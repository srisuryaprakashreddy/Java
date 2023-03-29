
import java.lang.*;
class threada1 implements Runnable{
    public void run() {
        System.out.println("odd number :5");
    }}
class threada2 implements Runnable{
    public void run(){
        for (int i=1 ;i<9 ;i++ )
        {
            if(i%2 != 0)
                System.out.println(i);
        }
    }}
public class threadprogram {
    public static void main(String[] args) {
        threada1 bullet1 = new threada1();
        Thread gun1=new Thread(bullet1);
        threada2 bullet2 =new threada2();
        Thread gun2 =new Thread(bullet2);
        gun1.start();
        gun2.start();
    }

}

