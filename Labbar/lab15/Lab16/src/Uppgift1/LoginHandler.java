package Uppgift1;

//klass som ska spara flera objekt av klassen Login
public class LoginHandler {

    private Login[] loginList;
    private int numOfElements;


    //vi skapade en objekt Login[maxElements]
    public LoginHandler(int maxElements) {
        loginList = new Login[maxElements];
        numOfElements = 0;
    }

    //toDo: Skriv en metod som ska lägga till ett nytt element av Login i arrayen
    public boolean addNew(Login loginIn) {
        boolean success = true;

        if(numOfElements < loginList.length && loginIn != null) {
            loginList[numOfElements] = loginIn;
            numOfElements++;
        } else {
            success = false;
        }
        return success;
    }

      //toDo: Skriv en metod som tar bort (nollställer) en viss position i arrayen
    public boolean deleteElementAt(int index) {
        boolean success = true;

        if(index < numOfElements && index >= 0 && loginList[index] != null) {
            loginList[index].reset();
            numOfElements--;
            moveElementOneStepToLeft(index);
        } else {
            success = false;
        }
           return success;
    }

    //move element to left
    private void moveElementOneStepToLeft(int index) {
        for (int i = index+1; i < loginList.length; i++) {
            loginList[i-1] = loginList[i];
            if (loginList[i] != null ) {
                loginList[i] = null;
            }
        }
    }

    // get metod för numofelements, vi använder de i main
    public int getNumOfElements() {
        return numOfElements;
    }
}
