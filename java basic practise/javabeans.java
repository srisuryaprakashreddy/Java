import java.io.*;
class GetSet
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String N)
    {
        this.name = N;
}
 }
 class main
 {
     public static void main(String[] args) {
         GetSet obj = new GetSet();
         obj.setName("surya");
         System.out.println(obj.getName());
     }
 }