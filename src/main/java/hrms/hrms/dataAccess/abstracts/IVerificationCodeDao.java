package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.VerificationCode;

public interface IVerificationCodeDao extends JpaRepository<VerificationCode, Long> {
	
	

}
