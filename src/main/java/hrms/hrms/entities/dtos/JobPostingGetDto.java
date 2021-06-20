package hrms.hrms.entities.dtos;
import java.time.LocalDate;
import java.util.Date;

public class JobPostingGetDto {

	private String companyName;
	private String jobTitle;
	private String numberOfOpenPosition;
	private Date createdAt;
	private LocalDate expirationDate;
	
	public JobPostingGetDto() {
		
	}
	
	public JobPostingGetDto(String companyName, String jobTitle, String numberOfOpenPosition, Date createdAt,
			LocalDate expirationDate) {
		super();
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.createdAt = createdAt;
		this.expirationDate = expirationDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getNumberOfOpenPosition() {
		return numberOfOpenPosition;
	}

	public void setNumberOfOpenPosition(String numberOfOpenPosition) {
		this.numberOfOpenPosition = numberOfOpenPosition;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
}
