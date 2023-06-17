import java.util.Arrays;

/**
 * Anagram
 */
public class Anagram {

    public static void main(String[] args) {
        String str1="Anand Saini";
        String str2="Anand Saini";

        //Remve any space and convert that string into lower case
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();

        //Convert string into char Array
        char[] sar1=str1.toCharArray();
        char[] sar2=str2.toCharArray();

        // sort the array
        Arrays.sort(sar1);
        Arrays.sort(sar2);
        
       if (Arrays.equals(sar1,sar2)) {
        System.out.println("Given String is an Anangram");
       } else {
        System.out.println("Given String is not an Anangram");
       }
  }
}