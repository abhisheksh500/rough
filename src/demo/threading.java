package demo;
public class threading {
    public static void main(String[] args) throws InterruptedException  {
        multithreading m = new multithreading();
        Three t = new Three();
       // m.start();
       // t.start(); 
        //System.out.println(m.setPriority());
        //System.out.println(t.getName());
        //System.out.println(m.getId());
        //System.out.println(m.getPriority());
        //System.out.println(m.getThreadGroup());
        //System.out.println(m.isInterrupted());
        m.run();
        t.run();
        t.sleep(10);
        m.setDaemon(true);
        t.join(1);
        if(m.isDaemon())
        {
            System.out.println("jgfs");
        }
        //System.out.println(m.getState());
        //System.out.println(m.getName());
        
    }
}
