package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Cow extends Animal {
	Animal cow;
	public void Cow() {
		cow.makeNoise();
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playSound("cow.wav");
	}
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
} 

	