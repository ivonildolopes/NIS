package br.edu.fanor.view.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Util.Datas;
import br.edu.fanor.Controller.Converter.ConverteEndereco;
import br.edu.fanor.Controller.Negocio.EnderecoBO;
import br.edu.fanor.Controller.Negocio.PacienteBO;
import br.edu.fanor.model.entity.Endereco;
import br.edu.fanor.model.entity.Paciente;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class PacienteControle implements Serializable {
	private Datas datas = new Datas();
	
	
	private static final String LIST_PACIENTE = "LIST_PACIENTE.xhtml";
	private static final String LIST_PACIENTE_ = "LIST_PACIENTE.xhtml?faces-redirect=true";
	private static final String FORM_PACIENTE = "FORM_PACIENTE.xhtml";
	private Paciente paciente;
	
	

	private PacienteBO pacienteBO;
	private EnderecoBO enderecoBO;
	private ConverteEndereco converteEndereco;
	
	//listas
	private List<Paciente> listaPaciente = new ArrayList<>();
	private List<Endereco> listaEnderecos = new ArrayList<>();

	public PacienteControle() {
		paciente = new Paciente();
		pacienteBO = new PacienteBO();
		enderecoBO = new EnderecoBO();
		
		converteEndereco = new ConverteEndereco();
		
		listaPaciente = pacienteBO.listarTodos();
		listaEnderecos = enderecoBO.listarTodos();
	}
	
	public ConverteEndereco getConverteEndereco() {
		return converteEndereco;
	}

	public void setConverteEndereco(ConverteEndereco converteEndereco) {
		this.converteEndereco = converteEndereco;
	}

	public EnderecoBO getEnderecoBO() {
		return enderecoBO;
	}

	public void setEnderecoBO(EnderecoBO enderecoBO) {
		this.enderecoBO = enderecoBO;
	}

	public List<Endereco> getListaEnderecos() {
		return listaEnderecos;
	}

	public void setListaEnderecos(List<Endereco> listaEnderecos) {
		this.listaEnderecos = listaEnderecos;
	}

	public String novo(){
		paciente = new Paciente();
		return FORM_PACIENTE;
	}
	
	public String salvar(){
		if(pacienteBO.salvar(paciente))
			return LIST_PACIENTE;
		else
			return FORM_PACIENTE;
	}
	

	
	public String cancelar(){
		return LIST_PACIENTE_;
	}
	public void listarTodos(){
		listaPaciente = pacienteBO.listarTodos();
	}
	
	public String alterar(Paciente paciente){
		this.paciente = paciente;
		return FORM_PACIENTE;
	}
	
	public String remover(Paciente paciente){
		pacienteBO.remover(paciente);
		listarTodos(); 
		return LIST_PACIENTE;
	}
	
	
	public int calculaIdade(Paciente paciente){	
		int idade = datas.calculaIdade(paciente.getDataNascimento());
		return idade;
	}
	
	
	public List<Endereco> completeTheme(String query) {
        List<Endereco> allThemes = enderecoBO.listarTodos();
        List<Endereco> filteredThemes = new ArrayList<Endereco>();
         
        for (int i = 0; i < allThemes.size(); i++) {
            Endereco skin = allThemes.get(i);
//            if(skin.getRua().startsWith(query)) {
//                filteredThemes.add(skin);
//            }else if(skin.getRua().toLowerCase().startsWith(query)) {
//                filteredThemes.add(skin);
//            }      
            
            if(skin.getRua().contains(query)) {
                filteredThemes.add(skin);
            }else if(skin.getRua().toLowerCase().contains(query)) {
                filteredThemes.add(skin);
            }else if(skin.getRua().toUpperCase().contains(query)) {
                filteredThemes.add(skin);
            }
        }
         
        return filteredThemes;
    }
	
	//get and set
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public PacienteBO getPacienteBO() {
		return pacienteBO;
	}

	public void setPacienteBO(PacienteBO pacienteBO) {
		this.pacienteBO = pacienteBO;
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}



}
