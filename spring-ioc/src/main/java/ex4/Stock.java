package ex4;

import org.springframework.stereotype.Component;

@Component("stk")

public class Stock {

	public Stock() {
		System.out.println("Stock constructor");
	}
	
	private static Stock stock;
	
	public static Stock get() {
		System.out.println("Stock singleton");
		if(stock == null)
			stock = new Stock();
		
		return stock;
	}
}