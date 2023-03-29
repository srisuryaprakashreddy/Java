class parent{
    public void print(){
        System.out.println("this is parent class");

    }
}
class child extends parent{

    public void display() {
        System.out.println("this is child class ");

    }
}

public class inheritancebeggining {
    public static void main(String[] args) {
        child obj=new child();
        parent obj1=new parent();
        obj1.print();
        obj.display();
        obj.print();


    }
}
