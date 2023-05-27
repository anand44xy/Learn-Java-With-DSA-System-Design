import java.util.Scanner;

/**
 * Utilites
 */

public class Array {

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner scan=new Scanner(System.in);
        // for(int usrIput:arr){
        //     System.out.print("Enter the markes of Student:");
        //     usrIput = scan.nextInt();
        // }

        for(int i = 0; i<arr.length; i++){
            System.out.print("ENter the number: ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Marks of Students are :");

        for(int usrIput:arr){
            System.out.print(usrIput+" ");
        }

        // int[][] arr=new int[3][4];
        // Scanner scan=new Scanner(System.in);
        
        // for(int i=0; i<arr.length;i++){
        //     for(int j=0; j<arr[i].length;j++){
        //      System.out.println("Eneter the marks of class "+i+" Student "+j);
        //      arr[i][j]=scan.nextInt();
        //     }
        // }
        // System.out.println("The marks of students are:");
        // for(int i=0; i<arr[i].length;i++){
        //     for(int j=0; j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        }


    }
