
public class matrixadd {
    public static void main(String[] args) {
        int a[][] = {{1,4,5},{6,8,3},{7,4,2}};
        int b[][]={{2,6,4},{5,8,3},{1,9,6}};
        int c [][]=new int[3][3];

        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                c[i][j]=a[i][j]+b[i][j];

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
