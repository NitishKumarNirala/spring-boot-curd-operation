package com.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.model.Customerdetail;
import com.app.service.CustomerService;
/**
 * 
 * @author nitish
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private static final Log LOG=LogFactory.getLog(CustomerServiceImpl.class);

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customerdetail> getCustomerDetails() {
		LOG.info("getCustomerDetails():::::::::::::::::::");
		return this.customerDao.getCustomerDetails();
	}

	@Override
	public Customerdetail saveCustomerDetails(Customerdetail customer) {
		LOG.info("saveCustomerDetails():::::::::::::::::::");
		return this.customerDao.saveCustomerDetails(customer);
	}

	@Override
	public Optional<Customerdetail> getCustmerDetailsById(Long id) {
		LOG.info("getCustmerDetailsById():::::::::::::::::::");
		return this.customerDao.getCustmerDetailsById(id);
	}

	@Override
	public Long deleteCustomerById(Long id) {
		LOG.info("deleteCustomerById():::::::::::::::::::");
		return this.customerDao.deleteCustomerById(id);
	}

	@Override
	public Customerdetail updateCustomerDetails(Customerdetail customer) {
		LOG.info("updateCustomerDetails():::::::::::::::::::");
		return this.customerDao.updateCustomerDetails(customer);
	}

	

}
