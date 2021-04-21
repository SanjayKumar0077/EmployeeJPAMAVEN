package com.smarteinc.assignment.parta;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private int age;
	private double ctc;
	private boolean  active;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Department department;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Address address;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, String password, int age, double ctc, boolean active, Department department,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.ctc = ctc;
		this.active = active;
		this.department = department;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", ctc=" + ctc
				+ ", active=" + active + ", department=" + department + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

 
}
