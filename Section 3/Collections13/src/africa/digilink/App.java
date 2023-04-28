package africa.digilink;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			// System.out.println(vehicle);

			String[] driversList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);
				// System.out.println(driver);
			}

			personnel.put(vehicle, driverSet);
		}

		{// Brackets just to scope driversList variable so can use again later
			// Example usage
			Set<String> driverList = personnel.get("helicopter");

			for (String driver : driverList) {
				System.out.println(driver);
			}
		}

		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driverList = personnel.get(vehicle);

			for (String driver : driverList) {
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
