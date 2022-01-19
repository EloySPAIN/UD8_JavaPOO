
public class ElectrodomesticoMainApp {

	public static void main(String[] args) {
		Electrodomestico elec1 = new Electrodomestico();
		Electrodomestico elec2 = new Electrodomestico(250, 15);
		Electrodomestico elec3 = new Electrodomestico("verde",150,10,'A');
		
		System.out.println(elec1);
		System.out.println(elec2);
		System.out.println(elec3);

	}

}
