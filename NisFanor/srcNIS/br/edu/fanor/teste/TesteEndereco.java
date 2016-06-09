package br.edu.fanor.teste;

import javax.persistence.EntityManager;

import model.JPA.EntityManagerUtil;
import br.edu.fanor.model.entity.Endereco;

public class TesteEndereco {


	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		
		
		
		endereco.setBairro("antonio bezerra");
		endereco.setCep("60360-450");
		endereco.setCidade("fortaleza");
		endereco.setEstado("Ceara");
		endereco.setRua("Congo");
		endereco.setComplemento("casa");
		
		EntityManager em = EntityManagerUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(endereco);
		em.getTransaction().commit();
		
		
		System.out.println("certo");

	}

}
