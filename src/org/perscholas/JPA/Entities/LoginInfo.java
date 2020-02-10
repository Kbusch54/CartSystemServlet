package org.perscholas.JPA.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class LoginInfo {
	
	@Id 
	private Long id;
	
	private String userName;
	private String passWord;
	
	public LoginInfo() {
		super();
	}
	/**
	 * @param id
	 * @param userName
	 * @param password
	 */
	public LoginInfo(Long id, String userName, String password) {
		this();
		this.setId(id);
		this.setUserName(userName);
		this.setPassword(password);
		
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return passWord;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.passWord = password;
	}
}
