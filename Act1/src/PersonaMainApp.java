/**
 * 
 * @author Eloy Altozano
 *
 */
public class PersonaMainApp {

	public static void main(String[] args) {
		Persona per1=new Persona("12321423L");
		Persona per2=new Persona("Eloy", 19,"23412356O",'H');
		Persona per3=new Persona("Jordi", 19,"13934129K",'H', 68.0,1.78);
		
		System.out.println("Persona 1: "+per1);
		System.out.println("Persona 2: "+per2);
		System.out.println("Persona 3: "+per3);

	}

}
