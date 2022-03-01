package Desenvolvimento.Aula02.Aplicando;

public class Curso {
	
	private String nome_curso, n�vel_curso;
	private boolean tem_trabalho;
	private double mensalidade_curso;
	private TCC tcc;
	
	public Curso(String nome_curso, String n�vel_curso, boolean tem_trabalho, double mensalidade_curso, TCC tcc) {
		super();
		this.nome_curso = nome_curso;
		this.n�vel_curso = n�vel_curso;
		this.tem_trabalho = tem_trabalho;
		this.mensalidade_curso = mensalidade_curso;
		this.tcc = tcc;
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

	public boolean isTem_trabalho() {
		return tem_trabalho;
	}

	public void setTem_trabalho(boolean tem_trabalho) {
		this.tem_trabalho = tem_trabalho;
	}

	public double getMensalidade_curso() {
		return mensalidade_curso;
	}

	public void setMensalidade_curso(double mensalidade_curso) {
		this.mensalidade_curso = mensalidade_curso;
	}

	public TCC getTcc() {
		return tcc;
	}

	public void setTcc(TCC tcc) {
		this.tcc = tcc;
	}
}
