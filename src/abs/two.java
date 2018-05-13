/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs;

/**
 *
 * @author Abhishek
 */
public class two extends one{
    void display()
    {
        System.out.println("its display in two");
    }
}
class three extends one{
    void display()
    {
        System.out.println("its  display  in three");
    }
    public static void main(String[] args) {
        one obj = new two();
        one obj1 = new three();
        obj.display();
        obj1.display();
    }
}
