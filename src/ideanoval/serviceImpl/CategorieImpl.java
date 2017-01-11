package ideanoval.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ideanoval.service.CategorieInterface;

public class CategorieImpl implements CategorieInterface {

	private Connection con;

	
	public CategorieImpl(Connection con){
		this.setCon(con);
	}
	
	@Override
	public boolean createCategorie(String name) {
		String query = "INSERT INTO ideaCat (name_IdeaCat) VALUES (?);";
		boolean result = false;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteCategorie(String name) {
		String query = "DELETE FROM ideaCat (name_IdeaCat) VALUES (?);";
		boolean result = false;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.executeUpdate();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Statement stmt;
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

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	
	
}
