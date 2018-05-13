
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class file {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh.txt");
        File fa = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abhnn.txt");
        f.createNewFile();
        
        
       //System.err.println(f.exists());
        Scanner sc = new Scanner(f);
 
        while (sc.hasNextLine())
        System.out.println(sc.nextLine());
        //System.out.println(f.getAbsoluteFile());
      //  System.out.println(f.getAbsolutePath());
        //System.out.println(f.getCanonicalFile());
       // System.out.println(f.isHidden());
        //System.out.println(f.length());
        //System.out.println(f.list());
    //System.out.println(f.getFreeSpace());
        //System.out.println(f.getName());
        //System.out.println(f.getPath());
        //System.out.println(f.renameTo(fa));
    }
}
