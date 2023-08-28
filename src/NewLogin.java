
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.sql.*;

public class NewLogin extends JFrame implements ActionListener
{

        
        JFrame f1,f2;
        JPanel p1,p2;
        JButton b1,b2,b3,b4;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8;
        JTextField t1,t2;
        
    
    
        NewLogin()
        {
            
            f1 = new JFrame();
            f1.setSize(900,550);
            f1.setLocation(250,100);
            
            
            p1 = new JPanel();
            p1.setLayout(null);
            p1.setBounds(0,0,900,550);
            p1.setBackground(Color.CYAN);
            f1.add(p1);
            
            
            ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icon/userlogo.png"));
            Image i3  = i2.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i4 = new ImageIcon(i3);
            l1 = new JLabel(i4);
            l1.setBounds(380,90,100,100);
            p1.add(l1);
            
            l3= new JLabel("Welcome To  WAPV");
            l3.setBounds(280,30,400,50);
            l3.setForeground(Color.WHITE);
            l3.setFont(new Font("Elephant",Font.ITALIC,28));
            p1.add(l3);
            
            l4 = new JLabel("Username");
            l4.setBounds(300,200,70,30);
            l4.setFont(new Font("Calibri",Font.BOLD,15));
            l4.setForeground(Color.WHITE);
            p1.add(l4);
            
            t1 = new JTextField();
            t1.setBounds(400,208,150,20);
            t1.setFont(new Font("Tahoma",Font.BOLD,12));
            t1.setBorder(null);
            p1.add(t1);
            
            l5 = new JLabel("Password");
            l5.setBounds(300,250,70,30);
            l5.setFont(new Font("Calibri",Font.BOLD,15));
            l5.setForeground(Color.WHITE);
            p1.add(l5);
            
            t2 = new JTextField();
            t2.setBounds(400,255,150,20);
            t2.setFont(new Font("Tahoma",Font.BOLD,12));
            t2.setBorder(null);
            p1.add(t2);
            
            b1 = new JButton("Login");
            b1.setBounds(310,310,80,25);
            b1.setForeground(Color.white);
            b1.setBackground(Color.DARK_GRAY);
            b1.setBorder(BorderFactory.createBevelBorder(1, Color.pink, Color.PINK));
            b1.addActionListener(this);
            p1.add(b1);
            
            
            b2 = new JButton("Sign in");
            b2.setBounds(450,310,80,25);
            b2.setForeground(Color.white);
            b2.setBackground(Color.DARK_GRAY);
            b2.setBorder(BorderFactory.createBevelBorder(1, Color.pink, Color.pink));
            b2.addActionListener(this);
            p1.add(b2);
            
            b3 = new JButton("Forget Password");
            b3.setBounds(370,345,100,20);
            b3.setForeground(Color.white);
            b3.setOpaque(false);
            b3.setContentAreaFilled(false);
            b3.setBorder(null);
            b3.addActionListener(this);
            p1.add(b3);

            //Define new Buttons or swing components above here
            
            ImageIcon i6 = new ImageIcon(ClassLoader.getSystemResource("icon/newuser.png"));
            Image i7 = i6.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ImageIcon i8 = new ImageIcon(i7);
            l6 = new JLabel(i8);
            l6.setBounds(540,310,25,25);
            p1.add(l6);
            
            ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("icon/confirmuser.png"));
            Image i10 = i9.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ImageIcon i11 = new ImageIcon(i10);
            l7 = new JLabel(i11);
            l7.setBounds(280,310,25,25);
            p1.add(l7);
            
            
            
            ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
            //Image i6 = i5.getImage().getScaledInstance(350, 250, Image.SCALE_DEFAULT);
            //ImageIcon i7 = new ImageIcon(i6);
            l6 = new JLabel(i5);
            l6.setLayout(null);
            l6.setBounds(250,75,350,300);
            l6.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.LIGHT_GRAY));
           // l6.setBackground(new Color(213,134,145,213));
            p1.add(l6);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
            //Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
            //ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i1);
            l2.setBounds(0,0,900,550);
            l2.setBackground(new Color(213,134,145,213));
            p1.add(l2);
            
            f1.setResizable(false);
            f1.setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()== b3)
            {
                new forgotpassword();
                f1.setVisible(false);
            }
            else if(ae.getSource()== b2)
            {   
                signup s1 = new signup();
                //s1.setVisible(true);
                f1.setVisible(false);
            }
            else
            {   if(t1.getText().length()== 0){
                    JOptionPane.showMessageDialog(this,"Enter Username..");
                 }
                else if(t2.getText().length()== 0){
                JOptionPane.showMessageDialog(this,"Enter Password..");
                } 
                else{
                    try{
                    
                    String username;
                    username = t1.getText();
                    Conn c = new Conn();
                    String q = "select * from newuser where username= '"+t1.getText()+"'";
                     
                    ResultSet rs = c.s.executeQuery(q);
                   
                   if(rs.next())
                   {}
                   else
                   {
                        JOptionPane.showMessageDialog(this, "username not found...");
                        t1.requestFocus();
                   }
                   
                    try{
                    
                    
                    username = t1.getText();
                    Conn c1 = new Conn();
                    String q1 = "select * from newuser where username = '"+t1.getText()+"' AND password = '"+t2.getText()+"' ";
                    
                    ResultSet rs1 = c.s.executeQuery(q1);
                   if(rs1.next())
                   {
                       JOptionPane.showMessageDialog(null, "Welcome  "+""+t1.getText());
                       new Dashboard(username);
                       f1.setVisible(false);
                   }
                   else
                   {
                        JOptionPane.showMessageDialog(this, "Incorrect Password...");
                        t2.requestFocus();
                   }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                   
                   
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
            
    }
      
    public static void main(String [] args)
    {
       NewLogin n1 =  new NewLogin();
    }

  
}
