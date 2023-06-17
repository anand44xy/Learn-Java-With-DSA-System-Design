import java.util.InputMismatchException;
import java.util.Scanner;

class MyThred extends Thread{
    public void run(){
        String tName=Thread.currentThread().getName();
        if (tName==("CALC")) {
            Calc();
            
        } else {
           ImpMsg(); 
        }

    }

    public void Calc(){
       try{
        System.out.println("Calc part started");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number here:");
        int n1=scn.nextInt();
        System.out.println("Enter sencond number here:");
        int n2=scn.nextInt();
        int result=n1+n2;
        System.out.println("Result: "+result);
        System.out.println("Calc part Ended");
        System.out.println("----------------------------");
    
      }catch(InputMismatchException ime){
        System.out.println("Given input is a number not a String");
      }


 }

    public void ImpMsg(){
      System.out.println("Displaying Important message");
      try {
        for(int i=0; i<3;i++){
            System.out.println("*Skills Speak Louder Than Words*");
        }
      } catch (Exception e) {
        System.out.println("Someth Went wrong");

      }
    }
}

public class MultiThreading1 {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThred t1=new MyThred();
        MyThred t2=new MyThred();
        t1.setName("CALC");
        t2.setName("PrintImpMsg");
        t1.start();
        t2.start();

        
    }
}