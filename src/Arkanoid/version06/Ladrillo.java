package tutorialJava.capitulo6b_Videojuegos.Arkanoid.version06;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Clase que representa a cada ladrillo de los que pondremos sobre la pantalla
 * @author R
 *
 */
public class Ladrillo extends Actor {
	// Damos un ancho y un alto específico al ladrillo. Suponemos que todos los ladrillos serán iguales
	public static final int ANCHO = 30;
	public static final int ALTO = 20;
	public static final int ESPACIO_ENTRE_LADRILLOS = 2;
	
	// Propiedades específicas de cada ladrillo
	private Color color = null;
	
	/**
	 * Constructor
	 */
	public Ladrillo() {
		super();
		spriteActual = null; // El ladrillo se pinta vectorialmente, así que no utilizo ningún sprite
		this.x = 10;
		this.y = 10;
		this.ancho = ANCHO;
		this.alto = ALTO;
		this.color = Color.WHITE; // Por defecto pongo el ladrillo en color blanco
	}

	/**
	 * Constructor parametrizado
	 * @param x
	 * @param y
	 * @param color
	 */
	public Ladrillo(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.ancho = ANCHO;
		this.alto = ALTO;
		this.color = color;
	}
	/**
	 * Pintado del ladrillo en pantalla
	 */
	public void paint(Graphics2D g){
		g.setColor(this.color);
		// Pinto el ladrillo como un rectángulo con vértices redondeados
		g.fillRoundRect(this.x, this.y, ANCHO, ALTO, 3, 3);
	}

	
	/**
	 * Colisión detectada
	 */
	@Override
	public void colisionProducidaConOtroActor(Actor actorColisionado) {
		super.colisionProducidaConOtroActor(actorColisionado);
		// Si un ladrillo detecta una colisión con un objeto de tipo "Bola", debe desaparecer
		if (actorColisionado instanceof Bola) {
			eliminar();
			// Creo un nuevo actor de tipo Explosion y lo centró respecto a la posición del ladrillo
			Explosion explosion = new Explosion(this.getX(), this.getY());
			explosion.setX(this.x + Ladrillo.ANCHO / 2 - explosion.getAncho() / 2);
			Arkanoid.getInstancia().agregarActor(explosion);
			// Reproduzco el sonido de la explisión
			CacheRecursos.getInstancia().playSonido("Arkanoid-SFX-01.wav");
		}
	}

	// Métodos getter y setter
	public Color getColor() { return color; }
	public void setColor(Color color) { this.color = color; }
}
