
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class CheckHotel1 extends JFrame implements ActionListener{
    
    JFrame f1;
    JButton bbook,bbook1,bbook2,bbook3,bbook4,back,back1,back2,back3,back4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JPanel  p1,p2,p3,p4,p5;
    JTabbedPane tab;
    String username;
    CheckHotel1(String username)
    {
        this.username = username;
        
        f1 = new JFrame();
        f1.setBounds(250,100,900,600);
        f1.setBackground(Color.black);
        f1.setForeground(Color.white);
        
        
        
        tab = new JTabbedPane();
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,900,600);
        p1.setBackground(Color.white);
       
        p2 = new JPanel();
         p2.setLayout(null);
        p2.setBounds(0,0,900,600);
        p2.setBackground(Color.white);
        
        p3 = new JPanel();
         p3.setLayout(null);
        p3.setBounds(0,0,900,600);
        p3.setBackground(Color.white);
        
        p4 = new JPanel();
         p4.setLayout(null);
        p4.setBounds(0,0,900,600);
        p4.setBackground(Color.white);
        
        p5 = new JPanel();
         p5.setLayout(null);
        p5.setBounds(0,0,900,600);
        p5.setBackground(Color.white);
        
        tab.setBackground(Color.black);
        tab.setForeground(Color.white);
        tab.addTab("JW Marriott Hotel",null,p1);
        tab.addTab("Mandarin Oriental Hotel",null,p2);
        tab.addTab("Four Seasons Hotel",null,p3);
        tab.addTab("Radisson Hotel",null,p4);
        tab.addTab("Classio Hotel",null,p5);
       
        f1.add(tab);
        
       
        
        l1 = new JLabel("JW Marriott Hotel (NORWAY)");
        l1.setBounds(300,00,400,50);
        l1.setLayout(null);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        p1.add(l1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(100,50,700,400);
        p1.add(l2);
        bbook = new JButton("Book");
        bbook.setLayout(null);
        bbook.setBounds(400,470,100,25);
        bbook.setBackground(Color.BLACK);
        bbook.setForeground(Color.WHITE);
        bbook.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook.addActionListener(this);
        p1.add(bbook);
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i17 = i16.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        back = new JButton(i18);
        back.setLayout(null);
        back.setBounds(0,0,20,20);
        back.addActionListener(this);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorder(null);
        p1.add(back);
        
        l3 = new JLabel("Mandarin Oriental Hotel (MIAMI)");
        l3.setBounds(300,00,400,50);
        l3.setLayout(null);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma",Font.BOLD,22));
        p2.add(l3);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/hotel2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l4 = new JLabel(i6);
        l4.setBounds(100,50,700,400);
        p2.add(l4);
        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i20 = i19.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
                bbook1 = new JButton("Book");
        bbook1.setLayout(null);
        bbook1.setBounds(400,470,100,25);
        bbook1.setBackground(Color.BLACK);
        bbook1.setForeground(Color.WHITE);
        bbook1.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook1.addActionListener(this);
        p2.add(bbook1);
        back1 = new JButton(i21);
        back1.setLayout(null);
        back1.setBounds(0,0,20,20);
        back1.addActionListener(this);
        back1.setOpaque(false);
        back1.setContentAreaFilled(false);
        back1.setBorder(null);
        p2.add(back1);
        
        l5 = new JLabel("Four Seasons Hotel (KERALA)");
        l5.setBounds(300,00,400,50);
        l5.setLayout(null);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma",Font.BOLD,22));
        p3.add(l5);
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/hotel3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l6 = new JLabel(i9);
        l6.setBounds(100,50,700,400);
        p3.add(l6);
        bbook2 = new JButton("Book");
        bbook2.setLayout(null);
        bbook2.setBounds(400,470,100,25);
        bbook2.setBackground(Color.BLACK);
        bbook2.setForeground(Color.WHITE);
        bbook2.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook2.addActionListener(this);
        p3.add(bbook2);
        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i23 = i22.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        back2 = new JButton(i24);
        back2.setLayout(null);
        back2.setBounds(0,0,20,20);
        back2.addActionListener(this);
        back2.setOpaque(false);
        back2.setContentAreaFilled(false);
        back2.setBorder(null);
        p3.add(back2);
         
        
        l7 = new JLabel("Radisson Hotel (MIAMI)");
        l7.setBounds(300,00,400,50);
        l7.setLayout(null);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma",Font.BOLD,22));
        p4.add(l7);
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icon/hotel4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l8 = new JLabel(i12);
        l8.setBounds(100,50,700,400);
        p4.add(l8);
        bbook3 = new JButton("Book");
        bbook3.setLayout(null);
        bbook3.setBounds(400,470,100,25);
        bbook3.setBackground(Color.BLACK);
        bbook3.setForeground(Color.WHITE);
        bbook3.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook3.addActionListener(this);
        p4.add(bbook3);
        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i26 = i25.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        back3 = new JButton(i27);
        back3.setLayout(null);
        back3.setBounds(0,0,20,20);
        back3.addActionListener(this);
        back3.setOpaque(false);
        back3.setContentAreaFilled(false);
        back3.setBorder(null);
        p4.add(back3);
        
        l9 = new JLabel("Classio Hotel (KERALA)");
        l9.setBounds(300,00,400,50);
        l9.setLayout(null);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma",Font.BOLD,22));
        p5.add(l9);
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icon/hotel5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l10 = new JLabel(i15);
        l10.setBounds(100,50,700,400);
        p5.add(l10);
        bbook4 = new JButton("Book");
        bbook4.setLayout(null);
        bbook4.setBounds(400,470,100,25);
        bbook4.setBackground(Color.BLACK);
        bbook4.setForeground(Color.WHITE);
        bbook4.setFont(new Font("Tahoma",Font.BOLD,15));
        bbook4.addActionListener(this);
        p5.add(bbook4);
        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i29 = i28.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        back4 = new JButton(i30);
        back4.setLayout(null);
        back4.setBounds(0,0,20,20);
        back4.addActionListener(this);
        back4.setOpaque(false);
        back4.setContentAreaFilled(false);
        back4.setBorder(null);
        p5.add(back4);
        
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == back1)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == back2)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == back3)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == back4)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook1)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook2)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook3)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
        else if(ae.getSource() == bbook4)
        {
            new BookHotel(username);
            f1.setVisible(false);
        }
    }
    public static void main(String[]args)
    {
        new CheckHotel1("");
    }
}


