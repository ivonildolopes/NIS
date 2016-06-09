package br.edu.fanor.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
public class Paciente extends Pessoa implements Serializable {

	@Column(nullable=false,length=200)
	@NotEmpty(message="Informe o nome da mãe")
	private String nomeMae;

	@Column(nullable=false)
	@NotNull(message="Informe a idade da mãe")
	private Integer idadeMae;

	@Column(nullable=false)
	@NotEmpty(message="Informe a escolaridade da mãe")
	private String escolaridadeMae;
	
	@Column(nullable=false)
	@NotEmpty(message="Informe a profissão da mãe")
	private String profissaoMae;

	@Column(nullable=false,length=200)
	@NotEmpty(message="Informe o nome do pai")
	private String nomePai;

	@Column(nullable=false)
	@NotNull(message="Informe a idade do pai")
	private Integer idadePai;

	@Column(nullable=false)
	@NotEmpty(message="Informe a escolaridade do pai")
	private String escolaridadePai;
	
	@Column(nullable=false)
	@NotEmpty(message="Informe a profissão do pai")
	private String profissaoPai;
	
		
	//GET AND SET

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Integer getIdadeMae() {
		return idadeMae;
	}

	public void setIdadeMae(Integer idadeMae) {
		this.idadeMae = idadeMae;
	}

	public String getEscolaridadeMae() {
		return escolaridadeMae;
	}

	public void setEscolaridadeMae(String escolaridadeMae) {
		this.escolaridadeMae = escolaridadeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Integer getIdadePai() {
		return idadePai;
	}

	public void setIdadePai(Integer idadePai) {
		this.idadePai = idadePai;
	}

	public String getEscolaridadePai() {
		return escolaridadePai;
	}

	public void setEscolaridadePai(String escolaridadePai) {
		this.escolaridadePai = escolaridadePai;
	}

	public String getProfissaoMae() {
		return profissaoMae;
	}

	public void setProfissaoMae(String profissaoMae) {
		this.profissaoMae = profissaoMae;
	}

	public String getProfissaoPai() {
		return profissaoPai;
	}

	public void setProfissaoPai(String profissaoPai) {
		this.profissaoPai = profissaoPai;
	}
	
	
}
