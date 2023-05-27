import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBR {
 public static void main(String[] args) throws IOException {
    File dir=new File("PWSkills");
    File file=new File(dir ,"PWSkills.text");
    FileWriter fw=new FileWriter(file);
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write("Java 42");
    bw.newLine();
    bw.write("Mahindra Thar");
    bw.newLine();
    char[] ch={'A','N','A','N','D'};
    bw.write(ch);
    System.out.println("To see the result go to PWSkills.txt file");
    bw.flush();
    
 }   
}
