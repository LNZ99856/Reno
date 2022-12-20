package robot;

public class Start {

	public static void main(String[] args) {
		//Creo los robots y los imprimo
				Robot kantam = new Robot();
				kantam.setNombre("Kantam");
				kantam.setPuntosVida(500);
				kantam.setAtaque(10);
				kantam.setDefensa();
				System.out.println(kantam);
				
				Robot claptrap = new Robot();
				claptrap.setNombre("Claptrap");
				claptrap.setPuntosVida(100);
				claptrap.setAtaque(20);
				claptrap.setDefensa();
				System.out.println(claptrap);


	}

}
