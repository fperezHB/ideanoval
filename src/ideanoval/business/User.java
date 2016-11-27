package ideanoval.business;

import java.time.LocalDate;

public class User {

	private String loginUser;
	private String pwdUser;
	private LocalDate dateAddUser;
	private LocalDate dateEditUser;
	private LocalDate dateDelUser;
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPwdUser() {
		return pwdUser;
	}
	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}
	public LocalDate getDateAddUser() {
		return dateAddUser;
	}
	public void setDateAddUser(LocalDate dateAddUser) {
		this.dateAddUser = dateAddUser;
	}
	public LocalDate getDateEditUser() {
		return dateEditUser;
	}
	public void setDateEditUser(LocalDate dateEditUser) {
		this.dateEditUser = dateEditUser;
	}
	public LocalDate getDateDelUser() {
		return dateDelUser;
	}
	public void setDateDelUser(LocalDate dateDelUser) {
		this.dateDelUser = dateDelUser;
	}
	@Override
	public String toString() {
		return "User [loginUser=" + loginUser + ", pwdUser=" + pwdUser + ", dateAddUser=" + dateAddUser
				+ ", dateEditUser=" + dateEditUser + ", dateDelUser=" + dateDelUser + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
