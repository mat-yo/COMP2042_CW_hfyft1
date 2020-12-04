package world;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Random;

public class MyStage extends World{
	MediaPlayer mediaPlayer;
	@Override
	public void act(long now) {
		
	}
	
	public MyStage() {
		
	}
	
	/**
	 * Play background music
	 * 25% chance to get remake version of background music
	 */
	public void playMusic() {
		String musicFile = "resources/soundtrack/Frogger Main Song Theme (loop).mp3"; 
		String musicFile2 = "resources/soundtrack/Frogger Main Song Theme Remix (loop).mp3";
		
		Random rand = new Random();
		int upperbound = 4;
		int randomint = rand.nextInt(upperbound);
		
		if (randomint==0) {
			Media sound = new Media(new File(musicFile2).toURI().toString());
			mediaPlayer = new MediaPlayer(sound);
		}
		else {
			Media sound = new Media(new File(musicFile).toURI().toString());
			mediaPlayer = new MediaPlayer(sound);
		}
		
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * Stop background music
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
