package Desenvolvimento.Aula02.Praticando;

public class Aluno {
	private String nome;
	private int cod_matricula;
	private boolean e_bolsista;
	private double desconto;
	private Curso curso;
 
	public Aluno(String nome,
				Curso curso,
				int cód_matrícula,
				boolean é_bolsista,
				double desconto) {
		this.nome = nome;
		this.curso = curso;
		this.cod_matricula = cód_matrícula;
		this.e_bolsista = é_bolsista;
		this.desconto = desconto;
				}
 
		public String getDados()
		{
			String resp = "Aluno: "+ this.nome +"\n";
			resp += "Curso: " + this.curso.getNível_curso() + " em " + this.curso.getNome_curso() +"\n";
			if (e_bolsista) 
			{
				resp += "Bolsista com desconto de: " + this.desconto + "%\n";
			}
			else resp += "Mensalidade: R$ " + CalculaMensalidade();
 
			return resp;
		}

		//EXTRACT METHOD
		private double CalculaMensalidade() {
			return this.curso.getMensalidade_curso()*(1-this.desconto/100);
		}
}
