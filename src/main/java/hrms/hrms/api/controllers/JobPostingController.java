package hrms.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IJobPostingService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.entities.concretes.JobPosting;
import hrms.hrms.entities.dtos.JobPostingConverter;
import hrms.hrms.entities.dtos.JobPostingGetDto;
import hrms.hrms.entities.dtos.JobPostingSetDto;

@CrossOrigin
@RestController
@RequestMapping("api/jobPostings")
public class JobPostingController {

	@Autowired 
	private IJobPostingService iJobPostingService;
	@Autowired 
	private JobPostingConverter jobPostingConverter;
	

    @GetMapping("/getAll")
    DataResult<List<JobPostingGetDto>> getAll(){
    DataResult<List<JobPosting>> jobPostings = this.iJobPostingService.getAll();
      List<JobPostingGetDto> jobPostingGetDtos = jobPostingConverter.entityToDto(jobPostings.getData());
       return new SuccessDataResult(jobPostingGetDtos);
    }
	
	@GetMapping("/getAllSorted")
	DataResult<List<JobPosting>>getAllSorted(){
		return this.iJobPostingService.getAllSorted();
		}
	
	
	@PostMapping("/save")
	Result add(@Valid @RequestBody JobPostingSetDto jobPostingSetDto) {
		return this.iJobPostingService.add(this.jobPostingConverter.dtoToEntity(jobPostingSetDto));
	}
	
	@PostMapping("/getAllByCompanyId")
	DataResult<List<JobPosting>>getAllByCompanyId(@RequestParam int id){
		return this.iJobPostingService.getAllByCompanyId(id);
		
	}
	
	@PostMapping("/getAllByCompanyName")
	DataResult<List<JobPosting>>getAllByCompanyName(@RequestParam String companyName){
		return this.iJobPostingService.getAllByCompanyName(companyName);
	}
	
	@PostMapping("/setValueOfActive")
	Result setValueOfActive(@RequestParam("id") int id, @RequestParam("active")boolean active){
		return this.iJobPostingService.setValueOfActive(id, active);
	}
}


