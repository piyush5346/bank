package indianflag;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class flagpanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.decode("#FFA500"));
	 g.drawRect(10, 10, 400, 70);
	 g.fillRect(10, 10, 400, 70);
	 
	 g.setColor(Color.white);
	 g.drawRect(10, 80, 400, 70);
	 g.fillRect(10, 80, 400, 70);
	 
	 g.setColor(Color.decode("#008000"));
	 g.drawRect(10, 150, 400, 70);
	 g.fillRect(10, 150, 400, 70);
	 
	 g.setColor(Color.black);
	 g.fillRect(10, 10,5, 540);
	 
	 
	 try {
		  Image img=ImageIO.read(new FileInputStream("src/asok.jpg"));
		  
		  g.drawImage(img,180,80,70,70,null);
		  
		  g.setColor(Color.blue);
		  g.setFont(new Font("lato",Font.BOLD,30));
		  g.drawString("Happy Independence Day", 25, 310);
	 }
	 catch(Exception e) {
		 
	 }
	
	
	
	}

	

	}


