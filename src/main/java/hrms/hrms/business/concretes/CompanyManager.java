package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.ICompanyService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.ICompanyDao;
import hrms.hrms.entities.concretes.Company;

@Service
public class CompanyManager implements ICompanyService {

	@Autowired
	private ICompanyDao iCompanyDao;
	
	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<>(this.iCompanyDao.findAll());
	}

	@Override
	public void add(Company company) {
		if(company.getPassword().equals(company.getPassword())) {
			this.iCompanyDao.save(company);
		}
	}

	@Override
	public Company getPhoneByCompanyId(int id) {
		return this.iCompanyDao.findById(id).orElse(null);
	}

	@Override
	public DataResult<Company> getByCompanyNameAndPhones_Phone(String companyName, String phone) {
		return new SuccessDataResult<Company>(this.iCompanyDao.getByCompanyNameAndPhones_Phone
				(companyName, phone), "Succesfull");
	}

}
