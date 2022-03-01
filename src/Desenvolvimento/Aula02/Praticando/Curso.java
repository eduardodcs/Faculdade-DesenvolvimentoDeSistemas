package Desenvolvimento.Aula02.Praticando;

//EXTRACT CLASS
public class Curso {
	
	private String nome_curso, nível_curso;
	private double mensalidade_curso;

	public Curso(String nome_curso, String nível_curso, double mensalidade_curso) {
		this.nome_curso = nome_curso;
		this.nível_curso = nível_curso;
		this.mensalidade_curso = mensalidade_curso;
	}
	
	public String getNome_curso() {
		return nome_curso;
	}
	
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	
	public String getNível_curso() {
		return nível_curso;
	}
	
	public void setNível_curso(String nível_curso) {
		this.nível_curso = nível_curso;
	}
	
	public double getMensalidade_curso() {
		return mensalidade_curso;
	}
	
	public void setMensalidade_curso(double mensalidade_curso) {
		this.mensalidade_curso = mensalidade_curso;
	}
}
