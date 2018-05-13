/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Abhishek
 */
public class arraylist {
    public static void main(String[] args) {
        List a1=new ArrayList();
        a1.add(10);
        a1.add(11);
        a1.add(1,22);
        
        ListIterator it = a1.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
