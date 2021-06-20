package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.hrms.business.abstracts.IEducationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.IEducationDao;
import hrms.hrms.entities.concretes.Education;

public class EducationManager implements IEducationService {
	
	@Autowired
	private IEducationDao iEducationDao;

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<>(this.iEducationDao.findAll());
	}

	@Override
	public DataResult<List<Education>> getAllByResumeIdOrderByEndedDateDesc(int cvId) {
		return new SuccessDataResult<>(this.iEducationDao.getAllByCvIdOrderByEndedDateDesc(cvId)
	);}

	@Override
	public Result add(Education education) {
		this.iEducationDao.save(education);
		return new SuccessResult();
	}

}
