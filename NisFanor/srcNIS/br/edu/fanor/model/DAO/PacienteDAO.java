package br.edu.fanor.model.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.fanor.model.entity.Paciente;

@SuppressWarnings("serial")
public class PacienteDAO implements Serializable {
	private EntityManager em = model.JPA.EntityManagerUtil.getEntityManager();

	public boolean salvar(Paciente paciente) {

		em.getTransaction().begin();

		try {
			if (paciente == null)
				em.persist(paciente);
			else
				em.merge(paciente);

			em.getTransaction().commit();

			System.out.println();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			return false;
		}

	}

	public void remover(Paciente paciente) {

		em.getTransaction().begin();
		em.remove(paciente);
		em.getTransaction().commit();

	}

	public Paciente buscarPorID(Long id) {
		return em.find(Paciente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Paciente> listarTodos() {
		String hql = "from Paciente order by nome";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}

}
