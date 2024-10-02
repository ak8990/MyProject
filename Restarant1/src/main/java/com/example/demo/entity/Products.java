package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oid;
	
	String name;
	int prise;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Products [oid=" + oid + ", name=" + name + ", prise=" + prise + "]";
	}
	public Products(int oid, String name, int prise) {
		super();
		this.oid = oid;
		this.name = name;
		this.prise = prise;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
