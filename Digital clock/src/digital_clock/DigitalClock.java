package digital_clock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

	JLabel jlabClock;
	ClockThread ct;

	public DigitalClock() {

		jlabClock = new JLabel("");
		jlabClock.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlabClock.setBackground(Color.DARK_GRAY);
		jlabClock.setForeground(Color.RED);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 40));
		jlabClock.setOpaque(true);
		jlabClock.setBackground(Color.BLACK);
		jlabClock.setForeground(Color.WHITE);
		getContentPane().add(jlabClock);
		setSize(600, 100);
		setLocationRelativeTo(null);
		ct = new ClockThread(this);
		setVisible(true);

	}

	public static void main(String[] args) {

		new DigitalClock();

	}

}
