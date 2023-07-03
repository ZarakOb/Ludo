
package com.mycompany.ludo_build;

import java.awt.Graphics2D;

public class Build_Player 
{
    Player[] pl=new Player[4]; 
    
    int initialx[][] = {                    
                     {1,1,3,3},            
                     {10,10,12,12},   
                     {10,10,12,12},       // Each row represents a player and each column represents                                      
                     {1,1,3,3},           // initial position of one of the game piece
                };
    
    // The initialx and initialy arrays are 2D arrays that define the
   //  initial positions of the player's game pieces on the game board.
    
    int[][] initialy= {
			{1,3,1,3},
			{1,3,1,3},
			{10,12,10,12},
			{10,12,10,12}
                };
    
    public Build_Player(int height, int width)
    {
        
        // Initializing each element in the pl array by creating a new Player 
       //  object with the given height and width.
        
        for (int i = 0; i<4; i++)
        {
            pl[i] = new Player(height, width);  
        }
        
    }
    
    public void draw(Graphics2D g) // Drawing the player's game pieces on the board. 
    {

         
        //loops through each player and each game piece, and calls the draw method of the PlayerPiece object 
        for (int i = 0; i<4; i++)
        {
            for (int j = 0; j<4; j++)
                pl[i].pa[j].draw(g,initialx[i][j],initialy[i][j],i);
        }
    }
    
}

