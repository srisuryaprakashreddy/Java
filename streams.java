
    import java.io.*;
    class streams
    {
        public static void main(String[] args)
        {
            try
            {
                FileOutputStream fos = new FileOutputStream("serial");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeDouble(3.5);
                oos.flush();
                oos.close();
            }
            catch(Exception e)
            {
                System.out.println("Serialization" + e);
                System.exit(0);
            }
            try
            {
                float x;
                FileInputStream fis = new FileInputStream("serial");
                ObjectInputStream ois = new ObjectInputStream(fis);
                x=ois.readInt();
                ois.close();
                System.out.println(x);
            }
            catch (Exception e)
            {
                System.out.print("deserialization");
                System.exit(0);
            }
        }
    }

