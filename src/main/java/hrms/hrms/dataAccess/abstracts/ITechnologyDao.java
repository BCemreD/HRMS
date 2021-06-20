package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.core.entities.Technology;

public interface ITechnologyDao extends JpaRepository<Technology, Integer> {
	
	List<Technology>getAllByCvId(int cvId);

}
