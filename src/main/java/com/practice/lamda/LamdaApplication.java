package com.practice.lamda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LamdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LamdaApplication.class, args);

        //Lamda's Functionality
        HotelService hotelService = new HotelService();
        List<Hotel> hotels = hotelService.findHotels((Hotel hotel) -> {
            return hotel.getPricePerNight() < 3000;
        });
        System.out.println(hotels);


        // same as Lamda but we did it by anynomous class
        hotels = hotelService.findHotels(new FilteringCondition() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType() == HotelType.FIVE_STAR;
            }
        });
        System.out.println(hotels);
    }
}
