package quiz.application;

import java.io.IOException;
import java.io.File;
import javax.sound.sampled.*;
import java.util.Scanner;

public class Music {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        Scanner sc = new Scanner(System.in);
        File file = new File("Mingle Game Song.wav"); // Path to your audio file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        // Start playing the audio
        clip.start();
        
        // Loop the audio indefinitely
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        // Keep the program running to allow the music to play
        System.out.println("Music is playing... Press 'Q' to quit.");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                clip.stop(); // Stop the music
                clip.close(); // Release resources
                System.out.println("Music stopped. Exiting...");
                break;
            }
        }
    }
}