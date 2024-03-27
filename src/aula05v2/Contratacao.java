package aula05v2;

import java.util.Date;
import aula05v2.Status;
import aula05v2.Cargo;
import aula05v2.Funcionario;

public class Contratacao {

	private Date data;
	private Cargo cargo;
	private Status status;
	
	private Funcionario funcionario;
	private Projeto projeto;
		
	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		super();
		this.data = data;
		this.cargo = cargo;
		this.funcionario = funcionario;
		this.projeto = projeto;
		this.status = Status.PENDENTE;
	}
	
	public Date getData() {
		return data;
	}



	public Cargo getCargo() {
		return cargo;
	}



	public Status getStatus() {
		return status;
	}

	/*
	@Override
	public String toString() {
		return "Contratacao [data=" + data + ", cargo=" + cargo + ", status=" + status + "]";
	}
	*/
	
	@Override
	public String toString() {
		return "Funcionário:" + funcionario.getNome() + status.toString();
	}
	

	public void contratar() {
		
		this.status = Status.CONTRATADO;
		
	/*	
		System.out.println("CADASTRO CONTRATADO");
		
		if(this.status == Status.PENDENTE) {
			
			this.status = Status.CONTRATADO;
			
		}else {
			System.out.println("Não permitido");
		}
	*/
				
	}
	
	public void demitir() {

		this.status = Status.DEMITIDO;
	
	/*
		System.out.println("CADASTRO DEMITIDO");
		
		if(this.status == Status.PENDENTE) {
			
			this.status = Status.DEMITIDO;
			
		}else {
			System.out.println("Não permitido");
		}
	*/
	
	}
	
	/*
	public void pendente() {

		this.status = Status.PENDENTE;
		
		System.out.println("CADASTRO PENDENTE");
		
		if(this.status == Status.PENDENTE) {
			
			this.status = Status.DEMITIDO;
			
		}else {
			System.out.println("Não permitido");
		}
	
	
	}
	*/
}
