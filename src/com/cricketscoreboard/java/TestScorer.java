package com.cricketscoreboard.java;

import java.util.Scanner;

public class TestScorer 
{

	public static void main(String[] args) 
	{
		MatchInformation minfo = new MatchInformation();
		Scanner readFromKb = new Scanner(System.in);
		Scanner forPlayers = new Scanner(System.in);
		
		System.out.println("ENter no. of overs");
		MatchInformation.maxOversPerInnings = readFromKb.nextInt();
		System.out.println("ENter the venue");
		MatchInformation.venue = readFromKb.next();
		System.out.println("ENter the team 1");
		MatchInformation.team1 = readFromKb.next();
		System.out.println("ENter the team 2");
		MatchInformation.team2 = readFromKb.next();
		minfo.matchInfo();
		System.out.println("Eneter toss selection, 1 for team1 and 2 for team2");
		MatchInformation.toss = readFromKb.nextInt();
		System.out.println("Enter, what the team opted to. 1 for bat and 2 for field"); 
		MatchInformation.choose = readFromKb.nextInt();	
		minfo.tossUpdate();
		
		TeamLists tlist = new TeamLists();
		System.out.println("Enter the path");
		TeamLists.path = forPlayers.nextLine(); 
		tlist.generateTeamLists();

		Players pl = new Players();
		pl.team_One();
		pl.team_Two();
		pl.battingFirst();
		
		readFromKb.close();
		forPlayers.close();
	}	
}
