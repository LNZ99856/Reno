package robot;

public class Gimnasio {
	
	//Uso static para que un metodo o variable existan aunque no haya un objeto
	public static Robot lucha(Robot robot0, Robot robot1) {
		
		// Creo para turnarse
		int turno = (int) (Math.random() * 2);

		// Creo un bucle para que luchen hasta que se queden sin puntos de vida
		while (robot0.puntosVida > 0 && robot1.puntosVida > 0) {
			int golpe = (int) (Math.random() * 101);
			// Si sale 1 ataca el robot 1
			if (turno == 0) {
				if (robot1.defensa < golpe) {
					robot1.puntosVida -= robot0.ataque;
				}
			} else if (turno == 1) {
				if (robot0.defensa < golpe) {
					robot0.puntosVida -= robot1.ataque;
				}
			}
			turno = (turno == 0) ? 1 : 0;
		}
		if (robot0.puntosVida <= 0) {
			return robot1;
		} else
			return robot0;
	}
}
