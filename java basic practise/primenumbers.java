import java.util.*;

public class primenumbers {
    public static void main(String[] args) {
        System.out.println("prime numbers");
        Scanner x= new Scanner(System.in);
        int n=x.nextInt();
        int m= n/2;
        for (int i = 2; i < m; i++) {
            if (n%i==0)
            {
                System.out.println("print it is a  not prime ");

            }
            else
            {
                System.out.println("number is prime");
                break;
            }


        }

    }
}
