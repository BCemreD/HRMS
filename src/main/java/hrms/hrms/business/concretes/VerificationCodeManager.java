package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IVerificationCodeService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.IVerificationCodeDao;
import hrms.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements IVerificationCodeService{

	@Autowired
	private IVerificationCodeDao iVerificationCodeDao;
	
	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult(this.iVerificationCodeDao.findAll());
	}

	@Override
	public Result add(VerificationCode verificationCode) {
		this.iVerificationCodeDao.save(verificationCode);
		return new SuccessResult();
	}

}
