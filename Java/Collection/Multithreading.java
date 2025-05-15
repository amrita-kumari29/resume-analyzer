import java.util.*;

class  Example implements Runnable{

    public void run()
    {
        try{
          for(int i=0;i<3;i++){
            System.out.println("Focus is important");
            Thread.sleep(3000);
          }
        }
        catch(Exception e){
            System.out.println("Some problem");
        }
    }

}

public class Multithreading
{
    public static void main(String[] args) throws Exception
    {
       Example ex = new Example();
       Thread t1 = new Thread(ex);
       t1.start();
       t1.interrupt();
    }
}
    
