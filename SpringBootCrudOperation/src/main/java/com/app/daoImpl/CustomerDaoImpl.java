package com.app.daoImpl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.CustomerDao;
import com.app.model.Customerdetail;
import com.app.repository.CustomerRepository;

@Component
public class CustomerDaoImpl implements CustomerDao{
	
	private static final Log LOG=LogFactory.getLog(CustomerDaoImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customerdetail> getCustomerDetails() {
		List<Customerdetail>listOfCustomerDetails=customerRepository.findAll();
		LOG.info("list of customer details::::::::::::"+listOfCustomerDetails.size());
		return listOfCustomerDetails;
	}

	@Override
	public Customerdetail saveCustomerDetails(Customerdetail customer) {
		
		Customerdetail details=customerRepository.saveAndFlush(customer);
		LOG.info("customer save Object:::::::::::::::::::::"+details);
		return details;
	}

	@Override
	public Optional<Customerdetail> getCustmerDetailsById(Long id) {
		LOG.info("getCustmerDetailsById::::::::::::::[Enter in this Method]");
		Optional<Customerdetail> list=customerRepository.findById(id);
		return list;
	}

	@Override
	public Long deleteCustomerById(Long id) {
		LOG.info("deleteCustomerById::::::::::::::[Enter in this Method]");
		if (id > 0) {

			customerRepository.deleteById(id);
		}
		else {
			id=0l;
		}
		return id;
	}

	@Override
	public Customerdetail updateCustomerDetails(Customerdetail customer) {
		// TODO Auto-generated method stub
		return null;
	}


}
