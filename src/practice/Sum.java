package practice;


 abstract class Sum {
     abstract int sumofTwo(int n1, int n2);
     abstract int sumofThree(int n1,int n2,int n3);
    public void disp()
    {
        System.out.println("method of class sum");
    }
}
class demo extends Sum {
    public int sumofTwo(int num1,int num2)
    {
        return num1+num2;
    }
    public int sumofThree(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        Sum obj = new demo();
        System.out.println(obj.sumofTwo(2,4));
        System.out.println(obj.sumofThree(2, 3, 4));
        obj.disp();
    }
}