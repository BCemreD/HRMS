package hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertises"})
@Entity
@Table(name="cities")
public class City {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "name", length = 20, unique = true, updatable = false)
	    private String name;

	    @OneToMany(mappedBy = "city")
	    private List<JobPosting> jobPostings;

	    public City() {
	    	
	    }
	    
		public City(int id, String name, List<JobPosting> jobPostings) {
			super();
			this.id = id;
			this.name = name;
			this.jobPostings = jobPostings;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<JobPosting> getJobPosting() {
			return jobPostings;
		}

		public void setJobPosting(List<JobPosting> jobPosting) {
			this.jobPostings = jobPosting;
		}
	
}
