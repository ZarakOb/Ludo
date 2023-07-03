
package com.mycompany.ludo_build;

import java.awt.Graphics2D;
import java.awt.Color;

public class Player
{
    int height, width, status,   
        coin;
    
    Pawn[] pa = new Pawn[4];   // Array of pawn objects
    
    public Player(int height , int width )
    {
        status = -1; // Current status of the player (uninitialized state)
        
        coin = 0;   // Number of coins the player has
        
        for (int i = 0; i<4; i++)
        {
            pa[i] = new Pawn(height, width);  
        }
    }
    
    
    
    
    public void draw(Graphics2D g) 
    {
       //
    }
    
}