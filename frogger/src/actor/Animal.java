package actor;

import java.util.ArrayList;

import javafx.event.EventHandler;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Animal extends Actor {
	Image imgW1, imgW2, imgA1, imgA2, imgS1, imgS2, imgD1, imgD2;
	int points = 0;
	int end = 0;
	private boolean second = false;
	boolean noMove = false;
	double movement = 12.5*2;
	double movementX = 12.5*2;
	int imgSize = 40;
	boolean carDeath = false;
	boolean waterDeath = false;
	boolean stop = false;
	boolean changeScore = false;
	int carD = 0;
	double w = 800;
	ArrayList<End> inter = new ArrayList<End>();
	
	/**
	 * Set frog actions when WASD keys are pressed
	 */
	public Animal(String imageLink) {
		setImage(new Image(imageLink, imgSize, imgSize, true, true));
		setX(300);
		setY(675+movement);
		imgW1 = new Image("file:resources/frogger/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:resources/frogger/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:resources/frogger/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:resources/frogger/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:resources/frogger/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:resources/frogger/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:resources/frogger/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:resources/frogger/froggerRightJump.png", imgSize, imgSize, true, true);
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				if (noMove) {
				}
				else {
				if (second) {
					if (event.getCode() == KeyCode.W) {	  
		                move(0, -movement);
		                changeScore = false;
		                setImage(imgW1);
		                second = false;
		            }
		            else if (event.getCode() == KeyCode.A) {	            	
		            	 move(-movementX, 0);
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S) {	            	
		            	 move(0, movement);
		            	 setImage(imgS1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.D) {	            	
		            	 move(movementX, 0);
		            	 setImage(imgD1);
		            	 second = false;
		            }
				}
				else if (event.getCode() == KeyCode.W) {	            	
	                move(0, -movement);
	                setImage(imgW2);
	                second = true;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(imgA2);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(imgS2);
	            	 second = true;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(imgD2);
	            	 second = true;
	            }
	        }
			}
		});	
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (noMove) {}
				else {
				if (event.getCode() == KeyCode.W) {	  
					if (getY() < w) {
						changeScore = true;
						w = getY();
						points+=10;
					}
	                move(0, -movement);
	                setImage(imgW1);
	                second = false;
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	 move(-movementX, 0);
	            	 setImage(imgA1);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	 move(0, movement);
	            	 setImage(imgS1);
	            	 second = false;
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	 move(movementX, 0);
	            	 setImage(imgD1);
	            	 second = false;
	            }
	        }
			}
			
		});
	}
	
	/**
	 * Move the frog
	 * If crash by car or drop in water then frog die, respawn frog at respawn location
	 */
	@Override
	public void act(long now) {
		int bounds = 0;
		if (getY()<0 || getY()>734) {
			setX(300);
			setY(675+movement);
		}
		if (getX()<0) {
			move(movement*2, 0);
		}
		if (getX()>575) {
			move(-movement*2, 0);
		}
		if (carDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:resources/frogdie/cardeath1.png", imgSize, imgSize, true, true));
			}
			if (carD==2) {
				setImage(new Image("file:resources/frogdie/cardeath2.png", imgSize, imgSize, true, true));
			}
			if (carD==3) {
				setImage(new Image("file:resources/frogdie/cardeath3.png", imgSize, imgSize, true, true));
			}
			if (carD == 4) {
				setX(300);
				setY(675+movement);
				carDeath = false;
				carD = 0;
				setImage(new Image("file:resources/frogger/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		if (waterDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:resources/frogdie/waterdeath1.png", imgSize,imgSize , true, true));
			}
			if (carD==2) {
				setImage(new Image("file:resources/frogdie/waterdeath2.png", imgSize,imgSize , true, true));
			}
			if (carD==3) {
				setImage(new Image("file:resources/frogdie/waterdeath3.png", imgSize,imgSize , true, true));
			}
			if (carD == 4) {
				setImage(new Image("file:resources/frogdie/waterdeath4.png", imgSize,imgSize , true, true));
			}
			if (carD == 5) {
				setX(300);
				setY(675+movement);
				waterDeath = false;
				carD = 0;
				setImage(new Image("file:resources/frogger/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		if (getIntersectingObjects(Obstacle.class).size() >= 1) {
			carDeath = true;
		}
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		if (getIntersectingObjects(Log.class).size() >= 1 && !noMove) {
			if(getIntersectingObjects(Log.class).get(0).getRight())
				move(1,0);
			else if (getIntersectingObjects(Log.class).get(0).getLeft())
				move(-1,0);
			else
				move (.75,0);
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) {
			move(-0.5,0);
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				waterDeath = true;
			} else {
				move(-0.5,0);
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				end--;
				points-=50;
			}
			points+=50;
			changeScore = true;
			w=800;
			getIntersectingObjects(End.class).get(0).setEnd();
			end++;
			setX(300);
			setY(700);
		}
		else if (getY()<400){
			waterDeath = true;
		}
	}
	
	public boolean getStop() {
		return end==5;
	}
	
	/**
	 * Pass current score
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Change the score
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}
}
