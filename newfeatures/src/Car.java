
public class Car {
	private String model;
	private String[] features;

	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}
	public void specs() {
		System.out.println("Features of "+model);
		for(String f:features)
			System.out.println("-"+f);
	}
	public static void main(String[] args) {
		//String []arg={"keyless","electric"};

		Car alto=new Car("Suzuki","keyless","electric");
		Car kia=new Car("KIA","keyless","electric");

		alto.specs();
		kia.specs();
	}

	}