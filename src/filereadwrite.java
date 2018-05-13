    
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class filereadwrite {
public static void writedata() throws IOException{
   File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh1.txt");
        FileWriter wr=new FileWriter(f);        
        if(f==null){
            System.out.println("null");
            f.mkdir();           
        }
        else{
            BufferedWriter bw=new BufferedWriter(wr);
                bw.write("hello how are you");
                bw.flush();                      
        }
    }
    public static void readdata() throws FileNotFoundException, IOException{
 File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh1.txt");
 FileReader fr =new FileReader(f);
        String line;       
        BufferedReader br=new BufferedReader(fr);
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    } 
    public static void createfile() throws IOException{
       File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh1.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        if(f==null){
            System.out.println("null");
        }
        else{
        BufferedWriter bw=new BufferedWriter(fw); 
        bw.write("hello how are you1");
        bw.flush();
         }      
            }
    public static void compare() throws FileNotFoundException, IOException{
         File f = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh1.txt");
          File f1 = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh2.txt");
        FileReader fr=new FileReader(f);
        FileReader frr=new FileReader(f1);
        String file,file2;
        BufferedReader br=new BufferedReader(fr);
        BufferedReader brr=new BufferedReader(frr);
        file=br.readLine();
        file2=brr.readLine();
        if(file.equals(file2))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Not same");
        }
    }
    public static void printdata(String a) throws IOException
    {
        
        FileWriter fw = new FileWriter("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh22.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.write(a);
        
        pw.flush();
        pw.close();
    }
    
    public static void main(String[] args) throws IOException {
            //writedata();
            //readdata();
            //createfile();
            //compare();
            
             File q = new File("C:\\Users\\Abhishek\\Desktop\\java\\file\\abh1.txt");
            q.createNewFile();
            String line;
            Scanner ss=new Scanner(System.in);
            System.out.println("Enter data");
            line=ss.nextLine();
            printdata(line);
            /*FileWriter fw=new FileWriter(q);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(line);
            //bw.append(line);
            bw.newLine();
            
            bw.flush();
            FileReader fr=new FileReader(q);
            BufferedReader br=new BufferedReader(fr);
            String copy;
            copy=br.readLine();
            //System.out.println(copy);
        /*System.out.println(f.exists());         
        System.out.println(f.compareTo(ff));
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalFile());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.getClass());
        System.out.println(f.getFreeSpace());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getParentFile()); 
        System.out.println(f.isAbsolute());
        System.out.println(f.lastModified());
        System.out.println(f.length());
            System.out.println(q.list());
        */
        
            
    } 
}
