class car implements Runnable{
 public void run(){
        try{
        System.out.println(Thread.currentThread().getName()+ "Has entered the parking lot");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+ "found the car and got it into to drive");
        synchronized(this){
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+ "Started to drive the car ");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+ "Come back and parked");
        Thread.sleep(2000);
        }
    }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
public class Synchornization {
    public static void main(String[] args) {
        car c=new car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
