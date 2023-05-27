public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing");
        String tName1=Thread.currentThread().getName();
        System.out.println("The name of by default thread name is: "+tName1);
        System.out.println("By default priority is: "+Thread.currentThread().getPriority());
        System.out.println("Afrer changing");
        System.out.println();

        Thread t=new Thread();
        t.setName("AnadWS");
        t.setPriority(8);
        String tName2=t.getName();
        System.out.println("The name of thread is:"+ tName2);
        System.out.println("Priority is: "+Thread.currentThread().getPriority());
        System.out.println("After changment");
    
    
    
     }
    
}
