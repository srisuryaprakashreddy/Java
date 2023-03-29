import java.util.*;

public class classesandobjects {
    static class area{
        float l,b;
        public void setdim()
        {
            System.out.println("enter the values of length and breadth");
            Scanner x=new Scanner(System.in);
            float l=x.nextFloat();
            float b=x.nextFloat();
            System.out.println("the area of the rectangle is "+ l*b);

        }


    }
    public static void main(String[] args) {

        area obj =new area();
        obj.setdim();
        //obj.getarea();

    }
}
