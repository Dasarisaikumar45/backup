class EventImpl implements Event{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("class level implementation");
		
	}
	
}
public class EventDemo {
	
	class InnerEventImpl implements Event{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Inner class implementaton");
			
		}
		
	}
	
	static class StaticInnerEventImpl implements Event{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("static inner class implememntation");
			
		}
		
	}
	public void nestedEvent() {
		class NestedEventImpl implements Event{

			@Override
			public void perform() {
				// TODO Auto-generated method stub
				System.out.println("Nested class implementation");
				
			}
			
		}
		new NestedEventImpl().perform();
	}
	public void oneMoreEvent() {
		Event e =new Event() {
			@Override
			public void perform() {
				System.out.println("Anonymous inner class implemtation");
			}
			
		};
		e.perform();
		
		
	}
		
		
		public void oneLastEvent() {
			Event e = () -> System.out.println("lamda event class implementation");
			e.perform();
		
	}
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.perform();
		
		EventDemo demo = new EventDemo();
		InnerEventImpl e2 = demo.new InnerEventImpl();
		e2.perform();
		
		EventDemo.StaticInnerEventImpl e3 = new EventDemo.StaticInnerEventImpl();
		e3.perform();
		
		demo.nestedEvent();
		demo.oneMoreEvent();
		demo.oneLastEvent();
	}
	
	

}
