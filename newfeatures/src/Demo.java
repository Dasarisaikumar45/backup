// Generics Programs....
public class Demo<Z>
{
private Z data;

	public Demo(Z data) {
	this.data = data;
}

	public Object getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	public static void main(String[] args) {
		Demo<String> d=new Demo("hello");//only String values
		System.out.println(d.getData());
		
		Demo<Integer> d1=new Demo(500);//only Integer values
		System.out.println(d1.getData());
	}

}