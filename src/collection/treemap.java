/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Abhishek
 */
public class treemap {
    public static void main(String[] args) {
        TreeSet<String> tr=new TreeSet<String>();  
  tr.add("Ravi");  
  tr.add("Vijay");  
  tr.add("Ravi");  
  tr.add("Ajay");  
   
  Iterator<String> i=tr.iterator();  
  while(i.hasNext()){  
   System.out.println(i.next());  
  }  
    }
}
