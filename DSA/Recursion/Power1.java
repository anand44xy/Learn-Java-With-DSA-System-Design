package Recursion;
import java.util.Scanner;

public class Power1 {
    public static int power(int a, int b) {
        // Base Case
        if (b == 0)
            return 1;

        // If 'b' is even
        if (b % 2 == 0) {
            int temp = power(a, b / 2);
            return temp * temp;
        }
        // If 'b' is odd
        else {
            int temp = power(a, b / 2);
            return a * temp * temp;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Value of a and b to Calculate Power(a^b): ");
        System.out.print("a: ");
        int a = scn.nextInt();
        System.out.print("b: ");
        int b = scn.nextInt();
        System.out.println("a^b is: " + power(a, b));
    }
}
