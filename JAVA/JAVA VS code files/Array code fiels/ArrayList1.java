import java.util.*;
/**
 * ArrayList1
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<Integer>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println("-------------------------------");

        ArrayList<Object> al2=new ArrayList<Object>();
        al2.add(0);
        al2.add(1.4);
        al2.add("Anand");
        al2.addAll(al1);
        System.out.println(al2);
        System.out.println("-------------------------------");
        ArrayList<Integer> al3=new ArrayList<Integer>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        System.out.println(al3);
        System.out.println("After adding collection");
        al3.addAll(al2);
        System.out.println(al3);
        
        
    }
}