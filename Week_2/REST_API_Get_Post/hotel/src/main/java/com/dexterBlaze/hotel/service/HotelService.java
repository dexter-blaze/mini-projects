package com.dexterBlaze.hotel.service;

import com.dexterBlaze.hotel.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HotelService {

    List<Hotel> hotelList = new ArrayList<>();
    Map<String, Hotel> hotelMap = new HashMap<>();

    public void createHotel (Hotel hotel) {
        hotelList.add(hotel);
        hotelMap.put(hotel.getId(), hotel);
    }

    public Hotel getHotelById (String hotelId) {
        return hotelMap.get(hotelId);
    }

    public List<Hotel> getAllHotels () {
        return hotelList;
    }

}
