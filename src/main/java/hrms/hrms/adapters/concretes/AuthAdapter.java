package hrms.hrms.adapters.concretes;

import hrms.hrms.adapters.abstracts.AuthService;
import hrms.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class AuthAdapter implements AuthService{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
	
        KPSPublicSoapProxy soapClient=new KPSPublicSoapProxy();
        try{
            return soapClient.TCKimlikNoDogrula(Long.valueOf(candidate.getId()),
            		candidate.getFirstName().toUpperCase(),candidate.getLastName().toUpperCase(), 1990);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
	}

}
