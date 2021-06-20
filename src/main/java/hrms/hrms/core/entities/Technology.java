package hrms.hrms.core.entities;

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
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "technologies")
public class Technology {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private int id;

 @ManyToOne
 @JoinColumn(name = "resume_id")
 private Cv cv;

 @NotBlank
 @Column(name = "description")
 private String description;

 @CreationTimestamp
 @Temporal(TemporalType.TIMESTAMP)
 @Column(name = "created_at")
 private Date createdAt;

 @UpdateTimestamp
 @Temporal(TemporalType.TIMESTAMP)
 @Column(name = "updated_at")
 private Date updatedAt;

public Technology(int id, Cv cv, @NotBlank String description, Date createdAt, Date updatedAt) {
	super();
	this.id = id;
	this.cv = cv;
	this.description = description;
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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
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
