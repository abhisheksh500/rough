/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Abhishek
 */
public class linklist {
    public static void main(String[] args) {
        LinkedList<String> a1=new LinkedList<String>();
        a1.add("abhi");
        a1.add("Sharma");
        a1.remove("Sharma");
        a1.addFirst("aabb");
        a1.addLast("mjo");
        
        System.out.println("Linked List "+a1);
        System.out.println("get first "+a1.getFirst());
        System.out.println("get Last "+a1.getLast());
        System.out.println("index of "+a1.indexOf(a1));
        int size = a1.size();
        System.out.println("size of link list "+size);
        boolean b = a1.contains("mjo");
 
        if(b)
            System.out.println("List contains the element 'mjo' ");
        else
            System.out.println("List doesn't contain the element 'mjo'");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
