package com.app.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customerdetails database table.
 * 
 */
@Entity
@Table(name="customerdetails")
@NamedQuery(name="Customerdetail.findAll", query="SELECT c FROM Customerdetail c")
public class Customerdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cftbhtm_seq")
    @SequenceGenerator(name = "cftbhtm_seq", sequenceName = "cftbhtm_seq")
	@Column(name="cus_id")
	private Long cusId;

	@Column(name="cus_address")
	private String cusAddress;

	@Column(name="cus_ref_no")
	private String cusRefNo;

	@Column(name="cus_remarks")
	private String cusRemarks;

	@Column(name="pin_code")
	private String pinCode;

	public Customerdetail() {
	}

	public Long getCusId() {
		return this.cusId;
	}

	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}

	public String getCusAddress() {
		return this.cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public String getCusRefNo() {
		return this.cusRefNo;
	}

	public void setCusRefNo(String cusRefNo) {
		this.cusRefNo = cusRefNo;
	}

	public String getCusRemarks() {
		return this.cusRemarks;
	}

	public void setCusRemarks(String cusRemarks) {
		this.cusRemarks = cusRemarks;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}