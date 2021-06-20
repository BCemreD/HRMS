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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import hrms.hrms.core.entities.Cv;

@Entity
@Table(name = "languages")
public class Language {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @ManyToOne
  @JoinColumn(name = "cv_id")
  private Cv cv;

  @Column(name = "language")
  private String language;

  @Column(name = "language_level")
  @Max(value = 5)
  @Min(value = 1)
  private short languageLevel;

  @Column(name = "created_at")
  private Date createdAt;

  @Column(name = "updated_at")
  private Date updatedAt;

public Language(int id, Cv cv, String language, @Max(5) @Min(1) short languageLevel, Date createdAt, Date updatedAt) {
	super();
	this.id = id;
	this.cv = cv;
	this.language = language;
	this.languageLevel = languageLevel;
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

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public short getLanguageLevel() {
	return languageLevel;
}

public void setLanguageLevel(short languageLevel) {
	this.languageLevel = languageLevel;
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
