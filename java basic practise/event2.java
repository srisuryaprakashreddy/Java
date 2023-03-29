import java.awt.*;
import java.awt.event.*;

class event2 extends Frame implements ActionListener{
    int sum=0;
    Button b;
    TextField t;
    event2()
    {
        t=new TextField();
        b=new Button("click me");
        t.setBounds(60, 50,170,20);
        b.setBounds(100,120,80,30);

        b.addActionListener(this);

        add(b);
        add(t);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)

    {            sum=sum+1;
            String str=sum+"";
            t.setText(str);
        }

    public static void main(String[] args) {
        new event2();
    }
}
