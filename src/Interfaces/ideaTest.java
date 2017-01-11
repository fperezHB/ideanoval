package Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import ideanoval.business.Idea;
import ideanoval.utils.DataConnect;

public class ideaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;

		try {
			con = DataConnect.getConnection();
			System.out.println("---------TEST CONNECTION------\n");
			System.out.println("connection : " + con);

			ideaimpl ii = new ideaimpl(con);
			
			
			/*
			Idea in = new Idea();
			in.setNameIdea("Idée à la con");
			in.setContentIdea("Wahou ça fait rêver comme idée");
			in.setTagsIdea("IDKONNE");
			in.setNbCommentIdea(0);	
			ii.createIdea(in);
			*/
			
			//ii.noteIdeaFlop(1, 1);
			
			ii.deleteIdea(3);
			
			//ii.noteIdeaTop(1, 1);
		
			
			
			
			
			
			
			
			
			
			
			
			

		} catch (SQLException | ClassNotFoundException sqle) {
			sqle.printStackTrace();
		} finally {
			DataConnect.closeConnection(con);
		}

	}
}