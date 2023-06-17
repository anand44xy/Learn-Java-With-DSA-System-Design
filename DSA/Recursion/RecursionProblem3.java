/*
 * Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
 */
package Recursion;

public class RecursionProblem3 {
    // FindMaxArray
    public static int findMax(int[] array) {
        return findMaxRecursive(array, 0, Integer.MIN_VALUE);
    }

    public static int findMaxRecursive(int[] array, int index, int currentMax) {
        if (index == array.length) {
            return currentMax; // Base case: reached the end of the array, return the current maximum
        } else {
            if (array[index] > currentMax) {
                currentMax = array[index]; // Update the current maximum if the current element is greater
            }
            return findMaxRecursive(array, index + 1, currentMax); // Recursively check the next element
        }
    }
     public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};
        int max = findMax(array);
        System.out.println("Maximum value: " + max);
    }
}
