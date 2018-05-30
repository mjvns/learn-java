import javax.swing.*;
import java.awt.*;

public class GUI2 extends JFrame{
    JLabel l1 = new JLabel("Username:");
    JLabel l2 = new JLabel("Password:");
    JTextField t1 = new JTextField(30);
    JPasswordField t2 = new JPasswordField(30);
    JButton b = new JButton("Login");
    Container c;
    GUI2(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        l1.setBounds(10,10,100,20);
        c.add(l1);
        t1.setBounds(110,10,100,20);
        c.add(t1);
        l2.setBounds(10,50,100,20);
        c.add(l2);
        t2.setBounds(110,50,100,20);
        c.add(t2);
        b.setBounds(110,100,100,30);
        c.add(b);
    }
    public static void main(String args[]){
        GUI2 obj = new GUI2();
        obj.setVisible(true);
        obj.setBounds(250,200,300,300);
        obj.setTitle("Login Page");
    }
}