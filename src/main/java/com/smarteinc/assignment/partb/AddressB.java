package com.smarteinc.assignment.partb;

 

public class AddressB {
	private int addressID;

	private String city;

	private String state;

	private String country;

	private String pinCode;

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
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

	public AddressB(int addressID, String city, String state, String country, String pinCode) {
		super();
		this.addressID = addressID;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public AddressB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AddressB [addressID=" + addressID + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pinCode=" + pinCode + "]";
	}

	 
}
