
public class vishal3 {
    public int x=0;
    class innerclass{
        public int x=1;
        void innermethod(int x){
            System.out.println("value of x = "+x);
            System.out.println("value of this.x="+this.x);
        }
    }

    public static void main(String[] args) {
        vishal3 o=new vishal3();
        vishal3.innerclass im=o.new innerclass();
        im.innermethod(55);
    }
}
