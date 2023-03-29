import java.util.*;

public class gradeassigning {
    public static void main(String[] args) {

        System.out.println("enter your marks ");
        Scanner x= new Scanner(System.in);
        float a=x.nextFloat();
        if (a>=90){
            System.out.println("your grade is A");
        }
        else if(a>=80){
            System.out.println("your grade is B");
        }
        else if (a>=70){
            System.out.println("your grade is C");
        }
        else if(a>=60){
            System.out.println("your grade is D");
        }
        else if(a>=35){
            System.out.println("your grade is E");
        }
        else{
            System.out.println("your Fail");
        }



    }


}
