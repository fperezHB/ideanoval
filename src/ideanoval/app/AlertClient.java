package ideanoval.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import ideanoval.business.Alert;
import ideanoval.serviceImpl.AlertImpl;
import ideanoval.utils.DataConnect;


public class AlertClient {
	
	public static void main (String[] args)
	{
		Connection con = null;
		try{
			con = DataConnect.getConnection();
			
			System.out.println("---------TEST CONNEXION-------");
			System.out.println("connection : "+con);
			
			AlertImpl ai = new AlertImpl(con);
			Alert alert = new Alert();
			alert.setDateAlert(LocalDate.now());
			alert.setId_Comment(2);
			alert.setId_User(2);
			//System.out.println("enregistrement de l'alerte: "+ai.createAlert(alert));
			//System.out.println("suppression de l'alerte: "+ai.deleteAlert(8));
			//System.out.println(ai.maxIdAlert());
			System.out.println("set isdone to true to id = 3" + ai.setIsDone(3, true));
			
			
			
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}finally{
			DataConnect.closeConnection(con);
		}
	}
	
}
