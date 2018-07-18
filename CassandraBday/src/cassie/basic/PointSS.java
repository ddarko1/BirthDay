package cassie.basic;
import java.awt.*;

public interface PointSS {
	//Created an interface which promises to implement these methods
	public Color getColor();
	//returns color of the bird
	public Point getPosition();
	//returns position of the bird
	public void fly();
	//has the bird move ts position
}
