package motorschnelligkeit;



import lejos.nxt.Motor;
import lejos.util.Delay;

public class TestMotorSpeed {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mosp =  (int) motorspeed(2);
		System.out.println(mosp);
		Delay.msDelay(2000);
		System.out.println(motorspeed(2));
		Delay.msDelay(2000);
	}
	public static long  motorspeed(int umdrehungen){
		// Wie lange braucht der LegoRoboter um die KeyBoard Taste zu drücken
		StopWatch s = new StopWatch();
		long total = 0;
		for (int i = 0; i<umdrehungen ; i++){
		s.start();
		Motor.C.rotate(45);
		Motor.C.rotate(-45);
		s.stop();
		long t = s.getElapsedTime();
		total = total + t;
		
		}
		total=total/umdrehungen;
		return total;
		
		// Ziemlich genau 700ms (mit fast leeren Batterien
		// nochmals mit zu 1/2 gefüllte Batterien getestet immer 568ms
	}
	

}
