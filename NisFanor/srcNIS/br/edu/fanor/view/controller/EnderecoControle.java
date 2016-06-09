package br.edu.fanor.view.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.fanor.Controller.Negocio.EnderecoBO;
import br.edu.fanor.model.entity.Endereco;


@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class EnderecoControle implements Serializable {
	
	
	private static final String LIST= "LIST_ENDERECO.xhtml";
	private static final String LIST_ = "LIST_ENDERECO.xhtml?faces-redirect=true";
	private static final String FORM = "FORM_ENDERECO.xhtml";
	private Endereco endereco;
	
	private List<Endereco> listaEndereco = new ArrayList<>();;

	private EnderecoBO enderecoBO;

	public EnderecoControle() {
		endereco = new Endereco();
		enderecoBO = new EnderecoBO();
		listaEndereco = enderecoBO.listarTodos();
	}
	
	public String novo(){
		endereco = new Endereco();
		return FORM;
	}
	
	public String salvar(){
		if(enderecoBO.salvar(endereco))
			return FORM;
		else
			return FORM;
	}
	

	
	public String cancelar(){
		return LIST_;
	}
	public void listarTodos(){
		listaEndereco = enderecoBO.listarTodos();
	}
	
	public String alterar(Endereco endereco){
		this.endereco = endereco;
		return FORM;
	}
	
	public String remover(Endereco endereco){
		enderecoBO.remover(endereco);
		listarTodos(); 
		return LIST;
	}
	
	//get and set

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

	public EnderecoBO getEnderecoBO() {
		return enderecoBO;
	}

	public void setEnderecoBO(EnderecoBO enderecoBO) {
		this.enderecoBO = enderecoBO;
	}
	
	
	
	
	
	



}
