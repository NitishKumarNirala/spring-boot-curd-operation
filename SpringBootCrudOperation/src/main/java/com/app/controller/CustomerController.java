package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Customerdetail;
import com.app.service.CustomerService;
import com.app.utils.ReferennceGeneration;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private static final Log LOG = LogFactory.getLog(CustomerController.class);

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String swagger() {
		return  "redirect:/swagger-ui.html";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomeUrl() {
		return "home";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addEmployeePageRedirect(String add) {
		add = "addEmployee";
		return add;

	}

	@ResponseBody
	@RequestMapping(value = "/getCustomerAllDetails", method = RequestMethod.POST)
	public void saveCustomer(@RequestBody Customerdetail customer) {
		customer.setCusRefNo(ReferennceGeneration.getCurrentDateTimeMS());
		Customerdetail cust = customerService.saveCustomerDetails(customer);
		LOG.debug("Customer Details Records:::::::::::::::::::" + cust);

	}

	@RequestMapping(value = "/saveEmployee", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView saveCustomerData(@ModelAttribute("customerView") Customerdetail customer) {
		customer.setCusRefNo(ReferennceGeneration.getCurrentDateTimeMS());
		Customerdetail cust = customerService.saveCustomerDetails(customer);
		LOG.debug("Customer Details Records:::::::::::::::::::" + cust);
		return new ModelAndView("redirect:/customer/home");

	}

	@ResponseBody
	@GetMapping(value = "/getCustomerAllDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customerdetail> getAllCustCustomerDetails() {
		List<Customerdetail> listOfCustomer = customerService.getCustomerDetails();
		LOG.info("List Of Customer Details:::::::::::" + listOfCustomer.size());
		return listOfCustomer;
	}

	@RequestMapping(value = { "/getCustomer" }, method = RequestMethod.GET)
	public ModelAndView listCustomer() {
		List<Customerdetail> list = customerService.getCustomerDetails();
		return new ModelAndView("listEmployee", "list", list);
	}

	@ResponseBody
	@GetMapping(value = "/getCustomerById/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	public Optional<Customerdetail> getCustomerDetailsById(@PathVariable Long id) {
		LOG.info("Customer Id::::::" + id);
		Optional<Customerdetail> detailsById = customerService.getCustmerDetailsById(id);
		LOG.info("getCustomerDetailsById::::::::::" + detailsById.get());
		return detailsById;

	}

	@ResponseBody
	@DeleteMapping(value = "/deleteCustmerById/{id}")
	public void deleteCustomerById(@PathVariable Long id) {

		LOG.info("Customer Id for Delete  Purpose::::::::" + id);
		Long deletedId = customerService.deleteCustomerById(id);
		LOG.info("Customer Id after  Deleted::::::::" + deletedId);

	}

}
