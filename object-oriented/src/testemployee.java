import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class testemployee {

	public static void main(String[] args) {
		Executive ex1 = new Executive(101, "sai", 1000, 3000);
		Manager mg1 = new Manager(102, "kumar", 2000, 4000);
		
		showSalary(ex1);
		showSalary(mg1);
		// TODO Auto-generated constructor stub
	}

	private static void showSalary(Employee e) {
		if( e instanceof Manager)
			System.out.println("manager salary:"+e.getSalary());
		else
			System.out.println("Executive salary:"+e.getSalary());
			
		
		
	}
	/*private static void showSalary(Executive ex1) {
		System.out.println("Executive salary: " + ex1.getsalary());
		// TODO Auto-generated method stub
		
	}

	private static void showSalary(Manager mg1) {
		System.out.println("Manager salary: " + mg1.getsalary());

		// TODO Auto-generated method stub
		
	}*/

}