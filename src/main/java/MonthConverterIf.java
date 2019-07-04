import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String monthString;

        System.out.println("Please enter a whole number between 1 and 12.");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();

        if(input < months.length) {
            monthString = months[input-1];
            System.out.println(input + " corresponds with " + monthString);
        } else {
            System.out.println("You have entered an invalid number. " +
                    "You must enter a number between 1 and 12. Goodbye.");
        }
    }


}

