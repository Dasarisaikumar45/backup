import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
 
	public static void main(String[] args) {
		
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Hello");
		 
		Consumer<String> c2= System.out::println;
		c2.accept("hye");
		
		Consumer<String> c3 = LamdaDemo::print;
		c3.accept("bro");
		
		Consumer<Integer> c4 = LamdaDemo::print;
		c4.accept(24);
		
		Supplier<String> s1 =() ->"kumar";
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () ->(int)(Math.random()* 100);
		System.out.println(s2.get());
		
		Predicate<Integer> positive = (x) -> x >=0;
		System.out.println(positive.test(-6));
		System.out.println(positive.test(9));
		
		Predicate<Integer> even = (x) -> x % 2 == 0;
		System.out.println(even.test(3));
		System.out.println(even.test(4));
		
		BiPredicate<String, String> contains = (s, c) ->s.contains(c);
		System.out.println(contains.test("dk", "a"));
		System.out.println(contains.test("dk", "b"));
		
		Function<Integer, Integer> square = (x) -> x * x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer, Integer, Integer> sum = (a, b) ->a+b;
		System.out.println(sum.apply(10, 40));
		
 	
	}
}
