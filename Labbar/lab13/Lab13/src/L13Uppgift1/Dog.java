package L13Uppgift1;

public class Dog {

    //attribut
    private int age;
    private String gender;
    private String name;

    //konstruktor
    public Dog() {}

    //operationer
    public void SetName(String n) {
        name = n;
    }

    public String GetName() {
        return name;
    }

    public void SetGender(String g) {
        gender = g;
    }

    public String GetGender() {
        return gender;
    }

    public void SetAge(int a) {
        age = a;
    }

    public int GetAge() {
        return age;
    }


}
