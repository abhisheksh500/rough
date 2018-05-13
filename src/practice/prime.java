package practice;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int m = n/2;
        if(n==0||n==1)
        {
            System.out.println("no is not prime");
        }
        else
        {
        for(int j = 2;j<=m;j++)
        {
            if(n%j==0)
            {
                
                count++;
                break;
            }
           
        }
        if(count == 0)
        {
            System.out.println("no is prime");
        }
        else
        {
            System.out.println("no is not prime");
        }
        }
    }
}
