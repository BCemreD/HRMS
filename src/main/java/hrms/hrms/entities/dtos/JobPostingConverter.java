package hrms.hrms.entities.dtos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import hrms.hrms.entities.concretes.City;
import hrms.hrms.entities.concretes.Company;
import hrms.hrms.entities.concretes.JobPosting;
import hrms.hrms.entities.concretes.JobTitle;

@Component
public class JobPostingConverter {

	
	public JobPostingGetDto entityToDto(JobPosting jobposting){
		JobPostingGetDto dto = new JobPostingGetDto();
		dto.setCompanyName(jobposting.getCompany().getCompanyName());
		dto.setJobTitle(jobposting.getJobTitle().getTitle());
		dto.setNumberOfOpenPosition(jobposting.getNumberOfOpenPosition());
		dto.setCreatedAt(jobposting.getCreatedAt());
		dto.setExpirationDate(jobposting.getExpirationDate());
		return dto;
	}
	
	public JobPosting dtoToEntity(JobPostingSetDto dto) {
		JobPosting jobPosting = new JobPosting();
		jobPosting.setMaxSalary(dto.getMaxSalary());
		jobPosting.setMinSalary(dto.getMinSalary());
		jobPosting.setNumberOfOpenPosition(dto.getNumberOfOpenPosition());
		jobPosting.setJobDefinition(dto.getJobDefinition());
		jobPosting.setExpirationDate(dto.getExpirationDate());
		
		JobTitle jobTitle = new JobTitle();
		jobTitle.setId(dto.getJobTitleId());
        jobPosting.setJobTitle(jobTitle);
        
        City city = new City();
        city.setId(dto.getCityId());
        jobPosting.setCity(city);
        
        Company company = new Company();
        company.setId(dto.getCompanyId());
        jobPosting.setCompany(company);
        jobPosting.setActive(dto.isActive());
        
		return jobPosting;
		
	}
	public List<JobPostingGetDto> entityToDto(List<JobPosting>jobPosting){
	return jobPosting.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
}
