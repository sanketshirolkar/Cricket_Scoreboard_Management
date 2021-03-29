package com.cricketscoreboard.java;

public class Players 
{
	public static String[] teamOne;
	public static String[] teamTwo;
	int length = TeamLists.bothTeamList.length;
	public void team_One()
	{
		teamOne = new String[length/2];
		for (int i=0; i<length/2; i++)
		{
			teamOne[i] = TeamLists.bothTeamList[i];
			
		}
	}
	public void team_Two()
	{
		teamTwo = new String[length-(teamOne.length)];
		for (int i=0; i<length; i++)
		{
			teamTwo[i] = TeamLists.bothTeamList[i];
		}
		System.out.println(teamTwo[8]);
	}
	
	
	
}
