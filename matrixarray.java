import java.util.*;
public class matrixarray {
    public static void main(String[] args) {
//        System.out.println("enter the value of rows and columns in a matrix ");
//        Scanner x =  new Scanner(System.in);
//        int a=x.nextInt();//rows
//        int b=x.nextInt(); //columns
//        int[][] c= new
//                int[a][b];
//        for(int i=0; i<a;i++)
//        {
//            for(int j=0;j<b;j++)
//            {
//                System.out.println("enter the values in row "+i+"  and column "+j);
//                c[i][j]=x.nextInt();
//
//            }
//            System.out.print("\n");
//        }
//        for(int i=0; i<a;i++)
//        {
//            for(int j=0;j<b;j++)
//            {
//                System.out.print(c[i][j]);
//
//            }
//            System.out.print("\n");
//        }

     int[] arr={2,1,3,5,4};
     insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void insertionsort(int[] arr){
        for(int i=0; i<=arr.length-2; i++)
        {
            int flag=0;
            for(int j = i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=1;
                }
                if(flag==0){
                    break;
                }
            }
        }
    }
}
