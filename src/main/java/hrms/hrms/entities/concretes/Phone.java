package hrms.hrms.entities.concretes;

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

@Entity
@Table(name = "phones")
public class Phone {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "phone_number")
  private String phoneNumber;

  @ManyToOne()
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private Company company;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at")
  private Date createdAt;

  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at")
  private Date updatedAt;


  public Phone(int id, String phoneNumber, Company company, Date createdAt, Date updatedAt) {
	super();
	this.id = id;
	this.phoneNumber = phoneNumber;
	this.company = company;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
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
}
