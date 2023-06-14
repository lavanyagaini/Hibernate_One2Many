package e1_onetomany_hibernatee1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_onetomany_hibernatee1.dto.School;
import e1_onetomany_hibernatee1.dto.Student;

public class StudentCrud {

	
	public EntityManager getmanager() {
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
//			EntityManager manager = factory.createEntityManager();
//			return manager;
			return Persistence.createEntityManagerFactory("Lavanya").createEntityManager();
		}
		
		
		           
		public void saveStudent(Student student,int id) {
			EntityManager manager=getmanager();
			School school=manager.find(School.class, id);
			if(school!=null) {
				
				List<Student>list=new ArrayList<Student>();
				list.add(student);
			    list.addAll(school.getStudents());
				school.setStudents(list);
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(school);
			transaction.commit();
			}
			else
				System.out.println("school is not present to save the student");
			
		}
	
	
	
}
