package com.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="account_id")
	private String accountId;

	@Column(name="accout_no")
	private String accoutNo;

	private double amount;

	@Column(name="cus_id")
	private BigInteger cusId;

	public Account() {
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccoutNo() {
		return this.accoutNo;
	}

	public void setAccoutNo(String accoutNo) {
		this.accoutNo = accoutNo;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigInteger getCusId() {
		return this.cusId;
	}

	public void setCusId(BigInteger cusId) {
		this.cusId = cusId;
	}

}