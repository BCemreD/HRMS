package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@Entity


public class Employer extends User{

	 @Column(name = "id")
	 private int id;

	 @Column(name = "company_name")
	 private String companyName;

	 @Column(name = "web_address")
	 private String webAddress;

	 @Column(name = "phone_number")
	 private String phoneNumber;
	 

	public Employer(int id, String companyName, String webAddress, String phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getWebAddress() {
		return webAddress;
	}


	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}