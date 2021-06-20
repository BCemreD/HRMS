package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.Company;

public interface ICompanyService {
 
 DataResult<List<Company>> getAll();
  void add(Company company);
  Company getPhoneByCompanyId(int id);
  DataResult<Company> getByCompanyNameAndPhones_Phone(String companyName, String phone);

}
