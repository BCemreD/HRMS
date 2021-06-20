package hrms.hrms.business.abstracts;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.entities.Technology;
import hrms.hrms.core.utilities.results.Result;

import java.util.List;

public interface ITechnologyService {

	DataResult<List<Technology>>getAllByCvId(int cvId);
	
	Result add(Technology technology);
}
