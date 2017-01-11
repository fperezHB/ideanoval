package ideanoval.app;

import java.sql.Connection;
import java.sql.SQLException;

import ideanoval.serviceImpl.CategorieImpl;
import ideanoval.utils.DataConnect;

public class IdeaCatClient {
	
	public static void main (String[] args)
	{
		Connection con = null;
		
		try{
			con = DataConnect.getConnection();
			System.out.println("---------TEST CONNEXION-------");
			System.out.println("connection : "+con);
			
			CategorieImpl catImpl = new CategorieImpl(con);
			
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}finally{
			DataConnect.closeConnection(con);
		}
		
	}
	
}
