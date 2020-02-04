package version01;



import java.awt.Color;
import java.awt.Graphics;

public  class Barra extends Objeto {

	public Barra() {

	}
	
	public Barra(int x, int y) {
		super(x,y);
		
	}

	
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(380, 700, 80, 20);
	}
	
	@Override
	public void act () {
		
	}
}
