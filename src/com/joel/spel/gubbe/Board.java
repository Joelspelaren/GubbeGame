/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joel.spel.gubbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;



public class Board extends JPanel implements ActionListener {



	public Board(){

		addKeyListener(new TAdapter());
		setBackground(Color.cyan);

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
                g.drawRect(2040, 100, -2040, -100);
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




	private class TAdapter extends KeyAdapter {

		public boolean right;

		public void keyReleased(KeyEvent e) {
                    
		}

		public void keyPressed(KeyEvent e) {
			//System.out.println("Tangent tryckt");
			int key = e.getKeyCode();

			if (key == KeyEvent.VK_D){
                            
		}
	}	
	}
}