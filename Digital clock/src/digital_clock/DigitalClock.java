package digital_clock;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DigitalClock extends JFrame {
	public DigitalClock() {
	}
	
	JLabel jlabClock;
	ClockThread ct;
	
	
	
	public void digitalClock () {
		jlabClock = new JLabel("");
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(jlabClock);
		setSize(1200, 120);
		setLocationRelativeTo(null);
		ct = new ClockThread(this);
		setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {

		new DigitalClock();
		
	}

}
