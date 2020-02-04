

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Objeto {
	
	Color color;


	/**
	 * @param x
	 * @param y
	 */
	public Ladrillo() {

	}
	
	public Ladrillo(int x, int y) {
		super(x,y);
	}
	
	



	@Override
	public void paint(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.x,this.y,60, 30);
		g.setColor(Color.white);
		g.drawRect(this.x, this.y, 60, 30);
	}
	 @Override
	public void act()	{
		
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	 
	 




}
