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
abstract class demo2 {
    abstract void eat();
}
class test{
    public static void main(String[] args) {
        demo2 d = new demo2() {
        void eat()
        {
            System.out.println("nice"); }
        };
        d.eat();
    }
}
