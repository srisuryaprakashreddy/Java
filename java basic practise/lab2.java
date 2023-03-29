import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        System.out.println("enter the no of employees data you want to enter");
        Scanner c= new Scanner(System.in);
        int n=c.nextInt();
        String[] empid=new String[n];
        String[] empname=new String[n];
        String[] depname=new String[n];
        String[] dateofjoin=new String[n];
        double [] basic=new double[n];
        double [] hra=new double[n];
        double [] it=new double[n];
        double [] da=new double[n];
        String [] empdes=new String[n];



        for (int i = 0; i < n; i++) {
            System.out.println("enter employee id :");
            empid[i] =c.nextLine();

            System.out.println("enter employee name :");
            empname[i] =c.nextLine();
            System.out.println("enter employee department :");
            depname[i] =c.nextLine();
            System.out.println("enter employee join date :");
            dateofjoin[i] =c.nextLine();
            System.out.println("enter employee basic salary :");
            basic[i] =c.nextInt();
            System.out.println("enter employee hra :");
            hra[i] =c.nextInt();
            System.out.println("enter employee it :");
            it[i] =c.nextInt();
            System.out.println("enter the code of designation of the employee");
            System.out.println("p ,e, m ,d ,c");
            empdes[i]=c.nextLine();
            switch(empdes[i]){
                case "p":
                {
                    da[i]= (basic[i]*0.30);
                }
                case "e":
                {
                    da[i]= (basic[i]*0.25);
                }
                case "m":
                {
                    da[i]= (basic[i]*0.20);
                }
                case "d":
                {
                    da[i]= (basic[i]*0.15);
                }
                case "c":
                {
                    da[i]= (basic[i]*0.10);
                }
                default:
                {
                    System.out.println("employee  designation not found");
                }

            }
        }
        System.out.println("enter employee id to search");
        String id=c.nextLine();
        for (int j = 0; j < n; j++) {
            if(empid[j]==id)
            {
                double salary=(basic[j]+hra[j]+da[j]-it[j]);
                System.out.println("salary of "+empname[j]+" is "+salary);
                System.out.println("designation of surya is "+empdes[j]);
            }
            else {
                System.out.println("employee id not found");
            }

        }
    }
}
