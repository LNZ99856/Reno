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

	// Creo el método para atacar entre 0 y 20 aleatoriamente
	private int generaAtaque() {
		int atacar = (int) (Math.random() * 21);
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

	// Como el ataque sólo puede ser de 0 a 20 lo aseguro
	public void setAtaque(int ataque) {
		if (ataque >= 0 & ataque <= 20) {
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
