import java.util.Scanner;

class pyramid{
    public void print()
    {
        System.out.println("enter the number of loops you want to do ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i;
        for ( i = 0; i < n; i++) {
            System.out.println(" ");
            for ( i = 0; i < n; i++) {
                System.out.println(" ");
        for (int j = 0; j <= n ; j++) {
            //System.out.print("   ");
            System.out.print( " * ");}
            
        }}

    }

}
public class pyramidproblem {
    public static void main(String[] args) {
        pyramid obj=new pyramid();
        obj.print();
    }

}
