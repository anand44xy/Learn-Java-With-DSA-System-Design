package IOfiles;
import java.io.*;
public class anand44xy1 {
    public static void main(String[] args) throws IOException {
        String s="PWSkills";
        File dir=new File(s);
        System.out.println(dir.isDirectory());

        dir.mkdir();
        System.out.println("dir is refering to directory PWSkills :"+dir.isDirectory());
        File file=new File(dir, "PWSkills.text");

        file.createNewFile();
        System.out.println("file is refering to file PWSkills:"+file.isFile());
        
        int count=0;
        File f=new File("PWSkills");
        String[] str=f.list();
        for (String fileName : str) {
            count++;
            System.out.println(fileName);  
        }
        System.out.println("No of files is:"+count);
    }
}

