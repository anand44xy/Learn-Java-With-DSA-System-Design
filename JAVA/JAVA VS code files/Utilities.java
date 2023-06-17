import java.util.Scanner;

public class Utilities {
 public static void main(String[] args) {
    
    String str = "";
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your String here: ");
    str = scan.next();

    String resultStr = "";
    
    for(int i=0;i<str.length();i++){
        char curntStr=str.charAt(i);
        if (curntStr!=' ') {
          if(i==0){
           resultStr+=curntStr;
          }else
          { 
            boolean isEqual=false;
            for(int j=0; j<resultStr.length();j++){
                isEqual=true;
                break;
            }
            if(isEqual==false){
                resultStr+=curntStr;
                
            }   
          }}
            
        }
        System.out.println("Entered String is: "+resultStr); 
    }
    
    

 }   
