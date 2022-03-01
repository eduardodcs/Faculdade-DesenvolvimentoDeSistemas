package Desenvolvimento.Aula02.Aplicando;

public class Aluno extends Pessoa {
	
	private int c�d_matr�cula, ano_finaliza��o;
	private boolean �_bolsista, curso_finalizado;
	private double desconto;
	private Curso curso;
	
		public Aluno(String nome, int c�d_matr�cula, boolean �_bolsista, boolean curso_finalizado, int ano_finaliza��o, 
			double desconto, Curso curso) {
		super(nome);
		this.c�d_matr�cula = c�d_matr�cula;
		this.ano_finaliza��o = ano_finaliza��o;
		this.�_bolsista = �_bolsista;
		this.curso_finalizado = curso_finalizado;
		this.desconto = desconto;
		this.curso = curso;
	}

		public String getMensalidade()
		{
			String resp="";
			if (this.�_bolsista) 
			{
				resp += "Bolsista com desconto de: " + this.desconto + "%\n";
			}
			resp += "Mensalidade: R$ " + CalculaMensalidade() + "\n";
			return resp;
		}
 
		public String getDados()
		{
			String resp = "Aluno: "+ this.nome +"\n";
			resp += "Curso: " + this.curso.getN�vel_curso() + " em " + this.curso.getNome_curso() +"\n";
			resp += this.getMensalidade();
			if (this.curso_finalizado)
			{
			 resp += "Curso finalizado em "+ano_finaliza��o + "\n";
			 if (this.curso.isTem_trabalho())
			 {
				resp += "T�tulo ";
				switch (this.curso.getN�vel_curso())
				{
				 case "Gradua��o": resp += "do TCC: "; break;
				 case "Lato sensu": resp += "da monografia: "; break;
				 case "Mestrado": resp += "da disserta��o: "; break;
				 case "Doutorado": resp += "da tese: "; break;
				}
				resp += this.curso.getTcc().getTitulo_trabalho() + "\n";
				resp += "Orientador(a): Prof. " + this.curso.getTcc().getOrientador().getNome() + "\n";
				if (this.curso.getN�vel_curso().equals("Gradua��o"))
					resp += "Nota: " + this.curso.getTcc().getNota_trabalho();
				else if (this.curso.getN�vel_curso().equals("Mestrado") || this.curso.getN�vel_curso().equals("Doutorado"))
				{
					resp += "Banca: ";
					Integer tamanhoLista = this.curso.getTcc().getMembros_banca().size();
					Integer index = 0;
					for (MembroBanca banca : this.curso.getTcc().getMembros_banca()) {
						resp += banca.getNome();
						index += 1;
						if(index != tamanhoLista) {
							resp += " - ";							
						}
						
					}
				}
			}
			}
			return resp;
		}
		
		
		//EXTRATC METHOD
		private double CalculaMensalidade() {
			return this.curso.getMensalidade_curso()*(1-this.desconto/100);
		}
}