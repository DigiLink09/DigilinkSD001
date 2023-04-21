package africa.digilink;

class Machine {

	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Contructor running!");
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Second contructor running!");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("Third contructor running!");
		this.name = name;
		this.code = code;
	}
}

public class Application {

	public static void main(String[] args) {
		Machine machie1 = new Machine();
		Machine machie2 = new Machine("Bertie");
		Machine machie3 = new Machine("Bertie", 7);
	}
}
