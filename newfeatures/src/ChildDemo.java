public class ChildDemo<Z,S,P> extends Demo<Z> {
	private S value;
	private P male;

	public ChildDemo(Z data, S value, P male) {
		super(data);
		this.value = value;
		this.male=male;
	}

	public P getMale() {
		return male;
	}

	public void setMale(P male) {
		this.male = male;
	}

	public S getValue() {
		return value;
	}

	public void setValue(S value) {
		this.value = value;
	}
	public static void main(String[] args) {
		ChildDemo <String,Integer,Boolean>d=new ChildDemo("Hello",10,true);//only String values
		System.out.println(d.getData()+"\t"+d.getValue()+"\t"+d.getMale());
	}

}