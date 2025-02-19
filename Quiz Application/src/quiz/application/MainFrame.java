
package quiz.application;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{
    
    JButton first,second;
    String name;
    MainFrame(String name){
        this.name = name;
        setBounds(0,5,1920,1080);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        first = new JButton("JAVA QUIZ");
        first.setFont(new Font("Poppins", Font.BOLD,25));
        first.setBounds(840,260,180,50);
        first.setBackground(Color.GRAY);
        first.setForeground(Color.WHITE);
        first.addActionListener(this);
        add(first);
        
        second = new JButton("SQUID GAME");
        second.setFont(new Font("Poppins", Font.BOLD,25));
        second.setBounds(820,860,200,50);
        second.setBackground(Color.RED);
        second.setForeground(Color.WHITE);
        second.addActionListener(this);
        add(second);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/JAVA.jpg"));
        Image i5 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1920,550);
        add(image);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/SGG.jpg"));
        Image i3 = i2.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image2 = new JLabel(i4);
        image2.setBounds(0,0,1920,1300);
        add(image2);
 
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == first){
            setVisible(false);
            new Quiz(name);
        }else if(ae.getSource() == second){
           try {
               setVisible(false);
               new Quiz2(name);
           } catch (LineUnavailableException ex) {
               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (UnsupportedAudioFileException ex) {
               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new MainFrame("User");
    }
}
