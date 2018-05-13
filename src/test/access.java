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
class access {
    protected  int i =0;
  protected   int ab()
    {
        int sum =10;
        return sum+i;
    }
}
class aaaab{
    public static void main(String[] args) {
        access obj = new access();
        obj.ab();
        System.out.println(obj.i);
    }
}
