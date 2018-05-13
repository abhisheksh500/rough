
package test;

public class palind {
    public static void main(String[] args) {
        int n = 1232;
        int i;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            i=n%10;
            System.out.println(i);
            sum = (sum *10)+i;
            n=n/10;
            System.out.println("gag"+n);
            
        }
        if(sum==temp)
        {
            System.out.println("palendrom");
        }
        else
        {
            System.out.println("not");
        }
    }
 
}
