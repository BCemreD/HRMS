package hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
	@Column(name="name")
	private String name;
	@Column(name="lastName")
	private String lastName;
	@Column(name="nationalId")
	private String nationalId;
	@Column(name="birthDate")
	private Date birthDate;
	
	public Candidate(int id, String name, String lastName, String nationalId, Date birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthDate = birthDate;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
