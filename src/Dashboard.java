import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Dashboard implements ActionListener{

    JFrame f1;
    JPanel p1,p2;
    JButton bprofile, bpackage, bbkpackage, bhotels, /*bbookhotels,*/ bvhotel, bdestination, bpayment, bcalculator, bnotepad, babout,back;
    JLabel l1,l2;
    ImageIcon i1, i3;
    JMenuBar mb;
    String username;
    Menu logout;
    Dashboard(String username)
    {
        this.username = username;
        
    // Creating Jframe for dashboard//
        f1 = new JFrame();
        //f1.setExtendedState(f1.MAXIMIZED_BOTH);
        f1.setSize(1366,689);
        f1.setLocation(0,0);
        f1.setLayout(null);
        //f1.setResizable(false);
        
    //creating panel //    
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1366,40);
        p1.setBackground(new Color(0,0,244));
        f1.add(p1);
        
        JLabel titel = new JLabel("Dashboard");
        titel.setLayout(null);
        titel.setBounds(60,05,200,30);
        titel.setForeground(Color.white);
        titel.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(titel);
        
        JLabel l4 = new JLabel("W");
        l4.setLayout(null);
        l4.setBounds(645,0,25,40);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Elephant",Font.PLAIN,20));
        p1.add(l4);
        
        JLabel l5 = new JLabel("A");
        l5.setLayout(null);
        l5.setBounds(670,0,20,40);
        l5.setForeground(Color.GREEN);
        l5.setFont(new Font("Elephant",Font.PLAIN,20));
        p1.add(l5);
        
        JLabel l6 = new JLabel("P");
        l6.setLayout(null);
        l6.setBounds(690,0,20,40);
        l6.setForeground(Color.orange);
        l6.setFont(new Font("Elephant",Font.PLAIN,20));
        p1.add(l6);
        
        JLabel l7 = new JLabel("V");
        l7.setLayout(null);
        l7.setBounds(710,0,20,40);
        l7.setForeground(Color.YELLOW);
        l7.setFont(new Font("Elephant",Font.PLAIN,20));
        p1.add(l7);
        
    //creeating second panel for menu buttons//
    p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(1116,40,250,610);
    p2.setBackground(Color.blue);
    f1.add(p2);
        
    //menu buttons//
    bprofile = new JButton("Profile");
    bprofile.setForeground(Color.white);
    bprofile.setBounds(0,0,250,61);
    bprofile.setFont(new Font("Tahoma",Font.BOLD,15));
    bprofile.setOpaque(false);
    bprofile.setContentAreaFilled(false);
   // bprofile.addMouseListener(this);
    bprofile.addActionListener(this);
    p2.add(bprofile);
    
    bpackage = new JButton("Packages");
    bpackage.setForeground(Color.white);
    bpackage.setBounds(0,61,250,61);
    bpackage.setFont(new Font("Tahoma",Font.BOLD,15));
    bpackage.setOpaque(false);
    bpackage.setContentAreaFilled(false);
    //bpackage.addMouseListener(this);
    bpackage.addActionListener(this);
    p2.add(bpackage);
    
    bbkpackage = new JButton("Book Package");
    bbkpackage.setForeground(Color.white);
    bbkpackage.setBounds(0,122,250,61);
    bbkpackage.setFont(new Font("Tahoma",Font.BOLD,15));
    bbkpackage.setOpaque(false);
    bbkpackage.setContentAreaFilled(false);
    bbkpackage.addActionListener(this);
    //bbkpackage.addMouseListener(this);
    p2.add(bbkpackage);
    
    bhotels = new JButton("Hotels");
    bhotels.setForeground(Color.white);
    bhotels.setBounds(0,183,250,61);
    bhotels.setFont(new Font("Tahoma",Font.BOLD,15));
    bhotels.setOpaque(false);
    bhotels.setContentAreaFilled(false);
    bhotels.addActionListener(this);
    
   // bhotels.addMouseListener(this);
    p2.add(bhotels);
    
    bvhotel= new JButton("Book Hotels");
    bvhotel.setForeground(Color.white);
    bvhotel.setBounds(0,244,250,61);
    bvhotel.setFont(new Font("Tahoma",Font.BOLD,15));
    bvhotel.setOpaque(false);
    bvhotel.setContentAreaFilled(false);
    bvhotel.addActionListener(this);
    //bvhotel.addMouseListener(this);
    p2.add(bvhotel); 
    
    bdestination = new JButton("Destinations");
    bdestination.setForeground(Color.white);
    bdestination.setBounds(0,305,250,61);
    bdestination.setFont(new Font("Tahoma",Font.BOLD,15));
    bdestination.setOpaque(false);
    bdestination.setContentAreaFilled(false);
    bdestination.addActionListener(this);
    //bdestination.addMouseListener(this);
    p2.add(bdestination);
    
    bpayment = new JButton("Payment");
    bpayment.setForeground(Color.white);
    bpayment.setBounds(0,366,250,61);
            
    bpayment.setFont(new Font("Tahoma",Font.BOLD,15));
    bpayment.setOpaque(false);
    bpayment.setContentAreaFilled(false);
    bpayment.addActionListener(this);
    //bpayment.addMouseListener(this);
    p2.add(bpayment);
    
    bcalculator = new JButton("Calculator");
    bcalculator.setForeground(Color.white);
    bcalculator.setBounds(0,427,250,61);
    bcalculator.setFont(new Font("Tahoma",Font.BOLD,15));
    bcalculator.setOpaque(false);
    bcalculator.setContentAreaFilled(false);
    bcalculator.addActionListener(this);
    //bcalculator.addMouseListener(this);
    p2.add(bcalculator);
    
    bnotepad = new JButton("Notepad");
    bnotepad.setForeground(Color.white);
    bnotepad.setBounds(0,488,250,61);
    bnotepad.setFont(new Font("Tahoma",Font.BOLD,15));
    bnotepad.setOpaque(false);
    bnotepad.setContentAreaFilled(false);
    bnotepad.addActionListener(this);
    //bnotepad.addMouseListener(this);
    p2.add(bnotepad);
    
    babout = new JButton("About");
    babout.setForeground(Color.white);
    babout.setBounds(0,549,250,61);
    babout.setFont(new Font("Tahoma",Font.BOLD,15));
    babout.setOpaque(false);
    babout.setContentAreaFilled(false);
    babout.addActionListener(this);
    //babout.addMouseListener(this);
    p2.add(babout);
    
    /*mb= new JMenuBar();
    mb.setLayout(null);
    mb.setBounds(1310,02,40,20);
    logout = new Menu("Log Out");
    p1.add(mb); */
    
    i1 = new ImageIcon(ClassLoader.getSystemResource("icon/slide2.jpg"));
    Image i2 = i1.getImage().getScaledInstance(1366,610,Image.SCALE_DEFAULT);
    i3 = new ImageIcon(i2);
    l1 = new JLabel(i3);
    l1.setLayout(null);
    l1.setBounds(0,40,1366,610);
    f1.add(l1);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/menuback.jpg"));
    Image i5 = i4.getImage().getScaledInstance(250, 610, Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    l2 = new JLabel(i6);
    l2.setBounds(0,0,250,610);
    l2.setOpaque(false);
    p2.add(l2);
    
    JLabel l9 = new JLabel(username);
    l9.setLayout(null);
    l9.setBounds(1200,5,100,35);
    l9.setFont(new Font("Calibri",Font.BOLD,15));
    l9.setForeground(Color.white);
    p1.add(l9);
    
    ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
    Image i17 = i16.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    ImageIcon i18 = new ImageIcon(i17);
    back = new JButton(i18);
    back.setBounds(20,5,30,30);
    back.setOpaque(false);
    back.setContentAreaFilled(false);
    back.setBorder(null);
    back.addActionListener(this);
    p1.add(back);
    
    
    ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icon/userlogo3.png"));
    Image i14 = i13.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
    ImageIcon i15 = new ImageIcon(i14);
    JLabel l10 = new JLabel(i15);
    l10.setLayout(null);
    l10.setBounds(1160,5,30,30);
    p1.add(l10);
    
    
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/polygon.jpg"));
        //Image i11 = i10.getImage().getScaledInstance(1366,40,Image.SCALE_DEFAULT);
        //ImageIcon i12 = new ImageIcon(i11);
        JLabel l8 = new JLabel(i10);
        l8.setLayout(null);
        l8.setBounds(0,0,1366,40);
        p1.add(l8);
    
    
    // Set Visiblity of frame at last//   
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bcalculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== bnotepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == back){
            new NewLogin();
            f1.setVisible(false); 
        }
        else if(ae.getSource()== bprofile)
        {
            new Profile(username);
            f1.setVisible(false);
        }
        else if(ae.getSource()== bpayment)
        {
            new Paytm(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bpackage)
        {
            new CheckPackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbkpackage)
        {
            new BookPackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bhotels)
        {
            new CheckHotel1(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bvhotel)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == babout)
        {
            new About();
            
        }
        else if(ae.getSource() == bdestination)
        {
            new Destination();
            
        }
        
    }
    
    public static void main(String []args)
    {
    new Dashboard("");
    }
}