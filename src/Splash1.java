/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AYUSH
 */
import javax.swing.*;
import java.awt.*;



public class Splash1 extends JFrame implements Runnable{
    
    Thread thread;
    JProgressBar bar;
    JLabel l2;
    boolean flag = false;
    Splash1(){
        
        setSize(1200,600);
        setLocation(95,80);
        
        bar = new JProgressBar();
        bar.setLayout(null);
        bar.setBounds(0,549,1200,13);
        bar.setStringPainted(true);
        bar.setBorder(null);
        bar.setForeground(Color.BLUE);
        bar.setBackground(Color.WHITE);
        add(bar);
        
        
        l2 = new JLabel("Hello There...");
        l2.setLayout(null);
        l2.setBounds(535,529,150,20);
        l2.setForeground(Color.BLACK);
        add(l2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/newlogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        
        
        
        
        
      
        
      
        thread = new Thread(this);
       // t = new Thread(this);
       // t.start();
       thread.start();
       
        setVisible(true);
     
       
      
        
    }
    public void run(){
        try{
            if(flag == false)
            {
            for(int i =1 ; i<= 100 ; i++)
            {
                bar.setValue(i);
                if(i==15)
                {
                    l2.setText("Getting Started...");
                }
                if(i==30)
                {
                    l2.setText("Geting System Ready...");
                }
                if(i==45)
                {
                    l2.setText("Almost Ready...");
                }
                if(i==65)
                {
                    l2.setText("Get Ready...");
                }
                if(i==69)
                {
                    l2.setVisible(false);
                }
                if(i==72)
                {
                    l2.setVisible(true);
                }
                if(i==76)
                {
                    l2.setVisible(false);
                }
                if(i==80)
                {
                    l2.setVisible(true);
                }
                if(i==85)
                {
                    l2.setText("Started...");
                }
                if(i==90)
                {
                    l2.setVisible(false);
                }
                if(i==92)
                {
                    l2.setVisible(true);
                }
                if(i==94)
                {
                    l2.setVisible(false);
                }
                if(i==96)
                {
                    l2.setVisible(true);
                }
                
                
                Thread.sleep(80);
                 
            }
           flag = true;
            }
            
       if(flag==true){
           NewLogin l1 = new NewLogin();
           setVisible(false);
        }
       }
        catch(Exception e){}
    }
    
    
    public static void main(String []args)
    {
        Splash1 frame = new Splash1();
       /*  int x=1;
        for(int i =1;i<=600; x++,i++)
        {
           frame.setSize(i*2,i);
           frame.setLocation(689-(x),384-(i/2));
           try
           {Thread.sleep(1);
           }
           catch(Exception e) {}
        }*/
      
    }

   
}
