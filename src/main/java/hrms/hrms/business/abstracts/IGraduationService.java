package hrms.hrms.business.abstracts;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Graduate;

import java.util.List;

public interface IGraduationService {
 
DataResult<List<Graduate>> getAll();
Result add(Graduate graduate);

}
