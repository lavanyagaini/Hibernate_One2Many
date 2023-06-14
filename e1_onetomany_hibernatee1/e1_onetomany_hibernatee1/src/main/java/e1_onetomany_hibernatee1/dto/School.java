package e1_onetomany_hibernatee1.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Student>students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", address=" + address + ", students=" + students + "]";
	}

	public School(String name, String address, List<Student> students) {
		super();
		this.name = name;
		this.address = address;
		this.students = students;
	}

	public School() {
		super();
	}
	
	
	
	
	

}
