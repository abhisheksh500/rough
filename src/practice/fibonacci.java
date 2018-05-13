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
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int sum ;
        int j=1;
        for(int i = 2;i<=n;i++)
        {
            sum = temp +j;
            System.out.println(sum);
            temp = j;
            System.out.println("j value"+j);
            System.out.println("temp value"+temp);
            j = sum;
            System.out.println("j value after"+j);
        }
        
    }
}
