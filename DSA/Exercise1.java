import java.util.Scanner;

public class Exercise1 {
    public static int Division(int a, int b) { // Division(/) operator and modules(%) are only valid for int and flot not for boolean data type
        return a / b;
    }

    public static int Reminder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value1 to Calculate it's Division and Reminder :");
        int a= scn.nextInt();
        System.out.println("Enter the value2 to Calculate it's Division and Reminder :");
        int b= scn.nextInt();
        System.out.println("Division of given numbers is: "+Division(a,b));
        System.out.println("Reminder of given numbers is: "+Reminder(a,b));
    }
    
}