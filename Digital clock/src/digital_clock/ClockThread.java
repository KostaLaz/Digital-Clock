package digital_clock;
import java.util.Date;

public class ClockThread extends Thread {

	DigitalClock dc;
	String time;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public ClockThread(DigitalClock dc) {
		
		this.dc = dc;
		
		start();
		
		
	}
	
	public void run() {
		
		while(true) {
			time = "" + new Date();
			dc.jlabClock.setText(time);
		}
		
	}
	
}
