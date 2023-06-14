package e1_onetomany_hibernatee1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_onetomany_hibernatee1.dto.School;

public class SchoolCrud {
	
	
	public EntityManager getmanager() {
		
//	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
//		EntityManager manager = factory.createEntityManager();
//		return manager;
		return Persistence.createEntityManagerFactory("Lavanya").createEntityManager();
	}
	
	
	           
	public void saveSchool(School school) {
		EntityManager manager=getmanager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(school);
		transaction.commit();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
