/*
 * Q1 : Given an integer, find out the sum of its digits using recursion in java.
Input: n= 1234
Output: 10
Explanation: 1+2+3+4=10 
Answer:
 */
package Recursion;

public class RecursionProblem1 {
    public static int CalSum(int n){
        if(n==0){
            return 0;
        }
        else{
            int sum=n%10+CalSum(n/10);
            return sum;
        }
    }
public static void main(String[] args) {
    int n=1234;
    System.out.println("Sum of given number is: "+CalSum(n));
}    
}
