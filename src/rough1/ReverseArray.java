/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough1;

import java.io.*;
import java.util.*;


public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        String result = "";
        
        	for (int i = arr.length - 1; i >= 0; i--) {
            	result = result + arr[i] + " ";
        	}
        
        	System.out.println(result);
        in.close();
    }
}

