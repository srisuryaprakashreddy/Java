class democlass {
    int a = 1;
    int b = 2;

    void fun() {
        demo obj = new demo();
        obj.display();
    }

    class demo {


        void display() {
            System.out.println(("na=" + a));
        }
    }

    void get() {
        System.out.println("nb=" + b);
    }
}

public class ved1 {
    public static void main(String[] args) {
        democlass obj=new democlass();
        obj.fun();
        obj.get();
    }
    }

