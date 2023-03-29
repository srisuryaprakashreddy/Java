class first{
    void display(){
        System.out.println("inside first");
    }
}
class second extends first{
    void display(){
        System.out.println("inside second");
    }
}
public class ved2 {
    public static void main(String[] args) {
        first obj=new first();
        second obj2=new second();
        first ref;
        ref=obj;
        ref.display();
        ref=obj2;
        ref.display();
    }
}
