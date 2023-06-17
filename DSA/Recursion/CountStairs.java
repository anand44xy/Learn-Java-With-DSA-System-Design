package Recursion;

import java.util.Scanner;

public class CountStairs {
    public static int countFind(int n){
        //Base Case Condition
        if (n<=1) {
            return n;
        } else {
            int cs=countFind(n-1)+countFind(n-2);
            return cs;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of Stairs");
        int n=scn.nextInt();
        System.out.println("The number of stairs is "+countFind(n+1));
    }
}
