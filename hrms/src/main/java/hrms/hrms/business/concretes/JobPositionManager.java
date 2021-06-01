package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IJobPositionService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.IJobPositionDao;
import hrms.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements IJobPositionService {
	
	private IJobPositionDao iJobPositionDao;
	
	@Autowired
	public JobPositionManager (IJobPositionDao iJobPositionDao) {
		this.iJobPositionDao = iJobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<> (iJobPositionDao.findAll(),"Job positions listed.");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.iJobPositionDao.save(jobPosition);
		return new SuccessResult("New Job Position added.");
	}

}
