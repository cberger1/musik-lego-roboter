package legoroboterpiano;

//import lejos.nxt.Motor;
//import lejos.util.Delay;
//import motorschnelligkeit.StopWatch;

public class Lieder {
	// static int t = 0;
	// public static long mosp;
	//
	// public static long motorspeed(int umdrehungen){
	// // Wie lange braucht der LegoRoboter um die KeyBoard Taste zu drücken
	// StopWatch s = new StopWatch();
	// long total = 0;
	// for (int i = 0; i<umdrehungen ; i++){
	// s.start();
	// Motor.C.rotate(45);
	// Motor.C.rotate(-45);
	// s.stop();
	// long t = s.getElapsedTime();
	// total = total + t;
	//
	// }
	// total=total/umdrehungen;
	// return total;
	//
	// // Ziemlich genau 700ms (mit fast leeren Batterien
	// // nochmals mit zu 1/2 gefüllte Batterien getestet immer 568ms
	// }

	static Funktionen f = new Funktionen();
	
	public static void Allmyducks(int t) {
		Funktionen.mosp = f.motorspeed(5);
		f.spielen("c", 50);
		f.spielen("d", 50);
		f.spielen("e", 50);
		f.spielen("f", 50);
		f.spielen("g", 100);
		f.spielen("g", 100);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("g", 200);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("a", 50);
		f.spielen("g", 200);
		f.spielen("f", 50);
		f.spielen("f", 50);
		f.spielen("f", 50);
		f.spielen("f", 50);
		f.spielen("e", 100);
		f.spielen("e", 100);
		f.spielen("g", 50);
		f.spielen("g", 50);
		f.spielen("g", 50);
		f.spielen("g", 50);
		f.spielen("c", 100);
	}
	// public static void spielen(String n, int x ){
	// int drehen = 45;
	// int tempo = t;
	// int d = (int) ((x*600/tempo)- mosp);
	// if(n.equals("c")){
	// Motor.A.rotate(drehen);
	// Delay.msDelay(d);
	// Motor.A.rotate(-drehen);
	// }
	// if(n.equals("d")){
	// Motor.A.rotate(-drehen);
	// Delay.msDelay(d);
	// Motor.A.rotate(drehen);
	// }
	// if(n.equals("e")){
	// Motor.B.rotate(drehen);
	// Delay.msDelay(d);
	// Motor.B.rotate(-drehen);
	// }
	// if(n.equals("f")){
	// Motor.B.rotate(-drehen);
	// Delay.msDelay(d);
	// Motor.B.rotate(drehen);
	// }
	// if(n.equals("g")){
	// Motor.C.rotate(drehen);
	// Delay.msDelay(d);
	// Motor.C.rotate(-drehen);
	// }
	// if(n.equals("a")){
	// Motor.C.rotate(-drehen);
	// Delay.msDelay(d);
	// Motor.C.rotate(drehen);
	// }
	// }

}
