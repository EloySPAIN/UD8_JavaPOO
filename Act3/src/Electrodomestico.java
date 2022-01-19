import javax.swing.JOptionPane;

/**
 * 
 * @author Eloy Altozano
 *
 */
public class Electrodomestico {
	private double precio_base;
	private String color;
	private char consumo_energetico;
	private double peso;

	public Electrodomestico() {
		this.color = "blanco";
		this.consumo_energetico = 'F';
		this.precio_base = 100;
		this.peso = 5;
	}

	public Electrodomestico(double precio_base, double peso) {
		this.color = "blanco";
		this.consumo_energetico = 'F';
		this.precio_base = precio_base;
		this.peso = peso;
	}

	public Electrodomestico(String color, double precio_base, double peso, char consumo_energetico) {
		this.color = variosColor(color);
		this.consumo_energetico = consumo_energetico;
		this.precio_base = precio_base;
		this.peso = peso;
	}

	public static String variosColor(String color) {
		String colores = "";
		switch (color) {
		case "blanco":
			return colores = "blanco";
		case "negro":
			return colores = "negro";
		case "rojo":
			return colores = "rojo";
		case "azul":
			return colores = "azul";
		case "gris":
			return colores = "gris";
		default:
			System.out.println("Color incorrecto");
			do {
				color = JOptionPane.showInputDialog("Escribe el color: ");
			} while (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul")
					&& !color.equals("gris"));
			colores = color;
			
		}
		return colores;
	}

	@Override
	public String toString() {
		return "Electrodomestico precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso;
	}

}
