import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basicolorchange extends JFrame implements ActionListener{
    JButton button1 = new JButton("Green");
    JButton button2 = new JButton("Red");
    Container c;

    public basicolorchange(){
        c = this.getContentPane();
        c.setLayout(null);
        button1.setBounds(150,100,100,80);
        button2.setBounds(350,100,100,80);
        button1.addActionListener(this);
        button2.addActionListener(this);
        c.add(button1);
        c.add(button2);
    }

    public static void main(String args[]){
        basicolorchange obj = new basicolorchange();
        obj.setVisible(true);
        obj.setBounds(200,250,500,500);
        obj.setTitle("COLOR CHANGE");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            c.setBackground(Color.GREEN);
        }else if(e.getSource() == button2){
            c.setBackground(Color.RED);
        }
    }
}
