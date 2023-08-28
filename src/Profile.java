import java.awt.*;
import java.sql.*;
import java.awt.event.*; 
import javax.swing.*;


public class Profile extends Frame implements ActionListener{
    
    JFrame f1;
    JButton baddetails, bback, duser;
    String username;
    JPanel p1;
    JLabel username1 , name1, id1, idno1, country1, address1, phone1, email1, gender1;
    
    Profile(String username)
    {
        this.username = username;
       f1 = new JFrame();
       f1.setSize(850,500);
       f1.setLocation(250,100);
       
       p1 = new JPanel();
       p1.setLayout(null);
       p1.setBounds(250,10,850,500);
       p1.setBackground(Color.white);
       f1.add(p1);
       
     
       
       
       baddetails = new JButton("Add Deatils");
       baddetails.addActionListener(this);
       baddetails.setBounds(200,420,100,25);
       baddetails.setBackground(Color.black);
       baddetails.setForeground(Color.black);
       baddetails.setBorder(BorderFactory.createLineBorder(Color.black));
       baddetails.setOpaque(false);
       p1.add(baddetails);
       
       bback = new JButton("Back");
       bback.addActionListener(this);
       bback.setBounds(500,420,100,25);
       bback.setBackground(Color.black);
       bback.setForeground(Color.black);
       bback.setBorder(BorderFactory.createLineBorder(Color.black));
       bback.setOpaque(false);
       p1.add(bback);
       
       duser = new JButton("Delete User");
       duser.addActionListener(this);
       duser.setBounds(350,420,100,25);
       duser.setBackground(Color.black);
       duser.setForeground(Color.black);
       duser.setBorder(BorderFactory.createLineBorder(Color.black));
       duser.setOpaque(false);
       p1.add(duser);
       
       
       JLabel lusername = new JLabel("username");
       lusername.setBounds(30,50,100,20);
       p1.add(lusername);
       
      username1 = new JLabel("");
       username1.setBounds(150,50,100,20);
       p1.add(username1);
       
       JLabel lname = new JLabel("Name");
       lname.setBounds(30,90,100,20);
       p1.add(lname);
       
       name1 = new JLabel("");
       name1.setBounds(150,90,100,20);
       p1.add(name1);
       
        JLabel lid = new JLabel("ID");
       lid.setBounds(30,130,100,20);
       p1.add(lid);
       
        id1 = new JLabel("");
       id1.setBounds(150,130,100,20);
       p1.add(id1);
       
        JLabel lidno = new JLabel("ID no");
       lidno.setBounds(30,180,100,20);
       p1.add(lidno);
       
        idno1 = new JLabel("");
       idno1.setBounds(150,180,100,20);
       p1.add(idno1);
       
        JLabel lcountry = new JLabel("Country");
       lcountry.setBounds(30,220,100,20);
       p1.add(lcountry);
       
        country1 = new JLabel("");
       country1.setBounds(150,220,100,20);
       p1.add(country1);
       
        JLabel laddress = new JLabel("Address");
       laddress.setBounds(30,260,100,20);
       p1.add(laddress);
       
        address1 = new JLabel("");
       address1.setBounds(150,260,150,20);
       p1.add(address1);

        JLabel lphone = new JLabel("Phone");
       lphone.setBounds(30,300,100,20);
       p1.add(lphone);
       
       phone1 = new JLabel("");
       phone1.setBounds(150,300,100,20);
       p1.add(phone1);
       
        JLabel lemail = new JLabel("Email");
       lemail.setBounds(30,340,100,20);
       p1.add(lemail);
       
        email1 = new JLabel("");
       email1.setBounds(150,340,100,20);
       p1.add(email1);
       
        JLabel lgender = new JLabel("Gender");
       lgender.setBounds(30,380,100,20);
       p1.add(lgender);
       
       gender1 = new JLabel("");
       gender1.setBounds(150,380,100,20);
       p1.add(gender1);
       
        try{
           Conn c = new Conn();
           String q1 = " select * from newcustomer where username = '"+username+"' ";
           ResultSet rs = c.s.executeQuery(q1);
           
           if(rs.next())
           {
               username1.setText(rs.getString("username"));
               name1.setText(rs.getString("name"));
               id1.setText(rs.getString("id"));
               idno1.setText(rs.getString("number"));
               country1.setText(rs.getString("country"));
               address1.setText(rs.getString("address"));
               phone1.setText(rs.getString("phone"));
               email1.setText(rs.getString("email"));
               gender1.setText(rs.getString("gender"));
           }
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0,0,850,500);
        p1.add(l5);
        
        
       f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == baddetails)
        {
          new AddDetails(username);
          f1.setVisible(false);
        }
        else if(ae.getSource() == duser)
        {
            try{
                Conn c = new Conn();
                String q1 = "delete from bookhotel where username = '"+username+"' ";
                String q2 = "delete from bookpackage where username = '"+username+"' ";
                String q3 = "delete from newcustomer where username = '"+username+"' ";
                String q4 = "delete from newuser where username = '"+username+"' ";
                
                c.s.executeUpdate(q1);  
                c.s.executeUpdate(q2);  
                c.s.executeUpdate(q3);  
                c.s.executeUpdate(q4);
                
                JOptionPane.showMessageDialog(this, "User Deleted");
           
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
         Dashboard d1 = new Dashboard(username);
         f1.setVisible(false);
            
        }
     
    }
    public static void main(String[]args)
    {
        new Profile("");
    }
}
