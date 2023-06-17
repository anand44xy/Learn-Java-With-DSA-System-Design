package Recursion;

/*
Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
Constraints : 0<=n<=1e6
Input1 : n = 10
Output 1 : -5
Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
Input 2 : n = 5
Output 2 : 3
Answer:
*/
public class RecursionProblem2 {
    public static void main(String[] args) {
        int n = 10;
        int sum = calculateAlternateSum(n);
        System.out.println("Alternate Sum: " + sum);
    }

    public static int calculateAlternateSum(int n) {
        if (n == 1) {
            return 1; // Base case: return 1 for n = 1
        } else {
            int sign = (n % 2 == 0) ? -1 : 1; // Determine the sign based on whether n is even or odd
            return sign * n + calculateAlternateSum(n - 1); // Recursively calculate the sum
        }
    }
}
