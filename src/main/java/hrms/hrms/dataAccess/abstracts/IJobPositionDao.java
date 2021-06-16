package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobPosition;

public interface IJobPositionDao extends JpaRepository<JobPosition, Integer> {

	boolean existsByPositionName(String positionName);
}
