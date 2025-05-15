import java.util.*;
import java.io.*;
public class factorialFind {
    //function define
    public static int factorialFind(int n){
        int result = 0;
        //base case condition
        if(n==0 || n==1){
            return 1;
        }
        //recursive case
        else{
           result = n*factorialFind(n-1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //function calling
        int result = factorialFind(n);
        System.out.println("Factorial of given number is: " + result);
    }
}
