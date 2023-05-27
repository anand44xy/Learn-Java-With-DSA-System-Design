import java.util.*;
public class dsaExmaple {

    public static void main(String[] args) {
       
            //Taking the input form user m and n
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter the number of rows(m): ");
            int m=scn.nextInt();
            System.out.println("Enter the number of columns(n): ");
            int n=scn.nextInt();
    
            int[][] arr=new int[m][n];
            //Get the elements from the user
           System.out.println("Enter the elements:");
           for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
           
        //Printing the elements that you enenterd
      System.out.println("Elements that you entered:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     
    }
}