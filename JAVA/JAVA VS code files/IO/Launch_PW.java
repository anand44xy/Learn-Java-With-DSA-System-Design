import java.io.*;
public class Launch_PW {

    public static void main(String[] args) throws IOException {
        File dir=new File("PWSkills");
        File file=new File(dir, "PWSkills.txt");
        
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        pw.write("Hello");
        pw.write("\n");
        pw.println("Anand");
        pw.println("Ajay");
        pw.print(true);
        pw.close();
        System.out.println("To see results go to PWSkills.txt file");

    }
}