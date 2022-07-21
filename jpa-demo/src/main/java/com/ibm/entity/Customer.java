package com.ibm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name="cust_id")
	private int custId;
	@Column(name="cname")
	private String custName;
	@Column(name="cr_limit")
	private int creditlimit;
	public Customer() {
	}
	public Customer(int custId, String custName, double creditlimit)
	{
		this.custId=custId;
		this.custName=custName;
		this.creditlimit=(int) creditlimit;
	}
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * 
@Param
 custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * 
@Param
 custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the creditlimit
	 */
	public int getCreditlimit() {
		return creditlimit;
	}
	/**
	 * 
@Param
 creditlimit the creditlimit to set
	 */
	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}
	
}