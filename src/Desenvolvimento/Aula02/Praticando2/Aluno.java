package Desenvolvimento.Aula02.Praticando2;

public class Aluno {
		private String nome;
		private int c�d_matr�cula, ano_finaliza��o;
		private boolean �_bolsista, curso_finalizado;
		private double desconto;
		private Curso curso;
		
		//[t�tulo do trabalho, nome do orientador, nota do trabalho]
		public Aluno(String nome,
					int c�d_matr�cula,
					boolean �_bolsista,
					boolean curso_finalizado,
					int ano_finaliza��o,
					double desconto,
					Curso curso) {
			this.nome = nome;
			this.c�d_matr�cula = c�d_matr�cula;
			this.�_bolsista = �_bolsista;
			this.curso_finalizado = curso_finalizado;
			this.ano_finaliza��o = ano_finaliza��o;
			this.desconto = desconto;
			this.curso = curso;
					}
	 
			public String getDados()
			{
				String resp = "Aluno: "+ this.nome +"\n";
				resp += "Curso: " + this.curso.getN�vel_curso() + " em " + this.curso.getNome_curso() +"\n";
				if (this.�_bolsista) 
				{
					resp += "Bolsista com desconto de: " + this.desconto + "%\n";
				}
				resp += "Mensalidade: R$ " + CalculaMensalidade() + "\n";
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
					resp += this.curso.getTcc().getTitulo() + "\n";
					resp += "Orientador(a): Prof. " + this.curso.getTcc().getOrientador() + "\n";
					resp += "Nota: " + this.curso.getTcc().getNota();
				}
				}
				return resp;
			}
			
			//EXTRATC METHOD
			private double CalculaMensalidade() {
				return this.curso.getMensalidade_curso()*(1-this.desconto/100);
			}
	}
	 


