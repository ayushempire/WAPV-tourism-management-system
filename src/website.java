
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class website extends JFrame {
    String username;
    website(String username)
    {
        this.username = username;
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://paytm.com");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        setSize(800,600);
        setLocation(250,100);
        setVisible(true);
    }
        
        
    
    
    public static void main(String [] args)
    {
        new website("");
    
    }

}
