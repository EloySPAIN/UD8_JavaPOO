/**
 * 
 * @author Eloy Altozano
 *
 */
public class PasswordMainApp {

	public static void main(String[] args) {
		Password pass1=new Password();
		Password pass2=new Password(16);
		
		System.out.println("Password 1: "+pass1);
		System.out.println("Password 2: "+pass2);
		
	}

}
