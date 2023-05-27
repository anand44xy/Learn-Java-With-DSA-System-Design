
import java.io.*;
public class LaunchFW 
{
    public static void main(String[] args) throws IOException
    {
       
     File dir=new File("PWSkills");
     File file=new File(dir, "PWSkills.txt");
     
        FileWriter fw=new FileWriter(file);
        fw.write("Welcome to the file");
        fw.write("\n");
        fw.write("PWSkills");
        fw.write("\n");
        fw.write(68);
        fw.write("\n");
        char[] ch={'j','a','v','a'};
        fw.write(ch);
        fw.flush();
       //fw.close();

        System.out.println("Open PWSkills.txt file to see results");
   
     
   
        
    }
    
}
