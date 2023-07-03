
package com.mycompany.ludo_build;
    

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
       


public class Layout{
	
	int x,y,width,height;
        ArrayList<BufferedImage> Dice = new ArrayList();
        
         

	public Layout(int xi,int yi) {
            //Location And Size Of Board
		x=xi; 
		y=yi;
		width=30;
		height=30;
	}
	public void draw(Graphics2D g){
            //Controls Path And Background Color
           g.setColor(Color.DARK_GRAY);
          
           
		

        g.fillRect(x,y,15*width,15*height);
        for(int i=0;i<6;i++) {
            //Controls Top Left House Borders
        	g.setColor(new Color(0xcf3c2c));
        	g.fill3DRect(x+(i*width),y, width, height, true);
        	g.fill3DRect(x, y+(i*height), width, height, true);
        	g.fill3DRect(x+(i*width),y+(5*height), width, height, false);
                g.fill3DRect(x+(5*width), y+(i*height), width, height, false);
            //Controls Top Right House Borders
        	g.setColor(new Color(0x358873));
        	g.fill3DRect(x+((i+9)*width),y, width, height,true);
        	g.fill3DRect(x+(9*width), y+(i*height), width, height,true);
        	g.fill3DRect(x+((i+9)*width),y+(5*height), width, height, false);
        	g.fill3DRect(x+(14*width), y+(i*height), width, height, false);
            //Controls Down Right House Borders
        	g.setColor(new Color(0xF2B418));  
        	g.fill3DRect(x+((i+9)*width),y+(9*height), width, height, true);
        	g.fill3DRect(x+(9*width), y+((i+9)*height), width, height, true);
        	g.fill3DRect(x+((i+9)*width),y+(14*height), width, height, false);
        	g.fill3DRect(x+(14*width), y+((i+9)*height), width, height, false);
            //Controls Down Left House Borders
        	g.setColor(new Color(0x052d43));
        	g.fill3DRect(x+(i*width),y+(9*height), width, height, true);
        	g.fill3DRect(x, y+((i+9)*height), width, height, true);
        	g.fill3DRect(x+(i*width),y+(14*height), width, height, false);
        	g.fill3DRect(x+(5*width), y+((i+9)*height), width, height, false);
        }
        for(int i=1;i<6;i++) {
            //Controls the 5 spaces that lead to the pawn reaching its end
            //For Red (TOP LEFT)
        	g.setColor(new Color(0xcf3c2c));
        	g.fill3DRect(x+(i*width),y+(7*height), width, height,true);
            //For Yellow (Down Right)
        	g.setColor(new Color(0xF2B418));
        	g.fill3DRect(x+((8+i)*width),y+(7*height), width, height, true);
            //For Green (Top Right
        	g.setColor(new Color(0x358873));
        	g.fill3DRect(x+(7*width),y+(i*height), width, height, true);
            //For Blue Down Left
        	g.setColor(new Color(0x052d43));
        	g.fill3DRect(x+((7)*width),y+((8+i)*height), width, height, true);
        }
        //Controls the one Box from which the Pawn starts it path
        //red
        g.setColor(new Color(0xcf3c2c));
    	g.fill3DRect(x+(1*width),y+(6*height), width, height, false);
        //Yellow
    	g.setColor(new Color(0xF2B418));
    	g.fill3DRect(x+((13)*width),y+(8*height), width, height, true);
        //Green
    	g.setColor(new Color(0x358873));
    	g.fill3DRect(x+(8*width),y+(1*height), width, height, true);
        //Blue
    	g.setColor(new Color(0x052d43));
    	g.fill3DRect(x+((6)*width),y+((13)*height), width, height, false);
        
        //The bases beneath the pawn in the Houses
    	int temp1=x+45,temp2=y+45, 
                ARCX = 15,
                ARCY = 15;
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    		g.setColor(new Color(0xcf3c3c));
                g.fillRoundRect(x, y, width, height, width, height);
    	    	g.fillRoundRect(temp1+(2*i*width),temp2+(2*j*height), width, height, ARCX, ARCY);
    	    	g.setColor(new Color(0xF2B418));
    	    	g.fillRoundRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+9*height, width, height, ARCX, ARCY);
    	    	g.setColor(new Color(0x358873));
    	    	g.fillRoundRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+0*height, width, height, ARCX,ARCY);
    	    	g.setColor(new Color(0x052d43));
    	    	g.fillRoundRect(temp1+(2*i*width)+0*width,temp2+(2*j*height)+9*height, width, height, ARCX, ARCY);
    		}
    	}
        
        //Controls The Middle Square Where Pawns Go Into
    	g.setColor(new Color(0xcf3c3c));
    	int xpoints0[] = {x+(6*width),x+(6*width), x+15+(7*width)};
        int ypoints0[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints = 3;
        g.fillPolygon(xpoints0, ypoints0, npoints);
              
        //YELLOW
    	g.setColor(new Color(0xF2B418));
    	int xpoints1[] = {x+(9*width),x+(9*width), x+15+(7*width)};
        int ypoints1[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints1= 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);
        //GREEN
    	g.setColor(new Color(0x358873));
    	int xpoints2[] = {x+(6*width),x+(9*width), x+15+(7*width)};
        int ypoints2[] = {y+(6*height),y+(6*height),y+15+(7*width)};
        int npoints2= 3;
        g.fillPolygon(xpoints2, ypoints2, npoints2);
        //BLUE
    	g.setColor(new Color(0x052d43));
    	int xpoints3[] = {x+(6*width),x+(9*width), x+15+(7*width)};
        int ypoints3[] = {y+(9*height),y+(9*height),y+15+(7*width)};
        int npoints3= 3;
        g.fillPolygon(xpoints3, ypoints3, npoints3);
        
    	g.setStroke(new BasicStroke(2));
    	g.setColor(Color.BLACK);
        
        //Decides how bubbly the squares should be:
        int ArcXN = 12,
            ArcYN = 12;
        {
        //decide the stroke width of boxes and their border colours
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.DARK_GRAY);
        boolean TrueFalse = false;
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<6;j++) {        
                
                g.draw3DRect(x+((i+6)*width), y+(j*height), width, height, TrueFalse);
                g.draw3DRect(x+((j)*width), y+((i+6)*height), width, height, TrueFalse);
                g.draw3DRect(x+((i+6)*width), y+((j+9)*height), width, height, TrueFalse);
                g.draw3DRect(x+((j+9)*width),y+((i+6)*height), width, height, TrueFalse);
    	       
    		}
    	} }
        g.setStroke(new BasicStroke(0));
        //Border For Houses
     g.setColor(Color.BLACK);

        //Border for Frame
        g.setStroke(new BasicStroke(2));
        g.drawRect(x,y,15*width,15*height);
       
        g.setStroke(new BasicStroke(0));
        for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    	    	g.drawRoundRect(temp1+(2*i*width),temp2+(2*j*height), width, height, ARCX - ArcXN+6,  ARCY - ArcYN+6);
    	    	g.drawRoundRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+9*height, width, height, ARCX - ArcXN+6, ARCY - ArcYN+6);
    	    	g.drawRoundRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+0*height, width, height, ARCX - ArcXN+6, ARCY - ArcYN+6);
    	    	g.drawRoundRect(temp1+(2*i*width)+0*width,temp2+(2*j*height)+9*height, width, height, ARCX - ArcXN+6, ARCY - ArcYN+6);
    		}
    	}
       //Polygons at the centre 
       g.drawPolygon(xpoints0, ypoints0, npoints);
       g.drawPolygon(xpoints1, ypoints1, npoints1);
       g.drawPolygon(xpoints2, ypoints2, npoints2);
       g.drawPolygon(xpoints3, ypoints3, npoints3);
       
       //Green
       g.setColor(new Color(0x358873));
       g.fill3DRect(x+(6*width), y+(2*height), width, height, true);
       //Yellow
       g.setColor(new Color(0xF2B418));
       g.fill3DRect(x+(12*width), y+(6*height), width, height, true);
       //Blue
       g.setColor(new Color(0x052d43));
       g.fill3DRect(x+(8*width), y+(12*height), width, height, true);
       //Red
       g.setColor(new Color(0xcf3c2c));
       g.fill3DRect(x+(2*width), y+(8*height), width, height, true);
      
        g.setFont(new Font("serif", Font.BOLD, 12));
        g.setColor(new Color(0xcf3c2c));
        g.drawString("Player 1", 110, 40);
        g.setColor(new Color(0x358873));
        g.drawString("Player 2", 390, 40);
        g.setColor(new Color(0x052d43));
        g.drawString("Player 4", 110, 520);
        g.setColor(new Color(0xF2B418));
        g.drawString("Player 3", 390, 520);
        
        ////Replace all the strings with the path of your Images
        try {
        Dice.add(null);
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice1.jpg")));
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice2.jpg")));
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice3.jpg")));
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice4.jpg")));
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice5.jpg")));
        Dice.add(ImageIO.read(new File("C:\\Users\\shira\\Documents\\NetBeansProjects\\Ludo_Build\\src\\main\\java\\com\\mycompany\\ludo_build\\LudoDice6.jpg")));
} catch(IOException e){
            System.out.println("File Not Loaded");
}
        g.setFont(new Font("serif", Font.ROMAN_BASELINE, 20));
        g.setColor(Color.BLACK);
        g.drawString("Press Tab + Enter To Start", x, y+520);
        
        g.drawImage(Dice.get((GameMoves.dice)), x+300, y+500, 110, 110, null);
         
    
        
    }
}

