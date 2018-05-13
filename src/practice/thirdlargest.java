package practice;


public class thirdlargest {
    public static void main(String[] args) {
        int arr[]={4,6,89,43,2,66};
        int temp;
        for(int j=0;j<5;j++)
        {
        for(int i =0;i<5-j;i++)
        {
           if(arr[i]>arr[i+1])
           {
               temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
           }
        }
        }
        for(int v:arr)
            System.out.print(v+" ");
        System.out.println();
        System.out.println(arr[2]);
    }
}
