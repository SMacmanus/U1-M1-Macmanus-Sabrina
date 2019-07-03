import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a whole number between 1 and 12.");
        int input = userInput.nextInt();

        if(input == 1) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 2) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 3) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 4) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 5) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 6) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 7) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 8) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 9) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input ==10) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input ==11) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else if(input == 12) {
            System.out.println("Month number " + input + " corresponds with " + months[input - 1] + " ." );
        } else {
            System.out.println("You have entered an invalid number. " +
                    "You must enter a number between 1 and 12. Goodbye.");
        }
    }


}

