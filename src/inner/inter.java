/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner;

/**
 *
 * @author Abhishek
 */
interface inter  {
    void show();
    interface disp{
        void dis();
    }
}
class teste implements inter.disp{
   public void dis()
    {
        System.out.println("asjsjas");
    }
   public void show()
   {
       System.out.println("223345");
   }
    public static void main(String[] args)throws Exception {
        inter.disp obj = new teste();
        obj.dis();
        
    }
}