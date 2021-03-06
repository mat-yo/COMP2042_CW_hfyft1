package actor;

import javafx.scene.image.Image;

public class Log extends Actor {
	private double speed;
	
	/**
	 * Move log and loop
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	
	/**
	 * Set log start location and speed
	 */
	public Log(String imageLink, int xpos, int ypos, double s, int w, int h) {
		setImage(new Image(imageLink, w, h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	
	/**
	 * Set log moving direction
	 */
	public boolean getLeft() {
		return speed < 0;
	}
	
	public boolean getRight() {
		return speed > 0;
	}
}
