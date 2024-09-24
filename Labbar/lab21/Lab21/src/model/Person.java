package model;

public class Person {
    private String customer;
    private String id;

    public Person(String customer, String id) {
        this.customer = customer;
        this.id = id;
    }
    public String getCustomer() {
        return customer;
    }
    public String getId() {
        return id;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setId(String id) {
        this.id = id;
    }
}
