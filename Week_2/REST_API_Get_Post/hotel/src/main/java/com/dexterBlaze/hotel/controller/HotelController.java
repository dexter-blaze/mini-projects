package com.dexterBlaze.hotel.controller;

import com.dexterBlaze.hotel.model.Hotel;
import com.dexterBlaze.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hotel")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public void createHotel(Hotel hotel){
        hotelService.createHotel(hotel);
    }
}
