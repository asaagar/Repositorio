package tutorialJava.capitulo6b_Videojuegos.Arkanoid.version05;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Explosion extends Actor {
	/**
	 * Constructor
	 */
	public Explosion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosión
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion1.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion2.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion3.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion4.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion5.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion6.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion7.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion8.png"));
		nuevosSprites.add(CacheImagenes.getInstancia().getImagen("sprite-explosion9.png"));
		this.setSpritesDeAnimacion(nuevosSprites);
		// Sprite actual
		this.spriteActual = this.getSpritesDeAnimacion().get(0);
		// Velocidad de cambio de sprite
		this.velocidadDeCambioDeSprite = 5;
	}
	

	/**
	 * Método que se llamará para cada actor, en cada refresco de pantalla del juego
	 */
	@Override
	public void act() {
		super.act();
		if (this.spriteActual.equals(this.spritesDeAnimacion.get(this.spritesDeAnimacion.size()-1))) {
			this.eliminar();
		}
	}

}
