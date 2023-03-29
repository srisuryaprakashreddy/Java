// importing necessary libraries  
import java.awt.*;
import java.awt.event.*;
// Our class extends Frame class and implements ActionListener interface  
public class TextFieldExample2 extends Frame implements ActionListener {
    // creating instances of TextField and Button class  
    TextField tf1, tf2, tf3,tf4,tf5,tf6,tf7;
    Button b1;
    Button b2;
    Label l1,l2,l3,l4,l5,l6,l7;
    // instantiating using constructor   
    TextFieldExample2() {
        // instantiating objects of text field and button  
        // setting position of components in frame  
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf4 = new TextField();
        tf4.setBounds(50, 200, 150, 20);
        tf5 = new TextField();
        tf5.setBounds(50, 250, 150, 20);
        tf6 = new TextField();
        tf6.setBounds(50, 300, 150, 20);
        tf7 = new TextField();
        tf7.setBounds(50, 350, 150, 20);


        b1 = new Button("submit");
        b1.setBounds(50, 400, 50, 50);
        b2 = new Button("clear");
        b2.setBounds(100, 400, 50, 50);

        // adding action listener  

        b1.addActionListener(this);
        b2.addActionListener(this);


        l1=new Label("empid");
        l1.setBounds(50, 30, 150, 20);
        l2=new Label("deptname");
        l2.setBounds(50, 80, 150, 20);
        l3=new Label("empdes");
        l3.setBounds(50, 130, 150, 20);
        l4=new Label("empname");
        l4.setBounds(50, 180, 150, 20);
        l5=new Label("date of join ");
        l5.setBounds(50, 230, 150, 20);
        l6=new Label("basic");
        l6.setBounds(50, 280, 150, 20);
        l7=new Label("hra");
        l7.setBounds(50, 330, 150, 20);

        // adding components to frame  
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(b1);
        add(b2);

        // setting size, layout and visibility of frame   
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    // defining the actionPerformed method to generate an event on buttons
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        String s3 = tf3.getText();
        String s4 = tf4.getText();
        String s5 = tf5.getText();
        String s6 = tf6.getText();
        String s7 = tf7.getText();
       /*int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;*/

        if (e.getSource() == b1){
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(s6);
            System.out.println(s7);
        }
        if (e.getSource() == b2){

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");

        }
       /* else if (e.getSource() == b2){
            c = a - b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);*/
    }
    // main method
    public static void main(String[] args) {
        new TextFieldExample2();
    }
}    