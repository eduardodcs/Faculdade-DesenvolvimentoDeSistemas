package Desenvolvimento.Aula02.Praticando2;

public class Aluno {
		private String nome;
		private int cód_matrícula, ano_finalização;
		private boolean é_bolsista, curso_finalizado;
		private double desconto;
		private Curso curso;
		
		//[título do trabalho, nome do orientador, nota do trabalho]
		public Aluno(String nome,
					int cód_matrícula,
					boolean é_bolsista,
					boolean curso_finalizado,
					int ano_finalização,
					double desconto,
					Curso curso) {
			this.nome = nome;
			this.cód_matrícula = cód_matrícula;
			this.é_bolsista = é_bolsista;
			this.curso_finalizado = curso_finalizado;
			this.ano_finalização = ano_finalização;
			this.desconto = desconto;
			this.curso = curso;
					}
	 
			public String getDados()
			{
				String resp = "Aluno: "+ this.nome +"\n";
				resp += "Curso: " + this.curso.getNível_curso() + " em " + this.curso.getNome_curso() +"\n";
				if (this.é_bolsista) 
				{
					resp += "Bolsista com desconto de: " + this.desconto + "%\n";
				}
				resp += "Mensalidade: R$ " + CalculaMensalidade() + "\n";
				if (this.curso_finalizado)
				{
				 resp += "Curso finalizado em "+ano_finalização + "\n";
				 if (this.curso.isTem_trabalho())
				 {
					resp += "Título ";
					switch (this.curso.getNível_curso())
					{
					 case "Graduação": resp += "do TCC: "; break;
					 case "Lato sensu": resp += "da monografia: "; break;
					 case "Mestrado": resp += "da dissertação: "; break;
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
	 


