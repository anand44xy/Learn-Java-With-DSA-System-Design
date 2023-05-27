package Reverse_Case;

public class Launch2 {
    public static void main(String[] args) {
        String str="DNANA_ANAPAS";
        String revrStr="";
        for(int i=str.length()-1; i>=0; i--){
            revrStr+=str.charAt(i);
        }
        System.out.println("Reverse of the String is: "+ revrStr);
    }
}
