import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        // Swapping of elements
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = new int[arr1.length]; // Create an empty array to store swapped elements
        for (int i = arr1.length - 1; i >= 0; i--) { // Corrected the loop condition and iteration
            arr2[arr1.length - 1 - i] = arr1[i]; // Swap the elements and store in the new array
        }
        System.out.println("After swapping the elements of Array: " + Arrays.toString(arr2)); // Print the swapped array
    }
}
