/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Abhishek
 */
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
        hm.put(100, "bbb");
        hm.put(101, "jk");
        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
            System.out.println(hm.clone());
            System.out.println(hm.size());
           
        }
    }
}
