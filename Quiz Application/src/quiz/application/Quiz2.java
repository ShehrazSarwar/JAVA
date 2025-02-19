package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.*;
import java.util.Scanner;

public class Quiz2 extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question, timerLabel;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    javax.swing.Timer quizTimer;
    Clip clip;
    
    Quiz2(String name) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        
        Scanner sc = new Scanner(System.in);
        File file = new File("Mingle Game Song.wav"); // Path to your audio file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        // Start playing the audio
        clip.start();
        
        // Loop the audio indefinitely
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        this.name = name;
        setBounds(250,80,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(159,450,900,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(question);
        
        timerLabel = new JLabel();
        timerLabel.setBounds(1050, 450, 300, 60);
        timerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        timerLabel.setForeground(Color.RED);
        add(timerLabel);
        
        questions[0][0] = "What is the main objective of the players in Squid Game?";
        questions[0][1] = "To form alliances and escape"; // Option 1
        questions[0][2] = "To win money by surviving deadly games"; // Correct Answer (Option 2)
        questions[0][3] = "To sabotage other players"; // Option 3
        questions[0][4] = "To uncover the secrets of the organizers"; // Option 4

        questions[1][0] = "What is the name of the mysterious organization behind the games?";
        questions[1][1] = "The Red Circle"; //  Option 1
        questions[1][2] = "The Front Man's Syndicate"; // Correct Answer (Option 2)
        questions[1][3] = "The Black Mask Group"; // Option 3
        questions[1][4] = "The VIP Consortium"; // Option 4

        questions[2][0] = "What is the significance of the shapes on the guards' masks?";
        questions[2][1] = "They represent the hierarchy of the guards"; // Correct Answer (Option 1)
        questions[2][2] = "They indicate the type of game they oversee"; // Option 2
        questions[2][3] = "They are random designs with no meaning"; // Option 3
        questions[2][4] = "They symbolize the players' progress"; // Option 4

        questions[3][0] = "What is the most iconic game from Season 1 that might return in Season 2?";
        questions[3][1] = "Tug of War"; // Option 1
        questions[3][2] = "Glass Stepping Stones"; // Option 2
        questions[3][3] = "Red Light, Green Light"; // Correct Answer (Option 3)
        questions[3][4] = "Marbles"; // Option 4

        questions[4][0] = "What role do the VIPs play in the games?";
        questions[4][1] = "They participate in the games secretly"; // Option 1
        questions[4][2] = "They fund the games anonymously"; // Option 2
        questions[4][3] = "They rescue losing players"; // Option 3
        questions[4][4] = "They bet on and watch the players"; // Correct Answer (Option 4)

        questions[5][0] = "What is the Front Man's real name?";
        questions[5][1] = "Lee Byung-hun"; // Option 1
        questions[5][2] = "Hwang In-ho"; // Correct Answer (Option 2)
        questions[5][3] = "Park Hae-soo"; // Option 3
        questions[5][4] = "Jang Deok-su"; // Option 4

        questions[6][0] = "What is the prize money for winning the games in Season 2?";
        questions[6][1] = "45.6 billion won"; // Correct Answer (Option 1)
        questions[6][2] = "100 billion won"; // Option 2
        questions[6][3] = "10 billion won"; // Option 3
        questions[6][4] = "1 trillion won"; // Option 4

        questions[7][0] = "What is the symbol on the Squid Game invitation card?";
        questions[7][1] = "A red umbrella"; // Option 1
        questions[7][2] = "A circle, triangle, and square"; // Correct Answer (Option 2)
        questions[7][3] = "A black mask"; // Option 3
        questions[7][4] = "A golden piggy bank"; // Option 4

        questions[8][0] = "What is the primary color scheme of the Squid Game uniforms?";
        questions[8][1] = "Green tracksuits for players, pink jumpsuits for guards"; // Correct Answer (Option 1)
        questions[8][2] = "Blue jumpsuits for players, black suits for guards"; // Option 2
        questions[8][3] = "Red tracksuits for players, white masks for guards"; // Option 3
        questions[8][4] = "Yellow uniforms for players, red masks for guards"; // Option 4

        questions[9][0] = "What is the ultimate fate of the winner of the games?";
        questions[9][1] = "They receive the prize money but are traumatized"; // Correct Answer (Option 1)
        questions[9][2] = "They are recruited as a game organizer"; // Option 2
        questions[9][3] = "They are eliminated to keep the games secret"; // Option 3
        questions[9][4] = "They are given a new identity and sent abroad"; // Option 4
        
        // Updated Squid Game Answers
        answers[0][1] = "To win money by surviving deadly games";
        answers[1][1] = "The Front Man's Syndicate";
        answers[2][1] = "They represent the hierarchy of the guards";
        answers[3][1] = "Red Light, Green Light";
        answers[4][1] = "They bet on and watch the players";
        answers[5][1] = "Hwang In-ho";
        answers[6][1] = "45.6 billion won";
        answers[7][1] = "A circle, triangle, and square";
        answers[8][1] = "Green tracksuits for players, pink jumpsuits for guards";
        answers[9][1] = "They receive the prize money but are traumatized";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        quizTimer = new javax.swing.Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer--;
                if (timer >= 0) {
                    timerLabel.setText("Time left - " + timer + " seconds");
                } else {
                    timerLabel.setText("Times up!!");
                    quizTimer.stop();
                    handleTimeUp();
                }
            }
        });
        quizTimer.start();
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
            timer = 15;
            quizTimer.restart();
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            quizTimer.stop();
            setVisible(false);
            count = 0;
            ans_given = 0;
            int newscore = score;
            score = 0;
            clip.stop(); // Stop the music
            clip.close(); // Release resources
            new ScoreS(name, newscore); //here score
        }
    }
    
    private void handleTimeUp() {
        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);
        
        if (count == 8) {
            next.setEnabled(false);
            submit.setEnabled(true);
        }
        if (count == 9) { // submit button
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            count = 0;
            ans_given = 0;
            int newscore = score;
            score = 0;
            clip.stop(); // Stop the music
            clip.close(); // Release resources
            new ScoreS(name, newscore); //here score
        } else { // next button
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            count++; // 0 // 1
            start(count);
            timer = 15;
            quizTimer.restart();
        }
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        new Quiz2("User");

    }
}