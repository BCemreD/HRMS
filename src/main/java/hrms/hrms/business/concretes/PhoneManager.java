package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.hrms.business.abstracts.IPhoneService;
import hrms.hrms.dataAccess.abstracts.IPhoneDao;
import hrms.hrms.entities.concretes.Phone;

public class PhoneManager implements IPhoneService{

	@Autowired
	private IPhoneDao iPhoneDao;
	
	@Override
	public List<Phone> getPhonesById(int id) {
		return this.iPhoneDao.findPhonesByCompanyId(id);
	}

}
