/*
 * Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
 */

package Recursion;

public class RecursionProblem4 {
    // ArraySum
    public static int calculateSum(int[] array) {
        return calculateSumRecursive(array, array.length - 1);
    }

    public static int calculateSumRecursive(int[] array, int index) {
        if (index == 0) {
            return array[0];    // Base case: if index is 0, return the element at index 0
        } else {
            return array[index] + calculateSumRecursive(array, index - 1); // Recursively calculate the sum
        }
    }
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};
        int sum = calculateSum(array);
        System.out.println("Sum of array: " + sum);
    }
}
