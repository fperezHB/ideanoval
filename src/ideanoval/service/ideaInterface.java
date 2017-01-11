package ideanoval.service;

import java.util.Date;

public interface ideaInterface {
	public boolean createIdea (String name_Idea, String contents_Idea, String tags_Idea, int score, int nbComment_Idea, Date dateAdd_Idea, Date dateEdit_Idea, Date dateDel_Idea);
	public int noteIdea (int id_Idea, int vote_Idea);
	public boolean commentIdea (int id_Idea, String comment_Idea);
	public boolean deleteIdea (int id_Idea);
}
