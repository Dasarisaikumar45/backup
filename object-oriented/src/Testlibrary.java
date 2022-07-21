import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class Testlibrary {
public static void main(String[] args) {
	Book b1 = new Book("The Jungle ");
	Member m1 = new Member("sai ");
	b1.status();
	m1.status();
	
	b1.issues(m1);
	b1.status();
	m1.status();
	
}
}
