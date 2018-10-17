package part1;
import java.awt.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.net.URL;

public class BigFrame extends JFrame{
	

		URL url = MathGameAPP.class.getResource("Zelda Main Theme Song.wav");
		@SuppressWarnings("deprecation")
		
		
		public BigFrame() {
			super("AddingSound");

			File music = new File("Zelda Main Theme Song.wav");

		    try
		    {
		        Clip clip = AudioSystem.getClip();
		        clip.open(AudioSystem.getAudioInputStream(music));
		        clip.start();
		        System.out.println("Hey!!");
		    }
		    catch (Exception exc)
		    {
		        exc.printStackTrace(System.out);
		    }
			

			
			
			setLayout(new FlowLayout());
		}


	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	JPanel Menu = new MathButtons();
	
	public BigFrame(String x) {
		setSize(800, 520); 
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		Menu.setLayout(null);
		this.add(Menu);
		
		File music = new File("Zelda Main Theme Song.wav");

	    try
	    {
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(music));
	        clip.start();
	        System.out.println("Hey!!");
	    }
	    catch (Exception exc)
	    {
	        exc.printStackTrace(System.out);
	    }
		
	}
	
	private void centerWindow(JFrame frame) {
	int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
	int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
	setLocation(centeredWidth, centeredHeight); //Set display location
	}
	
	
}
