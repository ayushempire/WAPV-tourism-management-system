
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AddDetails extends JFrame implements ActionListener{
    JFrame f1;
    JPanel p1;
    JLabel l1, l2,lusername,l2username, lname , l2name ,heading, lid, idno, lgender;
    JLabel country, address, phone ,email;
    String username;
    JComboBox jb1;
    JRadioButton male,female;
    JTextField tidno, tcountry , tphone, temail, taddress;
    JButton badd, bback;
    
    AddDetails(String username)
    {
        this.username =username;
        
        
        
        f1 = new JFrame();
        f1.setBounds(250,100,850,550);
        f1.setBackground(Color.white);
        f1.getContentPane().setBackground(Color.white);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(250,100,850,550);
        p1.setBackground(Color.white);
        f1.add(p1);
        
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

        l2name = new JLabel();
        l2name.setLayout(null);
        l2name.setBounds(150,190,100,20);
        l2name.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(l2name);
        
        
        try{
            
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from newuser where username = '"+username+"' ");
            
            if(rs.next())
            {
                l2name.setText(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        jb1 = new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Voter ID"});
        jb1.setLayout(null);
        jb1.setBounds(150,230,100,20);
        jb1.setBackground(Color.white);
        //jb1.setForeground(Color.WHITE);
        jb1.setBorder(null);
        p1.add(jb1);
        
        
        idno = new JLabel("ID No.");
        idno.setLayout(null);
        idno.setBounds(30,270,100,20);
        idno.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(idno);
        
        tidno = new JTextField(01);
        tidno.setLayout(null);
        tidno.setBounds(150,270,100,20);
        tidno.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(tidno);
        
        lgender = new JLabel("Gender");
        lgender.setLayout(null);
        lgender.setBounds(30,310,100,20);
        lgender.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(lgender);
        
        male = new JRadioButton("Male");
        male.setBounds(150,308,100,20);
        male.setBackground(Color.white);
        p1.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(250,308,100,20);
        female.setBackground(Color.white);
        p1.add(female);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        country = new JLabel("Country");
        country.setLayout(null);
        country.setBounds(30,350,100,20);
        country.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(country);
        
        tcountry = new JTextField();
        tcountry.setLayout(null);
        tcountry.setBounds(150,350,100,20);
        tcountry.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(tcountry);        
        
        
        phone = new JLabel("Phone");
        phone.setLayout(null);
        phone.setBounds(30,390,100,20);
        phone.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(phone);
        
        tphone = new JTextField();
        tphone.setLayout(null);
        tphone.setBounds(150,390,100,20);
        tphone.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(tphone); 
        
        email = new JLabel("Email");
        email.setLayout(null);
        email.setBounds(30,430,100,20);
        email.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(email);
        
        temail = new JTextField();
        temail.setLayout(null);
        temail.setBounds(150,430,100,20);
        temail.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(temail);
        
        address = new JLabel("Address");
        address.setLayout(null);
        address.setBounds(30,470,100,20);
        address.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(address);
        
        taddress = new JTextField();
        taddress.setLayout(null);
        taddress.setBounds(150,470,100,20);
        taddress.setFont(new Font("Calibri",Font.BOLD,15));
        p1.add(taddress);
        
        heading = new JLabel("Add Details");
        heading.setLayout(null);
        heading.setBounds(350,20,200,50);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Elephant",Font.PLAIN,32));
       // heading.setBackground(Color.BLACK);
        p1.add(heading);
        
        badd = new JButton("Add");
        badd.setBounds(450,430,100,25);
        badd.setBackground(Color.BLACK);
        badd.setForeground(Color.white);
        badd.addActionListener(this);
        p1.add(badd);
        
        bback = new JButton("Back");
        bback.setBounds(590,430,100,25);
        bback.setBackground(Color.BLACK);
        bback.setForeground(Color.white);
        bback.addActionListener(this);
        p1.add(bback);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/add.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setLayout(null);
        l1.setBounds(245 ,5,100,100);
        p1.add(l1);
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.jpg"));
        Image i5 = i4.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l2 = new JLabel(i6);
        l2.setLayout(null);
        l2.setBounds(380,40,400,400);
        p1.add(l2);
        
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == badd)
        {
            String susername =  l2username.getText();
            String name = l2name.getText();
            String id = (String) jb1.getSelectedItem();
            String number = tidno.getText();
            String scountry = tcountry.getText();
            String saddress = taddress.getText();
            String sphone = tphone.getText();
            String semail = temail.getText();
            String gender = null;
            if(male.isSelected())
            {
                gender = "Male";
            }
            else
            {
                gender = "Female";
            }
            
            
            String q1 = "insert into newcustomer values( '"+susername+"', '"+name+"', '"+id+"' , '"+number+"', '"+scountry+"' ,'"+saddress+"', '"+sphone+"', '"+semail+"', '"+gender+"')";
            try{
                Conn c = new Conn();
                c.s.executeLargeUpdate(q1);
                
                JOptionPane.showMessageDialog(this, "Deatils Added...");
            }catch(Exception e){
                e.printStackTrace();
            }
            
           
            
        }
        else{
           Profile p1 = new Profile(username);
            f1.setVisible(false);
        }
    }
    public static void main(String[]args)
   {
       new AddDetails("");
   }
}