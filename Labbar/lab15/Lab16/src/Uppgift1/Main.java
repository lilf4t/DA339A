package Uppgift1;

public class Main {
    public static void main(String[] args) {
        int maxElements = 5;


        //vi gör ett nytt objekt från klassen Login, (konstruktorn har en parameter(id, password) som vi fyller i här
        Login login = new Login("homer@simpson.se", "homer2022");
        System.out.println(login);

        //vi gör ett nytt objekt från klassen LoginHandler, vi kan anropa operationer från klassen
        LoginHandler loginList = new LoginHandler(maxElements);

        //lägger till element
        boolean ok = loginList.addNew(login);
        if (ok) {
            System.out.println(String.format("Object added. Num of elements: %d",
                    loginList.getNumOfElements()));
        }
            else {
                System.out.println("Object could not be added.");
        }

        //lägger till en annan element
        boolean ok1 = loginList.addNew(login);
        if (ok1) {
            System.out.println(String.format("Object added. Num of elements: %d",
                    loginList.getNumOfElements()));
        }
        else {
            System.out.println("Object could not be added.");
        }

        //tar bort element
       boolean ok2 = loginList.deleteElementAt(1);  //tar bort position 0 aka första
            if(ok2) {
                System.out.println(String.format("Object deleted. Num of elements: %d",
                        loginList.getNumOfElements()));

            }
            else {
                System.out.println("Object could not be deleted.");
            }

    }
}