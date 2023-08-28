import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BookPackage extends JFrame implements ActionListener{
    
    String username;
    JFrame f1;
    JPanel p1;
    JLabel lusername,l2username,lname,lid,l2id,l2name,idno,tidno,lphone,l2phone,lpackage ,lnop,lprice,lprice2;
    Choice cpackage;
    JTextField tnop;
    JButton cprice,bpackage,back,vbookpackage;
    BookPackage(String username)
    {
        this.username = username;
        
        f1= new JFrame();
        f1.setLayout(null);
        f1.setBounds(220,100,1000,500);
        
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1000,500);
        p1.setBackground(Color.white);
        f1.add(p1);
        
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(150,110,150,20);
        cpackage.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(cpackage);
        
        lpackage = new JLabel("Package");
        lpackage.setLayout(null);
        lpackage.setBounds(30,110,100,20);
        lpackage.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lpackage);
        
        lusername = new JLabel("Username");
        lusername.setLayout(null);
        lusername.setBounds(30,150,100,20);
        lusername.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lusername);
        
        l2username = new JLabel(""+username);
        l2username.setLayout(null);
        l2username.setBounds(150,150,100,20);
        l2username.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(l2username);
        
        lname = new JLabel("Name");
        lname.setLayout(null);
        lname.setBounds(30,190,100,20);
        lname.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lname);
        
        lid = new JLabel("ID");
        lid.setLayout(null);
        lid.setBounds(30,230,100,20);
        lid.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lid);
        
        l2id = new JLabel();
        l2id.setLayout(null);
        l2id.setBounds(150,230,100,20);
        p1.add(l2id);
        
        l2name = new JLabel();
        l2name.setLayout(null);
        l2name.setBounds(150,190,100,20);
        l2name.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(l2name);
       
           
        idno = new JLabel("ID No.");
        idno.setLayout(null);
        idno.setBounds(30,270,100,20);
        idno.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(idno);
        
        tidno = new JLabel();
        tidno.setLayout(null);
        tidno.setBounds(150,270,100,20);
        tidno.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(tidno);
        
        lphone = new JLabel("Phone");
        lphone.setLayout(null);
        lphone.setBounds(30,310,100,20);
        lphone.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lphone);
        
        l2phone = new JLabel();
        l2phone.setLayout(null);
        l2phone.setBounds(150,310, 100, 20);
        p1.add(l2phone);
       
        lnop = new JLabel("Persons");
        lnop.setLayout(null);
        lnop.setBounds(30,350,100,20);
        lnop.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lnop);
        
        tnop = new JTextField("1");
        tnop.setLayout(null);
        tnop.setBounds(150,350,100,20);
        tnop.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add( tnop);
        
        lprice = new JLabel("Total Price");
        lprice.setLayout(null);
        lprice.setBounds(30,390,100,20);
        lprice.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lprice);
        
        lprice2 = new JLabel();
        lprice2.setLayout(null);
        lprice2.setBounds(150,390,100,20);
        lprice2.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lprice2);
        
        cprice = new JButton("Check Price");
        cprice.setLayout(null);
        cprice.setBounds(320,400,130,25);
        cprice.setBackground(Color.BLACK);
        cprice.setForeground(Color.WHITE);
        cprice.setFont(new Font("Tahoma",Font.BOLD,13));
        cprice.addActionListener(this);
        p1.add(cprice);
        
        bpackage = new JButton("Book Package");
        bpackage.setLayout(null);
        bpackage.setBounds(650,400,130,25);
        bpackage.setBackground(Color.BLACK);
        bpackage.setForeground(Color.WHITE);
        bpackage.setFont(new Font("Tahoma",Font.BOLD,13));
        bpackage.addActionListener(this);
        p1.add(bpackage);
        
        back = new JButton("Back");
        back.setLayout(null);
        back.setBounds(820,400,130,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,13));
        back.addActionListener(this);
        p1.add(back);
        
        JLabel package1 = new JLabel("BOOK PACKAGE");
        package1.setLayout(null);
        package1.setBounds(350,0,400,100);
        package1.setForeground(Color.BLACK);
        package1.setFont(new Font("Elephant",Font.BOLD,20));
        p1.add(package1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(450,120,500,250);
        p1.add(l1);
        
                vbookpackage = new JButton("My Package");
                vbookpackage.setLayout(null);
                vbookpackage.setBounds(480,400,150,25);
                vbookpackage.setBackground(Color.BLACK);
                vbookpackage.setForeground(Color.white);
                vbookpackage.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                       viewpackage vp = new viewpackage(username);
                       vp.setVisible(true);
                        f1.setVisible(false);
                    }
                });
                p1.add(vbookpackage);
        
                
         try{
            
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from newcustomer where username = '"+username+"' ");
            
            if(rs.next())
            {
                l2username.setText(rs.getString("username"));
                l2name.setText(rs.getString("name"));
                l2id.setText(rs.getString("id"));
                tidno.setText(rs.getString("number"));
                l2phone.setText(rs.getString("phone"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        f1.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == cprice)
        {
                            String pack = cpackage.getSelectedItem();
                            int cost = 0;
                            if(pack.equals("Gold Package")) {
                                cost += 12000;
                            }if(pack.equals("Silver Package")){
                                cost += 25000;
                            }else if(pack.equals("Bronze Package")){
                                cost += 32000;
                            }
                            
                            cost *= Integer.parseInt(tnop.getText());
                            lprice2.setText("Rs "+cost);
        }
        else if(ae.getSource() == bpackage)
        {
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+cpackage.getSelectedItem()+"', '"+l2username.getText()+"', '"+l2name.getText()+"','"+l2id.getText()+"', '"+tidno.getText()+"','"+l2phone.getText()+"','"+tnop.getText()+"','"+lprice2.getText()+"') ");
                new Paytm(username);
                
                JOptionPane.showMessageDialog(this,"Packaged Booked");
                lprice2.setText("");
                tnop.setText(""); 
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else if(ae.getSource()== back)
        {
            new Dashboard(username);
            f1.setVisible(false);
        }
    }
    public static void main(String[]args)
    {
        new BookPackage("");
    }
}
