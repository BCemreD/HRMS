package hrms.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IEducationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Education;

@CrossOrigin
@RestController
@RequestMapping("/api/educations")
public class EducationController {

	@Autowired
	private IEducationService iEducationService;
	
	@GetMapping("/getAll")
	DataResult<List<Education>>getAll(){
	return this.iEducationService.getAll();
	}
	
	@GetMapping("/getAllByCvIdOrderByEndedDateDesc")
	DataResult<List<Education>>getAllByCvIdOrderByEndedDateDesc(int cvId){
		return this.iEducationService.getAllByResumeIdOrderByEndedDateDesc(cvId);
	}
	
	@PostMapping("/save")
	Result add(@Valid @RequestBody Education education) {
		return this.iEducationService.add(education);
	}
}
