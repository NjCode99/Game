package part1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class AdditionSubtractionGame implements WindowListener{
	SmallFrame Question;
	int points = 0;
	int problem = 0;
	AdditionSubtractionGame(){
		
	}
	void startQuestion() {
		Question = new SmallFrame();
		Question.setVisible(true);
		Question.addWindowListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		problem++;
		if(problem < 5) {
			CheckProblem();
			startQuestion();
		}
		else {
			CheckProblem();
		JOptionPane.showMessageDialog(null, "Congratulations, you have scored: " + points);
		}
	}
	
	public void CheckProblem() {
		int result = Question.getResult();
		int signCheck = Question.getSignCheck();
		int sum = Question.getSum();
		int difference = Question.getDifference();
			if(signCheck == 0) {
				if(result == sum) {
					points++;
				}
				else { 
				}
			}
			else{
				if(result == difference){
					points++;
				}
				else {	
				}
			}
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}