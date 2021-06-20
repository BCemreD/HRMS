package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobPosting;

public interface IJobPostingDao extends JpaRepository<JobPosting, Integer>{

	List<JobPosting> getAllByActiveTrue();
	List<JobPosting> getAllByActiveTrue(Sort sort);
	List<JobPosting> getAllByCompanyId(int id);
	List<JobPosting> getAllByCompany_CompanyName(String companyName);
	List<JobPosting> getByCompany_CompanyNameContainsIgnoreCase(String companyName);
}
