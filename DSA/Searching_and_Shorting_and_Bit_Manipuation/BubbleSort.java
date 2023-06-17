// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Bubble Sort is a stable sort
import java.util.*;
import java.io.*;

public class BubbleSort{

    public static void bubbleSort(int[] arr){
        // Write your code here

        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap two elements in an array
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 50, 30, 90, 5, 15};
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));

    }
}