
public class EmailValidators {
	public static void main(String[] args) {
		
    String email = "saikd@gmail.com";
    int iat = email.indexOf('@');
    int idot = email.indexOf('.');
    
    if (iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat>3 && idot > (iat+3) 
    		&& email.length() > (idot+2))
    	System.out.println("valid email");
    else 
    	System.out.println("invalid email");
	}

}
