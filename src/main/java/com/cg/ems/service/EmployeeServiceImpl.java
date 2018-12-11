package com.cg.ems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.cg.ems.dao.IEmployeeRepository;
import com.cg.ems.entity.EmployeeBean;
import com.cg.ems.exception.ECMException;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {
		System.out.println("SERVICE IMPL");
	}

	// Add Employee
	@Transactional
	@Override
	public void addEmployee(EmployeeBean employee) throws ECMException {
		if(employee==null)
			employeeRepository.save(employee);
		else {
			throw new ECMException("Employee already exists");	
		}
	}

	// Get Employee
	@Override
	public EmployeeBean getEmployee(int empId) throws ECMException {
		EmployeeBean employee = employeeRepository.findById(empId).get();
		if(employee==null)
			throw new ECMException("No value present");
		return employee;
	}

	// GetAll Employee
	@Override
	public List<EmployeeBean> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	// Update Employee
	@Transactional
	@Override
	public void updateEmployee(EmployeeBean employee) throws ECMException {
		if(employee!=null)
		employeeRepository.save(employee);
		else
			throw new ECMException("No value present");
	}

	// Delete Employee
	@Transactional
	@Override
	public void deleteEmployee(int empId) throws ECMException {
		EmployeeBean employee = employeeRepository.findById(empId).get();
		if(employee==null)
			throw new ECMException("No value present");
		employeeRepository.delete(employee);
	}
}
