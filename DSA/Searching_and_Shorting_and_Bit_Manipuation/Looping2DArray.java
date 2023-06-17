import java.io.*;
import java.util.*;

class Looping2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in an array");
        int m = sc.nextInt();

        System.out.println("Enter the number of columns in an array");
        int n = sc.nextInt();

        // Declaration of 2D Array
        int[][] arr = new int[m][n];

        // Initialization of 2D Array elements with 10
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = 10;
            }
        }

        // Print all the elements in 2D Array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            System.out.println();
            }
        }
    }
}
