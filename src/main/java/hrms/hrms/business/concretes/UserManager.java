package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.IUserService;
import hrms.hrms.dataAccess.abstracts.IUserDao;
import hrms.hrms.entities.concretes.User;

@Service
public class UserManager implements IUserService {
	
	private IUserDao iUserDao;
	
	@Autowired
	public UserManager(IUserDao iUserDao) {
		super();
		this.iUserDao = iUserDao;
	}

	@Override
	public List<User> getAll() {
		return this.iUserDao.findAll();
	}
	
	

}
