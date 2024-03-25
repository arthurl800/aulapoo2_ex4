package aula05v2;

public enum TipoDeDocumento {

	RG ("Registro Geral"),
	CPF("Cadastro de Pessoa Fisica"),
	CNPJ("Cadastro Nacional de Pessoa Juridica");
	
	private String descricao;
	
	TipoDeDocumento(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
