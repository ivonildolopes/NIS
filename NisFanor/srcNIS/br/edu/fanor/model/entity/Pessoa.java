package br.edu.fanor.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=200,nullable=false)
	@NotEmpty(message="O campo nome é obrigatório")
	private String nome;
	
	@Column(unique=true)
	@Email(message="Informe um email valido")
	private String email;
	
	@Column(nullable=false,columnDefinition="CHAR(1)")
	@NotEmpty(message="Informe o sexo")
	private String sexo; // M ou F
	
	@Column(nullable=false,length=14,unique=true)
	@Length(min=14,message="O CPF deve conter {min} caracteres")
	@NotEmpty(message="Informe o CPF")
	private String cpf;   // ex.: xxx.xxx.xxx-xx 
	
	@Column(nullable=false,length=13,unique=true)
	@Length(min=13,message="O RG deve conter {min} caracteres")
	private String rg;    // ex.: xxxxxxxxxxxxx 
	
	private String orgaoEmissor;
	
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	
	@Column(nullable=false,length=100)
	@Length(min=5,max=100,message="A escolatidade deve conter entre {min} e {max} caracteres")
	@NotEmpty(message="Informe a escolaridade")
	private String escolaridade;
	
	@Column(nullable=false,length=100)
	@Length(max=100,message="A escolatidade deve conter no maximo: {max} caracteres")
	@NotEmpty(message="Informe a escolaridade")
	private String profissao;
	
	@Column(nullable=false)
	@NotEmpty(message="Informe o estado civil")
	private String estadoCivil;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dataNascimento;
		
	private Double rendaFamiliar;
	
	@Column(nullable=false,length=14)
	@Length(min=14,message="O telefone deve conter {min} caracteres. Ex: (85) 9999-9999")
	@NotEmpty(message="Informe um telefone")
	private String telefone; //ex.: (xx) xxxx-xxxx
	
	@Column(nullable=false,length=15)
	@Length(min=15,message="O celular deve conter {min} caracteres. Ex: (85) 99999-9999")
	@NotEmpty(message="Informe um celular")
	private String celular;  //ex.: (xx) 9xxxx-xxxx
	
	@ManyToOne
	@JoinColumn(name="id_endereco",referencedColumnName="id")
	private Endereco endereco;
	
	private String numero;
	
	//GET AND SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(Double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
