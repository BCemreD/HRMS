package hrms.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobTitleService;
import hrms.hrms.dataAccess.abstracts.JobTitleDao;
import hrms.hrms.entities.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {
	
private JobTitleDao jobTitleDao;

@Autowired	
public JobTitleManager (JobTitleDao jobTitleDao) {
		this.jobTitleDao= jobTitleDao;
	}

@Override
public void save(JobTitle jobTitle) {
	
		this.jobTitleDao.save(jobTitle);	
	}


@Override
public Optional<JobTitle> findOneByTitle(String title) {
	
		return this.jobTitleDao.findOneByTitle(title);
	}

@Override
public List<JobTitle> findAll() {
		
		return this.jobTitleDao.findAll();
	}

}
