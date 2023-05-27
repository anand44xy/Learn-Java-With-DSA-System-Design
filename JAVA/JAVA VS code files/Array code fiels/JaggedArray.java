import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        int [][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
    Scanner scan=new Scanner(System.in);

    for(int i=0; i<arr.length;i++){
        for(int j=0; j<arr[i].length;j++){
            System.out.println("Enter the marks of class: "+i+" Student "+j);
            arr[i][j]=scan.nextInt();
        }
    }System.out.println("The marks of students are: ");
    for(int i=0; i<arr.length; i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }System.out.println();
    }
}
}