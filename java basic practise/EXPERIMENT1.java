import java.util.*;



public class EXPERIMENT1 {
    public static void main(String[] args) {


        System.out.println("enter the a,b,c values");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d))/(2*a);
            double x2 = (-b + Math.sqrt(d))/(2*a);
            System.out.println("the roots are "+x1+" "+x2);;
            if (d < 0) {
                System.out.println("no real roots exists");


            }
        }

    }
}
