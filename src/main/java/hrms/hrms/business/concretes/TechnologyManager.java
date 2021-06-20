package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.hrms.business.abstracts.ITechnologyService;
import hrms.hrms.core.entities.Technology;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.ITechnologyDao;

public class TechnologyManager implements ITechnologyService{

	@Autowired
	private ITechnologyDao iTechnologyDao;
	
	@Override
	public DataResult<List<Technology>> getAllByCvId(int cvId) {
		return new SuccessDataResult<>(this.iTechnologyDao.getAllByCvId(cvId));
	}

	@Override
	public Result add(Technology technology) {
		this.iTechnologyDao.save(technology);
		return new SuccessResult()
;	}

}
