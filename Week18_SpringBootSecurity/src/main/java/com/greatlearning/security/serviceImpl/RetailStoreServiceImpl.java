package com.greatlearning.security.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.security.entity.InventoryDetails;
import com.greatlearning.security.entity.YearlyFinancialReport;
import com.greatlearning.security.repository.EmployeeRepository;
import com.greatlearning.security.repository.InventoryDetailsRepository;
import com.greatlearning.security.repository.YearlyFinancialReportRepository;
import com.greatlearning.security.service.RetailStoreServiceInterface;

import lombok.extern.slf4j.Slf4j;

@Service //equivalent to calling methods present here to the place where object of this class has been created
@Slf4j //for adding logging information
public class RetailStoreServiceImpl implements RetailStoreServiceInterface {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	InventoryDetailsRepository inventoryDetailsRepository;
	
	@Autowired
	YearlyFinancialReportRepository yearlyFinancialReportRepository;
	
	@Override
	public boolean checkInventoryExist(int id) {
		return inventoryDetailsRepository.existsById(id);
	}

	@Override
	public List<InventoryDetails> viewInventory() {
		return inventoryDetailsRepository.findAll();
	}

	@Override
	public String makeAnnouncement(String discount) {
		return discount+"% off";
	}

	@Override
	public List<YearlyFinancialReport> viewFinancials() {
		return yearlyFinancialReportRepository.findAll();
	}

	@Override
	public String doCheckout() {
		return "fake checkout";
	}
}
