package br.edu.fanor.model.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.JPA.EntityManagerUtil;
import br.edu.fanor.model.entity.Endereco;

@SuppressWarnings("serial")
public class EnderecoDAO implements Serializable {

	private EntityManager em = EntityManagerUtil.getEntityManager();

	public boolean salvar(Endereco endereco) {

		em.getTransaction().begin();

		try {
				if (endereco == null)
					em.persist(endereco);
				else
					em.merge(endereco);

			em.getTransaction().commit();

			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			return false;
		}
	}

	public void remover(Endereco endereco) {
		em.getTransaction().begin();
		em.remove(endereco);
		em.getTransaction().commit();
	}

	public Endereco buscarPorID(int id) {

		return em.find(Endereco.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Endereco> listarTodos() {
		String hql = "from Endereco order by rua";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}
	
	public Endereco buscarPorCEP(String cep){
		String hql = "from Endereco where cep :=cep";
		
		Query query = em.createQuery(hql);
		query.setParameter("cep", cep);
		
		return (Endereco) query.getSingleResult();
	}

}
