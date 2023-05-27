import java.util.InputMismatchException;
import java.util.Scanner;


// The interface SelectType contains three abstract methods. 
interface SelectType 
{
    void enterDetails();
    void calculate();
    void show();
}

// The class Faherinheit implements SelectType and give body to methods 
class Fahrenheit implements SelectType
{
    float calcius, temp;
    Scanner scan = new Scanner(System.in);
  public void enterDetails()
  {
    System.out.println("Entre the temperature in calcius - "); 
    calcius = scan.nextFloat();
  }

  public void calculate()
  {
    temp = calcius*(9/5f) + 32;

  }

  public void show()
  {
    System.out.println("Temperature in Fahrenheit is - " + (int)temp + " Degree ");
  }


}

// The class Calcius  implements SelectType and give body to methods 

class Calcius implements SelectType
{
    float temp, faherinite;
    Scanner scan = new Scanner(System.in);
    public void enterDetails()
  {
    System.out.println("Entre the temperature in Faherinite "  );

    faherinite = scan.nextFloat();

  }

  public void calculate()
  {
     temp = (faherinite-32)*5/9f;
  }

  public void show()
  {
     System.out.println(" Temperature in calcius is  " + (int)temp + " Degree");
  }

}

// This is for losse compuling 
class Call 
{
    public void call(SelectType selectType)
    {
        selectType.enterDetails();
        selectType.calculate();
        selectType.show();
    }
}
class MainConverter
{
    static 
    {
        System.out.println("Welcome to temperature App ");
        System.out.println("Press 1  to convert temperature form celcius to faherinite ");
        System.out.println("Press 2 to convert temperature form faherinite to celcius ");

    }

    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        // This try catch methods are used to handle exception if occours at any time in the program 
        try{
            n = scan.nextInt();

        }
         
        catch(InputMismatchException e)
        {
           System.out.println("Input Mismatch please entre the right input and rerun the app ");
        }

        
        

       SelectType fahrenite = new Fahrenheit();
       SelectType calcius = new Calcius();
      
       Call callObj = new Call();
      if(n==1)
      {
         callObj.call(fahrenite);
         
      }

      else if(n==2)
      {
        callObj.call(calcius);
      }
      
      else 
      {
        System.out.println("Please Entre the right input ");
      }
      
      scan.close();
    }
}