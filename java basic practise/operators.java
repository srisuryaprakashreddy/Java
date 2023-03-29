import java.util.*;
public class operators {
    public static void main(String[] args) {
        //opertors
        System.out.println("enter the values  of a , b ");
        Scanner x =new Scanner(System.in);
        float a= x.nextFloat();
        Scanner y=new Scanner(System.in);
        float b =y.nextFloat();
        System.out.println("sum of a,b "+ (a+b));//addition
        System.out.println("sub of a,b " + (a-b));//subtraction
        System.out.println("mul of a,b" + (a*b));//multiplication
        System.out.println("division of a,b" +( a/b));//division
        System.out.println("mudulus of a,b "+ (a%b));//modulo
        float c =b;
        System.out.println( "value of c "+ (c));
        System.out.println("c+2 " +(c+=2));
        System.out.println("c-2 " +(c-=2));
        System.out.println("c*2 " +(c*=2));
        System.out.println("c/2 " +(c/=2));
        System.out.println("c%2 " +(c%=2));
        //relational
        float d = a;
        if (d>b){
            System.out.println("surya");
        }else if(d!=a)
        {
            System.out.println("lakshay");
        }else if(d>=a)
        {
            System.out.println("ram");
        }
        else {
            System.out.println("dhanush");
        }
        //logical
                // && operator
                System.out.println((a > b) && (a > c));  // true
                System.out.println((d > c) && (b < a));  // false
                // || operator
                System.out.println((a< c) || (a > d));  // true
                System.out.println((c > b) || (b < a));  // true
                System.out.println((d < b) || (a < d));  // fals
                // ! operator
                System.out.println(!(a == c));  // true
                System.out.println(!(b > d));  // false
     //uniary operators
        System.out.println("increament of a is "+ (++a));
        System.out.println("decreament of b is "+ (--b));
    }

    }

