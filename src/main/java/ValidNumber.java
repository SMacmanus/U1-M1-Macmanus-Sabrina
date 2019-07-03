/*This program prompts the user for a number between 1 and 10 and keeps asking until the entered number is in range. Your solution must be in a Java file called ValidNumber.

The program must do the following:


Prompt the user to enter a number between 1 and 10.
If the user enters a number less than 1 or greater than 10,
display the following error message and prompt the user for another entry:
"You must enter a number between 1 and 10, please try again."
When the user enters a valid number, print the number to the screen and exit.*/

import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {
        double tryAgain;
        double input;

        System.out.println("Please enter a number between 1 and 10.");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextDouble();

        if((input < 1) || (input > 10)) {
            do {
                System.out.println("You must enter a number between 1 and 10, please try again.");
                tryAgain = userInput.nextDouble();
            } while ((tryAgain < 1) || (tryAgain > 10));
            System.out.println(tryAgain);
        } else {
            System.out.println(input + " is a valid number between 1 and 10");
        }
    }

}

