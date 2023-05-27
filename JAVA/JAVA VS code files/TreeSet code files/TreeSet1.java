import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Object> ts1=new TreeSet<>();
        ts1.add(15);
        ts1.add(14);
        ts1.add(13);
        ts1.add(12);
       // ts1.add("Anand"); /heterogenous type data not allwoed 
        System.out.println(ts1);

        System.out.println(ts1.higher(14));
        System.out.println(ts1.lower(13));

        System.out.println(ts1.ceiling(15));
        System.out.println(ts1.floor(12));





    }
}
