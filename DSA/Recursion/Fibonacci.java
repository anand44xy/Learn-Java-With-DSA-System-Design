package Recursion;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static int fibonacci(int n){
        //1. Base Case condition
        if (n<=1) {
            return n;
        //2. Recursive Function Call     
        } else {
            int fib=fibonacci(n-1)+fibonacci(n-2);
             return fib;
        }
          
    }
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number that you want to find fibonacci series: ");
    int n=scn.nextInt();
    System.out.println("Fibonacci Series of" + n + "is: "+fibonacci(n));
}
}
