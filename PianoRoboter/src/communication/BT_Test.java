package communication;

import java.io.IOException;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTCommConnector;
import lejos.nxt.remote.RemoteNXT;
import lejos.util.Delay;
import motorschnelligkeit.StopWatch;

public class BT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LCD.drawString("Connecting...", 0, 0);
			NXTCommConnector connector = Bluetooth.getConnector();
			RemoteNXT nxt = new RemoteNXT("NXT", connector);
			StopWatch s = new StopWatch();
			LCD.clear();
			LCD.drawString("Connected", 0, 0);
			long total = 0;
			for (int i = 0; i<5 ; i++){
				s.start();
				nxt.C.rotate(45);
				nxt.C.rotate(-45); 
				s.stop();
				long t = s.getElapsedTime();
				total = total + t;
			}
			total=total/5;
			LCD.clear();
			System.out.print(total);
			Delay.msDelay(2000);
		} catch (IOException ioe) {
			LCD.clear();
			LCD.drawString("Conn Failed", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}
	}

}
