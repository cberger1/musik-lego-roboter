package legoroboterpiano;

import java.io.IOException;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTCommConnector;
import lejos.nxt.remote.RemoteNXT;
import lejos.util.Delay;
import motorschnelligkeit.StopWatch;

public class Funktionen {
	static int t = 0;
	public static long mosp;
	public static RemoteNXT nxt;
	
	public long motorspeed(int umdrehungen) {
		// Wie lange braucht der LegoRoboter um die KeyBoard Taste zu drücken
		StopWatch s = new StopWatch();
		long total = 0;
		Motor.C.setSpeed(1000);
		for (int i = 0; i < umdrehungen; i++) {
			s.start();
			Motor.C.rotate(45);
			Motor.C.rotate(-45);
			s.stop();
			long t = s.getElapsedTime();
			total = total + t;

		}
		total = total / umdrehungen;
		return total;

		// Ziemlich genau 700ms (mit fast leeren Batterien
		// nochmals mit zu 1/2 gefüllte Batterien getestet immer 568ms
	}
	public static void connecting(){
		try {
			LCD.drawString("Connecting...", 0, 0);
			NXTCommConnector connector = Bluetooth.getConnector();
			nxt = new RemoteNXT("NXT", connector);
			
		} catch (IOException ioe) {
			LCD.clear();
			LCD.drawString("Conn Failed", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}
	}
	
	

	public void pl(String n, int x) {
		int drehen = 45;
		int tempo = t;
		Motor.A.setSpeed(1000);
		Motor.B.setSpeed(1000);
		Motor.C.setSpeed(1000);
		
		int d = (int) ((x * 600 / tempo) - mosp);
		if (n.equals("c")) {
			Motor.A.rotate(drehen);
			Delay.msDelay(d);
			Motor.A.rotate(-drehen);
		}
		if (n.equals("d")) {
			Motor.A.rotate(-drehen);
			Delay.msDelay(d);
			Motor.A.rotate(drehen);
		}
		if (n.equals("e")) {
			Motor.B.rotate(drehen);
			Delay.msDelay(d);
			Motor.B.rotate(-drehen);
		}
		if (n.equals("f")) {
			Motor.B.rotate(-drehen);
			Delay.msDelay(d);
			Motor.B.rotate(drehen);
		}
		if (n.equals("g")) {
			Motor.C.rotate(drehen);
			Delay.msDelay(d);
			Motor.C.rotate(-drehen);
		}
		if (n.equals("a")) {
			Motor.C.rotate(-drehen);
			Delay.msDelay(d);
			Motor.C.rotate(drehen);
		}
		if (n.equals("h")) {
			nxt.A.rotate(-drehen);
			Delay.msDelay(d);
			nxt.A.rotate(drehen);
		}
		if (n.equals("C")) {
			Motor.A.rotate(-drehen);
			Delay.msDelay(d);
			Motor.A.rotate(drehen);
		}
		if (n.equals("D")) {
			Motor.B.rotate(drehen);
			Delay.msDelay(d);
			Motor.B.rotate(-drehen);
		}
		if (n.equals("E")) {
			Motor.B.rotate(-drehen);
			Delay.msDelay(d);
			Motor.B.rotate(drehen);
		}
		if (n.equals("F")) {
			Motor.C.rotate(drehen);
			Delay.msDelay(d);
			Motor.C.rotate(-drehen);
		}
		if (n.equals("G")) {
			Motor.C.rotate(-drehen);
			Delay.msDelay(d);
			Motor.C.rotate(drehen);
		}
	}

}
