
package com.mycompany.starwars;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class CallPanel extends JFrame{
    
    public CallPanel(){
        
        
        
    }

    public CallPanel(String title) throws HeadlessException {
        super(title);
        
        setSize(900, 900);
        setResizable(false);  
        setFocusable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        PlayGround pg = new PlayGround();
        
        pg.requestFocus();
        pg.addKeyListener(pg);
        pg.setFocusable(true);
        pg.setFocusTraversalKeysEnabled(false);       
        
        add(pg);
        
        setVisible(true);
    }
    
    
    
   
}
