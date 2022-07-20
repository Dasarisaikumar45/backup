package com.ibm.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "flights")
public class Flight {
	@Id
	private int  code;
	@Column(length = 15)
	private String carrier;
	@Column(length = 15)
	private String source;
	@Column(length=15)
	private String destination;
	
	public int getCode() {
		return code;
	}
	
	public void setcode(int code) {
		this.code = code;
	}

	public String getCarrier() {
		return carrier;
	}
	public void getCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSource() {
		return source;
	}
	public void getSource(String Source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void getDestination(String destination) {
		this.destination = destination;
	}


}