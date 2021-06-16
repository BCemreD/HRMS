package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employee;
import hrms.hrms.entities.concretes.Employer;

public interface IEmployeeService {

	DataResult<List<Employee>> getAll();
	Result VerifyEmployer(Employer employer);
}
