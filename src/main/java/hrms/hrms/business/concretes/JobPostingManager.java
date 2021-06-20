package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IJobPostingService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.IJobPostingDao;
import hrms.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements IJobPostingService {

	@Autowired
	private IJobPostingDao iJobPostingDao;
	
	@Override
	public DataResult<List<JobPosting>> getAll() {
	return new SuccessDataResult<List<JobPosting>>(this.iJobPostingDao.getAllByActiveTrue());}

	@Override
	public DataResult<List<JobPosting>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "createdAt");
		return new SuccessDataResult<List<JobPosting>>(this.iJobPostingDao.getAllByActiveTrue(sort));
	}

	@Override
	public DataResult<List<JobPosting>> getAllByCompanyId(int id) {
		return new SuccessDataResult<List<JobPosting>>(this.iJobPostingDao.getAllByCompanyId(id));
	}

	@Override
	public DataResult<List<JobPosting>> getAllByCompanyName(String companyName) {
		return new SuccessDataResult<List<JobPosting>>(this.iJobPostingDao.getByCompany_CompanyNameContainsIgnoreCase(companyName));
	}

	@Override
	public Result setValueOfActive(int id, boolean active) {
	   JobPosting tempJobPosting = this.iJobPostingDao.findById(id).orElse(null);
	    tempJobPosting.setActive(active);
	    this.iJobPostingDao.save(tempJobPosting);
	    return new SuccessResult("Uploaded");
	}

	@Override
	public Result add(JobPosting jobPosting) {
		this.iJobPostingDao.save(jobPosting);
		return new SuccessResult();
	}

}
