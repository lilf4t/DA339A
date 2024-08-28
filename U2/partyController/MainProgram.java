/*
Author: Fatima Kadum
Id: an4263
Study program: DT
*/

package partyController;

import javax.swing.*;
public class
MainProgram
{
    public static void main(String[] args)
    {
        int maxNbrOfGuests = 10;

        String numbers = JOptionPane.showInputDialog("How many guests would you like to have?");

        maxNbrOfGuests = Integer.parseInt(numbers);

        /* Write code to read max number of guests from the user by using one of
         - JOptionPane
         - Scanner and prompt
        */

        Controller controller = new Controller(maxNbrOfGuests);
    }
}
