package africa.digilink;

class Plant{
	
	public static final int ID = 7;
	
	private String name;
	
	public String getData()
	{
		String data = "Some stuff "+calculateGrowthForecast();
		return data;
	}
	
	private int calculateGrowthForecast()
	{
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Application {
	public static void main(String[] args) {
		Plant p = new Plant();
		
		System.out.println(p.getData());
	}
}
