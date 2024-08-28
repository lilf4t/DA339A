/*
Author: Fatima Kadum
Id: an4263
Study program: DT
*/
package partyModel;

public class Guest {
    /* Declare instance variables for first name and last name as String-objects and
       address as an Address-object.
     */
    private String firstName;
    private String lastName;
    private Address address;


    /* Write a default constructor (no parameters) that gives default values for
       instance variables and creates the Address-object using
       the default constructor for class Address.
       Use default values for first name and last name of your choice
       that will inform a user that this value isn't really set.

       You can handle this in this constructor or call
       the constructor below with null for all values and handle that there.
     */

    public Guest() {
        this.firstName = "unknown first name";
        this.lastName = "unknown last name";
        this.address = new Address();
    }

    /* Write a constructor with parameters for all instance variables
       given above where the address is a reference to an Address-object
       and first name and last name are of type String.

       Check that the values for the parameters for first name and last name
       isn't empty strings or null before assigning the values to the corresponding
       instance variables. If any value is empty or null assign a default value of your choice
       that will inform a user that this value isn't really set.

       If the parameter for the Address-object is null create an Address-object
       by using the default constructor for class Address.
     */

    //Överlagring av konstruktorer då vi vill använda just den som passar, default elr med parametrar etc
    //kedjeanrop med this.
    public Guest(String firstName, String lastName, Address address) {
        if(firstName == null || firstName == "") {
            this.firstName = "unknown first name";
        }
        else {
            this.firstName = firstName;
        }
        if(lastName == null || lastName == "") {
            this.lastName = "unknown last name";
        }
        else {
            this.lastName = lastName;
        }
        if(address == null) {
            this.address = new Address();
        }
        else {
            this.address = address;
        }

    }

    /* Write a constructor with parameters for all instance variables
       given above and all instance variables for the address.
       Create the Address-object with the values given in the parameters.
       Let the Address class take care of assigning default values if any
       parameters for this object is an empty string or null.
   */

    //konstruktor chain
     public Guest(String firstName, String lastName, String street, String zipCode, String city, Countries country) {
         if(firstName == null || firstName == "") {
             this.firstName = "unknown first name";
         }
         else {
             this.firstName = firstName;
         }
         if(lastName == null || lastName == "") {
             this.lastName = "unknown last name";
         }
         else {
             this.lastName = lastName;
         }
         this.address = new Address(street, zipCode, city, country);
     }


    /* Implement get- and set-methods for all instance variables,
       including variables matching the instance variables of
       the Address-object (those call getters and setters in the Address-object).

       Remember to check parameters in set-methods with the same
       rules as in the constructor above.
     */

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    /* Write a toString method to return a String made of first name and
       family name and the address (by calling the toString method of the Address-object)
       formatted in one line (this will be shown in the window under "Guest Register" ).
     */

    public String toString() {
        String text = String.format("%s %s %s", firstName, lastName, address);
        return text;
    }

}
