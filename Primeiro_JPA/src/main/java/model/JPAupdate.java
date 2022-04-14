package model;

import javax.persistence.EntityManager;

import utils.JPAutil;

public class JPAupdate {

	public static void main(String[] args) {
		EntityManager manager = JPAutil.getEntityManager();
		Aluno a = manager.find(Aluno.class, 1L);
		
		a.setBairro("Bairro dos Cornos");
		manager.persist(a);	
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
	}

}
