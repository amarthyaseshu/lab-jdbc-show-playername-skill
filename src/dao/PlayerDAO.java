package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO{
	
	// Method used to fetch all the players and their corresponding skill from the database
	public List<Player>  getAllPlayers() throws ClassNotFoundException, SQLException {
		
		String sql="select * from PPLD3L4";
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql); 
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.format("%10s %30s %30s %30s\n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return null;
		
	}
}
