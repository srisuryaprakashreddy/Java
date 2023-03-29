import java.util.*;
public class arrayandloops {
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want to enter in the array");
        Scanner x=new Scanner(System.in);
        int n = x.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= x.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println( "the elements in the ARRAY are "+ a[i]);
        }
        for(int i=n-1;i<n;i--) System.out.println("the elements in the ARRAY in reverse order is " + a[i]);



    }
}
