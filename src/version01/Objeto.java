package version01;



import java.awt.Graphics;

public abstract class Objeto {
	
	protected int x,y; // Coordenadas en las que se encuentra el actor
	protected int width, height; // Ancho y alto que ocupa, imprescindible para detectar colisiones
	

	public Objeto() {
		
	}
	
	public Objeto (int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	


	public abstract void paint(Graphics g);
	
	public void act() {
		
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	


	

}
