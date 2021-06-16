package hrms.hrms.adapters.concretes;

import hrms.hrms.adapters.abstracts.EmployerConfirmationService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;

public class EmployerConfirmationManager implements EmployerConfirmationService {

	@Override
	public Result confirmEmployer(int employerId) {
		return new SuccessResult("Employer is verified.");
	}

}
