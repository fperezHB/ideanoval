package Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import ideanoval.business.Idea;

public class ideaimpl implements ideaInterface {

	Connection con = null;
	
	public ideaimpl(Connection con) {
		super();
		this.con = con;
	}
	
	//INSERT INTO idea (id_idea, name_idea, content_idea, tags_Idea, scoreTop_Idea, scoreFlop_Idea, nbComment_Idea, dateAdd_Idea, dateEdit_Idea, dateShut_Idea) VALUES : ?,?, ?, ?, ?, ?, ?, ?, ?, ?;
	
	
	
	

	public boolean createIdea(Idea idea) {
		boolean isCreated = false;
		try{
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO idea (name_idea, content_idea, tags_Idea, scoreTop_Idea, scoreFlop_Idea, nbComment_Idea, dateAdd_Idea) VALUES : ?, ?, ?, ?, ?, ?, ?");
			ps.setString(1, idea.getNameIdea());
			ps.setString(2, idea.getContentIdea());
			ps.setString(3, idea.getTagsIdea());
			ps.setInt(4, 0);
			ps.setInt(5,0);
			ps.setInt(6, 0);
			ps.setDate(7, java.sql.Date.valueOf(LocalDate.now()));

			
			ps.executeUpdate();
			isCreated = true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return isCreated;
	}

	public boolean noteIdeaTop(int id_Idea, int vote_Idea) {

		boolean isVotedUp = false;

		try {
			PreparedStatement ps = con.prepareStatement("UPDATE idea SET scoreTop_Idea = ? WHERE id_Idea = ?");

			ps.setInt(1, vote_Idea + 1);
			ps.setInt(2, id_Idea);
	
			ps.executeUpdate();
			isVotedUp = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isVotedUp;

	}
	
	
	
	public boolean noteIdeaFlop(int id_Idea, int vote_Idea) {

		boolean isVotedDown = false;

		try {
			PreparedStatement ps = con.prepareStatement("UPDATE idea SET scoreFlop_Idea = ? WHERE id_Idea = ?");

			ps.setInt(1, vote_Idea + 1);
			ps.setInt(2, id_Idea);
	
			ps.executeUpdate();
			isVotedDown = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isVotedDown;

	}
	
	

	
	public boolean deleteIdea(int id_Idea) {
		boolean isIdeaDeleted = false;
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM idea WHERE id_Idea = ?");

			ps.setInt(1, id_Idea);
			System.out.println(ps);
			ps.executeUpdate();
			isIdeaDeleted = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isIdeaDeleted;

	}


		




}
