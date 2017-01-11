package Interfaces;

import java.util.Date;

import ideanoval.business.Idea;

public interface ideaInterface {
	public boolean createIdea (Idea idea);
	public boolean noteIdeaTop (int id_Idea, int vote_Idea);
	public boolean noteIdeaFlop (int id_Idea, int vote_Idea);
	public boolean deleteIdea (int id_Idea);
	


}
