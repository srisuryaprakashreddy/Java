import java.util.*;
public class Video {
    public String title;
    public boolean checked =true;
    int avgrating;
    public boolean checked()
    {
        return checked;
    }
    public void rent()
    {
        checked=false;
    }
    public void returned()
    {
        checked=true;
        System.out.println("video is returned");
    }
    public int getrating()
    {
        if (avgrating>0)
        {
            return avgrating;
        }
        else {
            System.out.println("rating is not available");
            return 0;
        }

    }
}
