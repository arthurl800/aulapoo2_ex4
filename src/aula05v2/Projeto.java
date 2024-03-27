package aula05v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> contratacoes = new ArrayList<>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		super();
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}

	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino + "]";
	}
	
	public List<Contratacao> getContratacao() {
		return contratacoes;
	}
	
	public boolean adicionarContratacao (Contratacao contratacao) {
		
		if ( contratacao != null && !contratacoes.contains(contratacao) ) {
			this.contratacoes.add(contratacao);
			return true;
		}
			
		return false;

	}
	
	public boolean removerContratacao (Contratacao contratacao) {
		
		if ( contratacao != null && contratacoes.size() > 0 && contratacoes.contains(contratacao) ) {
			this.contratacoes.remove(contratacao);
			return true;
		}	
		
		return false;

	}
	
	public void listarContratacao() {
		
        System.out.println("***Contratações***");
        System.out.println("Projeto:");
        System.out.println(nome);
        System.out.println("Funcionário(s):");
     
        for (Contratacao c : this.contratacoes ) {
			System.out.println("\t Status: " + c.getStatus()); 
			
			System.out.println("NAO ESTA IMPRIMINDO O FOR");
			
		}
        
        
        System.out.println();

	}
}
