package jframe;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	public static void main(String args []){
	JFrame frame = new JFrame();
	ImageIcon logoIcon = new ImageIcon("KappacatBlue.png");
	Image logo = logoIcon.getImage();
	frame.setSize(800, 600);
	frame.setTitle("Where is my Kappa KAt");
	frame.setIconImage(logo);
	frame.setResizable(false);
	frame.setVisible(true);

	}
}
