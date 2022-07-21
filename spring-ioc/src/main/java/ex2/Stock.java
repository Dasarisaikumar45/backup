package ex2;

public class Stock {
	
	public Stock() {
		System.out.println("Stock Constructor");
	}
	private static Stock stock;
	
	public static Stock get() {
		if(stock == null)
			System.out.println("singleton");
			stock = new Stock();
		
		return stock;
	}
	
	

}
