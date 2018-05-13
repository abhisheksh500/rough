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
public class pattern2 {
    public static void main(String[] args) {
        int n =5;
        int i , j,num=1;
        for(i=0;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num);
           num=num+1;
            }
            System.out.println();
        }
    }
}
