
package com.mycompany.starwars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JPanel;

public class PlayGround extends JPanel implements KeyListener, ActionListener{
    
    private BufferedImage image, imageB, imageC, imageD, imageE;
    
    public PlayGround(){
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("aharfi.jpg")));
            imageB = ImageIO.read(new FileImageInputStream(new File("bharfi.jpg")));
            imageC = ImageIO.read(new FileImageInputStream(new File("charfi.jpg")));
            imageD = ImageIO.read(new FileImageInputStream(new File("dharfi.png")));
            imageE = ImageIO.read(new FileImageInputStream(new File("eharfi.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(PlayGround.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.lightGray);
        
        
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        
        int[][] array = {   {0,0,0,0,0,1,0,0,0,0,0},            
                            {0,1,1,1,1,1,1,1,1,1,0},
                            {0,1,0,0,0,0,0,0,0,1,0},
                            {0,1,1,1,1,1,0,1,1,1,0},
                            {1,1,1,1,0,1,1,1,0,1,1},
                            {0,0,1,0,0,1,0,1,0,1,0},
                            {0,1,1,1,1,1,1,1,0,1,0},
                            {0,1,0,0,0,0,0,1,0,1,0},
                            {0,1,1,1,1,1,1,1,0,1,0},
                            {0,1,0,1,1,0,0,0,0,1,0},
                            {0,1,0,0,0,0,1,0,0,1,0},
                            {0,1,0,1,1,0,1,0,1,1,0},
                            {1,1,1,1,1,1,1,1,1,1,0},
                            {0,0,0,0,0,1,0,0,0,1,0},                           
                         };
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j] == 0){
                    g.fillRect(120+(i*41),90+(j*41), 41, 41);
                }             
            }
        }
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                    g.setColor(Color.black);
                    g.drawRect(120+(i*41),90+(j*41), 41, 41);
                
                
            }
        }
        
        g.drawImage(image, 120, 295, image.getWidth(), image.getHeight(),this);
        g.drawImage(imageB, 284, 91, imageB.getWidth(), imageB.getHeight(),this);
        g.drawImage(imageC, 612, 91, imageC.getWidth(), imageC.getHeight(),this);
        g.drawImage(imageD, 653, 295, imageD.getWidth(), imageD.getHeight(),this);
        g.drawImage(imageE, 284, 500, imageE.getWidth(), imageE.getHeight(),this);
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
    
    
}
