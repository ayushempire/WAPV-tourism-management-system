import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener{
    JFrame f1;
    JButton pay,back;
    String username;
    
    Paytm(String username){
        
        this.username = username;
        f1 = new JFrame();
        f1.setLayout(null);
        f1.setBounds(250,100,800,600);
        f1.getContentPane().setBackground((Color.white));
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setLayout(null);
        l1.setBounds(0,0,800,500);
        f1.add(l1);
        
        pay = new JButton("pay");
        pay.setBounds(300,525,100,30);
        pay.setBackground(Color.cyan);
        pay.setForeground(Color.black);
        pay.addActionListener(this);
        f1.add(pay);
        
        back = new JButton("back");
        back.setBounds(500,525,100,30);
        back.setBackground(Color.blue);
        back.setForeground(Color.black);
        back.addActionListener(this);
        f1.add(back);
        
        f1.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource()== pay)
        {
           website w1 =  new website(username);
        }
    }
    public static void main(String args[])
    {
        new Paytm("");
    }
}
