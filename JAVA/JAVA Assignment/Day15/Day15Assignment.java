import java.util.Scanner;

1. Write a simple String program to take input from user?

Ans--> 

class Demo
{
 public static void main(String[] args) {
    
 
Scanner in = new Scanner(System.in);
System.out.println("Entre your String Here");

String userResponse = in.nextLine();
 System.out.println("You entered " + userResponse);

 }
}


2. How do you concatenate two Strings in java? Give an example. 

Ans-->  

There are to ways to concatenate two strings in java- 

1. concat method - 
By this method new string will be created in Heap area. 
for example -

String name = "Devendra";
String fullName = name.concat(" Swami");  // here new object will be created and does not affect the old object. 

2. "+" Operator - 

+ Operator method is used to cocatenate two strings and create a new object inside the String Constent Pool. 

for example - 

String name = "Devendra";

String fullName = name + " Swami";  // this will create a  new object outside the SCP(String Constent Pool).

String fullName1 = "Devendra" + "Swami"; // this will create a new object in SCP.



3. How do you find the length of a String in java. Explain with Example. 


Ans--> To find the length of a String in java we can use in built method - .length()

For example 



String name = "Devendra";
System.out.println(name.length());



4. How to you compare two Strings in java. Give an Example.

Ans --> 

We can compare Strings on two parameters- 

1. on the basis of content inside the String - 

To compare the content of Strings we use inbuilt metod .equals()

for example - 
 
String name = new String("Devendra");
String s1 = "Devendra";

system.out.println(name.equals(s1)); 
// this will result as true because the content of the String is same 

2. On the basis of reference - 

To compare on the basis of reference we use inbuilt method -"= = "

for example - 

String name = new String("Devendra");
String s1 = "Devendra";

System.out.println(s1 == name); 
// This will result as false because the refernce of objects is not same . 


5. Write a program to find the length of String "refrigrator". 

Ans--> 

 
String stringRefrigrator = "refrigrator"; 

System.out.println(stringRefrigrator.length());

// this will give the length of stringRefrigrator as 11 . 



6. Write a Program to check if letter 'e' is present in the "umbrella".


Ans - To solve this problem I used a method of char (Character.compare(int x, int y)

	String item = "Umbrella";
     boolean isPresent = false;

     for(int i=0; i<item.length(); i++) {
        if( Character.compare(item.charAt(i), 'e') == 0 ) {
            System.out.println("Character 'e' is present at index: " + i);
            isPresent = true;
        }
     }
     if(isPresent==false) {
        System.out.println("Character 'e' is not present in this string!");
     }


7. Write a program to delete all consonants fro the string "Hello, have a good day".

Ans - // program to delete all consonants from a string.

         String message = "Hello, have a good day";

         StringBuffer convertedMessage = new StringBuffer();

         char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

         for (int i = 0; i < message.length(); i++) {

            if(message.charAt(i)>='a' && message.charAt(i)<='z' || message.charAt(i)>='A' && message.charAt(i)<='Z') {
                for (int j = 0; j < vowels.length; j++) {
                    if(vowels[j] == message.charAt(i)) {
                        convertedMessage.append(vowels[j]);
                    }
                }
            } else {
                convertedMessage.append(message.charAt(i));
            }
            
         }

         System.out.println(convertedMessage);








































