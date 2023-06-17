package IOfiles;
import java.io.*;


public class anand44xy {
    public static void main(String[] args) throws IOException {
        

    File file=new File("NewFile.text");
    System.out.println(file.exists());//false

    file.createNewFile(); 
    System.out.println(file.exists());// ture

    File dir=new File("PWFile");
    System.out.println(dir.exists());//false

    dir.mkdir();
    System.out.println(dir.exists());
}
}