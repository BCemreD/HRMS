package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IEmployeeService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	private IEmployeeService iEmployeeService;
	
	@Autowired
	public EmployeeController(IEmployeeService iEmployeeService) {
		this.iEmployeeService = iEmployeeService;
	}
	
	@GetMapping("/employees")
	public DataResult<List<Employee>> getAll(){
		return iEmployeeService.getAll();
	}
}
