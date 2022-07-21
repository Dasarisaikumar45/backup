import com.ibm.bank.AccountsFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {
		
		Bank s1 = AccountsFactory.openSavings("Polo");
//		s1.summary();
//		
//		s1.deposit(2000);
//		s1.summary();
//		
//		s1.withdraw(1000);
//		s1.summary();
//		
//		s1.deposit(7000);
//		s1.withdraw(5000);
//		
//		s1.statement();
		
		//Bank c1 = AccountsFactory.openCurrent("Jack");
		
		try {
			s1.withdraw(1000);
			
		}
		catch(BalanceException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		
		
	}
}