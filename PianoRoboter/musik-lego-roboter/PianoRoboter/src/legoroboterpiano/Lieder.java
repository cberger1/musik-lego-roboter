package legoroboterpiano;

//import lejos.nxt.Motor;
//import lejos.util.Delay;
//import motorschnelligkeit.StopWatch;

public class Lieder {
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

}
