/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Abhishek
 */
public class queue {
    public static void main(String[] args) {
       PriorityQueue<String> queue = new PriorityQueue<String>();
       queue.add("abhi");
       queue.add("fsd");
       queue.add("asd");
        System.out.println("head :"+queue.element());
        System.out.println("peak :"+queue.peek());
        Iterator i = queue.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        queue.remove();
        queue.poll();
        Iterator i2 = queue.iterator();
        System.out.println("delete 2 element");
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
    }
            
}
