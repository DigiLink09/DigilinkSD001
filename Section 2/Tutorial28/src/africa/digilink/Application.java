package africa.digilink;

public class Application {
	public static void main(String[] args) {
		
		byte byteValue = 20; // 8 bits store from -128 to 127 close to a total of 256 if we include a zero  
		short shortValue = 33;// 16 bits
		int intValue = 234; //32 bits
		long longValue = 23355;// 64 bits
		
		float floatValue = 8824.8f;
		double doubleValue = 52.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int) longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		// The following won't work as we expected
		// 128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
	}
}
