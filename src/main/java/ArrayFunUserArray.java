import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        int[] userArr = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number in the array.");
        userArr[0] = input.nextInt();

        for(int i = 1; i < userArr.length; i++) {
            System.out.println("Please enter a number for slot " + (i + 1));
            userArr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString((userArr)));
    }
}