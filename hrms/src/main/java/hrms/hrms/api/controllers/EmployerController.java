package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IEmployerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private IEmployerService iEmployerService; 
	
	@Autowired
	public EmployerController (IEmployerService iEmployerService) {
		this.iEmployerService = iEmployerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return iEmployerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return iEmployerService.add(employer);
	}

}
