package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				Skill skill= new Skill(null, null);
		Player player=new Player(null, null, null, skill);
		SkillDAO  skillDAO=new SkillDAO();
		PlayerDAO  playerDAO=new PlayerDAO();
		
		System.out.println("Enter the skillid of player you want to view");
		long skillid=Integer.parseInt(br.readLine());
		skill.setSkillld(skillid);
		System.out.format("%10s %30s %30s %30s\n","Skill Id","Player Name","Country","Skill");
		skillDAO.getSkillBylD(skillid);
		System.out.println("List of all players with skills");
		System.out.format("%10s %30s %30s %30s\n","Skill Id","Player Name","Country","Skill");
		playerDAO.getAllPlayers();
	}
}
