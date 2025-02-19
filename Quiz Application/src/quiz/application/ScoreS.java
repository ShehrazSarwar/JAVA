
package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScoreS extends JFrame implements ActionListener{
     ScoreS(String name, int score){
        setBounds(600,250,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(score >=50 ){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/S22.gif"));
        Image i2 = i1.getImage().getScaledInstance(281, 498, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,80,281,498);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " You WON :)");
        heading.setBounds(200,30,700,30); 
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score Is "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    else{
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/S11.gif"));
        Image i2 = i1.getImage().getScaledInstance(281, 498, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,80,281,498);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " Now Please DIE LOL");
        heading.setBounds(150,30,700,30); 
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score Is "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        }
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new ScoreS("User",0);
    }
}
