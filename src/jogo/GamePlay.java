/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Lais_Bergamo
 */
public class GamePlay extends JPanel implements KeyListener,ActionListener  {
 
      private boolean play = false;
      private int score;
      private int delay = 8;
      private  Timer timer;
      private int num_tijolos = 30;
      private int playerX = 310;
      private int posicaox_bola = 120;
      private int posicaoy_bola = 150;
      private int direcaox_bola = -1;
      private int direcaoy_bola = -2;
      
      public GamePlay(){
          addKeyListener(this);
          setFocusable(true);
          setFocusTraversalKeysEnabled(false);
          timer = new Timer(delay, this);
          timer.start();
      }

    
    
    public void paint(Graphics g){
        //plano de fundo do joguinho
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);
        
        //bordas
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(692, 0, 3, 592);
        
        
        //paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);
        
        //bola
       g.setColor(Color.RED);
        g.fillRect(posicaox_bola, posicaoy_bola, 20, 20);
  
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke){}

    @Override
    public void actionPerformed(ActionEvent ae){}
     
        @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
                if(playerX >= 600) {
                    playerX = 600;
                }else{
                   // moveRigth();
                }
                
                
            }if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                if(playerX >= 10) {
                    playerX = 10;
                }else{
                   // moveLeft();
                }
            }
    }    

    //movimentação
    public void moveRigth(){
 
    }
   
    public void moveLeft(){
        
       }

}
