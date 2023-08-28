import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckPackage extends JFrame implements ActionListener{
  
    JFrame f1;
    JPanel p1,p2,p3;
    JButton bbook, bbook1, bbook2, bback, bback1, bback2,bookedpackage,bookedpackage1,bookedpackage2;
    JLabel lrs;
    String username;
    CheckPackage(String username)
    {
        this.username = username;
        f1 = new JFrame();
       //f1.setLayout(null);
        f1.setBounds(250,100,900,600);
        
         
        JTabbedPane tab = new JTabbedPane();
        
        p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.white);
        
        p3= new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.white);
        
        tab.addTab("Gold",null,p1);
        tab.addTab("Silver",null,p2);
        tab.addTab("Bronze",null,p3);
        
        f1.add(tab);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/gold.png"));
        Image i5 = i4.getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        
        JLabel l2 = new JLabel(i6);
        l2.setBounds(300,00,300,150);
        l2.setLayout(null);
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("Elephant",Font.BOLD,25));
        p1.add(l2);
        
        JLabel l3 = new JLabel("6 days 7 Nights");
        l3.setLayout(null);
        l3.setBounds(20,120,180,40);
        l3.setFont(new Font("Tahoma",Font.BOLD,18));
        l3.setForeground(Color.BLACK);
        p1.add(l3);
        
         JLabel l4 = new JLabel("Airport Assistance");
        l4.setLayout(null);
        l4.setBounds(20,180,180,40);
        l4.setFont(new Font("Tahoma",Font.BOLD,18));
        l4.setForeground(Color.BLUE);
        p1.add(l4);
        
         JLabel l5 = new JLabel("Half Day City Tour");
        l5.setLayout(null);
        l5.setBounds(20,240,180,40);
        l5.setFont(new Font("Tahoma",Font.BOLD,18));
        l5.setForeground(Color.BLACK);
        p1.add(l5);
        
         JLabel l6 = new JLabel("Daily Buffet");
        l6.setLayout(null);
        l6.setBounds(20,300,180,40);
        l6.setFont(new Font("Tahoma",Font.BOLD,18));
        l6.setForeground(Color.BLUE);
        p1.add(l6);
        
        JLabel l7 = new JLabel("Welcome Drinks On Arrival");
        l7.setLayout(null);
        l7.setBounds(20,360,280,40);
        l7.setFont(new Font("Tahoma",Font.BOLD,18));
        l7.setForeground(Color.BLACK);
        p1.add(l7);
        
         JLabel l8 = new JLabel("Island Cruise");
        l8.setLayout(null);
        l8.setBounds(20,420,180,40);
        l8.setFont(new Font("Tahoma",Font.BOLD,18));
        l8.setForeground(Color.BLUE);
        p1.add(l8);
        
         JLabel l9 = new JLabel("English Guide");
        l9.setLayout(null);
        l9.setBounds(20,480,180,40);
        l9.setFont(new Font("Tahoma",Font.BOLD,18));
        l9.setForeground(Color.BLACK);
        p1.add(l9);
        
        lrs = new JLabel("Price : 12000 only");
        lrs.setLayout(null);
        lrs.setBounds(350,480,300,25);
        lrs.setFont(new Font("Calibri",Font.BOLD,20));
        lrs.setForeground(Color.black);
        p1.add(lrs);
        
        bbook = new JButton("Book");
        bbook.setLayout(null);
        bbook.setBounds(650,480,100,25);
        bbook.setBackground(Color.BLACK);
        bbook.setForeground(Color.WHITE);
        bbook.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook.addActionListener(this);
        p1.add(bbook);
        
        JLabel l20 = new JLabel("-Summer Special-");
        l20.setBounds(20,50,200,50);
        l20.setFont(new Font("Tahoma",Font.BOLD,20));
        l20.setForeground(Color.RED);
        p1.add(l20);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(300,120,500,350);
        p1.add(l10); 
        
        
        
        
        
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/silver.png"));
        Image i8 = i7.getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l11 = new JLabel(i9);
        l11.setBounds(300,00,300,150);
        l11.setLayout(null);
        l11.setForeground(Color.YELLOW);
        l11.setFont(new Font("Elephant",Font.BOLD,25));
        p2.add(l11);
        
        JLabel l12 = new JLabel("5 days 6 Nights");
        l12.setLayout(null);
        l12.setBounds(20,120,180,40);
        l12.setFont(new Font("Tahoma",Font.BOLD,18));
        l12.setForeground(Color.BLACK);
        p2.add(l12);
        
         JLabel l13 = new JLabel("Toll Free ");
        l13.setLayout(null);
        l13.setBounds(20,180,180,40);
        l13.setFont(new Font("Tahoma",Font.BOLD,18));
        l13.setForeground(Color.BLUE);
        p2.add(l13);
        
         JLabel l14 = new JLabel("Entrance Free Ticket");
        l14.setLayout(null);
        l14.setBounds(20,240,330,40);
        l14.setFont(new Font("Tahoma",Font.BOLD,18));
        l14.setForeground(Color.BLACK);
        p2.add(l14);
        
         JLabel l15 = new JLabel("Meet & Greet at Airport");
        l15.setLayout(null);
        l15.setBounds(20,300,330,40);
        l15.setFont(new Font("Tahoma",Font.BOLD,18));
        l15.setForeground(Color.BLUE);
        p2.add(l15);
        
        JLabel l16 = new JLabel("Welcome Drinks On Arrival");
        l16.setLayout(null);
        l16.setBounds(20,360,330,40);
        l16.setFont(new Font("Tahoma",Font.BOLD,18));
        l16.setForeground(Color.BLACK);
        p2.add(l16);
        
         JLabel l17 = new JLabel("Night Suffari");
        l17.setLayout(null);
        l17.setBounds(20,420,180,40);
        l17.setFont(new Font("Tahoma",Font.BOLD,18));
        l17.setForeground(Color.BLUE);
        p2.add(l17);
        
         JLabel l18 = new JLabel("Cruise with Dinner");
        l18.setLayout(null);
        l18.setBounds(20,480,180,40);
        l18.setFont(new Font("Tahoma",Font.BOLD,18));
        l18.setForeground(Color.BLACK);
        p2.add(l18);
        
        JLabel lrs1 = new JLabel("Price : 12000 only");
        lrs1.setLayout(null);
        lrs1.setBounds(350,480,300,25);
        lrs1.setFont(new Font("Calibri",Font.BOLD,20));
        lrs1.setForeground(Color.black);
        p2.add(lrs1);
        
        bbook1 = new JButton("Book");
        bbook1.setLayout(null);
        bbook1.setBounds(650,480,100,25);
        bbook1.setBackground(Color.BLACK);
        bbook1.setForeground(Color.WHITE);
        bbook1.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook1.addActionListener(this);
        p2.add(bbook1);
        
        JLabel l21 = new JLabel("-Winter Special-");
        l21.setBounds(20,50,200,50);
        l21.setFont(new Font("Tahoma",Font.BOLD,20));
        l21.setForeground(Color.RED);
        p2.add(l21);
        
        JLabel l22 = new JLabel("*including some features of GOLD package");
        l22.setBounds(350,500,500,20);
        p2.add(l22);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/package2.jpg"));
        Image i11 = i10.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l19 = new JLabel(i12);
        l19.setBounds(300,120,500,350);
        p2.add(l19); 
        
        
        
        
        
         ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icon/bronz.png"));
        Image i14 = i13.getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l23 = new JLabel(i15);
        l23.setBounds(300,00,300,150);
        l23.setLayout(null);
        l23.setForeground(Color.YELLOW);
        l23.setFont(new Font("Elephant",Font.BOLD,25));
        p3.add(l23);
        
        JLabel l24 = new JLabel("6 days 5 Nights");
        l24.setLayout(null);
        l24.setBounds(20,120,180,40);
        l24.setFont(new Font("Tahoma",Font.BOLD,18));
        l24.setForeground(Color.BLACK);
        p3.add(l24);
        
         JLabel l25 = new JLabel("Return Airfare");
        l25.setLayout(null);
        l25.setBounds(20,180,180,40);
        l25.setFont(new Font("Tahoma",Font.BOLD,18));
        l25.setForeground(Color.BLUE);
        p3.add(l25);
        
         JLabel l26 = new JLabel("Clubbing, Ridding");
        l26.setLayout(null);
        l26.setBounds(20,240,330,40);
        l26.setFont(new Font("Tahoma",Font.BOLD,18));
        l26.setForeground(Color.BLACK);
        p3.add(l26);
        
         JLabel l27 = new JLabel("River Rafting");
        l27.setLayout(null);
        l27.setBounds(20,300,330,40);
        l27.setFont(new Font("Tahoma",Font.BOLD,18));
        l27.setForeground(Color.BLUE);
        p3.add(l27);
        
        JLabel l28 = new JLabel("Hard Frinks");
        l28.setLayout(null);
        l28.setBounds(20,360,330,40);
        l28.setFont(new Font("Tahoma",Font.BOLD,18));
        l28.setForeground(Color.BLACK);
        p3.add(l28);
        
         JLabel l29 = new JLabel("Daily Buffet");
        l29.setLayout(null);
        l29.setBounds(20,420,180,40);
        l29.setFont(new Font("Tahoma",Font.BOLD,18));
        l29.setForeground(Color.BLUE);
        p3.add(l29);
        
         JLabel l30 = new JLabel("BBQ Dinner");
        l30.setLayout(null);
        l30.setBounds(20,480,180,40);
        l30.setFont(new Font("Tahoma",Font.BOLD,18));
        l30.setForeground(Color.BLACK);
        p3.add(l30);
        
        JLabel lrs2 = new JLabel("Price : 32000 only");
        lrs2.setLayout(null);
        lrs2.setBounds(350,480,300,25);
        lrs2.setFont(new Font("Calibri",Font.BOLD,20));
        lrs2.setForeground(Color.black);
        p3.add(lrs2);
        
        bbook2 = new JButton("Book");
        bbook2.setLayout(null);
        bbook2.setBounds(650,480,100,25);
        bbook2.setBackground(Color.BLACK);
        bbook2.setForeground(Color.WHITE);
        bbook2.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook2.addActionListener(this);
        p3.add(bbook2);
        
        JLabel l31 = new JLabel("-Special Package-");
        l31.setBounds(20,50,200,50);
        l31.setFont(new Font("Tahoma",Font.BOLD,20));
        l31.setForeground(Color.RED);
        p3.add(l31);
        
        JLabel l32 = new JLabel("*including some features of GOLD & SILVER package");
        l32.setBounds(330,500,500,20);
        p3.add(l32);
        
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icon/package3.jpg"));
        Image i17 = i16.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel l33 = new JLabel(i18);
        l33.setBounds(300,120,500,350);
        p3.add(l33);
        
        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i20 = i19.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        bback = new JButton(i21);
        bback.setLayout(null);
        bback.setBounds(2,2,20,20);
        bback.addActionListener(this);
        bback.setOpaque(false);
        bback.setContentAreaFilled(false);
        bback.setBorder(null);
        p1.add(bback);
        
        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i23 = i22.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        bback1 = new JButton(i24);
        bback1.setLayout(null);
        bback1.setBounds(2,2,20,20);
        bback1.addActionListener(this);
        bback1.setOpaque(false);
        bback1.setContentAreaFilled(false);
        bback1.setBorder(null);
        p2.add(bback1);
        
        
         ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i26 = i25.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
         bback2 = new JButton(i27);
        bback2.setLayout(null);
        bback2.setBounds(2,2,20,20);
        bback2.addActionListener(this);
        bback2.setOpaque(false);
        bback2.setContentAreaFilled(false);
        bback2.setBorder(null);
        bback2.setBorder(null);
        p3.add(bback2);
        
        bookedpackage = new JButton("My Package");
        bookedpackage.setLayout(null);
        bookedpackage.setBounds(600,05,150,20);
        bookedpackage.setBackground(Color.BLACK);
        bookedpackage.setForeground(Color.white);
        bookedpackage.addActionListener(this);
        p1.add(bookedpackage);
        
        bookedpackage1 = new JButton("My Package");
        bookedpackage1.setLayout(null);
        bookedpackage1.setBounds(600,05,150,20);
        bookedpackage1.setBackground(Color.BLACK);
        bookedpackage1.setForeground(Color.white);
        bookedpackage1.addActionListener(this);
        p2.add(bookedpackage1);
        
        bookedpackage2 = new JButton("My Package");
        bookedpackage2.setLayout(null);
        bookedpackage2.setBounds(600,05,150,20);
        bookedpackage2.setBackground(Color.BLACK);
        bookedpackage2.setForeground(Color.white);
        bookedpackage2.addActionListener(this);
        p3.add(bookedpackage2);
        
        
        f1.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == bbook){
           new BookPackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook1){
            new BookPackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook2){
            new BookPackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource()== bback){
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource()== bback1){
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource()== bback2){
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() ==  bookedpackage)
        {
            new viewpackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() ==  bookedpackage1)
        {
            new viewpackage(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() ==  bookedpackage2)
        {
            new viewpackage(username);
            f1.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new CheckPackage("");
    }

    
}
