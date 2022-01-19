/**
 * 
 * @author Eloy Altozano
 *
 */

public class Password {
	private int longitud=8;
	private String password;
	
	public Password() {
		this.longitud=longitud;
		this.password=contraRandom(longitud);
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.password=contraRandom(longitud);;
	}
	
	public static String contraRandom(int longitud) {
		String password="";
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		for(int i=0;i<longitud;i++) {
			password += letras.charAt((int) Math.round(Math.random() * letras.length()));
		}
		
		return password;
    }

	@Override
	public String toString() {
		return "Password longitud=" + longitud + ", password=" + password;
	}
}
