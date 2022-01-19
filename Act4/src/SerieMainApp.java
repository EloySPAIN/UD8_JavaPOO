/**
 * 
 * @author Eloy Altozano
 *
 */
public class SerieMainApp {

	public static void main(String[] args) {

		Serie serie1 = new Serie();
		Serie serie2 = new Serie("The Big Bang Theory", "Warner Bros");
		Serie serie3 = new Serie("The Big Bang Theory", 12, "comedia", "Warner Bros");
		
		System.out.println(serie1);
		System.out.println(serie2);
		System.out.println(serie3);

	}

}
