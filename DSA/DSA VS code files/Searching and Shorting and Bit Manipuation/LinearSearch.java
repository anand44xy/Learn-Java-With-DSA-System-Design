// Time Complexity: O(n)
// Space Complexity: O(1)

import java.io.*;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
         Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array: ");
    int n=scn.nextInt();

    System.out.println("Enter the elements: ");
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=scn.nextInt();
    }

    System.out.println("Enter the target value that you want to search in an array");
    int target=scn.nextInt();

    //Implementation of linear Search
    int flag=0;
    for(int i=0; i<n; i++){
        if(arr[i]==target){
            System.out.println("Entered target is fou in an array");
            flag=1;
            break;
        }
    }
     if(flag==0)
     System.out.println("Entered target is not found in an array");

 }
}

    

