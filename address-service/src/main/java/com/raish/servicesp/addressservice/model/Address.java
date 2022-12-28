package com.raish.servicesp.addressservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String line1;
	private String line2;
	private long zip;
	private String state;
	
	
	public Address(int id, String line1, String line2, long zip, String state) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.zip = zip;
		this.state = state;
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}


	/**
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}


	/**
	 * @return the line2
	 */
	public String getLine2() {
		return line2;
	}


	/**
	 * @param line2 the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}


	/**
	 * @return the zip
	 */
	public long getZip() {
		return zip;
	}


	/**
	 * @param zip the zip to set
	 */
	public void setZip(long zip) {
		this.zip = zip;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", zip=" + zip + ", state=" + state
				+ "]";
	}
	
	
	
	
}
