package L13Uppgift1;

public class DogOwner {

    //attribut
    private String address;
    private Dog d1;
    private Dog d2;
    private String name;
    private int numberOfDogs;



    //konstruktor funkar ej
    public DogOwner(String n, String a, int nbrOfDogs) {
        name = n;
        address = a;
        numberOfDogs = nbrOfDogs;

        if(nbrOfDogs == 1) {
            d1 = new Dog();
        }
        else if (nbrOfDogs == 2) {
            d1 = new Dog();
            d2 = new Dog();
        }
    }

    //operationer
    public void SetAddress(String a) {
        address = a;
    }

    public String GetAdress() {
        return address;
    }

    public String GetName() {
        return name;
    }

    public Dog GetDog1() {
        return d1;
    }

    public Dog GetDog2() {
        return d2;
    }

    public int GetNumberOfDogs() {
        return numberOfDogs;
    }


}
