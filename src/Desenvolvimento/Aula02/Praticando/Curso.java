package Desenvolvimento.Aula02.Praticando;

//EXTRACT CLASS
public class Curso {
	
	private String nome_curso, n�vel_curso;
	private double mensalidade_curso;

	public Curso(String nome_curso, String n�vel_curso, double mensalidade_curso) {
		this.nome_curso = nome_curso;
		this.n�vel_curso = n�vel_curso;
		this.mensalidade_curso = mensalidade_curso;
	}
	
	public String getNome_curso() {
		return nome_curso;
	}
	
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	
	public String getN�vel_curso() {
		return n�vel_curso;
	}
	
	public void setN�vel_curso(String n�vel_curso) {
		this.n�vel_curso = n�vel_curso;
	}
	
	public double getMensalidade_curso() {
		return mensalidade_curso;
	}
	
	public void setMensalidade_curso(double mensalidade_curso) {
		this.mensalidade_curso = mensalidade_curso;
	}
}
