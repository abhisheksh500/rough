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
public class febo {
    public static void main(String[] args) {
        int i =0,f=1,n=10;
        int sum;
        for(int j=2;j<=n;j++)
        {
            sum = i+f;
                    i=f;
                    f=sum;
            System.out.println(sum);
        }
    }
}
