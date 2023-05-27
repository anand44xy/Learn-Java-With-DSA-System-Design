class Day20Constructor 
{
   public static void main(String[] args) 
   {
    //   1. What is constructor ?

//         Whenever we are creating an object some piece of code will be executed automatically 
//         that pieace of code is nothing but constructor. The main objective of constructor is nothing 
//         but intilization of object. 
        
//         example - 

//         class Student 
//         {
//             int age; 
//             String name;
            
//             Student()
//             {
//                 System.out.println("Intilization of student object");
//             }
             
//         }
//             class Day20
//             {
//               public static void main(String[] args) 
//               {
//                 Student s1 = new Student();
//                 //   while creating student object intilization has been done . if we run this code this 
//                 //    will print " intillization of student object".
                 
//               }
//               {

//               }
//             }
        

//         2. What is constructor chaining?
         
//         Ans--> Constructor chaining is also known as constructor overloading. Their can be multiple 
//                constructor with same name and different parameters within a same class. 

//                For example 
//                Student()
//                {
//                 //code 
//                }
//                Student(String name)
//                {
//                 //code 
//                }
//                // both the constructor are valid.

//           3. Can we call a subclass constructor form a super class constructor?

//            --> No we can't call, because a superclass constructor does not know how many class are going 
//               to inhirit it .     
              
//          4. What happens if you keep a written type to a constructor?

//              Ans-->It will become method this is how java distinguih between method and constructor. 

//           5. what is No-argument constuctor? 
              

//              Ans--> A No-argument constuctor is a constructor with no parameters. This is the default 
//                     constructor( if user does not define any).  


//             6. How is the no-argument constructor is different form defalut constructor? 

//             Ans--> whenever developer defines any constuctor wheather it takes any argument aur not it 
//                    will not  called as default constructor.

//                    if developer does not define any constructor then java will take defalut constructor which 
//                    will not take any argument. 

//             7. When do we need constructor overloading?

//             Ans--> when we have multiple objects with different parameters of different data types . 
//                    At that time we can use the constructor as per requirement . It will intilaize the 
//                    objects. Constructor overloading makes the complex program easy. 

            
//              8. What is the default constructor ? Explain with example.
            
//              Ans--> 
//                  When developer does not defines any constructor then while the creation of object java 
//                  takes default constructor . which will not accept any parameters.

//                  For Example 


//                  class Student 
//                  {
//                     //   Student()
//                     //   {
//                     //      // code 
//                     //      // this looks  same like default constructor but it is not default constructor 
//                     //   }
//                  }

//                  class Demo
//                  {
//                     public static void main(String[] args) 
//                     {
//                         Student s1 = new Student();
//                         // while defining this object in backgound java has taken the default constructor
//                            // which looks same as the above constructor.    
//                     }
//                  }
                
   } 
}
