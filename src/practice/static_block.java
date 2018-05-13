package practice;


public class static_block {
    
    static int a = 10;
    void a()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        int b=1;
        int sum = 0;
      int a=5;
        while(b<5)
        {
            
             sum = a+b;
            b++;
                    System.out.println("fdgc"+sum);

        }
        System.out.println(sum);
        static_block obj = new static_block();
        obj.a();
    }
}
