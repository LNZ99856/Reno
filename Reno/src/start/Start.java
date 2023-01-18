package start;

import robot.Gimnasio;
import robot.Robot;

public class Start {

	public static void main(String[] args) {
		// Creo los robots parametrizados y los imprimo.
		Robot kantam = new Robot("Kantam");
		Robot claptrap = new Robot("Claptrap");

		System.out.println(kantam);
		System.out.println(claptrap);
		
		Robot ganador = Gimnasio.lucha(kantam, claptrap);
		System.out.println(ganador);
		

	}

}
