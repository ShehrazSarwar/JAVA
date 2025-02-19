package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,exit;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,530);
        add(image);
        
        JLabel heading = new JLabel("Quiz Quest");
        heading.setBounds(820, 80, 300, 45);
        heading.setFont(new Font("Comic Sans MS", Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel heading2 = new JLabel("Test Your Knowledge!");
        heading2.setBounds(828, 160, 300, 45);
        heading2.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        heading2.setForeground(new Color(255, 121, 0));
        add(heading2);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(850, 250, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(780,300,300,25);
        tfname.setFont(new Font("Arial", Font.BOLD,18));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(780,360,120,30);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(960,360,120,30);
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        
        setSize(1250,600);
        setLocation(350,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            if(name.isEmpty()){
                name = "User";
            }
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource() == exit){
            setVisible(false);
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
