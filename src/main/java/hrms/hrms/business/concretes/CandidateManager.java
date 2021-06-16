package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.adapters.abstracts.AuthService;
import hrms.hrms.business.abstracts.ICandidateService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.RunRules;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.ICandidateDao;
import hrms.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements ICandidateService{
	
	private ICandidateDao iCandidateDao;
	private AuthService authService;
	
	  @Autowired
	    public CandidateManager(ICandidateDao candidateDao, AuthService authService) {
	        this.iCandidateDao = candidateDao;
	        this.authService = authService;
	    }


	    @Override
	    public DataResult<List<Candidate>> getAll() {
	        return new SuccessDataResult<List<Candidate>>(this.iCandidateDao.findAll(),
	        		"Job title listed");
	    }

	    @Override
	    public Result add(Candidate candidate) {
	        Result result = RunRules.run(identityNumberControl(candidate),mernisControl(candidate),nullControl(candidate));
	        if(result.isSuccess()){
	            iCandidateDao.save(candidate);
	            return new SuccessResult(candidate.getFirstName()+ " "+ candidate.getLastName()+" added.");
	        }
	        return result;
	    }

	//------------------------------------------------------------------------------------------------------------------

	    private Result mernisControl(Candidate candidate) {
	        if (!authService.checkIfRealPerson(candidate)) {
	            return new ErrorResult("Confirmation failed");
	        }
	        return new SuccessResult();
	    }
	    private Result identityNumberControl(Candidate candidate) {

	        if (candidate.getNationalId().length() != 11) {
	            return new ErrorResult("Id must have 11 charachters.");
	        }
	        return new SuccessResult();
	    }

	    private Result nullControl(Candidate candidate) {
	        if(candidate.getFirstName().isEmpty()||
	                candidate.getLastName().isEmpty()||
	                candidate.getNationalId().isEmpty()||
	                candidate.getbirthOfYear().toString().isEmpty()||
	                candidate.getEmail().isEmpty()||
	                candidate.getPassword().isEmpty()){
	            return new ErrorResult("Alanlar bos birakilamaz!!");
	        }
	        return new SuccessResult();
	    }
}