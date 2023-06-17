 
 1. How to create an Object in java?

 Ans-->  Object can be created in java by using new keyword. 
        
        Syntax for Object creation is -   Test obj = new TEst();
                                          // Test - the name of the class 
                                          // obj - the name object 

2. What is the use of new keyord in java ? 

Ans--> 
'new' keyword in java is used to create a new object of a class
or we can say it instatiates a class and allocate a memory of that object. 
And also it returns the reference of that allocated memory.


3. What are the different types of variable in java? 

Ans--> There are 3 types of  variables in java 

 
1. Local variable 
2. Instance variable 
3. static variable 


4. What is the difference between Local variable  and Instance variable? 

Ans -- 

 1. Local variable-  it is present in method . and the memory for local variable is allocated in the stack
                     area. The scope of the local variable is as the scope of the of the method. As the 
                     method is executed the scope of local variable wil be no more. 




 2. Instance varible - 

 It is present inside the class but outside the method . and the memory for instance variable is allocated in 
in the Heap area. the Instance variable's scope is same as its class. Inastance variable is intialized during 
the object creation.   



 5. In which area memory is allocated for Local and instance variable? 

 Ans--> For local variable memory is allocated stack area. And for instace variable memory is allocated 
        Heap area. 
        
6. What is method Overloading? 

Ans--> 
      Having two methods with same name  and  different parameters within a class is called method 
      Overloading.
      
      for exmaple

      {
        public void show(int a )
        {
            System.out.println(a);
        }
        
        public void show(int a, int b)
        {
            System.out.println(a +b );
        }

        public void show(string a )
        {
            System.out.println(a);
        }
      }
                  













