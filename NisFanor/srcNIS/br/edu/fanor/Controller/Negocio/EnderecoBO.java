package br.edu.fanor.Controller.Negocio;

import java.io.Serializable;
import java.util.List;

import Util.UtilMensagem;
import br.edu.fanor.model.DAO.EnderecoDAO;
import br.edu.fanor.model.entity.Endereco;

@SuppressWarnings("serial")
public class EnderecoBO implements Serializable {

	private EnderecoDAO enderecoDAO;

	public EnderecoBO() {
		enderecoDAO = new EnderecoDAO();
	}

	public boolean salvar(Endereco endereco) {

		if (enderecoDAO.salvar(endereco)) {
			UtilMensagem.mensagemInformacao("Endereco salvo com sucesso");
			return true;
		} else {
			UtilMensagem.mensagemErro("Erro ao tentar salvar o endereco");
			return false;
		}
	}

	public void remover(Endereco endereco) {

		try {
			enderecoDAO.remover(endereco);
			UtilMensagem.mensagemInformacao("Removido com sucesso");
		} catch (Exception e) {
			UtilMensagem.mensagemErro("Erro ao tentar remover");
		}
	}

	public List<Endereco> listarTodos() {
		return enderecoDAO.listarTodos();
	}

	public Endereco buscarPorID(int id) {

		return enderecoDAO.buscarPorID(id);
	}

}
