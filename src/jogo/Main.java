/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JFrame;

/**
 *
 * @author Lais_Bergamo
 */
public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        GamePlay gamePlay = new GamePlay();
        janela.setBounds(20, 20, 700, 600);
        janela.setTitle("Breakout");
        janela.setVisible(true);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(gamePlay);
        
        
        
        
    }
}
