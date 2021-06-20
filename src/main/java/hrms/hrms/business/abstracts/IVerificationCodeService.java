package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.VerificationCode;
public interface IVerificationCodeService {
 
	DataResult<List<VerificationCode>> getAll();
    Result add(VerificationCode verificationCode);
}
