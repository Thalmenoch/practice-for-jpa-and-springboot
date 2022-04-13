package code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class JpaAluno {
	
	public static void main (String args[]) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Practice_for_TJW");
		
		EntityManager manager = factory.createEntityManager();
		
		//representa uma conexão com a unidade de persistência
		
		manager.getTransaction().begin();
		
		Aluno a = new Aluno();
		a.setNome("Luciano Ramos Costa");
		a.setRG("222222222222");
		a.setCPF("123-145-456-65");
		a.setCep("1515-132");
		a.setCidade("Middletown");
		a.setEndereco("AV.I");
		a.setBairro("JW");
		
		manager.persist(a);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
