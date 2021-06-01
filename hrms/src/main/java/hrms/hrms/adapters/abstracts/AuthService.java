package hrms.hrms.adapters.abstracts;

import hrms.hrms.entities.concretes.Candidate;

public interface AuthService {

	 boolean checkIfRealPerson(Candidate candidate);
	}