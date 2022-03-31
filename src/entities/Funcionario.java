package entities;

import entities.enums.TipoDeDocumento;

public class Funcionario {
	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento documento;

	public Funcionario(String nomeFuncionario, TipoDeDocumento documento, String numeroDocumento) {
		this.documento = documento;
		this.nome = nomeFuncionario;
		this.numeroDocumento = numeroDocumento;

	}

}
