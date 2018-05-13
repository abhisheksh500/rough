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
public class armstring {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0,sum=0,temp;
        temp=n;
        while(n>0)
        {
            i=n%10;
           sum=(i*i*i)+sum;
           n=n/10;
        }
        if(sum==temp){
        System.out.println("armstrong");
        }
        else
        {
            System.out.println("no armstrong");
        }
    }
}
