package part1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MathButtons extends JPanel implements ActionListener{
private JButton Play, HighScore, Help, exit;
	
	public MathButtons() //throws IOException 
	{ //Constructor
		
		Play = new JButton("Addition/Subtraction");
		HighScore = new JButton("High Scores");
		Help = new JButton("Help");
		exit = new JButton("Quit");
		
		Play.setBounds(150,100,200,35);
		HighScore.setBounds(150,150,200,35);
		Help.setBounds(150,200,200,35);
		exit.setBounds(150,250,200,35);
		
		this.add(Play);
		this.add(HighScore);
		this.add(Help);
		this.add(exit);
		
		Play.addActionListener(this);
		HighScore.addActionListener(this);
		Help.addActionListener(this);
		exit.addActionListener(this);
		
		  try 
		  {
			  ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			  Image mycar = ImageIO.read(classLoader.getResourceAsStream("car.png"));
			  ImageIcon car = new ImageIcon(mycar);
			  JLabel imgIcon = new JLabel();
				imgIcon.setIcon(car);
				//imgIcon.setBounds(0,0,this.getWidth(), this.getHeight());//*/
				imgIcon.setBounds(0,0,800,550);
			//	this.setBackground(Color.BLUE);
				add(imgIcon);

		  }
		  catch( IOException err)
		  {
			  System.out.println("Failed to Load Image");
			  System.exit(0);
		  }
			  //mycar = mycar.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
	    
//*
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
			if(source == Play) {
				AdditionSubtractionGame ASG = new AdditionSubtractionGame();
				ASG.startQuestion();
			}
			else if(source == HighScore) {
				ScoresFrame SF = new ScoresFrame();
				SF.setVisible(true);
			}
			else if(source == Help) {
				JOptionPane.showMessageDialog(null, "This game will test your knowledge in addition and subtraction." + 
						"\n" + "Each problem you solve correctly will earn you one point. There are a total of 20 problems."
						+ "\n" + "Good luck!" );
			}
			else if(source == exit) {
				JOptionPane.showMessageDialog(null, "Thank you for playing our game!");
				System.exit(0);
			}
	}	
}
