package legoroboterpiano;

import lejos.nxt.LCD;
import lejos.util.Delay;

public class Lieder {
	static Funktionen f = new Funktionen();

	public static void Test() {
		Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		Funktionen.kal = f.kalibrieren(5);
		Delay.msDelay(1000);
		LCD.clear();
		LCD.drawString("Test", 0, 0);
		f.pl("c", 50);
		f.pl("d", 50);
		f.pl("e", 50);
		f.pl("f", 50);
		f.pl("g", 50);
		f.pl("a", 50);
		f.pl("h", 100);
		f.pl("C", 100);
		f.pl("D", 100);
		f.pl("E", 100);
		f.pl("F", 100);
		f.pl("G", 100);
		Delay.msDelay(2000);
	}	
	public static void Allmyducks() {
		//Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		Funktionen.kal = f.kalibrieren(5);
		Delay.msDelay(1000);
		LCD.clear();
		LCD.drawString("All my ducks", 0, 0);
		
		f.pl("c", 50);
		f.pl("d", 50);
		f.pl("e", 50);
		f.pl("f", 50);
		f.pl("g", 150);
		f.pl("g", 50);
		f.pl("g", 100);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("g", 200);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("a", 50);
		f.pl("g", 200);
		f.pl("f", 50);
		f.pl("f", 50);
		f.pl("f", 50);
		f.pl("f", 50);
		f.pl("e", 150);
		f.pl("e", 150);
		f.pl("d", 50);
		f.pl("d", 50);
		f.pl("d", 50);
		f.pl("d", 50);
		f.pl("c", 400);
		Delay.msDelay(2000);
	}
	public static void SongOfTime() {
		//Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		Funktionen.kal = f.kalibrieren(5);
		Delay.msDelay(1000);
		LCD.clear();
		LCD.drawString("Song of Time", 0, 0);
		
		f.pl("a", 100);
		f.pl("d", 200);
		f.pl("f", 100);
		f.pl("a", 100);
		f.pl("d", 200);
		f.pl("f", 100);
		f.pl("a", 50);
		f.pl("C", 50);
		f.pl("h", 100);
		f.pl("g", 100);
		f.pl("f", 50);
		f.pl("g", 50);
		f.pl("a", 100);
		f.pl("d", 100);
		f.pl("c", 50);
		f.pl("e", 50);
		f.pl("d", 500);
		Delay.msDelay(2000);
	}
	public static void StarWarsTheme() {
		//Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		Funktionen.kal = f.kalibrieren(5);
		Delay.msDelay(1000);
		LCD.clear();
		LCD.drawString("Star Wars Theme", 0, 0);
		f.pl("d", 33);
		f.pl("d", 33);
		f.pl("d", 33);

			f.pl("g", 200);
			f.pl("D", 200);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("a", 33);
			f.pl("G", 200);
			f.pl("D", 100);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("a", 33);
			f.pl("G", 200);
			f.pl("D", 100);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("C", 33);
			f.pl("a", 200);
			f.pl("d", 33);
			f.pl("d", 33);
			f.pl("d", 33);
			
			f.pl("g", 200);
			f.pl("D", 200);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("a", 33);
			f.pl("G", 200);
			f.pl("D", 100);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("a", 33);
			f.pl("G", 200);
			f.pl("D", 100);
			f.pl("C", 33);
			f.pl("h", 33);
			f.pl("C", 33);
			f.pl("a", 200);
			f.pl("d", 50);
			f.pl("d", 50);
		
		f.pl("e", 150);
		f.pl("e", 50);
		f.pl("C", 50);
		f.pl("h", 50);
		f.pl("a", 50);
		f.pl("g", 50);
		f.pl("g", 33);
		f.pl("a", 33);
		f.pl("h", 33);
		f.pl("a", 100);
		f.pl("f", 100);
		f.pl("d", 50);
		f.pl("d", 50);
		
		f.pl("e", 150);
		f.pl("e", 50);
		f.pl("C", 50);
		f.pl("h", 50);
		f.pl("a", 50);
		f.pl("g", 50);
		f.pl("D", 100);
		f.pl("a", 200);
		f.pl("d", 50);
		f.pl("d", 50);
		
		f.pl("e", 150);
		f.pl("e", 50);
		f.pl("C", 50);
		f.pl("h", 50);
		f.pl("a", 50);
		f.pl("g", 50);
		f.pl("g", 33);
		f.pl("a", 33);
		f.pl("h", 33);
		f.pl("a", 100);
		f.pl("f", 100);
		f.pl("d" , 200);
		
		Delay.msDelay(2000);		
	}
}


