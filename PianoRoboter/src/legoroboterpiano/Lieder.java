package legoroboterpiano;

//import lejos.nxt.Motor;
//import lejos.util.Delay;
//import motorschnelligkeit.StopWatch;

public class Lieder {
	static Funktionen f = new Funktionen();

	public static void Allmyducks(int t) {
		Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		f.pl("c", 50);
		f.pl("d", 50);
		f.pl("e", 50);
		f.pl("f", 50);
		f.pl("g", 100);
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
		f.pl("e", 100);
		f.pl("e", 100);
		f.pl("g", 50);
		f.pl("g", 50);
		f.pl("g", 50);
		f.pl("g", 50);
		f.pl("c", 100);
	}

	public static void SongOfTime(int t) {
		Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);
		f.pl("a", 100);
		f.pl("d", 200);
		f.pl("f", 100);
		f.pl("a", 100);
		f.pl("d", 200);
		f.pl("f", 100);
		f.pl("a", 50);
		f.pl("C", 50);
		f.pl("D", 100);
		f.pl("g", 100);
		f.pl("f", 50);
		f.pl("g", 50);
		f.pl("a", 100);
		f.pl("a", 100);
		f.pl("c", 50);
		f.pl("e", 50);
		f.pl("d", 500);

	}


	public static void StarWarsTheme(int t) {
		Funktionen.connecting();
		Funktionen.mosp = f.motorspeed(5);

		f.pl("D", 33);
		f.pl("D", 33);
		f.pl("D", 33);

		for (int i = 0; i > 2; i++) {

			f.pl("G", 200);
			f.pl("d", 200);
			f.pl("c", 33);
			f.pl("H", 33);
			f.pl("A", 33);
			f.pl("g", 200);
			f.pl("d", 100);
			f.pl("c", 33);
			f.pl("H", 33);
			f.pl("A", 33);
			f.pl("g", 200);
			f.pl("d", 100);
			f.pl("c", 33);
			f.pl("H", 33);
			f.pl("c", 33);
			f.pl("A", 200);
			f.pl("D", 50);
			f.pl("D", 50);
		}
		f.pl("E", 150);
		f.pl("E", 50);
		f.pl("c", 50);

	}

}
