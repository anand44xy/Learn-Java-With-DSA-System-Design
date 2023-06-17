
        1. Write a program to remove duplicates from a String. 

        Ans--> 
 
      


     String s1 = "Mohan Murari Das";
     String s2 ="";
   s1 = s1.replace(" ", "");
  s1 = s1.toLowerCase();

  
  
   for(int i = 0; i<s1.length(); i++ )
   
   {
     boolean isMatched = false;
     
     if(i==0)
     {
         s2 =  s2 + s1.charAt(i);
     }

     else  
     {
         for(int j = 0 ; j<s2.length(); j++ )
         {
             if( s2.charAt(j) == s1.charAt(i))
             {
               isMatched = true;
             }
             
         }
         
         if(!isMatched) {
             s2 = s2 + s1.charAt(i);
         }
     }
   }
  System.out.println(s2);

         
        2. Write a program to print duplicates from the string. 

        Ans--> 

        String s1 = "Mooooohhhhhaaaaannnnnnn murari ";
        String dup = "";
        
        s1 = s1.replace(" ", "");
        s1  = s1.toLowerCase();
        char ch[] = s1.toCharArray();
        int ar[] = new int[26];
        
        for(int i = 0; i <ch.length; i++)
        {
            ar[ch[i]-97]++;
        }
        
        for(int j =0; j<ar.length; j++)
        {
            if(ar[j] >=2)
            {
                dup = dup + (char) (j+97);
            }
        }
        System.out.println(dup);

        // this will print the duplicates from the string and the out will be - "ahmnor"
        

        3. Write a program to check "2552" is Palindrome or not. 
        
        Ans-->

        String string2552 = "2552";
        String reverse2552 = "";
        
        for(int i = string2552.length()-1 ; i>=0 ; i--)
        {
            reverse2552 = reverse2552 + string2552.charAt(i);

        }
        if(string2552.equals(reverse2552)){
            System.out.println(" 2552 is palindrome ");
        }
        else {
            System.out.println("2552 is not Palindrome");
        }





         Q.4 - WAP to count the number of consonants, vovels and special characters in a string.

         Ans -->

         
        String s1 = "helllldf   gdhlo!";
       
        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialCharactersCount = 0;
        int spaceCount = 0;
 
        char []vowels = {'a' , 'e' , 'i', 'o', 'u' , 'A' , 'E' , 'I' , 'O' , 'U'};
 
     for(int i = 0; i<s1.length(); i++ ) {
           
      if(s1.charAt(i)>= 'a' && s1.charAt(i)<= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
 
      {    
            boolean isVowel = false;
 
             for(int j = 0 ; j<vowels.length; j++)
             {
                 if(vowels[j] == s1.charAt(i))
                 {
                     isVowel =true;
                     vowelsCount++;
                     break;
                 }
 
                 }
 
                 
                 if(isVowel ==false) {
                     consonantsCount++;
             }
      
 
 
 
      }
 
      else{
         if(s1.charAt(i) != 32)
         {
             specialCharactersCount++;
         }
         else{
              spaceCount++;
         }
        
      }
     }
 
 System.out.println("vowel Cout is - " + vowelsCount);
 System.out.println("Consonants count is - " + consonantsCount);
 System.out.println("Special Characters count is - "+ specialCharactersCount);
 System.out.println("Space Count - " + spaceCount);
 


 Q.5 --> WAP to check if a string is anagram using least inbuilt characters


Ans -> 

        
String str1 = "School Master";
String str2 = "The Class Room";

// we have to check wheathe given strings are angram or not 

 str1 = str1.replace(" ", "");
 str2 = str2.replace(" ", "");

  str1 = str1.toLowerCase();
  str2  = str2.toLowerCase();

  char ar1[] = str1.toCharArray();
  char ar2[] = str2.toCharArray();

  Arrays.sort(ar1);
  Arrays.sort(ar2);

 

  if( Arrays.equals(ar1, ar2))
  {
    System.out.println("Given Strings are Anagram");
    
  }

  else {
    System.out.println("Given Strings are not Anagram");
  }



    }
}

 



        Q.6 --> WAP to implement pangram checking with least inbuilt methods being used.

        Ans 6 -


        
        String strForPangram = "The quick brown fox jumps over lazy dog";

        strForPangram = strForPangram.toLowerCase();
        strForPangram = strForPangram.replace(" ","");

        int ar[] = new int[26];
        boolean isPangram = true;

        for(int i = 0;  i<strForPangram.length(); i++)
        {
            char cc = strForPangram.charAt(i);

            if(cc >= 'a' && cc <= 'z')
            {
                ar[cc-97]++;
                //this will increase the value by 1 of ar[i] at index no.
            }
        }
       
        for(int i : ar)
        {
            if(i<1)
            {
                System.out.println("Given String is not Pangram");
                isPangram = false;
                break;
            }
        }

        if(isPangram)
        {

       System.out.println("The given string is pangram");
        }










Q. 7 --> WAP to find if String contains all unique characters.

Ans--> 

String s1 = "Hey bro!";

String stringToCheck = s1.toLowerCase();

int ar[] = new int[26];
boolean isUnique = true;

for(int i = 0; i<stringToCheck.length() ; i++)
{
    char cc = stringToCheck.charAt(i);

    if(cc >= 'a' && cc <= 'z')
    {
        ar[cc -97]++;
        //this will change the default values of the charaters of ar according to the no. of time chracter present in the string
    }
}
for(int i: ar)
{
    if(i>1)
    {
        System.out.println("the String does not contain all unique charcters ");
        isUnique =false;
        break;
        
    }
}

if(isUnique)
{
 System.out.println("Given String contains unique characters");
}






Q. 8 --> WAP to find the maximum occurring character in a String.


Ans-->


String s1 = "Heeeeeelo Abhishek";

// we have to find max occuring character in the string 
 s1 = s1.toUpperCase();
 s1 = s1.replace(" ", "");

int ary[] = new int[26];

for(int i=0 ; i<s1.length(); i++) 
{
  char cc = s1.charAt(i);

  ary[cc-65]++;
}

int max = ary[0];
int index = 0;

for(int i = 0; i<ary.length; i++) {
  if(max < ary[i]) {
    max = ary[i];
    index = i;
  }
}
System.out.println("Maximum count is of character : " + (char) (index+97));


