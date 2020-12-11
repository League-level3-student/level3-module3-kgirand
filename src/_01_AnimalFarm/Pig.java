package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Pig extends Animal {
	Animal pig;
	Animal pigg;
	public void Pig() {
		pig.makeNoise();
		pigg.makeNoise();
		
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playSound("hog11.wav");
	}
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
}
