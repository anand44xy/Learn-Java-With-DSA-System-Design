import java.util.Arrays;

/**
 * Anagram
 */
public class Anagram {

    public static void main(String[] args) {
        String str1="Anand Saini";
        String str2="Anand Saini";
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] sar1=str1.toCharArray();
        char[] sar2=str2.toCharArray();
        Arrays.sort(sar1);
        Arrays.sort(sar2);
       if (Arrays.equals(sar1,sar2)) {
        System.out.println("Given String is an Anangram");
       } else {
        System.out.println("Given String is not an Anangram");
       }
  }
}