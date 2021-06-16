package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Employer;

public interface IEmployerDao extends JpaRepository<Employer, Integer> {
	 List<Employer> findAllByEmail(String email);
}
