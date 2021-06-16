package hrms.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.adapters.abstracts.EmailService;
import hrms.hrms.business.abstracts.IEmployerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.RunRules;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.IEmployerDao;
import hrms.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements IEmployerService {
	
	private IEmployerDao iEmployerDao;
	private EmailService emailService;
	@Autowired
	public EmployerManager(IEmployerDao iEmployerDao,EmailService emailService) {
		this.iEmployerDao = iEmployerDao;
		this.emailService = emailService;
	}

	@Override
	  public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(iEmployerDao.findAll(),"Employer listed.");
    }

	@Override
	 public Result add(Employer employer) {
		Result result= RunRules.run(emailExist(employer.getEmail()),
				nullControl(employer),isRealEmployer(employer));
        if(result.isSuccess()){
            iEmployerDao.save(employer);
            return new SuccessResult(employer.getCompanyName()+" eklendi..");
        }
        return result;
    }
private Result emailExist(String email) {
        if((long) iEmployerDao.findAllByEmail(email).size() != 0) {
            return new ErrorResult("Email sistemde zaten mevcut!!");
        }
        return new SuccessResult();
    }
    private Result nullControl(Employer employer) {
        if(employer.getEmail()==null || employer.getEmail().isBlank()||
                employer.getPassword()==null||employer.getPassword().isBlank()||
                employer.getCompanyName()==null|| employer.getCompanyName().isBlank()||
                employer.getWebAddress()==null||employer.getWebAddress().isBlank()) {

            return new ErrorResult("Alanlar bos birakilamaz!!");
        }
        return new SuccessResult();
    }
    private Result isRealEmployer(Employer employer) {

        if(!emailService.emailSend(employer.getEmail())){
            return new ErrorResult("Email formatina uygun bir mail giriniz!!");
        }

        else if(!employer.getWebAddress().contains(employer.getEmail().split("@")[0])){
            return new ErrorResult("Domain ayni degil!!!");
        }
        return new SuccessResult();
    }
	 }


