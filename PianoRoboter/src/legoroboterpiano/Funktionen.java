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
	
	public static int r = 50;
	public static int t = 100;
	public static long mosp;
	public static long kal;
	public static RemoteNXT nxt;
	public static int drehen = 22;
	
	public long motorspeed(int umdrehungen){
		StopWatch s = new StopWatch();
		long total = 0;
		Motor.A.setSpeed(1000);
		for (int i = 0; i<umdrehungen ; i++){
			s.start();
			Motor.A.setSpeed(1000);
			Motor.A.rotate(drehen);
			Motor.A.rotate(-drehen);
			s.stop();
			long t = s.getElapsedTime();
			total = total + t;
		}
		total=total/umdrehungen;
		LCD.clear();
		LCD.drawString("mosp1 = " + total, 0, 0);
		return total;
	}
	public long kalibrieren(int umdrehungen){
		StopWatch s = new StopWatch();
		long total = 0;
		nxt.A.setSpeed(1000);
		for (int i = 0; i<umdrehungen ; i++){
			s.start();
			nxt.A.setSpeed(1000);
			nxt.A.rotate(-drehen);
			nxt.A.rotate(drehen);
			s.stop();
			long t = s.getElapsedTime();
			total = total + t;
		}
		total=total/umdrehungen;
		LCD.drawString("mosp2 = " + total, 0, 1);
		return total;
	}
	public static void connecting(){
		try {
			LCD.drawString("Connecting...", 0, 0);
			NXTCommConnector connector = Bluetooth.getConnector();
			nxt = new RemoteNXT("Colin", connector);
			LCD.clear();

		} catch (IOException ioe) {
			LCD.clear();
			LCD.drawString("Conn Failed", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}
	}
	public void pl(String n, int x) {
		int tempo = t;
		Motor.A.setSpeed(1000);
		Motor.B.setSpeed(1000);
		Motor.C.setSpeed(1000);
		nxt.A.setSpeed(1000);
		nxt.B.setSpeed(1000);
		nxt.C.setSpeed(1000);

		int d1 = (int) ((x * 600 / tempo) - mosp);
		int d2 = (int) (((x * 600 / tempo) - kal)/2);
		
		if (n.equals("c")) {
			nxt.A.rotate(-drehen);
			Delay.msDelay(d2);
			nxt.A.rotate(drehen);
		}
		if (n.equals("d")) {
			nxt.A.rotate(drehen);
			Delay.msDelay(d2);
			nxt.A.rotate(-drehen);
		}
		if (n.equals("e")) {
			nxt.B.rotate(-drehen);
			Delay.msDelay(d2);
			nxt.B.rotate(drehen);
		}
		if (n.equals("f")) {
			nxt.B.rotate(drehen);
			Delay.msDelay(d2);
			nxt.B.rotate(-drehen);
		}
		if (n.equals("g")) {
			nxt.C.rotate(-drehen);
			Delay.msDelay(d2);
			nxt.C.rotate(drehen);
		}
		if (n.equals("a")) {
			nxt.C.rotate(drehen);
			Delay.msDelay(d2);
			nxt.C.rotate(-drehen);
		}
		if (n.equals("h")) {
			Motor.A.rotate(drehen);
			Delay.msDelay(d1);
			Motor.A.rotate(-drehen);
		}
		if (n.equals("C")) {
			Motor.A.rotate(-drehen);
			Delay.msDelay(d1);
			Motor.A.rotate(drehen);
		}
		if (n.equals("D")) {
			Motor.B.rotate(drehen);
			Delay.msDelay(d1);
			Motor.B.rotate(-drehen);
		}
		if (n.equals("E")) {
			Motor.B.rotate(-drehen);
			Delay.msDelay(d1);
			Motor.B.rotate(drehen);
		}
		if (n.equals("F")) {
			Motor.C.rotate(-drehen);
			Delay.msDelay(d1);
			Motor.C.rotate(drehen);
		}
		if (n.equals("G")) {
			Motor.C.rotate(drehen);
			Delay.msDelay(d1);
			Motor.C.rotate(-drehen);
		}
	}
}
