package StepDefinitions;

import Pages.Burak.MusicPlayer;
import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class Hooks {
    private static boolean isMusicPlaying = false;
    private MusicPlayer musicPlayer;

    @Before
    public void beforeScenario() {

        if (!isMusicPlaying) {
            // Replace the musicFilePath with the actual path to your music file
            String musicFilePath = "src/test/java/Pages/Burak/Mario.wav";
            musicPlayer = new MusicPlayer(musicFilePath);
            musicPlayer.start();
            isMusicPlaying = true;
        }

/*        try {
            File soundFile = new File("src/test/java/Pages/Burak/Mario.wav"); // Replace with the actual path to your sound file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(a);*/
    }


    @After
    public void afterScenario() {
        BasicDriver.quitDriver();
    }

}
