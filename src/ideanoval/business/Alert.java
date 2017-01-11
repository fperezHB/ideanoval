package ideanoval.business;

import java.time.LocalDate;

public class Alert {
	
	private int id_Alert;
	private LocalDate dateAlert;
	private int id_User;
	private int id_Comment = -1;
	private int id_Idea = -1;
	private boolean isDone = false;
	
	
	
	public int getId_Alert() {
		return id_Alert;
	}
	public void setId_Alert(int id_Alert) {
		this.id_Alert = id_Alert;
	}
	public int getId_User() {
		return id_User;
	}
	public void setId_User(int id_User) {
		this.id_User = id_User;
	}
	public int getId_Comment() {
		return id_Comment;
	}
	public void setId_Comment(int id_Comment) {
		this.id_Comment = id_Comment;
		this.id_Idea = -1;
	}
	public int getId_Idea() {
		return id_Idea;
	}
	public void setId_Idea(int id_Idea) {
		this.id_Idea = id_Idea;
		this.id_Comment = -1;
	}
	public LocalDate getDateAlert() {
		return dateAlert;
	}
	public void setDateAlert(LocalDate dateAlert) {
		this.dateAlert = dateAlert;
	}
	public boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	
	
	@Override
	public String toString() {
		return "Alert [id_Alert=" + id_Alert + ", dateAlert=" + dateAlert + ", id_User=" + id_User + ", id_Comment="
				+ id_Comment + ", id_Idea=" + id_Idea + ", isDone=" + isDone + "]";
	}
	public Alert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alert(LocalDate dateAlert, int id_User, int id_Comment, int id_Idea) {
		super();
		this.dateAlert = dateAlert;
		this.id_User = id_User;
		this.id_Comment = id_Comment;
		this.id_Idea = id_Idea;
	}
	
	
	

}
