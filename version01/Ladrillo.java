package arkanoid.version01;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Objeto {


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
		g.setColor(Color.red);
		g.fillRect(this.getX() + 10,this.getY() + 10,50, 20);
	}
	 @Override
	public void act()	{
		
	}




}
