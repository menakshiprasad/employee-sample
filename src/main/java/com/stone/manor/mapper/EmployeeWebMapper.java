package com.stone.manor.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stone.manor.controller.EmployeeController;
import com.stone.manor.data.Employee;

@RestController
@RequestMapping(value = "/employee")
@EnableWebMvc
public class EmployeeWebMapper {
	
	@Autowired
	private EmployeeController empController;

	@RequestMapping(value = "/id/{empId}", method = RequestMethod.GET)
	public ResponseEntity<String> getEmployee(@PathVariable("empId") String empId) {

		try {
			Employee emp = empController.getEmployee(empId);
			return ResponseEntity.status(HttpStatus.OK).body("Employee details in Infosys: " + emp);
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
		}
	}

	@RequestMapping(value = "/phone/id/{empId}", method = RequestMethod.GET)
	public ResponseEntity<String> getEmployeePhone(@PathVariable("empId") String empId) {

		try {
			Long phone = empController.getEmployeePhone(empId);
			return ResponseEntity.status(HttpStatus.OK)
					.body(String.format("Phone number of Employee [%s] is [%s]", empId, phone));
		} catch (Exception ex) {
			String errorMessage = "ERROR : " + ex;
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
		}
	}
}
