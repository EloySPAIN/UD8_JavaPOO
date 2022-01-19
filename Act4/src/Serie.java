/**
 * 
 * @author Eloy Altozano
 *
 */
public class Serie {
	private String titulo;
	private int n_temp;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.n_temp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.n_temp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int n_temp, String genero, String creador) {
		this.titulo = titulo;
		this.n_temp = n_temp;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie titulo=" + titulo + ", n_temp=" + n_temp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador;
	}
	
	
}
