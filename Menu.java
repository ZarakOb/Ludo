
package com.mycompany.ludo_build;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Menu extends JPanel {
    
    public Menu(){
        this.setPreferredSize(new Dimension(1000,1000));
        
    }

    /**
     *
     * @param g
     */
    @Override
     public void paint(Graphics g){
        
        Graphics2D G = (Graphics2D)g;
        
       
        
       
        //Image
        //Replace this with the path of your Image
        try{
        G.drawImage(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoWP.jpg")), 0, 0,700,800, null);
        
        } catch (IOException E){
            
        }
         //Name
        G.setFont(new Font("serif", Font.BOLD, 50));
       
        G.setColor(Color.RED);
        G.drawString("+Ludo Master+", 138, 170);
        G.setColor(Color.BLUE);
        G.drawString("+Ludo Master+", 130, 170);
        G.setColor(Color.WHITE);
        G.drawString("+Ludo Master+", 134, 170);
        //Play Button
        
        G.setColor(Color.RED);
        G.setStroke(new BasicStroke(2));
        G.fillRoundRect(GameScreen.XPos-2, GameScreen.YPos+2,GameScreen.LimXPos-GameScreen.XPos, GameScreen.LimYPos-GameScreen.YPos, 10, 10);
        G.setColor(Color.BLUE);
        G.fillRoundRect(GameScreen.XPos+2, GameScreen.YPos-2,GameScreen.LimXPos-GameScreen.XPos, GameScreen.LimYPos-GameScreen.YPos, 10, 10);
        G.setColor(Color.WHITE);
        G.fillRoundRect(GameScreen.XPos, GameScreen.YPos,GameScreen.LimXPos-GameScreen.XPos, GameScreen.LimYPos-GameScreen.YPos, 10, 10);
        G.setFont(new Font("serif", Font.BOLD, 45));
        G.setColor(Color.BLACK);
        G.drawString("PLAY", GameScreen.XPos+60, GameScreen.YPos+65);
//Music Button
        
        G.setColor(Color.RED);
        G.setStroke(new BasicStroke(2));
        G.fillRoundRect(GameScreen.XPos-2-30, GameScreen.yPosM+2,GameScreen.LimXPos-GameScreen.XPos+60, GameScreen.LimYPosM-GameScreen.yPosM, 10, 10);
        G.setColor(Color.BLUE);
        G.fillRoundRect(GameScreen.XPos+2-30, GameScreen.yPosM-2,GameScreen.LimXPos-GameScreen.XPos+60, GameScreen.LimYPosM-GameScreen.yPosM, 10, 10);
        G.setColor(Color.WHITE);
        G.fillRoundRect(GameScreen.XPos-30, GameScreen.yPosM,GameScreen.LimXPos-GameScreen.XPos+60, GameScreen.LimYPosM-GameScreen.yPosM, 10, 10);
        G.setFont(new Font("serif", Font.BOLD, 35));
        G.setColor(Color.BLACK);
        G.drawString("Music On/Off", GameScreen.XPos+20, GameScreen.YPos+210);
        
    }
    public void RePaint(){
        repaint();
    }
}
