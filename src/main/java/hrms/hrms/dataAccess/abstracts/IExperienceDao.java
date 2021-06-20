package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Experience;

public interface IExperienceDao extends JpaRepository<Experience, Integer>{
	List<Experience> getAllByCvIdByEndeDateDesc(int cvId);

}
