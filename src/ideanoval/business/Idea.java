package ideanoval.business;

import java.time.LocalDate;

public class Idea {

	private int id_Idea;
	private String nameIdea;
	private String contentIdea;
	private String tagsIdea;
	private LocalDate dateAddIdea;
	private LocalDate dateEditIdea;
	private LocalDate dateDellIdea;
	private int nbVoteTop;
	private int nbVoteFlop;
	private int nbCommentIdea;
	private boolean isActiveIdea;
	
	
	public int getId_Idea() {
		return id_Idea;
	}
	public void setId_Idea(int id_Idea) {
		this.id_Idea = id_Idea;
	}
	public String getNameIdea() {
		return nameIdea;
	}
	public void setNameIdea(String nameIdea) {
		this.nameIdea = nameIdea;
	}
	public String getContentIdea() {
		return contentIdea;
	}
	public void setContentIdea(String contentIdea) {
		this.contentIdea = contentIdea;
	}
	public String getTagsIdea() {
		return tagsIdea;
	}
	public void setTagsIdea(String tagsIdea) {
		this.tagsIdea = tagsIdea;
	}
	public LocalDate getDateAddIdea() {
		return dateAddIdea;
	}
	public void setDateAddIdea(LocalDate dateAddIdea) {
		this.dateAddIdea = dateAddIdea;
	}
	public LocalDate getDateEditIdea() {
		return dateEditIdea;
	}
	public void setDateEditIdea(LocalDate dateEditIdea) {
		this.dateEditIdea = dateEditIdea;
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
	public int getNbCommentIdea() {
		return nbCommentIdea;
	}
	public void setNbCommentIdea(int nbCommentIdea) {
		this.nbCommentIdea = nbCommentIdea;
	}
	public boolean isActiveIdea() {
		return isActiveIdea;
	}
	public void setActiveIdea(boolean isActiveIdea) {
		this.isActiveIdea = isActiveIdea;
	}
	@Override
	public String toString() {
		return "Idea [id_Idea=" + id_Idea + ", nameIdea=" + nameIdea + ", contentIdea=" + contentIdea + ", tagsIdea="
				+ tagsIdea + ", dateAddIdea=" + dateAddIdea + ", dateEditIdea=" + dateEditIdea + ", dateDellIdea="
				+ dateDellIdea + ", nbVoteTop=" + nbVoteTop + ", nbVoteFlop=" + nbVoteFlop + ", nbCommentIdea="
				+ nbCommentIdea + ", isActiveIdea=" + isActiveIdea + "]";
	}
	public Idea() {
		super();
		// TODO Auto-generated constructor stub
	}



}
