package model;

import javax.persistence.EntityManager;

import utils.JPAutil;

public class JPAremove {
	public static void main (String args[]) {
		EntityManager manager = JPAutil.getEntityManager();
		
		//Aluno a = manager.getReference(Aluno.class, 3L);
		Aluno a = manager.find(Aluno.class, 2L);
		
		manager.remove(a);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
	}
}
