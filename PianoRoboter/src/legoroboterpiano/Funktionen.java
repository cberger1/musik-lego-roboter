package legoroboterpiano;

import lejos.nxt.Motor;
import lejos.util.Delay;
import motorschnelligkeit.StopWatch;

public class Funktionen {
	static int t = 0;
	public static long mosp;

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

	public void spielen(String n, int x) {
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
	}

}
