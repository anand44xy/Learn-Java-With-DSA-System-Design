package Recursion;

import java.util.Scanner;
public class Factorial {

   //public int factorial(int n){
    public static int factorial(int n){
       //1.Base Case condition
       if(n==1 || n==0) 
       return 1;
       //2.Recursive function Call
       int fact=n* factorial(n-1);
       return fact;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you wnat to find out: ");
        int n=scn.nextInt();
        /* 
          [There is no need to create an object to print result to avoid it we should use 'static' keyword in factorial method]
         
          Factorial fact=new Factorial();
          fact.factorial(n);  
          System.out.println("The factorial of "+n+" is: "+fact.factorial(n));
        */
        System.out.println("The factorial of "+n+"!" +" is: "+factorial(n)); 

    }
}
