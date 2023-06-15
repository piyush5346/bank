package indianflag;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class myframe extends JFrame {
	private flagpanel panel=new flagpanel();
	public myframe() throws HeadlessException{
		setTitle("happy independent day");
		setSize(440,600);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}

}
