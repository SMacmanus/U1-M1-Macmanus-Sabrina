import java.util.Scanner;

public class MonthConverterSwitch {
    public static void main(String[] args){

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a whole number between 1 and 12.");
        int input = userInput.nextInt();

        switch(input) {
            case 1:
                System.out.println("The first month is January.");
                break;
            case 2:
                System.out.println("The second month is February.");
                break;
            case 3:
                System.out.println("The third month is March.");
                break;
            case 4:
                System.out.println("The fourth month is April.");
                break;
            case 5:
                System.out.println("The fifth month is May.");
                break;
            case 6:
                System.out.println("The sixth month is June.");
                break;
            case 7:
                System.out.println("The seventh month is July.");
                break;
            case 8:
                System.out.println("The eighth month is August.");
                break;
            case 9:
                System.out.println("The ninth month is September.");
                break;
            case 10:
                System.out.println("The tenth month is October.");
                break;
            case 11:
                System.out.println("The eleventh month is November.");
                break;
            case 12:
                System.out.println("The twelfth month is December.");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }

}

