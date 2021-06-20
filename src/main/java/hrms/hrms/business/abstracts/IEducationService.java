package hrms.hrms.business.abstracts;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Education;

import java.util.List;

public interface IEducationService {
	
 DataResult <List<Education>> getAll();
 DataResult <List<Education>> getAllByResumeIdOrderByEndedDateDesc(int cvId);
 Result add(Education education);
}
