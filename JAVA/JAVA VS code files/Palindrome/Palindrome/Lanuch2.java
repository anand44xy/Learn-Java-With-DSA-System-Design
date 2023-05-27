package Palindrome;

public class Lanuch2 {
public static void main(String[] args) {
    String str1="OYO";
    String str2="";
    for(int i=str1.length()-1; i>=0; i--){
        str2+=str1.charAt(i);
    }
    if (str1.equals(str2)) {
       System.out.println(str1+"Given string is an palindrome");   
    } else {
        System.out.println(str1+"Givnen String is not an Palindrome");
    }
}
}
