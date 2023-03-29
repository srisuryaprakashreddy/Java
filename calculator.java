import java.util.*;
public class calculator {
    int i;
    public static void main(String[] args) {
        System.out.println("enter operation you want to do \n  -  +   *   ");
        Scanner x= new Scanner(System.in);
        char a=x.next().charAt(0);
        System.out.println("enter  no of values you want to do functions ");
        int d=x.nextInt();
        float[] b=new float[d];
        for(int i=0;i<d;i++){
            b[i]=x.nextFloat();
        }
        switch (a){
            case '+':
            { float sum=0;
                for (int i=0;i<d;i++){
                sum =sum+ b[i];

            }


                System.out.println("the answer is " + sum);
                break;
            }
            case '-':
            { float sub=0;
                for (int i=0;i<d;i++){
                    sub = b[i]-sub;

                }
                System.out.println("the answer is " + sub);
                break;
            }
            case '*':
            { float mul=1;
                for (int i=0;i<d;i++){
                    mul = b[i]*mul;}
                System.out.println("the answer is " + mul);

                    break;}

        }
}
}