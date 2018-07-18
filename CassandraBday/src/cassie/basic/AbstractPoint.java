package cassie.basic;
import java.awt.*;

public abstract class AbstractPoint {
	//Created three fields for birds' x and y coordinates and whether or not they are flying upward 
	protected int x;
	protected int y;
	protected boolean upward = true;
	
	public AbstractPoint(int x, int y) {
		//Set the x and y fields equal to the passed parameters
		this.x = x;
		this.y = y;
	}

	public Point getPosition() {
		//Get position is a field used by all kinds of birds and returns the point location of the bird
		return new Point(x, y);
	}
}
