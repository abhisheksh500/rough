/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Abhishek
 */
public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(55);
        v.add(11);
        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            System.err.println(e.nextElement());
        }
    }
}
