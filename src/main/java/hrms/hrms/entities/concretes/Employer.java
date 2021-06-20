package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import hrms.hrms.core.entities.User;
import lombok.EqualsAndHashCode;


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


	public Employer(int id, String companyName, String webAddress, String phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
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


}
