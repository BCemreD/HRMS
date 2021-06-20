package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Table;

import hrms.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")

public class Employee extends User {

	@Column(name="userId")
	private int userId;
	@Column(name="first_name")
	private String name;
	@Column (name ="last_name")
	private String lastName;
	
	
	public Employee(int userId, String name, String lastName) {
		super(userId, name, lastName);
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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
}
