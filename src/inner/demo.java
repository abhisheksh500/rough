/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner;

/**
 *
 * @author Abhishek
 */
public class demo {
    private int d=900;
    class inner{
        void mmsg()
        {
            System.out.println("data "+d);
        }
    }
    public static void main(String[] args) {
        demo obj = new demo();
        demo.inner i =obj.new inner();
        i.mmsg();
    }
}
