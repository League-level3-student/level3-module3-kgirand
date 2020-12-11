package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal {
	
	Animal pig;
	Animal pigg;
	Animal cow;
	Animal chicken;
	Animal dog;
	Animal dogg;
	public static void main(String[] args) {
		new Farm().start();
		
	}
	public void start() {
		Animal pig = new Pig();
		Animal pigg = new Pig();
		Animal cow = new Cow();
		Animal chicken = new Chicken();
		Animal dog = new Dog();
		Animal dogg = new Dog();
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(pig);
		farm.add(pigg);
		farm.add(cow);
		farm.add(chicken);
		farm.add(dog);
		farm.add(dogg);
		for(int i = 0; i < farm.size()-1; i++) {
			farm.get(i).makeNoise();
		}
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
	}
}
