package practice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
abstract class shape {
    abstract int circle(int r);
    abstract int rectangle(int l, int b);
    abstract int square(int s);
    
}
class demo1 extends shape
{
public int circle(int r)
{
    int circle = 2*r;
    return circle;
}
public int rectangle(int l,int b)
{
    int rectangle = 2*(l+b);
    return rectangle;
}
public int square(int s)
{
    int square = s*s;
    return square;
}
    public static void main(String[] args) {
        demo1 d = new demo1();
        System.out.println(d.circle(2));
        System.out.println(d.rectangle(3, 5));
        System.out.println(d.square(5));
        
    }
}