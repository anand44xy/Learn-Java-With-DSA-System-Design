// Time Complexity: O(log n)
// Space Complexity: O(1)

import java.util.*;
import java.io.*;

public class SquareRoot {

    //Function Definition
    public static int squareRoot(int num){
        int low=0, high=num, result=-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            long val = mid * mid;
            if(val == num){
                // Perfect Square root of the given number
                return mid;
            }
            else if(val < num){
                // store the mid as we need to report the floor value in case of non perfect square root of the given number
                result = mid;
                // right side of an array
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square root you are looking for: ");
        int num = sc.nextInt();
        // Function calling
        int result = squareRoot(num);
        System.out.println("The square root of a given number is: "+result);
    }
}
