package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel heading = new JLabel("Welcome " + name + " To Quiz Quest");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Comic Sans MS", Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel("Welcome " + name + " To Quiz Quest");
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
        "<html>" +
            "1. Each question has only one correct answer." + "<br><br>" +
            "2. If unsure, pick 'B.' It works… sometimes." + "<br><br>" +
            "3. Don't stare at the screen too hard. The answers won’t magically appear." + "<br><br>" +
            "4. This quiz app doesn’t accept bribes or flattery. Try logic instead." + "<br><br>" +
            "5. If you see a 'None of the above' option, beware. It’s usually a trap." + "<br><br>" +
            "6. Clicking the wrong answer repeatedly doesn’t make it right. This isn’t social media." + "<br><br>" +
            "7. Time is ticking. Think fast, but don’t fry your brain." + "<br><br>" +
            "8. Remember, even wild guesses can sometimes turn into legends." + "<br><br>" +
        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,490,100,40);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(430,490,100,40);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(530,170);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new MainFrame(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
}
