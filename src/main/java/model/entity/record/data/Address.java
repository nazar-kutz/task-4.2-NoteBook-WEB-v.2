package model.entity.record.data;

import model.servise.stringManipulater;
import view.constants.str.UserDataStringGlobalConstants;

import static languages.CurrentLanguage.language;

public class Address {
    private String cityIndex;
    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public Address(String cityIndex, String city, String street, int houseNumber, int apartmentNumber) {
        this.cityIndex = cityIndex;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public static Builder getNewBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String cityIndex;
        private String city;
        private String street;
        private int houseNumber;
        private int apartmentNumber;

        private Builder() {

        }

        public Builder buildCityIndex(String cityIndex) {
            this.cityIndex = cityIndex;
            return this;
        }

        public Builder buildCity(String city) {
            this.city = stringManipulater.setFirstCharAtUpperCase(city);
            return this;
        }

        public Builder buildStreet(String street) {
            this.street = stringManipulater.setFirstCharAtUpperCase(street);
            return this;
        }

        public Builder buildHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder buildApartmentNumber(int apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
            return this;
        }

        public Address build(){
            return new Address(cityIndex, city, street, houseNumber, apartmentNumber);
        }
    }

    public String getCityIndex() {
        return cityIndex;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setCityIndex(String cityIndex) {
        this.cityIndex = cityIndex;
    }

    public void setCity(String city) {
        this.city = stringManipulater.setFirstCharAtUpperCase(city);
    }

    public void setStreet(String street) {
        this.street = stringManipulater.setFirstCharAtUpperCase(street);
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.cityIndex).append(", ").append(this.city).append(", ").
                append(language.getString(UserDataStringGlobalConstants.STREET)).append(": ").append(this.street).
                append(", <br>").append(language.getString(UserDataStringGlobalConstants.HOUSE_NUMBER)).
                append(": ").append(houseNumber).append(", <br>").
                append(language.getString(UserDataStringGlobalConstants.APARTMENT_NUMBER)).append(": ").
                append(this.apartmentNumber).toString();
    }
}
