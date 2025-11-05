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

    public void deleteHotelById(String id) {
        Hotel hotel = getHotelById(id);
        hotelList.remove(hotel);
        hotelMap.remove(id);
    }


    public void updateHotel(Hotel updatedHotel) {
        /**
         1. Get the existing data of the hotel
         2. remove this old data from the list
         3. add the updated data to the list
         4. update the previous data with new data.
         5. Update the map with new data.
         **/
        Hotel existingHotel = getHotelById(updatedHotel.getId());
        hotelList.remove(existingHotel);
        hotelList.add(updatedHotel);
//        hotelMap.remove(existingHotel.getId()); --> no need for this
        hotelMap.put(updatedHotel.getId(), updatedHotel);

        //here we have to do all these steps, when using db it will be lot easier, just call the db
    }
}
