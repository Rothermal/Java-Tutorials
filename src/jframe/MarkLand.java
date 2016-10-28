package jframe;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarkLand {
	public static void main(String args []){
	JFrame frame = new JFrame();
	ImageIcon logoIcon = new ImageIcon("KappacatBlue.png");
	Image logo = logoIcon.getImage();
	frame.setSize(1200, 800);
	frame.setTitle("MarkLand");
	frame.setIconImage(logo);
	frame.setResizable(false);
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
//JLabel label= new JLabel("Hello",logo,JLabel.CENTER);
	// denny 97!! forever
	
	
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
