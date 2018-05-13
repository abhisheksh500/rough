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
public class constructor_thread implements Runnable {
    public void run(){  
        System.out.println(Thread.currentThread().getName());  
        //System.out.println(Thread.activeCount());
} 
    public static void main(String[] args) throws InterruptedException {
        constructor_thread cot = new constructor_thread();
        //Thread t = new Thread(cot);
        //t.start();
        //t.getId();
        //t.run();
       // t.join();
        ThreadGroup gr = new ThreadGroup("group");
        Thread t1 = new Thread(gr, cot,"one");  
          t1.start();
          t1.run();
          Thread t2 = new Thread(gr, cot,"two");  
          t2.start();  
          t2.run();
          Thread t3 = new Thread(gr, cot,"three");  
          t3.start();  
          t3.run();
          System.out.println(gr.getName());  
         gr.list();  
        
    }
    
}
