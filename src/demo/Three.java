/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Abhishek
 */
public class Three extends Thread {
    void three(){
         for(int i = 1;i<=10;i++)
        {
            System.out.println("3 table "+3*i);
        }
    }
    @Override
    public void run()
    {
        three();
    }
    
}
