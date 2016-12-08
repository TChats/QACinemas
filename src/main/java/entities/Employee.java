package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Employee {

	@Id
	@NotNull
	@Column(name = "username")
	private String username;
	@NotNull
	@Column(name = "password")
	private String password;
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	@NotNull
	@Column(name = "surname")
	private String surname;
	@NotNull
	@Column(name = "jobRole")
	private String jobRole;
	
	@NotNull
	@Column(name = "not_salt")
	private String salt;
	
	public Employee(String username, String password, String firstName, String surname, String jobRole, String salt) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.surname = surname;
		this.jobRole = jobRole;
		this.salt = salt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
