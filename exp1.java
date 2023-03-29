import java.util.*;

public class exp1 {/*Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0.
    Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, display a
    message stating that there are no real solutions*/

    public static void main(String[] args) {



    System.out.println("enter the values of a,b,c of the eqation ax2+bx+c = 0. ");
    Scanner x= new Scanner(System.in);
    int a =x.nextInt();
    int b=x.nextInt();
    int c=x.nextInt();

    double d= ((b*b)-(4*a*c));
    if(d < 0)
        System.out.println("there are no real solutions");

    else {
        double r=(-b+(Math.pow(d,0.5)))/(2*a);
        double s=(-b-(Math.pow(d,0.5)))/(2*a);
        System.out.println("the roots of the equation are  "+r+" "+s);
    }


}}
