class Demo1 implements Runnable{
   public void run(){   
     System.out.println("Child thread executing");
     try {
        Thread.sleep(3000);
     }
     catch (Exception e) {
        System.out.println("Something went wrong");
     }
     System.out.println("Child thread exiting");
}

}
public class MultiThreading2 {
 public static void main(String[] args) {
    System.out.println("Main Thread Started");
    Demo1 demo = new Demo1();
    Thread thread = new Thread(demo);
    thread.start();
 }   
}
