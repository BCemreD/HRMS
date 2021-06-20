package hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hrms.hrms.core.entities.User;

@Entity
@Table(name = "companies")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
public class Company extends User {
	 
	@NotBlank(message = "Sirket adi alani bos birakilamaz!")
    @Column(name = "company_name", nullable = false)
    private String companyName;

	@NotBlank(message = "Web adres alani bos birakilamaz!")
	@Column(name = "website", nullable = false)
	private String website;

	@OneToMany( mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Phone> phones;

	@OneToMany(mappedBy = "company")
	private List<JobPosting> jobPostings;
	
	public Company() {
		
	}

	public Company(@NotBlank(message = "Sirket adi alani bos birakilamaz!") String companyName,
	@NotBlank(message = "Web adres alani bos birakilamaz!") String website, List<Phone> phones,
	List<JobPosting> jobPostings) {
		super();
		this.companyName = companyName;
		this.website = website;
		this.phones = phones;
		this.jobPostings = jobPostings;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Phone> getPhone() {
		return phones;
	}

	public void setPhone(List<Phone> phones) {
		this.phones = phones;
	}

	public List<JobPosting> getJobPosting() {
		return jobPostings;
	}

	public void setJobPosting(List<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}
	
}
