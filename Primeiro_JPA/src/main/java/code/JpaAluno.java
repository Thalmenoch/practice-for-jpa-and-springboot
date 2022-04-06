package code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaAluno {
	
	public static void main (String args[]) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Practice_for_TJW");
		
		EntityManager manager = factory.createEntityManager();
		
		//representa uma conexão com a unidade de persistência
		
		//manager.getTransation().begin();
		//manager.getTransaction().commit();
		//manager.close();
		//factory.close();
	}
}
