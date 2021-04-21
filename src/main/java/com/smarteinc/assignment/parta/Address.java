package com.smarteinc.assignment.parta;

 
import javax.persistence.*;

@Entity
   public class Address {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO )
   private int id;
   @Column(name = "CITY")
   private String city;
   @Column(name = "STATE")
   private String state;
   @Column(name = "COUNTRY")
   private String country;
   @Column(name = "PINCODE")
   private String pinCode;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int id, String city, String state, String country, String pinCode) {
	super();
	this.id = id;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pinCode = pinCode;
}

   
}
