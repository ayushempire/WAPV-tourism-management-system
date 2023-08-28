import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


public class forgotpassword implements ActionListener{
    JFrame f1;
    JLabel lusername, lname, lquestion, lanswer, lpassword,l1,l2,l3;
    JTextField tusername, tname, tquestion, tanswer, tpassword;
    JButton retrive, back, search;
    JPanel p1;
     
    forgotpassword()
    {
        f1 = new JFrame();
        f1.setSize(400,600);
        f1.setLocation(450,100);
        f1.setTitle("Forget Password..");
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,400,600);
        p1.setBackground(Color.white);
        f1.add(p1);
        
        lusername = new JLabel("Username");
        lusername.setLayout(null);
        lusername.setBounds(30,200,70,20);
        lusername.setForeground(Color.BLACK);
        lusername.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lusername);
        
        tusername = new JTextField();
        tusername.setBounds(130,200,180,20);
        tusername.setFont(new Font("Tahoma",Font.BOLD,12));
        tusername.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        p1.add(tusername);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/search.png"));
        Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        
        search = new JButton(i9);
        search.setBounds(320,200,40,20);
        search.setBorder(null);
        search.addActionListener(this);
        p1.add(search);
        
        lname = new JLabel("Name");
        lname.setLayout(null);
        lname.setBounds(30,240,70,20);
        lname.setForeground(Color.BLACK);
        lname.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lname);
        
        tname = new JTextField();
        tname.setBounds(130,240,180,20);
        tname.setFont(new Font("Tahoma",Font.BOLD,12));
        tname.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        p1.add(tname);
        
        lquestion = new JLabel("Question");
        lquestion.setLayout(null);
        lquestion.setBounds(30,280,70,20);
        lquestion.setForeground(Color.BLACK);
        lquestion.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lquestion);
        
        tquestion = new JTextField();
        tquestion.setBounds(130,280,180,20);
        tquestion.setFont(new Font("Tahoma",Font.BOLD,12));
        tquestion.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        p1.add(tquestion);
        
        lanswer = new JLabel("Answer");
        lanswer.setLayout(null);
        lanswer.setBounds(30,320,70,20);
        lanswer.setForeground(Color.BLACK);
        lanswer.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lanswer);
        
        tanswer = new JTextField();
        tanswer.setBounds(130,320,180,20);
        tanswer.setFont(new Font("Tahoma",Font.BOLD,12));
        tanswer.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        p1.add(tanswer);
        
        retrive = new JButton("Get Password");
        retrive.setBounds(30,365,280,25);
        retrive.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        retrive.setForeground(Color.WHITE);
        retrive.setFont(new Font("Tahoma",Font.BOLD,13));
        retrive.setBackground(new Color(51,204,255));
        retrive.addActionListener(this);
        p1.add(retrive);
        
        lpassword = new JLabel("Password");
        lpassword.setLayout(null);
        lpassword.setBounds(30,420,70,20);
        lpassword.setForeground(Color.BLACK);
        lpassword.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lpassword);
        
        tpassword = new JTextField();
        tpassword.setBounds(130,420,180,20);
        tpassword.setFont(new Font("Tahoma",Font.BOLD,12));
        tpassword.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
        p1.add(tpassword);
        
        back = new JButton("Back to LogIn...");
        back.setBounds(80,480,180,30);
        back.setForeground(Color.BLACK);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/help.png"));
        Image i11 = i10.getImage().getScaledInstance(32,32,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JButton h = new JButton(i12);
        h.setLayout(null);
        h.setBounds(340,8,32,32);
        h.setOpaque(false);
        h.setContentAreaFilled(false);
        h.setBorder(null);
        h.addActionListener(this);
        p1.add(h);
        
        
        //Delare the Buttons and Other swing COmponents above here
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/userlock.png"));
        Image i5 = i4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l2 = new JLabel(i6);
        l2.setBounds(150,40,100,100);
        p1.add(l2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/forpassbacck.png"));
        Image i2 = i1.getImage().getScaledInstance(400,600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0,0,400,600);
        p1.add(l1);
        
        f1.setResizable(false);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            try{
                Conn c = new Conn();
                
                String q1  = "select * from newuser where username = '"+tusername.getText()+"'";
              
                ResultSet rs = c.s.executeQuery(q1);
                
                if(rs.next()){
                    tname.setText(rs.getString("name"));
                    tquestion.setText(rs.getString("question"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username Not Found...");
                    tusername.setText("");
                    tusername.requestFocus();
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==retrive)
        {
            try{
                Conn c = new Conn();
             
                String q2 = "select * from newuser where answer = '"+tanswer.getText()+"' AND username = '"+tusername.getText()+"'";
                ResultSet rs = c.s.executeQuery(q2);
            
                if(rs.next())
                {
                    tpassword.setText(rs.getString("password"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Answer...");
                    tanswer.requestFocus();
                }
            
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== back)
        {
            NewLogin n1 = new NewLogin();
            f1.setVisible(false);
            
        }
        else
        {
            try {
                Desktop.getDesktop().open(new java.io.File("C:\\Users\\AYUSH\\Documents\\NetBeansProjects\\WAPV\\src\\files\\forPasshelp.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(forgotpassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args)
    {
        new forgotpassword();
    }
}
