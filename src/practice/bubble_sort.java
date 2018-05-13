package practice;


import java.util.Scanner;


public class bubble_sort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       int arr[] = new int[n];
       int temp;
       for(int i=0;i<n;i++)
       
           arr[i] = sc.nextInt();
           
       for(int k=0;k<(n-1);k++)
       {
       for(int j = 0;j<n-k-1;j++)
       {
           if(arr[j]>arr[j+1])
           {
               temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1] = temp;
           }
       }
       }
        System.out.println("sorted list");
      for(int c=0;c<n;c++)
           System.out.println(arr[c]);
        System.out.println(arr[2]);
      /* for(int c = n-1;c>=0;c--)
       {
           System.out.println(arr[c]);
       }*/
    }
 
}
