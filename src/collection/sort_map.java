
package collection;

import java.util.*;
public class sort_map {
    public static void main(String[] args) {
        SortedMap sm=new TreeMap();
        sm.put(1, "hgf");
        sm.put(3, "bye");
        sm.put(5, "rv");;
        sm.put(4, "golu");
        sm.put(1, "situ");
        Set s = sm.entrySet();
        Iterator i =s.iterator();
        while(i.hasNext())
        {
           Map.Entry m = (Map.Entry) i.next();
           int key = (int) m.getKey();
           String value =(String)m.getValue();
            System.out.println("key "+key+"value "+value);
        }
    }
    
}
