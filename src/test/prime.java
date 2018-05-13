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
public class prime {
    public static void main(String[] args) {
        int n = 12;
        int m = n%2;
        int count =0;
        for(int i =1;i<=m;i++)
        {
            if(n%i==0)
            {
                count++;
                
                break;
            }
        }
        if(count == 1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
