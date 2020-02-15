package com.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the payee_trf_details database table.
 * 
 */
@Entity
@Table(name="payee_trf_details")
@NamedQuery(name="PayeeTrfDetail.findAll", query="SELECT p FROM PayeeTrfDetail p")
public class PayeeTrfDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="payee_id")
	private String payeeId;

	private String accountNumber;

	@Column(name="cus_id")
	private BigInteger cusId;

	private String payeeAddress;

	private String payeebankName;

	private String payeeBranchName;

	private String payeeIfscCode;

	private String payeeName;

	public PayeeTrfDetail() {
	}

	public String getPayeeId() {
		return this.payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigInteger getCusId() {
		return this.cusId;
	}

	public void setCusId(BigInteger cusId) {
		this.cusId = cusId;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeebankName() {
		return this.payeebankName;
	}

	public void setPayeebankName(String payeebankName) {
		this.payeebankName = payeebankName;
	}

	public String getPayeeBranchName() {
		return this.payeeBranchName;
	}

	public void setPayeeBranchName(String payeeBranchName) {
		this.payeeBranchName = payeeBranchName;
	}

	public String getPayeeIfscCode() {
		return this.payeeIfscCode;
	}

	public void setPayeeIfscCode(String payeeIfscCode) {
		this.payeeIfscCode = payeeIfscCode;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

}