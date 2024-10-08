package model.person;

public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String country;


    //----------------------------------Get method----------------------------------------------
    public String getStreet() {
        return street;
    }
    public String getCity(){return city;}
    public String getZipCode(){return zipCode;}
    public String getCountry(){return country;}

    //----------------------------------Set method----------------------------------------------
    public void setStreet(String street) {this.street = street;}
    public void setCity(String city) {
        this.city = city;
    }
    public void setZipCode(String zipCode) {this.zipCode = zipCode;}
    public void setCountry(String country){this.country = country;}

    //----------------------------------To string----------------------------------------------
    public String toString() {
        return String.format("%s %s %s %s", street, city, zipCode, country);
    }




}
