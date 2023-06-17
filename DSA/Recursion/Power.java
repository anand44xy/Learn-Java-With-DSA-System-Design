package Recursion;

import java.util.Scanner;

public class Power {
public static int power(int a,int b){
    //1. Base Case
   if (b==0) {
        return 1;
    //2. Recrsive fuction Call
    } else {
         int pow=a*power(a,b-1);
        return pow;
    }
    
}
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Value of a and b to Caluclate Power(a^b): ");
        System.out.println("a:");
        int a=scn.nextInt();
        System.out.println("b:");
        int b=scn.nextInt();
        System.out.println("a^b is :"+power(a,b));
        
    }
}
