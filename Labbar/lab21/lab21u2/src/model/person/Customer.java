package model.person;

public class Customer {
    private String firstName;
    private String lastName;
    private Address address;


    //----------------------------------Get method----------------------------------------------
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Address getAddress() {
        return address;
    }

    //----------------------------------Set method----------------------------------------------
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAddress(Address address) {this.address = address;}

    //----------------------------------To string----------------------------------------------
    public String toString() {
        return String.format("%s %s %s", firstName, lastName, address);
    }

}
