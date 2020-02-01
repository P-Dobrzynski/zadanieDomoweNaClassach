package com.company;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

class Address {

        private String country;
        private String city;
        private String postalCode;
        private String street;
        private int houseNumber;
        private int flatNumber;

        public Address(String country, String city, String postalCode, String street, int houseNumber, int flatNumber) {
            this.country=country;
            this.city=city;
            this.postalCode=postalCode;
            this.street=street;
            this.houseNumber=houseNumber;
            this.flatNumber=flatNumber;
        }

    public String getCountry() {
        return country;
        }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }
}
