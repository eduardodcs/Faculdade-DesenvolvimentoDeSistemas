package Desenvolvimento.Aula02.Aplicando;

public class Aluno extends Pessoa {
	
	private int cód_matrícula, ano_finalização;
	private boolean é_bolsista, curso_finalizado;
	private double desconto;
	private Curso curso;
	
		public Aluno(String nome, int cód_matrícula, boolean é_bolsista, boolean curso_finalizado, int ano_finalização, 
			double desconto, Curso curso) {
		super(nome);
		this.cód_matrícula = cód_matrícula;
		this.ano_finalização = ano_finalização;
		this.é_bolsista = é_bolsista;
		this.curso_finalizado = curso_finalizado;
		this.desconto = desconto;
		this.curso = curso;
	}

		public String getMensalidade()
		{
			String resp="";
			if (this.é_bolsista) 
			{
				resp += "Bolsista com desconto de: " + this.desconto + "%\n";
			}
			resp += "Mensalidade: R$ " + CalculaMensalidade() + "\n";
			return resp;
		}
 
		public String getDados()
		{
			String resp = "Aluno: "+ this.nome +"\n";
			resp += "Curso: " + this.curso.getNível_curso() + " em " + this.curso.getNome_curso() +"\n";
			resp += this.getMensalidade();
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
				resp += this.curso.getTcc().getTitulo_trabalho() + "\n";
				resp += "Orientador(a): Prof. " + this.curso.getTcc().getOrientador().getNome() + "\n";
				if (this.curso.getNível_curso().equals("Graduação"))
					resp += "Nota: " + this.curso.getTcc().getNota_trabalho();
				else if (this.curso.getNível_curso().equals("Mestrado") || this.curso.getNível_curso().equals("Doutorado"))
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