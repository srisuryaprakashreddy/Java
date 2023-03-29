import java.util.Scanner;

public class labexperiment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF EMPLOYEES: ");
        int n = in.nextInt();
        String empId[] = new String[n];
        String EmpName[] = new String[n];
        String Join_date[] = new String[n];
        String des_code[] = new String[n];
        String Dept[] = new String[n];
        int Basic[] = new int[n];
        int Hra[] = new int[n];
        int It[] = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE INFORMATION OF EMPLOYEE ");
            System.out.println("ENTER THE EMPLOYEE ID: ");
            empId[i] = in.next();
            System.out.println("enter the emp name: ");
            EmpName[i] = in.next();
            System.out.println("ENTER THE JPOIN DATE: ");
            Join_date[i] = in.next();
            System.out.println("ENTER THE DESIGNATION CODE{e, c, k, r, m}: ");
            des_code[i] = in.next();
            System.out.println("ENTER THE DEPARTMENT: ");
            Dept[i] = in.next();
            System.out.println("ENTER THE BASIC SALARY: ");
            Basic[i] = in.nextInt();
            System.out.println("ENTER THE HRA SALARY: ");
            Hra[i] = in.nextInt();
            System.out.println("ENTER THE IT SALARY: ");
            It[i] = in.nextInt();
        }
        String Des_code_fixed[] = {"e", "c", "k", "r", "m"};
        String Desg_fixed[] = {"engg","cons", "clerk", "recp", "manager"};
        int DA[] = {20000, 32000, 12000, 15000, 40000};
        System.out.println("SEARCH EMPLOYEE");
        String find = in.next();
        for (int i = 0; i < n; i++) {
            if(find.equals(empId[i])){
                String id =  des_code[i];
                int idx= -1;
                for (int j = 0; j < 4; j++) {
                    if (Des_code_fixed[i].equals(id)){
                        idx=j;
                        break;
                    }
                }
                System.out.println("SALARY OF THE EMPLOYEE IS");
                int salary = Basic[i]+Hra[i]+DA[idx]-It[i];
                System.out.println((salary));



            }
    }


}

}