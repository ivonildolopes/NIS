package br.edu.fanor.teste;

import java.util.Date;

import br.edu.fanor.Controller.Negocio.PacienteBO;
import br.edu.fanor.model.entity.Paciente;

public class TestePaciente {


	public static void main(String[] args) {
		
		
				
		//EntityManager em = EntityManagerUtil.getEntityManager();
		
		Paciente p = new Paciente();
		
		p.setNome("cacayrton1010");
		p.setSexo("M");
		p.setCpf("055.122.152-55");
		p.setRg("21099010442998");
		p.setOrgaoEmissor("SSP-CE");
		p.setDataEmissao(new Date());
		p.setEscolaridade("Superior em Andamento");
		p.setProfissao("Analista de Sistema 1");
		p.setEstadoCivil("Solteiro");
		p.setDataNascimento(new Date());
		p.setRendaFamiliar(5500.0);
		p.setTelefone("(85) 3832-0027");
		p.setCelular("(85) 97412-9796");
		
		p.setNomeMae("Dona1 Maaria 1");
		p.setIdadeMae(50);
		p.setEscolaridadeMae("Medio completo 1");
		p.setProfissaoMae("Não informado");
		
		p.setNomePai("Sr. Joooão");
		p.setIdadePai(51);
		p.setEscolaridadePai("Fundamental Completo");
		p.setProfissaoPai("nao informado");
		
		
//		em.getTransaction().begin();
//		em.persist(p);
//		em.getTransaction().commit();
//		System.out.println("Paciente criado com sucesso");
//		
//		PacienteDAO pd = new PacienteDAO();
//		if(pd.salvar(p))
//			System.out.println("certo mano");
//		else
//			System.out.println("erro mano");
		
		PacienteBO pb = new PacienteBO();
		if(pb.salvar(p))
			System.out.println("certo mano");
		else
			System.out.println("erro mano");
		
//		PacienteControle pc = new PacienteControle();
//		pc.salvar();
//		System.out.println("\0/");
	}

}
