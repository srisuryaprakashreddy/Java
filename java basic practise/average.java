import java.util.Scanner;

class averages{
    public void method(){
        System.out.println("enter the number of numbers u want to take average of ");
        Scanner z= new Scanner(System.in);
        int b=z.nextInt();
        int[] a=new int[b-1];
        for (int i = 0; i < b; i++) {
            a[i]=z.nextInt();

        }
        int average =0;
        for (int j = 0; j < b; j++) {
            average = average +a[j];


        }
        System.out.println("the average of numbers entered is "+ average/b);

    }
}
public class average {
    public static void main(String[] args) {
        averages obj=new averages();

    }
}
