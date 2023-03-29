import javax.swing.*;
import java.awt.*;

public class awt {
    awt(){
        Frame f=new Frame();

        Button b= new Button ("submit");
        TextField t = new TextField();
        Label l=new Label("EMPLOYE ID");

        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(400,400);
        f.setLayout(null);
        f.setTitle("employee details");
        f.setVisible(true);
    }

    public static void main(String[] args) {
        awt a =new awt();
    }
}
