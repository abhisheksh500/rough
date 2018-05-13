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
public class armstr {
    public static void main(String[] args) {
        int n =15;
        int temp =n;
        int sum = 0;
        int i ;
        while(n>0)
        {
            i = n%10;
            sum = sum+(i*i*i);
            n=n/10;
            
        }
        if(sum==temp)
        {
            System.out.println("arm");
        }
        else
        {
            System.out.println("not");
        }
    }
}
