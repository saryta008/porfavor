package entornos;
/**
 * Clase Punto
 *
 * Version 1
 *
 * @author Sara Martínez Pérez
 * 
 * 14/02/2023
 *
 * Copyright
 */
public class Punto {
	private final int x;
	private final int y;

	// CONSTRUCTOR
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Punto(int x, int y) {
		// Punto en el sistema cartesiano de coordenadas
		this.x = x;
		this.y = y;
	}

	// METODOS
	/**
	 * distancia
	 * Este método calcula la distancia entre este punto 
	 * y otro punto que se pase como argumento
	 * 
	 * @param other
	 * @return Math.hypot(x - other.x, y - other.y)
	 */
	public double distancia(Punto other) { // Este metodo devuelve la distancia entre dos puntos
		return Math.hypot(x - other.x, y - other.y);
	}
	
	/**
	 * getX
	 * @return x
	 */
	public int getX() { // Este metodo devuelve el punto Y
		return x;
	}
	
	/**
	 * getY
	 * @return y
	 */
	public int getY() { // Este metodo devuelve el punto Y

		return y;
	}

	/**
	 * toString
	 * @override
	 */
	public String toString() { // Este metodo devuelve los dos puntos de plano
		return "(" + x + "," + y + ")";
	}

}
