
package com.mycompany.ludo_build;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Music 
{
    public static Clip clip;
    
    public void playMusic(String filePath) {
        try 
        {
             File audioFile = new File(filePath);
             
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
             AudioFormat format = audioStream.getFormat();
             
             DataLine.Info info = new DataLine.Info(Clip.class, format);
             clip = (Clip) AudioSystem.getLine(info);
             clip.open(audioStream);
             clip.start();
             
        }
      catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) 
      {
            e.printStackTrace();
        }
        
    }
    
     public void stopMusic()
     {
         if (clip != null && clip.isRunning()) // clip!=null checks if the music has been initialized or not
                                            
         {
            clip.stop();
            clip.close();
         }
     }
    
}
