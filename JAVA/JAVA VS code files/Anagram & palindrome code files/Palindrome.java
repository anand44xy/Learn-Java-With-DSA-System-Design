/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        int num=2552;
        String intStr1=String.valueOf(num);
        String intStr2="";
        for(int i=intStr1.length()-1; i>=0; i--){
            intStr2=intStr2+ intStr1.charAt(i);
        }
        if (intStr1.equals(intStr2)) {
           System.out.println("It is a Palindrome");            
        } else {
            System.out.println("It is not a Palindrome");
        }
    
              
            }
        }
    