 package ex;
class runtimeexception{
    public runtimeexception()
    {
        //exceptions
        //checked -ioexeception,sqlexception
        //unchecked-runtimeexception
        int i,j,k ;
        i=8;j=0;
        try
        {
            k=i/j;
        }
        catch( ArithmeticException e)//runtime exception
        {
            System.out.println("cannot divide by zero"+e);
        }
        finally {
            System.out.println("you had entered a exception value");
        }
    }
}
class arthimeticexception extends runtimeexception
{
    public arthimeticexception()
    {int i,j,k ;
        i=8;j=0;
        try
        {
            k=i/j;
        }
        catch(Exception e)//runtime exception
        {
            System.out.println("cannot divide by zero"+e);
        }

    }
}

public class exceptionhandling {
    public static void main(String[] args) {
        arthimeticexception obj= new arthimeticexception();



    }
}

