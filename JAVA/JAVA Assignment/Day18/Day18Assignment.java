class Day18Assignment
{
    public static void main(Static []args)
    {
         // 1. Why do we need static keyword in java ? Explain with an example.

        // Ans- Static keyword in java is mainly used for memory management. We can use static keyword 
        //      before class, variable, blocks and function. It is used when same thing is applicable for
        //      objects. So we don't need to write again and again for every Object.

        //      For example-
        //     In a laptop company the brand name is same for all laptops so we can use static there.
           
        //     i.e - static String Brand = "HP";

       
        // 2. What is class loading and how does the java program actually executes ?

        // Ans - In java, class loading is the process of loading class files into the JVM at runtime. 
        //      class loader is responsible for loading classes form various source.  such as the file system , 
        //      network, and databases, and making them available for execution. All class are not loaded
        //      once but loaded according to the demand.


        // 3. Can we mark a local variable as a static?

        // Ans- No local variable can't be a static variable.

        // 4. Why is static block is executed before the main method in java?

        // Ans - In java main method is executed after the class gets loaded but the static block is 
        //       Executed while the class gets loaded. so that's why the static block is executed before the 
        //       main method in java.


        // 5. Why is a static method is also called a class method?

        // Ans -->  Because a static meethod is directly accessed by the class not need to create a object 
        //          for execution. that's why static method is called a class method.


        // 6. What is the use of static blocks in java?
        
        // Ans --> Static blocks are used to intiliaze the static variables. and to store all the static variable 
        //         in a single block so it make the code easy or managed. 
       

        // 7. Difference between instance and static variables?

        // Ans --> The static variables belongs to the class and same for all objects. while the instance
        //          variable are different for different objects and belongs to the object.

        // 8. Differnce between static and non staic members .
        
        // Ans --> Static members are those members or variable which do not need objects to be accessed . 
        //         they are created with loading of the  class. And stops when the class stops.

        //         Non - static members or variable  which need objects to be access. They are loaded once 
        //         the class is loaded.
    }
}