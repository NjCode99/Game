package part1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class SmallFrame extends JFrame implements ActionListener{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	private JLabel firstNumber,secondNumber,sign;
	private JButton nextQuestion, HighScores;
    private JTextField solutionField;
	int First, Second, Sum, Difference, result;
	int signCheck = 0; int problem = 0; int points = 0;
	
	public SmallFrame() {
		MakeLabel();
		setSize(300, 110); 
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		centerWindow(this);
		solutionField = new JTextField(5);
		nextQuestion = new JButton("Next Question");
		HighScores= new JButton("HighScores");
		add(firstNumber);
		add(sign);
		add(secondNumber);
		add(solutionField);
		add(nextQuestion);
		add(HighScores);
		nextQuestion.addActionListener(this);
		HighScores.addActionListener(this);
	}
	
	private void centerWindow(JFrame frame) {
	int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
	int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
	setLocation(centeredWidth, centeredHeight); //Set display location
	}
	
	public int getSum() {
		return Sum;
	}
	public int getDifference() {
		return Difference;
	}
	public int getResult() {
		result = Integer.parseInt(solutionField.getText());
		return result;
	}
	public int getSignCheck() {
		return signCheck;
	}

	public void MakeLabel(){		
	    String s;
			Random r = new Random();
			First = r.nextInt(20-1)+1;
			s = Integer.toString(First);
			firstNumber = new JLabel(s);
			Second = r.nextInt(First - 0)+ 0;
			s = Integer.toString(Second);
			secondNumber = new JLabel(s);
		
			switch(r.nextInt(1-0+1)) {
				case 0: Sum = First + Second; 
					sign = new JLabel("+");
					signCheck = 0; break; 
				case 1: Difference = First - Second; 
					sign = new JLabel("-");
					signCheck = 1; break;
			}
			
	}
			
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
			if(source == nextQuestion) {
				this.dispose();
			}
			else if(source == HighScores) {
				ScoresFrame SF = new ScoresFrame();
				SF.setVisible(true);
			}
	}	
}
			
	

