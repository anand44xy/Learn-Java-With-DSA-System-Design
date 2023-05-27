public class ReverseProgram {
public static void main(String[] args) {
//  String s1="Anand Saini";
//  String s2="";
  
// for(int i=s1.length()-1 ; i>=0; i--)
// {
//     s2=s2+s1.charAt(i);
// }
// System.out.println("Before Reversing: "+s1);
// System.out.println("After Reversing: "+s2);


// String s1="Anand Saini";
// String s2="";
// String[] arr=s1.split(" ");

// for(int i=arr.length-1; i>=0; i--)
// {
//     s2=s2+arr[i]+" ";
// }
// System.out.println("Before Reversing: "+s1);
// System.out.println("After Reversing: "+s2);

String s1="Anand Saini";
String s2="";
String sarr[]=s1.split(" ");

        for(String elmnt :sarr)
        {
            for(int i=elmnt.length()-1 ; i>=0;i--)
            {
                s2=s2+ elmnt.charAt(i);
            }
            s2=s2+" ";
        }
        
        System.out.println("Before Reversing: " + s1);
        System.out.println("After Reversing: " +s2);
    }
}  

    
    
   
    
    











    

