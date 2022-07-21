import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TestException {
	
@Test

	public void testDivision() {
		assertThrows(ArithmeticException.class,()->{int x=10/0;});
	}
	
	
@Test

	public void testParsing() {
		assertThrows(NumberFormatException.class,()->Integer.parseInt("One"));
	}
}