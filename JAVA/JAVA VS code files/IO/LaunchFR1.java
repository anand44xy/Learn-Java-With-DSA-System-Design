import java.io.*;
public class LaunchFR1 {
    public static void main(String[] args) throws Exception  {
        File dir=new File("PWSkills");
        File file=new File(dir, "PWSkills.txt");

        FileReader fr=new FileReader(file);
        int i=fr.read();
        while (i!=-1) {
            System.out.println(i+"----> ");
            System.out.println((char)i);
            i=fr.read();
        }
        
    }
}
