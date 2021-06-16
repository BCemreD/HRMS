package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IJobPositionService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {
	
	private IJobPositionService iJobPositionService;
	
	@Autowired
	public JobPositionController (IJobPositionService iJobPositionService) {
		this.iJobPositionService = iJobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return iJobPositionService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.iJobPositionService.add(jobPosition);
	}
}
