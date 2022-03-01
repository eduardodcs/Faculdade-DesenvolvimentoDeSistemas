package Desenvolvimento.Aula02.Aplicando;

import java.util.ArrayList;
import java.util.List;

public class TCC {
	
	private String titulo_trabalho;
	private Professor orientador;
	private double nota_trabalho;
	private List<MembroBanca> membros_banca = new ArrayList<MembroBanca>();

	public TCC(String titulo_trabalho, Professor orientador, double nota_trabalho, List<MembroBanca> membros_banca) {
		super();
		this.titulo_trabalho = titulo_trabalho;
		this.orientador = orientador;
		this.nota_trabalho = nota_trabalho;
		this.membros_banca = membros_banca;
	}

	public String getTitulo_trabalho() {
		return titulo_trabalho;
	}
	
	public void setTitulo_trabalho(String titulo_trabalho) {
		this.titulo_trabalho = titulo_trabalho;
	}
	
	public Professor getOrientador() {
		return orientador;
	}
	
	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}
	
	public double getNota_trabalho() {
		return nota_trabalho;
	}
	
	public void setNota_trabalho(double nota_trabalho) {
		this.nota_trabalho = nota_trabalho;
	}
	
	public List<MembroBanca> getMembros_banca() {
		return membros_banca;
	}
	
	public void setMembros_banca(List<MembroBanca> membros_banca) {
		this.membros_banca = membros_banca;
	}

}
