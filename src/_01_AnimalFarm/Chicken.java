package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Chicken extends Animal {
Animal chicken;
	public void chicken() {
		chicken.makeNoise();
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playSound("chicken.wav");
	}
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
}
