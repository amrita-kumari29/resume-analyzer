import java.util.*;
import java.io.*;
public class fibonacci {
    //function define
    public static int fibonacciFind(int n){
        int result = 0;
        //base case condition
        if(n<=1){
            return n;
        }
        //recursive case
        else{
           result = fibonacciFind(n-1)+ fibonacciFind(n-2);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //function calling
        int result = fibonacciFind(n);
        System.out.println("Fibonacci series of number is: " + result);
    }
}
