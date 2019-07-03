/*Your code must get 5 words from the user,
put them in an array, and
print the array elements to the screen.
 */
import  java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        String[] userArr = new String[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < userArr.length; i++) {
            System.out.println("Please enter a word for the array");
            userArr[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(userArr));



    }
}
