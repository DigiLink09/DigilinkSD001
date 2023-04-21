package africa.digilink;

import africa.digilink.world.Plant;

public class Grass extends Plant{
	public Grass() {
		
		// Won't work --- Grass not in same package as Plant, event though is a subclass
		// System.out.println(this.height);
	}	
}
