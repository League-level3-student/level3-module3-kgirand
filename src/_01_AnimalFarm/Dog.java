package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Dog extends Animal {
Animal dog;
Animal dogg;
	public void dog() {
		dog.makeNoise();
		dogg.makeNoise();
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		playSound("animals049.wav");
	}
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
}
