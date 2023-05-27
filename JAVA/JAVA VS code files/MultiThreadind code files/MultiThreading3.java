import java.util.*;
class Calc implements Runnable{
    public void run(){
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
  
}
class Message implements Runnable{
    public void run() {
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
public class MultiThreading3 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        // Calc c=new Calc();
        // Message m=new Message();
    
        // Thread t1=new Thread(c);
        // Thread t2= new Thread(m);
        // t1.start();
        // t2.start();

     //We are also doing this using polymorphism with the help of array 
     Runnable[] runnables=new Runnable[2];
     runnables[0]=new Calc();
     runnables[1]=new Message();
     for (Runnable runnable : runnables) {
        Thread td=new Thread(runnable);
        td.start();

     }

    }
}
