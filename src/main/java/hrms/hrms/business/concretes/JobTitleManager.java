package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobTitleService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.RunRules;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobTitleDao;
import hrms.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
private JobTitleDao jobTitleDao;

@Autowired	
public JobTitleManager (JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao= jobTitleDao;
	}

@Override
public DataResult<List<JobTitle>> getAll() {
	return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Job title listed"); }

@Override
public Result add(JobTitle jobTitle) {
	 Result result= RunRules.run(nullControl(jobTitle),titleRepeatControl(jobTitle));
    
	 if(result.isSuccess()){
         this.jobTitleDao.save(jobTitle);
	return new SuccessResult(jobTitle.getTitle() + " "+" added..");
    }
return result;
}
private Result nullControl(JobTitle jobTitle) {
    if(jobTitle.getTitle()==null || jobTitle.getTitle().isBlank()) {
        return new ErrorResult("Cannot be null!");
    }
    return new SuccessResult();
}

private Result titleRepeatControl(JobTitle jobTitle) {
    if((long) jobTitleDao.findAllByJobTitle(jobTitle.getTitle()).size() !=0 ) {
        return new ErrorResult("This position is already existed!");
    }
    return new SuccessResult();
}
}
