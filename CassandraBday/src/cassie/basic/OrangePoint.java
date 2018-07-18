package cassie.basic;
import java.awt.*;
import java.util.Random;

public class OrangePoint extends AbstractPoint implements PointSS, PointConstants {
	//Creates a class that is a subclass of AbstractBird but also is part of the Bird interface
	//Creates a random object to dictate the hummingbird's movement
	Random rand = new Random();
	
	public OrangePoint(int x, int y) {
		//Calls method from the super class
		super(x,y);
	}
	
	public Color getColor() {
		//returns a blue color from color class
		return Color.ORANGE;
	}
	
	public void fly() {
		//The bird's x and y positions are randomized to move about the range of the screen
		this.x = rand.nextInt(SIZE);
		this.y = rand.nextInt(SIZE);
	}
}
