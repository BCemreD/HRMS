package hrms.hrms.adapters.concretes;

import hrms.hrms.adapters.abstracts.EmailService;

public class EmailValidator implements EmailService{

	EmailSender emailSender = new EmailSender();
	@Override
	public boolean emailSend(String email) {
		return emailSender.emailVerification(email);
	}

}
