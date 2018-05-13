
package abs;


 class seven implements four,five{
    
        public void show()
        {
            System.out.println("it's show");
        }
        public void print()
        {
            System.out.println("it's print");
        }
     public static void main(String[] args) {
      seven obj2 = new seven();
      obj2.print();
      obj2.show();
     }
}
