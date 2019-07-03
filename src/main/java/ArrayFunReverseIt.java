/*Your code must declare the following array [1, 2, 3, 4, 5],
create another array of equal length, and
fill that array with values from the original array but in reverse order.
Finally, your code must print the contents of both arrays to the screen.
 */

import java.util.Arrays;

public class ArrayFunReverseIt {

    public static void main(String[] args){

    int[] forwardArr = {1,2,3,4,5};
    System.out.println(Arrays.toString(forwardArr));
    int[] backwardArr = new int[forwardArr.length];
    int j = (forwardArr.length - 1);
    for(int i = 0; i < forwardArr.length; i++) {
        backwardArr[i] = forwardArr[j];
        j--;
    }

    System.out.println(Arrays.toString(backwardArr));



    }
}
