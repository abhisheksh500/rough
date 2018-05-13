package demo;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class datetime {
    public static void main(String[] args) throws ParseException {
         SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
    Date date =sdf.parse("31/12/2018");
    System.out.println(date);
    Date d  = new Date();
    System.out.println("today "+d);
    //System.out.println(""+d.getTime());
    //System.out.println(d.compareTo(date));
       
    }
}
