package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_info")
public class Customer {
	
	@Id
	@Column(name="cust_id")
	private int code;
	
	@Column(name="cust_name", length=20, nullable=false)
	private String name;
	
	@Column(name="cust_address", length=40, nullable=true)
	private String address;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	
}
