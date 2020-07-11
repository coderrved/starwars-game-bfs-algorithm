
package com.mycompany.starwars;

import javax.swing.JFrame;


public class CallPanel extends JFrame{
    
    public CallPanel(){
        this.setSize(600,600);
        
    }
    
    public static void main(String[] args) {
        
        PlayGround pg = new PlayGround();
        
        CallPanel cp = new CallPanel();
        
        cp.setVisible(true);
        cp.setSize(800, 800);
        cp.setResizable(true);        
        cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.add(pg);
         
        
    }
    
}
