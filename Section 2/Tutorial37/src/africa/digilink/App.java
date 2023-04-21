/**
 * 
 */
package africa.digilink;

public class App {

	public static void main(String[] args) {	
		String[] texts = {"1","2","3"};
		
		try {
		System.out.println(texts[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
	}
}
