package part1;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import javax.sound.sampled.AudioInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import javax.swing.*;
//

public class MathGameAPP {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Please enter your name: ");
		Player Player1 = new Player(s);
		BigFrame Menu = new BigFrame("Main Program");
		Menu.setVisible(true);


		}//ends method
		}// ends class


//		String s = JOptionPane.showInputDialog("Please enter your name: ");
//		Player Player1 = new Player(s);
//		BigFrame Menu = new BigFrame("Main Program");
//		Menu.setVisible(true);
//		
//	}
//}












//public class MathGameAPP extends JFrame
//{
////	File music = new File("")
////	AudioInputStream name = AudioSystem.getAudioInputStream();
////	Choice music1 = AudioSystem.getClip();
////	clip.open(name);
////	clip.start();
////}
////	
//	JButton Play = new JButton ("Play");
//	JButton Loop = new JButton ("Loop");
//	JButton Stop = new JButton ("Stop");
//	URL url = MathGameAPP.class.getResource("wsss.wav");
//	AudioClip clip = Applet.newAudioClip(url);
//	
//	public MathGameAPP() {
//		super("AddingSound");
//		setLayout(new FlowLayout());
//		
//		Play.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				clip.play();
//		}
//	});
//		
//		Loop.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				clip.loop();
//		}
//	});
//		
//		Stop.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				clip.stop();
//		}
//	});
//add(Play);
//add(Loop);
//add(Stop);
//	}
//}
	
//	
////	public static void main(String[] args)  throws IOException{
////		JFrame window = new JFrame("Math Games");
////		window.setVisible(true);
////		window.setSize(800, 575); 
////		window.setResizable(false);
////		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
////		JPanel menu = new MathGameButton(); //Create object of the panel
////		menu.setLayout(null);
////		window.add(menu);
////		
////		// I started here
////		JFrame frame = new MathGameAPP();
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		frame.setSize(90,90);
////		frame.setVisible(true);
////	
////		
////		
////	}
////}
//	
////		JFrame music = new JFrame("Background");
////		music.setSize(300,300);
////		JButton button = new JButton("Turn on the Sound");
////		music.add(button);
////		button.addActionListener((ActionListener) new AL());
////		music.setVisible(true);
////		music.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////	
////	public static class AL implements ActionListener{
////		public final void actionPreformed(ActionEvent e) {
////			music();
////		}
////		}
////	public static void music () {
////		AudioPlayer MGP = AudioPlayer.player;
////		AudioStream GM;
////		AudioData MD;
////		
////		ContinuousAudioDataStream loop = null;
////		try {
////			BGM = new AudioStream(new FileInputStream(""));
////			MD = BGM.getData();
////			loop = new ContinuousAudioDataStream(MD);
////		}
////		catch (IOException error){
////			System.out.println("hey");
////		}
////		MGP.start(loop);
////	}
////}
////
////	
//	
//		
//		
//		
//		
//		
//	
//	
//		//window.add(imgIcon);
//
