interface a {
    void dispaly();
}
interface b{void print();}

class c implements a,b{
    @Override
    public void dispaly() {
        System.out.println("kush");
    }

    @Override
    public void print() {
        System.out.println("surya");
    }
}
public class multipleinheritanc  {
    public static void main(String[] args) {


    c o=new c();
    o.dispaly();
    o.print();
    }

}
