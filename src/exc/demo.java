/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc;

/**
 *
 * @author Abhishek
 */
public class demo {
    public static void main(String[] args) {
        try{
            int i=200/0;
            //String i =null;
           // System.out.println(i.length());
          String s="abbb";
           int d = Integer.parseInt(s);
           //int ar[] = new int[5];
             //      ar[5]=10;
        }
        catch(NumberFormatException e)
        {
           // System.out.println("divided by 0   "+e);
           // System.out.println("null pointer exception  "+e);
            System.out.println("number format exception   "+e);
           // System.out.println("array out of bound exception   "+e);
        }
       catch(ArithmeticException e)
        {
            System.out.println("div by 0");
        }
        catch(Exception e)
        {
            System.out.println("rest of ccode");
        }
        finally
        {
            System.out.println("bsakdb");
        }
    }
}
