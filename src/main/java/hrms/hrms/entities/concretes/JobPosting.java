package hrms.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

public class JobPosting {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;

	 @Column(name = "max_salary")
	 private int maxSalary;

	 @Column(name = "min_salary")
	 private int minSalary;

	 @NotBlank(message = "The number of open position cannot be null!")
	 @Column(name = "number_of_open_position", nullable = false)
	 private String numberOfOpenPosition;

	 @NotBlank(message = "Job definition cannot be null!")
	 @Column(name = "job_definition", nullable = false)
	 @Type(type = "text")
	 @Lob
	 private String jobDefinition;

	 @Column(name = "expiration_date")
	 private LocalDate expirationDate;

	 @ManyToOne
	 @JoinColumn(name = "job_title_id", nullable = false)
	 private JobTitle jobTitle;

	 @ManyToOne
	 @JoinColumn(name = "city_id", nullable = false)
	 private City city;

	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
     private Company company;

	 @CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "created_at", nullable = false, updatable = false)
	 private Date createdAt;

	 @UpdateTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "updated_at", nullable = false)
	 private Date updatedAt;

	 @Column(name = "is_active", nullable = false)
	 private boolean active;
	 
	 public JobPosting() {
		 
	 }

	public JobPosting(int id, int maxSalary, int minSalary,
			@NotBlank(message = "The number of open position cannot be null!") String numberOfOpenPosition,
			@NotBlank(message = "Job definition cannot be null!") String jobDefinition, LocalDate expirationDate,
			JobTitle jobTitle, City city, Company company, Date createdAt, Date updatedAt, boolean active) {
		super();
		this.id = id;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.jobDefinition = jobDefinition;
		this.expirationDate = expirationDate;
		this.jobTitle = jobTitle;
		this.city = city;
		this.company = company;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.active = active;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
