import com.ibm.shop.ShoppingCart;
import com.ibm.shop.ShoppingException;
import com.ibm.shop.Product;

public class TestShopping {
	public static void main(String[] args) throws ShoppingException {
		
//	
//	           try {
//		
//			ShoppingCart cart = new ShoppingCart();
//			
//			Product p1 = new Product("pods", 8000);
//			//cart.addToCart(p1);
//			cart.addToCart(new Product("watch",22000));
//			cart.checkout();
//			
//		
//	} catch (ShoppingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	           
//	}
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product("pods", 8000);
		
		try {
			cart.addToCart(p1);
			
		}
		catch(ShoppingException e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}
}



	           
