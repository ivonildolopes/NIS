package br.edu.fanor.Controller.Negocio;

import java.io.Serializable;
import java.util.List;

import Util.UtilMensagem;
import br.edu.fanor.model.DAO.PacienteDAO;
import br.edu.fanor.model.entity.Paciente;

@SuppressWarnings("serial")
public class PacienteBO implements Serializable {

	private PacienteDAO pacienteDAO;

	public PacienteBO() {
		pacienteDAO = new PacienteDAO();
	}

	public boolean salvar(Paciente paciente) {

		if (pacienteDAO.salvar(paciente)) {
			UtilMensagem.mensagemInformacao("Paciente salvo com sucesso");
			return true;
		} else {
			UtilMensagem.mensagemErro("Erro ao tentar salvar o paciente");
			return false;
		}
	}

	public void remover(Paciente paciente) {

		try {
			pacienteDAO.remover(paciente);
			UtilMensagem.mensagemInformacao("Removido com sucesso");
		} catch (Exception e) {
			UtilMensagem.mensagemErro("Erro ao tentar remover");
		}
	}

	public List<Paciente> listarTodos() {
		return pacienteDAO.listarTodos();
	}

	public Paciente buscarPorID(Long id) {

		return pacienteDAO.buscarPorID(id);
	}
}
