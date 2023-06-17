/**
 * Utilities
 */
public class ReversePrograming {

    public static void main(String[] args) {
        // String s1="Ajay jaat";
        // String s2="";
        // for(int i=s1.length()-1; i>=0;i--)
        // {
        //     s2=s2+s1.charAt(i);
        // }
        // System.out.println("Before Reversing: "+s1);
        // System.out.println("After Reversing: "+s2);
              
        // String s1="Ajay jaat";
        // String s2="";
        // String[] sarr=s1.split(" ");
        // for(int i=sarr.length-1; i>=0;i--)
        // {
        //     s2=s2+sarr[i]+" ";
        // }
        // System.out.println("Before Reversing: "+s1);
        // System.out.println("After Reversing: "+s2);

        String s1="Ajay Anand";
        String s2="";
        String[] sarr=s1.split(" ");
         for(String name:sarr)
         {
           for(int i=name.length()-1; i>=0;i--)
           {
            s2=s2+name.charAt(i);
           }
           s2=s2+" ";
         }
         System.out.println("Before Reversing: "+s1);
        System.out.println("After Reversing: "+s2);
    }
}