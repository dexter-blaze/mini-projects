package com.dexterBlaze.hotel.controller;

import com.dexterBlaze.hotel.exception.BadRequestException;
import com.dexterBlaze.hotel.model.Hotel;
import com.dexterBlaze.hotel.service.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public void createHotel(@Valid @RequestBody Hotel hotel, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new BadRequestException("Invalid Request");
        }
        hotelService.createHotel(hotel);
    }

    @GetMapping("/id/{hotelId}")
    public Hotel getHotelById(@PathVariable String hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @GetMapping("/get-all")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @DeleteMapping("/remove/id/{hotelId}")
    public void deleteHotelById(@PathVariable String hotelId) {
        hotelService.deleteHotelById(hotelId);
    }

    @PutMapping("/update")

    //@RequestBody since we have to send the details
    public void updateHotel(@RequestBody Hotel hotel) {
        //delegating the work to service
        hotelService.updateHotel(hotel);
    }
}
