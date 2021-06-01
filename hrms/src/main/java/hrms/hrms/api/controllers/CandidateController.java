package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.ICandidateService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	
	private ICandidateService iCandidateService;
	
	@Autowired
	public CandidateController(ICandidateService iCandidateService) {
		this.iCandidateService = iCandidateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return iCandidateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return iCandidateService.add(candidate);
	}
}
