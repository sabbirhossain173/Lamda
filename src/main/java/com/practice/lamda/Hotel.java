package com.practice.lamda;

public class Hotel {
    private String name;
    private int pricePerNight;
    private HotelType hotelType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public Hotel(String name, int pricePerNight, HotelType hotelType) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.hotelType = hotelType;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", hotelType=" + hotelType +
                '}';
    }
}
