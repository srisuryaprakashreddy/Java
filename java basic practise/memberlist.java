import java.util.Scanner;

class member {
    String name, age, number, address, salary;

    public member() {
        System.out.println("enter the details of member ");
        Scanner x = new Scanner(System.in);
        System.out.println("name ");
        name = x.nextLine();
        System.out.println("age");
        age = x.nextLine();
        System.out.println("number");
        number = x.nextLine();
        System.out.println("address");
        address = x.nextLine();
        System.out.println("salary");
        salary = x.nextLine();
    }


}
    class employee extends member{
        public String specilization;
        public employee()
        {
            System.out.println("enter the employee specilization");
            Scanner y=new Scanner(System.in);
            specilization =y.nextLine();
        }



    }
    class managers extends employee{
        public String department;
        public managers()
        {
            System.out.println("enter the employee department");
            Scanner z=new Scanner(System.in);
            department =z.nextLine();
        }
        public void print() {
            System.out.println("name :" + name);
            System.out.println("age :" + age);
            System.out.println("number :" + number);
            System.out.println("address :" + address);
            System.out.println("salary :" + salary);
            System.out.println("specilizartion  :"+  specilization);
            System.out.println("department   :"+department);
        }


    }


public class memberlist {
    public static void main(String[] args) {
        managers obj=new managers();
        obj.print();



    }
}
