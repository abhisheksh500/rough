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
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0,j=0;
        int temp ;
        temp = n;
        while(n>0)
        {
            
        sum = n%10;
        
        j=(j*10)+sum;
        n=n/10;
            System.out.println(j);
        }
        if(j==temp)
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("no palindrom");
        }
    }
}
