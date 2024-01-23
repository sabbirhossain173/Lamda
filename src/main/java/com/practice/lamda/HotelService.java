package com.practice.lamda;

import java.util.ArrayList;


public class HotelService {
    ArrayList<Hotel> hotels = new ArrayList<>();
    public HotelService() {
        hotels.add(new Hotel("SonarGaon", 2000, HotelType.THREE_STAR));
        hotels.add(new Hotel("PanPacific", 3000, HotelType.FOUR_STAR));
        hotels.add(new Hotel("Radison", 4000, HotelType.FIVE_STAR));
        hotels.add(new Hotel("HotelNice", 1000, HotelType.THREE_STAR));
        hotels.add(new Hotel("AgraaHotel", 3000, HotelType.FOUR_STAR));
        hotels.add(new Hotel("Dalas", 4000, HotelType.FIVE_STAR));
    }
//
//    private boolean isDesired(int price) {
//        return price < 3000;
//    }
//
//    public ArrayList<Hotel> findHotelLessThan3000() {
//        ArrayList<Hotel> desiredHotels = new ArrayList<>();
//        for(Hotel hotel : hotels) {
//            if(isDesired(hotel.getPricePerNight())) {
//                desiredHotels.add(hotel);
//            }
//        }
//        return desiredHotels;
//    }



//    private boolean is3StarHotelAvailable(HotelType hotelType) {
//        return hotelType == HotelType.FOUR_STAR;
//    }
    public ArrayList<Hotel> findHotels(FilteringCondition filteringCondition) {
        ArrayList<Hotel> desiredHotels = new ArrayList<>();
        for(Hotel hotel : hotels) {
            if(filteringCondition.test(hotel)) {
                desiredHotels.add(hotel);
            }
        }
        return desiredHotels;
    }

}
