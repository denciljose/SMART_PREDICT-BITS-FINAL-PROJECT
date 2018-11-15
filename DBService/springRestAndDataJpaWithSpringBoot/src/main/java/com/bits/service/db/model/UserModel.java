package com.bits.service.db.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="USER_MODEL")
public class UserModel implements Serializable {
	 
	//@Id
	///@GeneratedValue(strategy= GenerationType.IDENTITY)
//	@Column(name = "ID")
	// private Long Id;
	
	@Id
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ISADMIN")
	private Boolean isAdmin;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin= isAdmin;
	}

	
	/*public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}*/

	public UserModel() {
		super();
	}

	public UserModel(String userName, String password, Boolean isAdmin) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	 
}