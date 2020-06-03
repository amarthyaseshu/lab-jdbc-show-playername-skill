package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
		//Method used to fetch the skill information from the database based on the skill id.
	
	public Skill getSkillBylD(Long id) throws ClassNotFoundException, SQLException {
		
		String sql="select * from PPLD3L4";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			if(id.equals(rs.getLong("id")))
				
				System.out.format("%10s %30s %30s %30s\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return null;
		
	}
	
	
	
}
