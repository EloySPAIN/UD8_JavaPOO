/**
 * 
 * @author Eloy Altozano
 *
 */
public class Persona {
	final private char SEXO = 'H';
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo = SEXO;
	private double peso;
	private double altura;
	
	
	public Persona(String DNI) {
		this.nombre="";
		this.edad=0;
		this.DNI=DNI;
		this.sexo=SEXO;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}

	@Override
	public String toString() {
		return "Persona SEXO=" + SEXO + ", nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura;
	}
	
	
}