package ideanoval.business;

import java.time.LocalDate;

public class Comment {

	private String descCom;
	private LocalDate dateAddCom;
	private LocalDate dateDelCom;
	private boolean isAuthorIdea;

	public String getDescCom() {
		return descCom;
	}

	public void setDescCom(String descCom) {
		this.descCom = descCom;
	}

	public LocalDate getDateAddCom() {
		return dateAddCom;
	}

	public void setDateAddCom(LocalDate dateAddCom) {
		this.dateAddCom = dateAddCom;
	}

	public LocalDate getDateDelCom() {
		return dateDelCom;
	}

	public void setDateDelCom(LocalDate dateDelCom) {
		this.dateDelCom = dateDelCom;
	}

	public boolean isAuthorIdea() {
		return isAuthorIdea;
	}

	public void setAuthorIdea(boolean isAuthorIdea) {
		this.isAuthorIdea = isAuthorIdea;
	}

	@Override
	public String toString() {
		return "Comment [descCom=" + descCom + ", dateAddCom=" + dateAddCom + ", dateDelCom=" + dateDelCom
				+ ", isAuthorIdea=" + isAuthorIdea + "]";
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
