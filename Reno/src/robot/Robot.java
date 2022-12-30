package robot;

public class Robot {
	// Creo los atributos
	private String nombre;
	private int puntosVida;
	private int ataque;
	private int defensa;

	// Creo un constructor parametrizado con sólo el nombre como parámetro. Los
	// puntos de vida son 100 por defecto.
	public Robot(String nombre) {
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = generaAtaque();
		this.defensa = generaDefensa();
	}

	// Creo un constructor copia para mi método pelea
	public Robot(Robot otroRobot) {
		this.nombre = otroRobot.nombre;
		this.puntosVida = otroRobot.puntosVida;
		this.ataque = otroRobot.ataque;
		this.defensa = otroRobot.defensa;
	}

	// Creo el método lucha cuyo parámetro será el otro robot
	public void lucha(Robot robot2) {
		Robot robot1 = new Robot(this);
		String ganador = "";
		// Creo un bucle para que luchen hasta que se queden sin puntos de vida
		while (robot1.puntosVida > 0 && robot2.puntosVida > 0) {
			robot2.puntosVida -= robot1.calcularDanio(robot1.ataque, robot2.defensa);
			robot2.imprimir();
			// Creo un if para que sólo sigan luchando si los 2 siguen con vida
			if (robot2.puntosVida > 0) {
				robot1.puntosVida -= robot2.calcularDanio(robot2.ataque, robot1.defensa);
				robot1.imprimir();
				// para que se generen ataque y defensa nuevos en cada turno
				robot1.ataque = robot1.generaAtaque();
				robot1.defensa = robot1.generaDefensa();
				robot2.ataque = robot2.generaAtaque();
				robot2.defensa = robot2.generaDefensa();
			}
		}
		if (robot1.puntosVida > 0) {
			ganador = "Ha ganado " + robot1.nombre;
		} else {
			ganador = "Ha ganado " + robot2.nombre;
		}
		System.out.println(ganador);
	}

	// Creo un método para calcular el daño
	private int calcularDanio(int ataque, int defensa) {
		int danio = 0;
		if (ataque > defensa) {
			danio = ataque;
		}
		return danio;
	}

	// Creo un método para imprimir por pantalla
	public void imprimir() {
		System.out.println(
				"nombre= " + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa);
	}

	// Creo el método para atacar entre 0 y 20 aleatoriamente
	private int generaAtaque() {
		int atacar = (int) (Math.random() * 101);
		return atacar;
	}

	//// Creo el método para defender entre 0 y 100 aleatoriamente
	private int generaDefensa() {
		int defender = (int) (Math.random() * 101);
		return defender;
	}

	// Creo los setters y los getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	// Como el ataque sólo puede ser de 0 a 100 lo aseguro
	public void setAtaque(int ataque) {
		if (ataque >= 0 & ataque <= 100) {
			this.ataque = ataque;
		}
	}

	public int getAtaque() {
		return ataque;
	}

	// Como la defensa es un número aleatorio no recibe parámetros.
	public void setDefensa() {
		this.defensa = (int) (Math.random() * 101);

	}

	public int getDefensa() {
		return defensa;
	}

	// Creo el toString
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}

}
