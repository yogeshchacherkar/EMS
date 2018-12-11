package com.cg.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ems.entity.EmployeeBean;
import com.cg.ems.exception.ECMException;

public interface IEmployeeService {

	void addEmployee(EmployeeBean employee) throws ECMException;

	EmployeeBean getEmployee(int empId) throws ECMException;

	List<EmployeeBean> getAllEmployees();

	void updateEmployee(EmployeeBean employee) throws ECMException;

	void deleteEmployee(int empId) throws ECMException;

}
