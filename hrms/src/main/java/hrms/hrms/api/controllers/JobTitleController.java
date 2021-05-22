package hrms.hrms.api.controllers;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobTitleService;
import hrms.hrms.entities.concretes.JobTitle;



@RestController
@RequestMapping(path = "api/job-titles")

public class JobTitleController {
	
private final JobTitleService jobTitleService;
    
public JobTitleController(JobTitleService jobTitleService) {
    	this.jobTitleService = jobTitleService;
    }
    
@GetMapping(path="getall")
public List<JobTitle>getAll(){
	return this.jobTitleService.findAll();
}

}
