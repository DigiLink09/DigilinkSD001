package africa.digilink;

import africa.digilink.world.Plant;

/*
 * private --- only within the same class
 * public --- from anywhere
 * protected --- same class, subclass, and same package
 * no modifier --- same class and same package only
 */

public class Application {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// Won't work either -- type is private
		// System.out.println(plant.type);
		
		// size is protected and Application is not in the same package as Plant
		// Won't work
		// System.out.println(plant.size);
		
		// Wom't work; Application and Plant in different packages, height has package level visibility
		// System.out.println(plant.height);
	}	
}
