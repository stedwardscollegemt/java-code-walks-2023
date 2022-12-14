package TypeValidationCheck;

import Helpers.Keyboard;

/**
 * The following program intends to display the cost of a cinema ticket.
 * An adult customer is charged 11.50.
 * A child customer (under the age of 12) gets in for 5.50.
 */
public class CinemaTicketWithTypeValidation {
    public static void main(String[] args) {
        // Declaration of constants to store the prices
        final double ADULT_PRICE = 11.50;
        // Declare CHILD_PRICE
        final double CHILD_PRICE = 5.50;
        
        // Declare variable ageIn to store the age of the user
        int ageIn;
        
        // Display a user prompt for input
        System.out.println("Please enter your age:");
        // Store the value of Keyboard.readInt() in ageIn
        try {
            ageIn = Keyboard.readInt();
             
            if (ageIn > 5) { // first I am checking that the age is greater than 5
                // A conditional statement to check whether ageIn is less than 12
                if (ageIn < 12) {
                    System.out.println("Child Ticket Price: $" + CHILD_PRICE);
                } else {
                    System.out.println("Adult Ticket Price: $" + ADULT_PRICE);
                }
            } else {
                System.out.println("Sorry, very young children cannot get a ticket.");
            }
        } catch (NumberFormatException e) {
            // The program was going to crash... but we stopped it!
            System.out.println("Sorry, we could not process your request because the input was invalid.");
        }
    }
}
