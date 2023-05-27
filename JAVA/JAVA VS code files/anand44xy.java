import java.util.Scanner;

public class anand44xy {
    public static void main(String[] args) throws Exception{
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
  System.out.println("Matrix that you entered:");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

       //Variables
       int posNo = 0;
       int negNo=0;
       int zeroNo=0;
       int evenNO=0;
       int oddNo=0;

       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int num = arr[i][j];
       
            if(num>0){
                posNo++;
            }else if(num<0){
                negNo++;
            }
            
            if(num %2 ==0){
                evenNO++;
            }else{
                oddNo++;
            }
          }
        }
        System.out.println("Number of positive numbers: " + posNo);
        System.out.println("Number of negative numbers: " + negNo);
        System.out.println("Number of even numbers: " + evenNO);
        System.out.println("Number of odd numbers: " + oddNo);
        System.out.println("Number of zeroes: " + zeroNo);

        scn.close();
    }
}