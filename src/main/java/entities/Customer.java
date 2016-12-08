package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Customer {

	@Id
	@NotNull
	@Column(name = "customerID")
	private int customerID;
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
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNum;
	@NotNull
	@Column(name = "not_salt")
	private String salt;
	
	public Customer(int customerID, String username, String password, String firstName, String surname, String email,
			String phoneNum, String salt) {
		this.customerID = customerID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
		this.phoneNum = phoneNum;
		this.salt = salt;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
