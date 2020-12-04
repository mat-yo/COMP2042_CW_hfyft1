package actor;

import javafx.scene.image.Image;

public class End extends Actor{
	boolean activated = false;
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	/**
	 * Set frog goal
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:resources/end/End.png", 59, 65, true, true));
	}
	
	/**
	 * Set frog goal has frog
	 */
	public void setEnd() {
		setImage(new Image("file:resources/end/FrogEnd.png", 55, 65, true, true));
		activated = true;
	}
	
	/**
	 * Determine whether frog can jump in the goal
	 */
	public boolean isActivated() {
		return activated;
	}
}
