package e1_onetomany_hibernatee1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String bloodgroup;
	private String address;
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", bloodgroup=" + bloodgroup + ", address="
				+ address + "]";
	}
	public Student(String name, long phone, String bloodgroup, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.bloodgroup = bloodgroup;
		this.address = address;
	}
	public Student() {
		super();
	}

	
	
	
	
	
	

}
