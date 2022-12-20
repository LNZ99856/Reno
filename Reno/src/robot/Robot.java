package robot;

public class Robot {
	// Creo los atributos
	private String nombre;
	private int puntosVida;
	private int ataque;
	private int defensa;

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
