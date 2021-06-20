package hrms.hrms.business.abstracts;

import java.util.List;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Experience;

public interface IExperienceService {
	
 DataResult<List<Experience>> getAllByCvIdOrderByEndedDateDesc(int cvId);
 Result add(Experience jobExperience);
}
