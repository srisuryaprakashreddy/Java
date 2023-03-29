import java.util.Scanner;

class students
{ public String name,address,uid,number;
    Scanner x=new Scanner(System.in);//doubt can we initilize two objects in one line.........

    public void prints()
    {

        name=x.nextLine();
        address=x.nextLine();
        uid=x.nextLine();
        number=x.nextLine();
        System.out.println("details of "+name+ "\n"+address+"\n"+uid+"\n"+number);

    }
}
public class studentsdata2 {
    public static void main(String[] args) {
        students obj =new students();
        students obj1=new students();
        obj.prints();
        obj1.prints();

    }




}
