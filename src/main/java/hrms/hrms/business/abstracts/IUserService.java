package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.User;

public interface IUserService {

	List<User>getAll();
}
