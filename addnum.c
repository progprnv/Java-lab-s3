import java.awt.event.*;
import javax.swing.*;
public class Addnum extends JFrame implements ActionListener{
    JFrame f=new JFrame("Addnum");
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b;
    public Addnum(){
        f.setLayout(null);

        l1=new JLabel("Number 1:");
        l1.setBounds(20,20,80,30);
        l2=new JLabel("Number 2:");
        l2.setBounds(20,60,80,30);
        l3=new JLabel("Result:");
        l3.setBounds(20,100,80,30);

        t1=new JTextField(20);
        t1.setBounds(120,20,80,30);
        t2=new JTextField(20);
        t2.setBounds(120,60,80,30);
       
        b=new JButton("Sum");
        b.setBounds(120,100,80,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b);

        b.addActionListener(this);

        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int n3=n1+n2;
        l3.setText(""+n3);
       
    }
    public static void main(String[] args){
        new Addnum();
    }
}




