package hrms.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import hrms.hrms.core.entities.Cv;


@Entity
@Table(name= "educations")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = Cv.class)
    @JoinColumn(name = "resume_id", referencedColumnName = "id")
    private Cv cv;

    @Column(name = "school_name")
    private String schoolName;

    @ManyToOne(targetEntity = Graduate.class)
    @JoinColumn(name = "graduate_id")
    private Graduate graduate;

    @Column(name = "school_department")
    private String schoolDepartment;

    @Column(name = "started_date")
    private LocalDate startedDate;

    @Column(name = "ended_date")
    private LocalDate endedDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

	public Education(int id, Cv cv, String schoolName, Graduate graduate, String schoolDepartment,
			LocalDate startedDate, LocalDate endedDate, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.cv = cv;
		this.schoolName = schoolName;
		this.graduate = graduate;
		this.schoolDepartment = schoolDepartment;
		this.startedDate = startedDate;
		this.endedDate = endedDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Graduate getGraduate() {
		return graduate;
	}

	public void setGraduate(Graduate graduate) {
		this.graduate = graduate;
	}

	public String getSchoolDepartment() {
		return schoolDepartment;
	}

	public void setSchoolDepartment(String schoolDepartment) {
		this.schoolDepartment = schoolDepartment;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(LocalDate endedDate) {
		this.endedDate = endedDate;
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
}
