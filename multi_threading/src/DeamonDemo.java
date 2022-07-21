
public class DeamonDemo extends Thread {
	private int limit;
	
	public DeamonDemo(int limit, String name) {
		super(name);
		this.limit = limit;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		for(int c=1; c<=limit; c++)
			System.out.println(name + ": " + c);
	}
	 public static void main(String[] args) {
		DeamonDemo d1 = new DeamonDemo(25,"First");
		DeamonDemo d2 = new DeamonDemo(50,"Second");
		DeamonDemo d3 = new DeamonDemo(100,"third");
		DeamonDemo d4 = new DeamonDemo(500000,"Deamon");
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		
	}

}
