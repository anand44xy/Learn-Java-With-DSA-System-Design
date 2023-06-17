/*
 * Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No
 */
package Recursion;

public class RecursionProblem5 {
    // ArmstrongNumber
    public static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numDigits = countDigits(n);
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    } 
    public static void main(String[] args) {
        int n = 153;
        boolean isArmstrong = isArmstrongNumber(n);
        System.out.println(isArmstrong ? "Yes" : "No");
    }
}
