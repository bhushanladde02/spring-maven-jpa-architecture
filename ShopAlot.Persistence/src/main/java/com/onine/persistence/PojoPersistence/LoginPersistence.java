package com.onine.persistence.PojoPersistence;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.onine.pojo.Common.Login;

@Entity
@Table(name="Login")
public class LoginPersistence extends Login implements Serializable{

	private static final long serialVersionUID = 20120910121414L;

	public LoginPersistence() {
		super();
	}

	public LoginPersistence(long id,String username, String password) {
		super(id,username, password);
	}

	@Id
	@GeneratedValue
	@Column(name="id")
	@Override
	public long getId() {
		return super.getId();
	}
	
	@Column(name="username", nullable=false)
	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Column(name="password", nullable=false)
	@Override
	public String getPassword()  {
		return super.getPassword() ;
	}
}