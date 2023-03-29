import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class area{

 int length ,breadth;

    public area(int l, int b)//important solution found remember it
            //to initilize a variable from the constructor.
    {
      length=l;
      breadth=b;
    }
    public int returnarea()
    {
       return (length*breadth);

    }
}
public class areaofrectangle2 {
    public static void main(String[] args) {
        System.out.println("enter values of length and breadth");
        Scanner x=new Scanner(System.in);
       int l=x.nextInt();
        int b=x.nextInt();
        area obj=new area(l,b);
        obj.returnarea();
        System.out.println("area of the rectangle is "+obj.returnarea());


    }



}
