package africa.digilink;

public class App {

	public static void main(String[] args) {
		
		//E.g 4! = 4*3*2*1
		
		System.out.println(factorial(3));
	}
	
	private static int factorial(int value)
	{
		//System.out.println(value);
		
		if(value == 1)
		{
			return 1;
		}
		return factorial(value - 1) * value;
	}
}
