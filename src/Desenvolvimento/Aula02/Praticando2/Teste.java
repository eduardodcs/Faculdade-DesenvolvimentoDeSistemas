package Desenvolvimento.Aula02.Praticando2;

public class Teste {
		public static void main (String args[])
		{
			Aluno aluno1 = new Aluno("Martin Fowler",
								11223344,
								true,
								false,
								-1,
								20.5,
								new Curso("ADS",
										"Graduação",
										920.50,
										false,
										new TCCNulo())
								);
	 
			Aluno aluno2 = new Aluno("Kent Beck",
								22334455,
								false,
								true,
								2019,
								0,
								new Curso("Computação Aplicada",
										"Mestrado",
										2150.45,
										true,
										new TCC("Impacto da Refatoração", "Peter Coad", 9.5)));
			System.out.println(aluno1.getDados());
			System.out.println(aluno2.getDados());
		}
	}
