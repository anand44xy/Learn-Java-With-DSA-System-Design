public class Day19Assignment {

    //   1. What is Encapsulation in java? Why it is called Data hiding?
    
        //     Ans--> Encapsulation in java is the process through which data is protected from other classes.
        //           By making the variables private . so the data only can be accessed by other classes by 
        //           using methods  getters and setters.
        //           Encapslation is called Data hiding because it id hiding the data from other classes.
    
    
            //    2. What are the important features of Encapsulation?
                 
            //    Ans--> The main important feature of Encapsulation is Data hiding from other class so the 
            //           other classes do not access the data directly. Encapsulation makes the complex code 
            //           easy.
    
            //    3. What are getter and setter in java . Explain with example.

            //    Ans-->
                     
            //       getters - such methods in a class  which are used to get values from another class 
            //                where its object is created.
                  
                  
            //       setters -  such methods  are used to set values of  a class members of a particular
            //                   object.  

                
            //      public int getAge()
            //      {
            //         return age;
            //      }
                 
            //     public void setAge(int age)
            //     {
            //         this.age = age;
            //     }

            // 4. What is the use of this Keyword? Explain with example.
               
            // Ans--> this keyword is used while giving value to a class member . And it is only necessary 
            //         when the name of local variable(argument inside setter method) and instance variable is same. 

            //         for example 
                     
            //         int age; 

            //         public void setAge(age)
            //         {
            //            age = age; // if i use it then the JVM will confuse in local variable and instance variable and it will give prefence to 
            //                          the local variable 
            //             this.age = age; 
            //         }

            // 5.  What is the advantage of Encapsulation?
                
            // Ans--> 1. used to protect and hide the code.
            //        2. Makes the complex program easy to understand . Other developers can easily 
            //            understand the code. 

            // 6. How to achieve encapsulation java . Explain with example.

            // Ans --> All members of the class should be private and use getters and setters method to access 
            //         data with restrictions.
                    
                    
            //         Step by step guide to achieve Encapsulation 

                    // first create your classes 

                    // class School 
                    // {
                        public static void main(String []args)
                        {
                            // creating a object of student class given below 
                            Student s1 = new Student();
                            // now set value to s1 
                            s1.setAge(18);
                            s1.setName("Devendra Swami");

                            // now we will get values from s1 
                            int s1Age =s1.getAge();
                            String s1Name = s1.getName();

                            // now lets print the vlaues 
                            System.out.println(s1Age);
                            System.out.println(s1Name);
                            
                    

                        }
                    }
                   
                    class Student 
                    {
                      private int age;
                      private String name; 
                     
                      // generate setter and getter method 
                      public int getAge()
                      {
                        return age;
                      }
                       
                      public void setAge(int age)
                      {
                        this.age = age;
                      }
                      
                      public String getName()
                      {
                        return name;
                      }
                    
                      public void setName(String name)
                      {
                        this.name = name;
                      }
                    // }
}
