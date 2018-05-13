/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough1;


/**
 *
 * @author Abhishek
 */
public class Car {
void run(){
System.out.println("car"); 
}
}
 class Audi {
void run()
{
System.out.print("audi");
}
}
 class car2 extends Audi
{
public static void main( String args[])
{
Audi b=new Audi();
b.run();
}
}
