package hrms.hrms.entities.dtos;

import java.time.LocalDate;

public class JobPostingSetDto {

    private int maxSalary;
    private int minSalary;
    private String numberOfOpenPosition;
    private String jobDefinition;
    private LocalDate expirationDate;
    private int jobTitleId;
    private int cityId;
    private int companyId;
    private boolean active;
    
    public JobPostingSetDto() {
    	
    }
    
	public JobPostingSetDto(int maxSalary, int minSalary, String numberOfOpenPosition, String jobDefinition,
			LocalDate expirationDate, int jobTitleId, int cityId, int companyId, boolean active) {
		super();
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.jobDefinition = jobDefinition;
		this.expirationDate = expirationDate;
		this.jobTitleId = jobTitleId;
		this.cityId = cityId;
		this.companyId = companyId;
		this.active = active;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public String getNumberOfOpenPosition() {
		return numberOfOpenPosition;
	}

	public void setNumberOfOpenPosition(String numberOfOpenPosition) {
		this.numberOfOpenPosition = numberOfOpenPosition;
	}

	public String getJobDefinition() {
		return jobDefinition;
	}

	public void setJobDefinition(String jobDefinition) {
		this.jobDefinition = jobDefinition;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getJobTitleId() {
		return jobTitleId;
	}

	public void setJobTitleId(int jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
