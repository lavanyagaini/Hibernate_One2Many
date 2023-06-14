package e1_onetomany_hibernatee1.controller;

import java.util.ArrayList;
import java.util.List;

import e1_onetomany_hibernatee1.dao.SchoolCrud;
import e1_onetomany_hibernatee1.dao.StudentCrud;
import e1_onetomany_hibernatee1.dto.School;
import e1_onetomany_hibernatee1.dto.Student;

public class SchoolStudentMain {

	public static void main(String[] args) {
		
		
		StudentCrud crud=new StudentCrud();
		
		SchoolCrud crud2=new SchoolCrud();
//		 
		 Student  s1=new Student();
		 s1.setName("raju");
		 s1.setPhone(23456789);
		 s1.setAddress("BLR");
		 s1.setBloodgroup("B+");
		 
		 Student s2=new Student("babu", 345678, "o+", "pune");
		 
		 Student s3=new Student("saan", 345678, "O+", "manglore");
		   
		 List<Student>list=new ArrayList<Student>();
		 list.add(s1);
		 list.add(s2);
		 list.add(s3);
		 
//		 
		School school=new School("BRHS", "chittoor",list);
//		   
//		   
		   crud2.saveSchool(school);
		 
		

		//student save
		 
//	 Student s3=new Student("saan", 345678, "O+", "manglore");
//	 
//     crud.saveStudent(s3, 2);
		 
		 
	

	}

}
