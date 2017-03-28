package legoroboterpiano;

import lejos.nxt.Motor;
import lejos.util.Delay;

public class Lieder {
	public static void Allmyducks(){
		spielen("c", 50);
		spielen("d", 50);
		spielen("e", 50);
		spielen("f", 50);
		spielen("g", 100);
		spielen("g", 100);
		spielen("a", 50);
		spielen("a", 50);
		spielen("a", 50);
		spielen("a", 50);
		spielen("g", 200);
		spielen("a", 50);
		spielen("a", 50);
		spielen("a", 50);
		spielen("a", 50);
		spielen("g", 200);
		spielen("f", 50);
		spielen("f", 50);
		spielen("f", 50);
		spielen("f", 50);
		spielen("e", 100);
		spielen("e", 100);
		spielen("g", 50);
		spielen("g", 50);
		spielen("g", 50);
		spielen("g", 50);
		spielen("c", 100);
	}
	public static void spielen(String n, int x ){
		int drehen = 45;
		int tempo = 100;
		if(n.equals("c")){
			Motor.A.rotate(drehen);
			Delay.msDelay((x*600/tempo));
			Motor.A.rotate(-drehen);
		}
		if(n.equals("d")){
			Motor.A.rotate(-drehen);
			Delay.msDelay(x*600/tempo);
			Motor.A.rotate(drehen);
		}
		if(n.equals("e")){
			Motor.B.rotate(drehen);
			Delay.msDelay(x*600/tempo);
			Motor.B.rotate(-drehen);
		}
		if(n.equals("f")){
			Motor.B.rotate(-drehen);
			Delay.msDelay(x*600/tempo);
			Motor.B.rotate(drehen);
		}
		if(n.equals("g")){
			Motor.C.rotate(drehen);
			Delay.msDelay(x*600/tempo);
			Motor.C.rotate(-drehen);
		}
		if(n.equals("a")){
			Motor.C.rotate(-drehen);
			Delay.msDelay(x*600/tempo);
			Motor.C.rotate(drehen);
		}
	}
}

