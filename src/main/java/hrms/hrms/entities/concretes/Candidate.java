package hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import hrms.hrms.core.entities.User;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = false)
@Table(name="candidates")
@Entity
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="UserId", referencedColumnName="id")

public class Candidate extends User{
	
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_Name")
	private String lastName;
	@Column(name="identity_number")
	private String nationalId;
	@Column(name="birth_of_year")
	private Date birthOfYear;
	
	public Candidate(int id, String name, String lastName, String nationalId, Date birthOfYear) {
		super();
		this.id = id;
		this.firstName = name;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthOfYear = birthOfYear;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Date getbirthOfYear() {
		return birthOfYear;
	}

	public void setbirthOfYear(Date birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
}
