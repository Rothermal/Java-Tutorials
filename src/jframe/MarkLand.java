package jframe;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarkLand {
	public static void main(String args []){
		
	JFrame frame = new JFrame();
	frame.setTitle("MarkLand");
	frame.setSize(1200, 800);
	frame.setVisible(true);

	ImageIcon logoIcon = new ImageIcon("KappacatBLUE.png");
	Image logo = logoIcon.getImage();
	frame.setIconImage(logo);
//	frame.setResizable(false);
	JPanel panel = new JPanel();
	frame.add(panel);
	JLabel label= new JLabel("Hello");
	label.setIcon(logoIcon);
	panel.add(label);
	
	
//	   JFrame frame = new JFrame();        
//       String title = "Hello App";        
//       frame.setTitle(title);        
//       frame.setSize(300, 200);        
//       frame.setDefaultCloseOperation        
//           (JFrame.EXIT_ON_CLOSE);        
//       frame.setVisible(true);        
//       JPanel panle = new JPanel();        
//       frame.add(panle);        
//       JLabel lable = new JLabel("Hello World!!!");        
//       panle.add(lable);  

	

	}
}
