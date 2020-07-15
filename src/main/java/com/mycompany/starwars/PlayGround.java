
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
    
    
    int[][] array = {       {0,0,0,0,0,1,0,0,0,0,0},            
                            {0,1,1,1,1,1,1,1,1,1,0},
                            {0,1,0,0,0,0,0,0,0,1,0},
                            {0,1,1,1,1,1,0,1,1,1,0},
                            {1,1,1,1,0,1,1,1,0,1,1},
                            {0,0,1,0,0,1,0,1,0,1,0},
                            {0,1,1,1,1,1,1,1,0,1,0},
                            {0,1,0,0,0,0,0,1,0,1,0},
                            {0,1,1,1,1,1,1,1,1,1,0},
                            {0,1,0,1,1,0,0,0,0,1,0},
                            {0,1,0,0,0,0,1,0,0,1,0},
                            {0,1,0,1,1,0,1,0,1,1,0},
                            {1,1,1,1,1,1,1,1,1,1,0},
                            {0,0,0,0,0,1,0,0,0,1,0},                           
                    };
    
    private BufferedImage image, imageB, imageC, imageD, imageE, imageKupa, imageFire, imagePath;
    private BufferedImage imageAsagiOk, imageYukarıOk, imageSagOk, imageSolOk, imageAsagiOkTwo;
    private BufferedImage imageMasterYoda;
    
    private int masterYodaX=364;
    private int masterYodaY=295;
    
    CharacterLocation characterLocation = new CharacterLocation();
    
    
    
    public PlayGround(){
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("aharfi.jpg")));
            imageB = ImageIO.read(new FileImageInputStream(new File("bharfi.jpg")));
            imageC = ImageIO.read(new FileImageInputStream(new File("charfi.jpg")));
            imageD = ImageIO.read(new FileImageInputStream(new File("dharfi.png")));
            imageE = ImageIO.read(new FileImageInputStream(new File("eharfi.jpg")));
            
            imageAsagiOk = ImageIO.read(new FileImageInputStream(new File("asagiok.jpg")));
            imageAsagiOkTwo = ImageIO.read(new FileImageInputStream(new File("asagiok2.jpg")));
            imageSagOk = ImageIO.read(new FileImageInputStream(new File("sagok.jpg")));
            imageSolOk = ImageIO.read(new FileImageInputStream(new File("solok.jpg")));
            imageYukarıOk = ImageIO.read(new FileImageInputStream(new File("yukarıok.jpg")));
            
            imageKupa = ImageIO.read(new FileImageInputStream(new File("kupa.jpeg")));
            imageFire = ImageIO.read(new FileImageInputStream(new File("fire.jpg")));
            imagePath = ImageIO.read(new FileImageInputStream(new File("path.jpg")));
            
            imageMasterYoda = ImageIO.read(new FileImageInputStream(new File("masteryoda.png")));
            
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
        
        
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                    g.setColor(Color.black);
                    g.drawRect(120+(i*41),90+(j*41), 41, 41);
                              
            }
        }
        
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j] == 0){
                    //g.fillRect(120+(i*41),90+(j*41), 41, 41);
                    g.drawImage(imageFire, 120+(i*41), 90+(j*41), imageFire.getWidth(), imageFire.getHeight(),this);
                }else{
                    g.drawImage(imagePath, 120+(i*41), 90+(j*41), imagePath.getWidth(), imagePath.getHeight(),this);
                }          
            }
        }
        
        
        g.drawImage(image, 120, 295, image.getWidth(), image.getHeight(),this);
        g.drawImage(imageB, 284, 91, imageB.getWidth(), imageB.getHeight(),this);
        g.drawImage(imageC, 612, 91, imageC.getWidth(), imageC.getHeight(),this);
        g.drawImage(imageD, 653, 295, imageD.getWidth(), imageD.getHeight(),this);
        g.drawImage(imageE, 284, 500, imageE.getWidth(), imageE.getHeight(),this);
        
        g.drawImage(imageSagOk, 80, 295, imageSagOk.getWidth(), imageSagOk.getHeight(),this);
        g.drawImage(imageAsagiOk, 284, 50, imageAsagiOk.getWidth(), imageAsagiOk.getHeight(),this);
        g.drawImage(imageAsagiOkTwo, 612, 50, imageAsagiOkTwo.getWidth(), imageAsagiOkTwo.getHeight(),this);
        g.drawImage(imageSolOk, 693, 295, imageSolOk.getWidth(), imageSolOk.getHeight(),this);
        g.drawImage(imageYukarıOk, 284, 541, imageYukarıOk.getWidth(), imageYukarıOk.getHeight(),this);
        
        g.drawImage(imageKupa, 695, 459, imageKupa.getWidth(), imageKupa.getHeight(),this);
        
        g.drawImage(imageMasterYoda, masterYodaX, masterYodaY, imageMasterYoda.getWidth(), imageMasterYoda.getHeight(),this);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int value = e.getKeyCode();
        
        if(value == KeyEvent.VK_LEFT){
            System.out.println(characterLocation.getCharacterX());
            System.out.println(characterLocation.getCharacterY());
            if(array[characterLocation.getCharacterX()-1][characterLocation.getCharacterY()] == 0){
                
            }else{
                masterYodaX-=41;
                characterLocation.setCharacterX(characterLocation.getCharacterX()-1);
                System.out.println("X Kordinati: "+characterLocation.getCharacterX());
                System.out.println(masterYodaX);
            }
            
        }
        else if(value == KeyEvent.VK_RIGHT){
            System.out.println(characterLocation.getCharacterX());
            System.out.println(characterLocation.getCharacterY());
            if(array[characterLocation.getCharacterX()+1][characterLocation.getCharacterY()] == 0){
                
            }else{
                masterYodaX+=41;
                characterLocation.setCharacterX(characterLocation.getCharacterX()+1);
                System.out.println("X Kordinati: "+characterLocation.getCharacterX());
                System.out.println(masterYodaX);
            }
        }
        else if(value == KeyEvent.VK_UP){
            /*
            if(masterYodaY < 173){
                masterYodaY=131;
            }else{
                masterYodaY-=41;
                System.out.println(masterYodaY);
            }
*/
            System.out.println(characterLocation.getCharacterX());
            System.out.println(characterLocation.getCharacterY());
            if(array[characterLocation.getCharacterX()][characterLocation.getCharacterY()-1] == 0){
                
            }else{
                masterYodaY-=41;
                characterLocation.setCharacterY(characterLocation.getCharacterY()-1);
                System.out.println("Y Kordinati: "+characterLocation.getCharacterY());
                System.out.println(masterYodaY);
            }
            
        }
        else if(value == KeyEvent.VK_DOWN){
            
            System.out.println(characterLocation.getCharacterX());
            System.out.println(characterLocation.getCharacterY());
            if(array[characterLocation.getCharacterX()][characterLocation.getCharacterY()+1] == 0){
                
            }else{
                masterYodaY+=41;
                characterLocation.setCharacterY(characterLocation.getCharacterY()+1);
                System.out.println("Y Kordinati: "+characterLocation.getCharacterY());
                System.out.println(masterYodaY);
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
    
    
}
