package cassie.basic;
import java.awt.*;

public class PinkPoint extends AbstractPoint implements PointSS, PointConstants {
	//Creates a class that is a subclass of AbstractBird but also is part of the Bird interface
	//Create another boolean which switches the horizontal movement of the bird
	private boolean left = true;
	
	public PinkPoint (int x, int y) {
		//Calls method from the super class
		super(x,y);
	}
	public Color getColor() {
		//returns a red color from color class
		return Color.PINK;
	}
	
	public void fly() {
		//Created a switch method which changes the value of each boolean 
		// when the x or y value moves by one
		if (upward && left) {
			this.y--;
			upward = false;
		} else if (!upward && left) {
			this.x--;
			this.x--;
			this.x--;
			this.x--;
			left = false;
		} else if (!upward && !left) {
			this.y++;
			upward = true;
		} else if (upward && !left) {
			this.x++;
			left = true;
		}
	}
}
