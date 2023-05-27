import java.util.Arrays;

class Day17Assignment
{
    public static void main(String []args)
    {
        // 1. What is mutable String? Give an Example.

        // Mutable Strings are those Strings whose content can be changed without creating a new object.
        // StringBuilder and StringBuffer are the example of mutable strings.


        // 2. Write a program to reverse a String.
        // Answer

        String str1="PWSKILLS";
        String str2="";
        for(int i = str1.length()-1; i>=0; i--)
        {
            str2=str2+str1.charAt(i);

        }
        System.out.println("Before reversing - "+str1);
        System.out.println( "After reversing - "+str2);

        // 3. Write a program to reverse a sentence while preserving the Position.
        //     Input = Think Twice
        //     Output = kniht eciwt 

        // Answer

        String str21 = " Think Twice";
        String str2Arr[]= str21.split(" ");
        StringBuffer reversedString= new StringBuffer();
        for(String s : str2Arr)
        {
            for(int i = s.length()-1; i >=0 ; i--)
            {
                reversedString.append(s.charAt(i));
            }
            reversedString.append(" ");
        }   
          System.out.println(reversedString);    
          
          

        //   4. Write a program to sort a string alphabitacally.
         
         String s1 = "Devendra Swami";
         s1=s1.replace(" ","");
         s1 = s1.toUpperCase();
         char ar1[]= s1.toCharArray();
         Arrays.sort(ar1);  

         System.out.println(ar1);



    }
}