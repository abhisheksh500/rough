package practice;


public class this_currentclass {
int rollno;
String name;
float fee;
this_currentclass(int rollno,String name,float fee)
{
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
}
void m()
{
    System.out.println("bababab");
}
this_currentclass(int rollno,String name)
{
    this(1000,"bdhsk",666);
    System.out.println(rollno+name);
}
void display()
{
   
    m();
    System.out.println(rollno+name+fee);
}
}
class test{
    public static void main(String[] args) {
        this_currentclass obj = new this_currentclass(100,"bajasd",100000);
        this_currentclass obj1 = new this_currentclass(100,"bajasd");
        obj.display();
        obj.display();
    }
}
