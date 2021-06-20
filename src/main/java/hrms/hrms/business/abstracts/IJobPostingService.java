package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobPosting;

public interface IJobPostingService {

	DataResult<List<JobPosting>> getAll();
	DataResult<List<JobPosting>> getAllSorted();
	DataResult<List<JobPosting>> getAllByCompanyId(int id);
	DataResult<List<JobPosting>> getAllByCompanyName(String companyName);
	
	Result setValueOfActive(int id, boolean active);
	
	Result add(JobPosting jobPosting);
}
