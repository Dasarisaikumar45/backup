
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye() {
		return "mama";
	}
	static void greet () {
		System.out.println("happy holidays");
	}
}
