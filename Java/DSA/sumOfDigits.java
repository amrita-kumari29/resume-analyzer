//Approach: Recursion
import java.util.Scanner;

public class sumOfDigits {
    //function definition
     public static int sumOfDigits(int num){
        int result = 0;
        //base case condition
        if(num==0){
            return 0;
        }
        //recursive case
        
           return(num%10) + sumOfDigits(num/10);
    }
    //Driver code
    public static void main(String[] args) {
        int num = 12345;
        //function calling
        int result = sumOfDigits(num);
        System.out.println("Sum of digits are: " + result);
    }
}
