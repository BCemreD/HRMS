package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobPosition;

public interface IJobPositionService {

	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
