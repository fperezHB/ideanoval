package ideanoval.business;

import java.time.LocalDate;

public class Idea {

	private String titleIdea;
	private String descIdea;
	private LocalDate dateAddIdea;
	private LocalDate dateDellIdea;
	private int nbVoteTop;
	private int nbVoteFlop;
	private boolean isActiveIdea;

	public String getTitleIdea() {
		return titleIdea;
	}

	public void setTitleIdea(String titleIdea) {
		this.titleIdea = titleIdea;
	}

	public String getDescIdea() {
		return descIdea;
	}

	public void setDescIdea(String descIdea) {
		this.descIdea = descIdea;
	}

	public LocalDate getDateAddIdea() {
		return dateAddIdea;
	}

	public void setDateAddIdea(LocalDate dateAddIdea) {
		this.dateAddIdea = dateAddIdea;
	}

	public LocalDate getDateDellIdea() {
		return dateDellIdea;
	}

	public void setDateDellIdea(LocalDate dateDellIdea) {
		this.dateDellIdea = dateDellIdea;
	}

	public int getNbVoteTop() {
		return nbVoteTop;
	}

	public void setNbVoteTop(int nbVoteTop) {
		this.nbVoteTop = nbVoteTop;
	}

	public int getNbVoteFlop() {
		return nbVoteFlop;
	}

	public void setNbVoteFlop(int nbVoteFlop) {
		this.nbVoteFlop = nbVoteFlop;
	}

	public boolean isActiveIdea() {
		return isActiveIdea;
	}

	public void setActiveIdea(boolean isActiveIdea) {
		this.isActiveIdea = isActiveIdea;
	}

	@Override
	public String toString() {
		return "Idea [titleIdea=" + titleIdea + ", descIdea=" + descIdea + ", dateAddIdea=" + dateAddIdea
				+ ", dateDellIdea=" + dateDellIdea + ", nbVoteTop=" + nbVoteTop + ", nbVoteFlop=" + nbVoteFlop
				+ ", isActiveIdea=" + isActiveIdea + "]";
	}

	public Idea() {
		super();
		// TODO Auto-generated constructor stub
	}

}
