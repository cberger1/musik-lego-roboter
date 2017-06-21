package legoroboterpiano;

import lejos.nxt.Button;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lieder.Test();
		
		Lieder.Allmyducks();
		
		Lieder.SongOfTime();
		
		Button.waitForAnyPress();
		
		Lieder.StarWarsTheme();
	}

}



