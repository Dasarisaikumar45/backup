public class EmailValidator {
	public static void main(String[] args)
	{
		String email="saikd@gmail.com";
		int a1=(email.indexOf("@"));
		int a2=(email.lastIndexOf("@"));
		int b1=(email.indexOf("."));
		int b2=(email.lastIndexOf("."));
		int c1=b1-a1;
		int c2=email.length()-b1;
		if(a1==a2 && b1==b2)
		{
			if(a1>=3 && c1>=4 &&c2>=2)
			{
				System.out.println("valid Mail id");			
			}
			else
			{
				
				System.out.println("Invalid Mail id");
			}
		}
		else
		{
			System.out.println("Invalid mail id");
			
				
		}
	}
}