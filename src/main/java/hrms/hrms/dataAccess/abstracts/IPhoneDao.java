package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Phone;

public interface IPhoneDao extends JpaRepository<Phone, Integer>{
	
	List<Phone>findPhonesByCompanyId(int id);

}
