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
		
	public Contratacao(Date data, Cargo cargo, Funcionario x, Projeto y) {
		super();
		this.data = data;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.funcionario = x;
		this.projeto = y;
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

	@Override
	public String toString() {
		return "Contratacao [data=" + data + ", cargo=" + cargo + ", status=" + status + "]";
	}

	public void contratar() {
		
		if(this.status == Status.PENDENTE) {
			
			this.status = Status.CONTRATADO;
			
		}else {
			System.out.println("Não permitido");
		}
				
	}
	
	public void demitir() {

		if(this.status == Status.PENDENTE) {
			
			this.status = Status.DEMITIDO;
			
		}else {
			System.out.println("Não permitido");
		}
	
	}
}
