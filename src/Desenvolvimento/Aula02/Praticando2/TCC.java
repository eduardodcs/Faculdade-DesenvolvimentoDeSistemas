package Desenvolvimento.Aula02.Praticando2;


//REPLACE ARRAY WITH OBJECT
public class TCC {
	private String titulo;
	private String orientador;
	private double nota;
	
	public TCC(String titulo, String orientador, double nota) {
		this.titulo = titulo;
		this.orientador = orientador;
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getOrientador() {
		return orientador;
	}
	
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}

}
