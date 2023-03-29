import java.util.Scanner;

public class class_array {
    /*  4
arrrays notes
     array initilization
     datatype varname[][];
     varnamae=new datatype[size];
     to intilize the  arrahy we have to use indexes of array at eaht index we want store the array
     a[0]=5;
     a[1]=4;
     a[3]=45;


     -------------arrays-------------

     */
    public static void main(String[] args) {
        System.out.println("enter the dimension of matrix");
        Scanner x = new Scanner(System.in);
        int a, b;
        a = x.nextInt();
        b = x.nextInt();
        double[][] arr = new double[a][b];
        int i = 0;
        int j = 0;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                Scanner y = new Scanner(System.in);

                arr[i][j] = y.nextDouble();

            }
        }

        double[][] arr1 = new double[a][b];

        for (int n = 0; n < a; n++) {
            for (int s = 0; s < b; s++) {
                Scanner y = new Scanner(System.in);

                arr1[i][j] = y.nextDouble();

            }
        }

        //---------------------addtion of matrixs--------------------
        char c = x.next().charAt(0);
        double arr2[][] = new double[a][b];
        System.out.println("enter the process  you want to  do +");

        switch (c) {
            case '+': {
                for (int g = 0; g < a; g++) {
                    for (int f = 0; f < b; f++) {

                        arr2[i][j] = arr[i][j] + arr1[i][j];


                    }
                }
                for (int h = 0; h < a; h++) {
                    for (int o = 0; o < b; o++) {
                        System.out.println(arr2[i][j]);

                    }

                }

                System.out.println("");

            }
            case '-':
            {
                for (int q = 0; q < a; q++) {
                    for (int w = 0; w<b; w++) {

                        arr2[i][j] = arr[i][j] - arr1[i][j];


                    }
                }
                for (int v = 0; v < a; v++) {
                    for (int m = 0; m < b; m++) {
                        System.out.println(arr2[i][j]);

                    }

                }

            }


        }
    }
}
