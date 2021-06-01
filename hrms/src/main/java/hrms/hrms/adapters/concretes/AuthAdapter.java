package hrms.hrms.adapters.concretes;

import org.springframework.stereotype.Service;

import hrms.hrms.adapters.abstracts.AuthService;
import hrms.hrms.entities.concretes.Candidate;



@Service
public class AuthAdapter implements AuthService {

	 @Override
	    public boolean checkIfRealPerson(Candidate candidate) {
	        int year=candidate.getBirthDate().getYear()+1900;
	        NRWKPSPublicSoap soapClient=new NRWKPSPublicSoap();
	        try{
	            return soapClient.TCKimlikNoDogrula(Long.valueOf(candidate.getId()),
	            		candidate.getName().toUpperCase(),candidate.getLastName().toUpperCase(),
	            		year);
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        return false;
	    }
}
