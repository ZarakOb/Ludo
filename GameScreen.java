
package com.mycompany.ludo_build;


import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Color;





public class GameScreen extends JPanel implements MouseListener {
    static int XPos = 170, YPos =300 , LimXPos = 425, LimYPos = 400, yPosM = 450, LimYPosM = 550;
    JFrame LudoFrame = new JFrame();
    Menu M;
    Music player;
    
    //Replace this with your music path
    String MusicPath = "C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\Forging an Empire - Christoffer Moe Ditlevsen.wav";
        
    public GameScreen(){
        
        LudoFrame.setSize(635, 750);
        LudoFrame.setTitle("Ludo");
        LudoFrame.setResizable(false);
        LudoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Back Ground Color
       
        
         
        //Top Left Icon
        //Replace this with the path of your Image
        ImageIcon image = new ImageIcon("C:/Users/shira/Documents/NetBeansProjects/Ludo_Build/src/main/java/com/mycompany/ludo_build/LudoIcon.png");
        LudoFrame.setIconImage(image.getImage());
        
        //Menu
        M = new Menu();
        LudoFrame.add(M);
        player = new Music();
        player.playMusic(MusicPath);
        
        LudoFrame.addMouseListener(this);
        
        LudoFrame.getContentPane().setBackground(new Color(0x1F3B4D));
        LudoFrame.setVisible(true);
        
    }
    
        
        


    @Override
    public void mouseClicked(MouseEvent e) {
      
        
        int Mx = e.getX();
        int My = e.getY();
        
        
         if(My > YPos && My < LimYPos+50) {
            if(Mx > XPos-20 && Mx < LimXPos+20){  
                
                //pressed Play Button
                M.setVisible(false);
                LudoFrame.setBackground(new Color(0x1F3B4D));
                GameMoves gm = new GameMoves();
	        gm.setFocusable(true);
	        gm.addKeyListener(gm);
	        gm.addMouseListener(gm);
                LudoFrame.add(gm);
              
                
               
	        
	        LudoFrame.setVisible(true);
                
                
            }
        }
         
       
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        //M.setVisible(true);
        int Mx = e.getX();
        int My = e.getY();
        
        
         if(My > yPosM && My < LimYPosM) {
            if(Mx > XPos && Mx < LimXPos){ 
                 
                 if(player.clip.isRunning()){
                     player.stopMusic();
                 
               
                 }else {
                     player.playMusic(MusicPath);
                 }}
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	   }

   
        
        
       

    

