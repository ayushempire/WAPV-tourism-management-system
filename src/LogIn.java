import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.geom.*;
import javax.swing.border.*;


public class LogIn extends JFrame implements ActionListener{
    JButton b1,b2;
    LogIn()
    {
        setSize(600,300);
        setLocation(400,200);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        //l1.setLayout(null);
        //l1.setBounds(250, 300, 250, 300);
        p1.setBackground(new Color(133,193,233));
        p1.setLayout(null);
        p1.setBounds(0,0,250,300);
        add(p1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1  = new JLabel(i3);
        l1.setLayout(null);
        l1.setBounds(60,60,150,150);
        p1.add(l1);
        
        JLabel l5 = new JLabel("LOG IN");
        l5.setLayout(null);
        l5.setBounds(20,250,100,50);
         p1.add(l5);
        
        
        JPanel p2 =new JPanel();
        p2.setLayout(null);
        p2.setBounds(250, 0, 350, 300);
        add(p2);   
        
        
        
       
        
        JLabel l2 = new JLabel("username");
        l2.setLayout(null);
        l2.setBounds(80, 20, 120, 20);
        l2.setBackground(Color.GREEN);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Calibri",Font.BOLD,18));
        p2.add(l2);
        
        JTextField t1 =new JTextField();
        t1.setLayout(null);
        t1.setBounds(60,40,200,20);
        t1.setBorder(null);
        p2.add(t1);
        
        JLabel l3 = new JLabel("Password");
        l3.setLayout(null);
        l3.setForeground(Color.white);
        l3.setBounds(80,100,200,24);
        l3.setFont(new Font("Calibri",Font.BOLD,18));
        p2.add(l3);
        
        JTextField t2 = new JTextField();
        t2.setLayout(null);
        t2.setBounds(60,130,200,20);
        t2.setBorder(null);
        p2.add(t2);
        
        b1 = new JButton("LOG IN");
        b1.setBounds(60,190,100,30);
        b1.setFont(new Font("Caliri",Font.BOLD,15));
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
        b1.setBorder(null);
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("CANCLE");
        b2.setBounds(200,190,100,30);
        b2.setFont(new Font("Calibri",Font.BOLD,15));
        b2.setForeground(Color.MAGENTA);
        b2.setBackground(Color.green);
        b2.addActionListener(this);
        p2.add(b2);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/login2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
         JLabel l4 = new JLabel(i6);
        l4.setLayout(null);
        l4.setBounds(0,0,350,300);
        p2.add(l4);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b2)
        {
            this.hide();
           
        }
        else if(ae.getSource()== b1)
        {
            
        }
    }
    
    
    public static void main(String [] args)
    {
        LogIn Jframe = new LogIn();
    }
}
