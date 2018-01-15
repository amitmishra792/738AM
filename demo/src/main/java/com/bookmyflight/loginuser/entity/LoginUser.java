package com.bookmyflight.loginuser.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGINUSER")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	/**
	 * @return userId
	 */
	public int getUserId() {

		return this.userId;
	}

	/**
	 * @param userId
	 *            new value of {@link #getuserId}.
	 */
	public void setUserId(int userId) {

		this.userId = userId;
	}

	/**
	 * @return email
	 */
	public String getEmail() {

		return this.email;
	}

	/**
	 * @param email
	 *            new value of {@link #getemail}.
	 */
	public void setEmail(String email) {

		this.email = email;
	}

	/**
	 * @return password
	 */
	public String getPassword() {

		return this.password;
	}

	/**
	 * @param password
	 *            new value of {@link #getpassword}.
	 */
	public void setPassword(String password) {

		this.password = password;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {

		return serialVersionUID;
	}

	@Override
	public String toString() {

		return "SignUpUser [userId=" + this.userId + ", email=" + this.email
				+ ", password=" + this.password + "]";
	}

}