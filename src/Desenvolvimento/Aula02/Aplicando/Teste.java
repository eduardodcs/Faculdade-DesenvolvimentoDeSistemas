package Desenvolvimento.Aula02.Aplicando;

import java.util.ArrayList;
import java.util.Arrays;

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
									false,
									920.50,
									new TCCNulo()));
 
		Aluno aluno2 = new Aluno("Kent Beck",
							22334455,
							false,
							true,
							
							2019,
							
							0,
							new Curso("Computação Aplicada",
									"Mestrado",
									true,
									2150.45,
									new TCC("Impacto da Refatoração", new Professor("Peter Coad"), 0.0,
											new ArrayList<MembroBanca>(Arrays.asList(new MembroBanca("Grady Booch"), new MembroBanca("Erich Gamma"))))));
		System.out.println(aluno1.getDados());
		System.out.println(aluno2.getDados());
	}
}