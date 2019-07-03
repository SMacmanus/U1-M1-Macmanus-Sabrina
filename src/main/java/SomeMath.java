import java.util.Arrays;

public class SomeMath {

    public static int total5(int a, int b, int c, int d, int e){
        int sum = a+b+c+d+e;
        System.out.println("The sum " +
                "of total5 is " + sum + " .");
        return sum;
    }

    public static double average5( int a, int b, int c, int d, int e) {
        double average = ((a+b+c+d+e) / 5);
        System.out.println("The average of average5 is " + average + " .");
        return average;
    }

    public static double largest5( double a, double b, double c, double d, double e) {
        int i;
        double[] largestArray = {a,b,c,d,e};
        double largest = largestArray[0];
        for(i = 1; i < largestArray.length; i++) {
            if(largestArray[i] > largest) {
                largest = largestArray[i];
            }
        }
        System.out.println("The largest number in this array is " + largest + " .");
        return largest;
    }

    public static void main(String[] args){
        total5(1,2,3,4,5);
        average5(1,3,5,7,9);
        largest5(42, 35.1, 2.3, 40.2, 15.6);

    }
}
