package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oid;
	
	String oname;
	String type;
	String topping;
	String addon;
	String size;
	int oprice;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getAddon() {
		return addon;
	}
	public void setAddon(String addon) {
		this.addon = addon;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", oname=" + oname + ", type=" + type + ", topping=" + topping + ", addon="
				+ addon + ", size=" + size + ", oprice=" + oprice + "]";
	}
	public Orders(int oid, String oname, String type, String topping, String addon, String size, int oprice) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.type = type;
		this.topping = topping;
		this.addon = addon;
		this.size = size;
		this.oprice = oprice;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
