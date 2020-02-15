package com.app.dao;

import java.util.List;
import java.util.Optional;

import com.app.model.Customerdetail;

public interface CustomerDao {

	public List<Customerdetail> getCustomerDetails();

	public Customerdetail saveCustomerDetails(Customerdetail customer);

	public Optional<Customerdetail> getCustmerDetailsById(Long id);

	public Long deleteCustomerById(Long id);
	
	public Customerdetail updateCustomerDetails(Customerdetail customer);

}
