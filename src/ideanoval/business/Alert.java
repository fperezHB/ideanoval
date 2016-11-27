package ideanoval.business;

import java.time.LocalDate;

public class Alert {
	
	private LocalDate dateAlert;
	private boolean isDone;
	public LocalDate getDateAlert() {
		return dateAlert;
	}
	public void setDateAlert(LocalDate dateAlert) {
		this.dateAlert = dateAlert;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "Alert [dateAlert=" + dateAlert + ", isDone=" + isDone + "]";
	}
	public Alert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
