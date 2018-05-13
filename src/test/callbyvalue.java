/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Abhishek
 */
public class callbyvalue {
    int i = 100;
    void change(callbyvalue c)
    {
        c.i  = c.i+100;
    }
    public static void main(String[] args) {
        callbyvalue c = new callbyvalue();
        System.out.println("before"+c.i);
        c.change(c);
        System.out.println("after"+c.i);
    }
}
