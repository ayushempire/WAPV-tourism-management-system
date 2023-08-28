import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class signup extends JFrame implements ActionListener{
    JFrame f1;
    JLabel l1name, l2user, l3pass, l4conpass, l5squestion, l5,l6,l7,l8answer;
    JPanel p1,p2;
    JButton b1create, b2back;
    JTextField t1name, t2user,t3pass, t4conpass, t6answer;
    Choice cquestion;
    
    signup()
    {
       f1 = new JFrame();
       f1.setSize(900,550);
       f1.setLocation(250,100);
       f1.setTitle("WAPV");
       f1.setResizable(false);
       
       p1 = new JPanel();
       p1.setLayout(null);
       p1.setBounds(0,0,900,550);
       f1.add(p1);
       
       l1name = new JLabel("Name");
       l1name.setBounds(315,160,50,20);
       l1name.setFont(new Font("Calibri",Font.BOLD,15));
       l1name.setForeground(Color.black);
       p1.add(l1name);
       
       l2user = new JLabel("Username");
       l2user.setBounds(315,200,70,20);
       l2user.setFont(new Font("calibri",Font.BOLD,15));
       l2user.setForeground(Color.BLACK);
       p1.add(l2user);
       
       l3pass = new JLabel("Password");
       l3pass.setBounds(315,240,60,20);
       l3pass.setForeground(Color.black);
       l3pass.setFont(new Font("Calibri",Font.BOLD,15));
       p1.add(l3pass);
       
       l4conpass = new JLabel("Confim Password");
       l4conpass.setBounds(290,280,120,20);
       l4conpass.setForeground(Color.black);
       l4conpass.setFont(new Font("Calibri",Font.BOLD,15));
       p1.add(l4conpass);
       
       l5squestion = new JLabel("Security Question");
       l5squestion.setBounds(290,320,120,20);
       l5squestion.setForeground(Color.BLACK);
       l5squestion.setFont(new Font("calibri",Font.BOLD,15));
       p1.add(l5squestion);
       
       l8answer = new JLabel("Answer");
       l8answer.setBounds(315,360,60,20);
       l8answer.setForeground(Color.BLACK);
       l8answer.setFont(new Font("Calibri",Font.BOLD,15));
       p1.add(l8answer);
       
       t1name = new JTextField();
       t1name.setBounds(420,160,150,20);
       t1name.setFont(new Font("Tahoma",Font.PLAIN,11));
       t1name.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(t1name);
       
       t2user = new JTextField();
       t2user.setBounds(420,200,150,20);
       t2user.setFont(new Font("Tahoma",Font.PLAIN,11));
       t2user.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(t2user);
       
       t3pass = new JTextField();
       t3pass.setBounds(420,240,150,20);
       t3pass.setFont(new Font("Tahoma",Font.PLAIN,11));
       t3pass.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(t3pass);
       
       t4conpass = new JTextField();
       t4conpass.setBounds(420,280,150,20);
       t4conpass.setFont(new Font("Tahoma",Font.PLAIN,11));
       t4conpass.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(t4conpass);
       
       cquestion = new Choice();
       cquestion.add("Your Favourite Hero");
       cquestion.add("favourite Freedom Fighter");
       cquestion.add("lucky number");
       cquestion.add("your name");
       cquestion.setBounds(420,320,150,20);
       cquestion.setFont(new Font("Calibri",Font.BOLD,12));
       p1.add(cquestion);
       
       t6answer = new JTextField();
       t6answer.setBounds(420,360,150,20);
       t6answer.setFont(new Font("Tahoma",Font.PLAIN,11));
       t6answer.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(t6answer);
       
       b1create = new JButton("Create");
       b1create.setBounds(315,420,100,25);
       b1create.setBackground(Color.yellow);
       b1create.setForeground(Color.blue);
       b1create.setFont(new Font("Tahoma",Font.BOLD,13));
       b1create.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.blue));
       b1create.addActionListener(this);
       p1.add(b1create);
       
       b2back = new JButton("Back");
       b2back.setBounds(460,420,100,25);
       b2back.setBackground(new Color(0,0,255));
       b2back.setForeground(Color.yellow);
       b2back.setFont(new Font("Tahoma",Font.BOLD,13));
       b2back.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       b2back.addActionListener(this);
       p1.add(b2back);
       
       // Declare new Buttons & swing Componets Above here
       
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/PngItem_635220.png"));
       Image i8 = i7.getImage().getScaledInstance(150, 120,Image.SCALE_DEFAULT);
       ImageIcon i9 = new ImageIcon(i8);
       l7 = new JLabel(i9);
       l7.setBounds(390,35,150,120);
       p1.add(l7);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/peakpx.jpg"));
       Image i5 = i4.getImage().getScaledInstance(350,450, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       l6 = new JLabel(i6);
       l6.setBounds(275,25,350,450);
       l6.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));
       p1.add(l6);
       
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/peakpx (1).jpg"));
       Image i2 = i1.getImage().getScaledInstance(900, 550, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       l5 = new JLabel(i3);
       l5.setBounds(0,0,900,550);
       p1.add(l5);
       
       f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1create)
        {
            if(t1name.getText().length()==0)
            {
                JOptionPane j1 = new JOptionPane();
                /*j1.setBackground(Color.yellow);
                j1.setForeground(Color.WHITE);
                j1.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.yellow));*/
                j1.showMessageDialog(this,"Enter Name");
            }
            else if(t3pass.getText().length()<=8)
            {
                JOptionPane.showMessageDialog(this,"Password must have size 8...");
            }
            else if(t3pass.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(this,"enter password");
            }
            else if(t3pass.getText().equals(t4conpass.getText()) == false)
            {
                JOptionPane.showMessageDialog(this,"Password Does not matched");
            }
            else{
                String name = t1name.getText();
                String username = t2user.getText();
                String password = t4conpass.getText();
                String question = cquestion.getSelectedItem();
                String answer = t6answer.getText();
                
                String q1 = "insert into newuser values('"+name+"','"+username+"','"+password+"','"+question+"','"+answer+"')";
                
                try
                {
                    Conn c = new Conn();
                    c.s.executeUpdate(q1);
                    
                    JOptionPane j1 = new JOptionPane();
                    j1.showMessageDialog(this,"User Created..");
                
                    t1name.setText("");
                    t2user.setText("");
                    t3pass.setText("");
                    t4conpass.setText("");
                    t6answer.setText("");
                    
                    t1name.requestFocus();
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        else
        {
            NewLogin n1 = new NewLogin();
            f1.setVisible(false);
        }
    }
    public static void main(String[]args)
    {
        new signup();
    }
}
