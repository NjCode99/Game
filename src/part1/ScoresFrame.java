package part1;

import java.awt.*;
import javax.swing.*;
public class ScoresFrame extends JFrame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	private JLabel Name, Scores;
	
	
	
	public ScoresFrame() {
		setSize(500, 475); 
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		Name = new JLabel(""/*string name*/);
		
		Scores = new JLabel();
		add(Scores);
		
	}
	
	private void centerWindow(JFrame frame) {
	int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
	int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
	setLocation(centeredWidth, centeredHeight); //Set display location
	}
	
}
