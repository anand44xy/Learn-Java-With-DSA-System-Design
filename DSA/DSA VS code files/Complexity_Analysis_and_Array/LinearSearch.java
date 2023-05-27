// Time Complexity: O(n)
// Space Complexity: O(1)

import java.io.*;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value that you want to search for: ");
        int target = sc.nextInt();

        //Implementation of Linear Search Algorithm
        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Element is not found in an array");
        }
        else{
            System.out.println("Element is present at the location: "+idx);
        }

    }
}
