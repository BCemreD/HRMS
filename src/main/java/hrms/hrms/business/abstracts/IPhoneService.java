package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.Phone;

public interface IPhoneService {
	
	List<Phone>getPhonesById(int id);

}
