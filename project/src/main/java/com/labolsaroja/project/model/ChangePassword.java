package com.labolsaroja.project.model;

public class ChangePassword {
	private String password;
	private String newPassword;
	
	public ChangePassword(String password, String newPassword) {
		super();
		this.password = password;
		this.newPassword = newPassword;
	}//Constructor

	public ChangePassword() {
		super();
	}//Constructor vacio

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}//G&S

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", newPassword=" + newPassword + "]";
	}//toString	
}//class
