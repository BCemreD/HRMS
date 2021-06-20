package hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

import hrms.hrms.core.entities.User;



@Entity
@Table(name = "verification_codes")
public class VerificationCode {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   @Column(name = "code", unique = true)
   private String code;

   @Column(name = "is_used")
   private boolean isUsed;

   @JsonIgnore
   @Column(name = "created_at", updatable = false)
   @CreationTimestamp
   @Temporal(TemporalType.TIMESTAMP)
   private Date createdAt;


   @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
   @JoinColumn(name = "user_id", referencedColumnName = "id")
   private User user;


public VerificationCode(int id, String code, boolean isUsed, Date createdAt, User user) {
	super();
	this.id = id;
	this.code = code;
	this.isUsed = isUsed;
	this.createdAt = createdAt;
	this.user = user;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public boolean isUsed() {
	return isUsed;
}


public void setUsed(boolean isUsed) {
	this.isUsed = isUsed;
}


public Date getCreatedAt() {
	return createdAt;
}


public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}
}
