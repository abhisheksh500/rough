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
public class test1 {
    public static void main(String[] args) {
     int n=5;
     int num=1;
     for(int i=0;i<n;i++)
     {
         
         for(int j=1;j<=i;j++)
         {
                System.out.print(num);
                 num=num*(i-j)/(j+1);
             
         }
         System.out.println();
     }
    
    }
}
