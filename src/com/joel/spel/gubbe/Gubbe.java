/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joel.spel.gubbe;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Gubbe extends JFrame {
	
	public Gubbe (){
		add(new Board());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(2040,1100);
        setLocationRelativeTo(null);
	}
	
public static void main(String[] args){
		new Gubbe();
	}
}
