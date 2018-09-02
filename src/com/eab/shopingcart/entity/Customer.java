package com.eab.shopingcart.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.javafx.beans.IDProperty;

@Entity
@Table(name="customer")
public class Customer {

	/*private String name;
	private String address;
	private double creditAmount;
	private String telephone;
	private String country;
	private String gender;
	private Map<String, String> countries;
	private List<String> operatingSystems;
	
	public Customer() {
		this.countries = new LinkedHashMap<>();
		this.operatingSystems = new ArrayList<>();
		countries.put("SL", "Sri Lanka");
		countries.put("JPN", "Japan");
		countries.put("IND", "India");
		
	}

	public Customer(String name, String address, double creditAmount, String telephone) {
		this.name = name;
		this.address = address;
		this.creditAmount = creditAmount;
		this.telephone = telephone;
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

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="telephone")
	private String telephone;
	
	

}
