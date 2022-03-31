package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> listContratacao = new ArrayList<>();

	

	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		super();
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
		this.listContratacao = listContratacao;
	}

	public boolean adicionarContratacao(Contratacao contratacao) {
		Boolean sucessVerifica = true;
		if(contratacao != null && !listContratacao.contains(contratacao) ) {
			this.listContratacao.add(contratacao);
			listContratacao.add(contratacao);
			return sucessVerifica ;
		}else {
			System.out.println("Null Pointer Excepetion");
		}

		return false;
	}

	public boolean removerContratacao(Contratacao contratacao) {
		Boolean sucessVerifica = true;
		if(listContratacao!= null && listContratacao.contains(contratacao)
				&& listContratacao.size()>0) {
			this.listContratacao.remove(contratacao);
			return sucessVerifica;
		}else {
			System.out.println("Null Pointer Excepetion");
		}
		return false;
	}


	public void listarContratacao() {
		for(Contratacao c : this.listContratacao) {
			System.out.println("\t" + c.getFuncionario().getNome() + "[ Status]: " + c.getStatusTyoeStatusType());
		}
		System.out.println(this.listContratacao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dt_Inicio, dt_Termino, listContratacao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return Objects.equals(dt_Inicio, other.dt_Inicio) && Objects.equals(dt_Termino, other.dt_Termino)
				&& Objects.equals(listContratacao, other.listContratacao) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino
				+ ", listContratacao=" + listContratacao + "]";
	}



}
