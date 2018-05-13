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
public class local {
    private int i =100;
    void dis()
    {
        class local2
        {
            void disp()
            {
                System.out.println("display "+i);
            }
        }
        local2 l = new local2();
        l.disp();
    }
    public static void main(String[] args) {
        local lo = new local();
        lo.dis();
    }
}
