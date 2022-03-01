package Desenvolvimento.Aula02.Praticando;

public class Teste {
	public static void main (String args[])
	{
		Aluno a1 = new Aluno("Martin Fowler", 
							new Curso("ADS",
							"Graduação", 920.50),
							11223344,
							true,
							20.5);
		Aluno a2 = new Aluno("Kent Beck",
							new Curso("Computação Aplicada",
							"Mestrado", 2150.45),
							22334455,
							false,
							0);
		System.out.println(a1.getDados());
		System.out.println(a2.getDados());
	}
}
