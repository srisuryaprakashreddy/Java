import java.util.*;
class triangle{
    Scanner x=new Scanner(System.in);// how to use the constructor variable values in the functions
    double a =x.nextDouble();
    double b =x.nextDouble();
    double c =x.nextDouble();
    double s= (a+b+c)/2;
    public void area(){
        System.out.println("the area of the triangle is "+Math.pow((s*(s-a)*(s-b)*(s-c)),0.5));
         }
    public void perimeter(){
            System.out.println("the perimeter of the triangle is "+(a+b+c));}
}
public class areaoftriangle {
    public static void main(String[] args) {
        System.out.println("enter the values of triangle a,b,c ");
        triangle obj=new triangle();
        obj.area();
        obj.perimeter();

    }
}
