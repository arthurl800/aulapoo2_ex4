package aula05v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Projeto> listaProjetos = new ArrayList<>();
	
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
	
	public boolean adicionarContratacao (Projeto contratacao) {
		
		
		if ( contratacao != null && !listaProjetos.contains(contratacao) ) {
			this.listaProjetos.add(contratacao);
			return true;
		}
		
		return false;
	}
	
	public boolean removerContratacao (Contratacao contratacao) {
		
		if ( contratacao != null && listaProjetos.size() > 0 && listaProjetos.contains(contratacao) ) {
			this.listaProjetos.remove(contratacao);
			return true;
		}
		
		return false;
	}
	
	public void listarContratacao() {
		
		System.out.println();
		if (listaProjetos.isEmpty()) {
			System.out.println("Projeto" + this.nome + " nao cadastrado");
		}
		else {
			System.out.println("Projeto: \n" + this.nome);
			for (Projeto m : this.listaProjetos) {
				System.out.println(" FUNCIONARIO "); 
			}
		}
	}
}
