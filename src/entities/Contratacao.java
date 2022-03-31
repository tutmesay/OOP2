package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.CargoType;
import entities.enums.StatusType;

public class Contratacao {
	private Date datal;
	private CargoType cargoType;
	private StatusType statusTyoeStatusType;
	private Funcionario funcionario;
	private Projeto projeto;

	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Contratacao(Date datal, CargoType cargoType, StatusType statusTyoeStatusType, Funcionario funcionario, Projeto projeto) {
		this.datal = datal;
		this.cargoType = cargoType;
		this.statusTyoeStatusType = statusTyoeStatusType;
		this.funcionario = funcionario;
		this.projeto = projeto;
		this.projeto.adicionarContratacao(this);
		this.pendente();
	}

	public void pendente() {
		statusTyoeStatusType = StatusType.PENDENTE;
		System.out.println("Contratação Pendente. Passe no RH e verifique com seu Gestor!");
	}


	public void contratar() {	
		if(statusTyoeStatusType == StatusType.PENDENTE) {
			statusTyoeStatusType = StatusType.CONTRATADO;
		}else {
			statusTyoeStatusType = StatusType.CONTRATADO;
		}
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public SimpleDateFormat getDf() {
		return df;
	}

	public void setDf(SimpleDateFormat df) {
		this.df = df;
	}

	public void demitir() {
		if(statusTyoeStatusType == StatusType.PENDENTE) {
			statusTyoeStatusType = StatusType.DEMITIDO;
		}
	}


	public Date getDatal() {
		return datal;
	}

	public void setDatal(Date datal) {
		this.datal = datal;
	}

	public CargoType getCargoType() {
		return cargoType;
	}

	public void setCargoType(CargoType cargoType) {
		this.cargoType = cargoType;
	}

	public StatusType getStatusTyoeStatusType() {
		return statusTyoeStatusType;
	}

	public void setStatusTyoeStatusType(StatusType statusTyoeStatusType) {
		this.statusTyoeStatusType = statusTyoeStatusType;
	}


}
