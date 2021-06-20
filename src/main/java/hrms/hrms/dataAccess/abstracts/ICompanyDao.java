package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Company;

public interface ICompanyDao extends JpaRepository<Company, Integer>{
	Company getByCompanyNameAndPhones_Phone(String companyName, String phone);

}
