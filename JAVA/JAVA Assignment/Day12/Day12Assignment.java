1. What do you mean by an Array? 

Ans--> An array is collection of similar types of variables ,Which can be accesed using index numbers. 
      In java arrays can store both primitive and non primitive data types. 

      ex- 
         int arr[] = {5,6,8,9};

2. How to create an array? 

Ans--> In java array is considered as object so here are the syntax to create array- 
            
        int ar1[] = {5,3,5,6,7};  // if we have data during the creation of array 

                       or 
     
        int ar2[] = new int[7]; // here 7 is the number of elemets inside the array. 
        
        int ar3[][] = new int[3][4]; // this is the syntax of 2 d Array . here 3 is number of rows and 4  is  coloums.  
     

3. can we change the size of array at run time? 

Ans --> NO 

4. Can you declare an array without assigning the size of array ? 

Ans-> Yes, we can declare but we have to intiliaze the array otherwise it will give compile time error. 


5. What is the default value of an array?
Ans - Default value of array types - 
		int array —> 0
		string array —> null
		boolean array —> false
		double array —> 0.0	
		user-defined array —> null


6. What is 1D array. give an example. 

Ans --> one dimensional array is know as 1D array. syntax for 1D array is -  int arr2[] = new int[no. of elements here];
        
    ex-     int arr1[] = {7,5,6,7,7}; // if we have values during the creation of array 


7. Write a program on 2 D array. 

Ans-> A program on 2 D array - 

     int arrr[][] = {{5,6,7,8,8} ,
                      {7,5,6,7}, {4,6,7,8}}; 

    for(int a[] : arrr)
   {
    for(int b : a )
    {
       System.out.print(b);
    }
    System.out.println();
   }             
       


           