package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Candidate;

public interface ICandidateDao extends JpaRepository<Candidate, Integer>{

}
