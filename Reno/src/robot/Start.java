package robot;

public class Start {

	public static void main(String[] args) {
		// Creo los robots parametrizados y los imprimo.
		Robot kantam = new Robot("Kantam");
		Robot claptrap = new Robot("Claptrap");

		kantam.lucha(claptrap);

	}

}
