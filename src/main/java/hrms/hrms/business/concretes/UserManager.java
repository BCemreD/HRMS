package hrms.hrms.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IUserService;
import hrms.hrms.core.entities.User;
import hrms.hrms.dataAccess.abstracts.IUserDao;


@Service
public class UserManager implements IUserService {
	
	private IUserDao iUserDao;
	
	@Autowired
	public UserManager(IUserDao iUserDao) {
		super();
		this.iUserDao = iUserDao;
	}

	

	@Override
	public User getById(int id) {
		return this.iUserDao.findById(id).orElse(null);
	}
	
	

}
