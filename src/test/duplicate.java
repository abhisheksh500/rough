/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class duplicate {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int arr[] = new int[n];
       int temp;
       for(int i=0;i<n;i++)
       
           arr[i] = sc.nextInt();
           
       
       for(int j = 0;j<n;j++)
       {
           if(arr[j]%2==0)
           {
               System.out.println("sdkdsk"+arr[j]);
           }
       
       }
        System.out.println("sorted list");
      for(int c=0;c<n;c++)
           System.out.println(arr[c]);
        
       
    }
}
