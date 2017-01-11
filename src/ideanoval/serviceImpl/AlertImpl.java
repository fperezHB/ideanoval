package ideanoval.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import ideanoval.business.Alert;
import ideanoval.service.AlertInterface;

public class AlertImpl implements AlertInterface {

	private Connection con;

	
	public AlertImpl(Connection con){
		this.setCon(con);
	}
	
	@Override
	public boolean createAlert(Alert alert) {
		String query = "";
		if (alert.getId_Comment() != -1)
		{
			query = "INSERT INTO alert (date_Alert, id_User, id_Comment, isDone_Alert)"
					+ " VALUES (?,?,?,?)";
		}
		else if (alert.getId_Idea() != -1)
		{
			query = "INSERT INTO alert (date_Alert, id_User, id_Idea, isDone_Alert)"
					+ " VALUES (?,?,?,?)";
		}
		else
		{
			return false;
		}
		boolean isCreated = false;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setDate(1, (java.sql.Date.valueOf(alert.getDateAlert())));
			ps.setInt(2, alert.getId_User());
			if (alert.getId_Comment() != -1)
			{
				ps.setInt(3, alert.getId_Comment());				
			}
			else
			{
				ps.setInt(3, alert.getId_Idea());
			}
			ps.setBoolean(4, alert.getIsDone());
			ps.executeUpdate();
			isCreated = true;
			
			alert.setId_Alert(maxIdAlert());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
	}
	
	@Override
	public boolean deleteAlert(int idAlert) {
		boolean result = false;
		String query = "DELETE FROM alert WHERE id_Alert = "+idAlert+";";
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			result = true;
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		query = "ALTER TABLE alert AUTO_INCREMENT = 1";
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			result = true;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean setIsDone(int id_Alert, boolean isDone) {
		boolean result = false;
		String query = "UPDATE alert SET isDone_Alert = "+isDone+" WHERE id_ALert = "+id_Alert;
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			result = true;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public int maxIdAlert() {
		int result = -1;
		String query = "SELECT MAX(id_Alert) FROM alert";
		Statement stmt;
		try{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next())
			{
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}






	
	
	
}
