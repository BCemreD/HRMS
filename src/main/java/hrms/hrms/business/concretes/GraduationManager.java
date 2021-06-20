package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IGraduationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.IGraduationDao;
import hrms.hrms.entities.concretes.Graduate;

@Service
public class GraduationManager implements IGraduationService {

	@Autowired
	private IGraduationDao iGraduationDao;
	@Override
	public DataResult<List<Graduate>> getAll() {
		return new SuccessDataResult<>(this.iGraduationDao.findAll());
	}

	@Override
	public Result add(Graduate graduate) {
		this.iGraduationDao.save(graduate);
		return new SuccessDataResult("Graduation added.");
	}

}
