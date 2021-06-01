package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.adapters.abstracts.AuthService;
import hrms.hrms.business.abstracts.IEmployeeService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.IEmployeeDao;
import hrms.hrms.entities.concretes.Employee;
import hrms.hrms.entities.concretes.Employer;

@Service
public class EmployeeManager implements IEmployeeService {

	private IEmployeeDao iEmployeeDao;
	@Autowired
	public EmployeeManager (IEmployeeDao iEmployeeDao, AuthService authService, IEmployeeService iEmployeeService) {
		this.iEmployeeDao = iEmployeeDao;
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<>(iEmployeeDao.findAll(),"Employees listed.");
	}

	@Override
	public Result VerifyEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
