package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.User;

public interface IUserDao extends JpaRepository<User, Integer>{


}
