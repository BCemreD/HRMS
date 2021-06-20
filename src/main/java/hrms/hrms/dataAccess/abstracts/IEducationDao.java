package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Education;

public interface IEducationDao extends JpaRepository<Education, Integer>{
	List<Education>getAllByCvIdOrderByEndedDateDesc(int cvId);

}
