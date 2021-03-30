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
		for (int i=0; i<(length-teamOne.length); i++)
		{
			teamTwo[i] = TeamLists.bothTeamList[i+(length/2)];
		}
		//System.out.println(teamTwo[11]);
	}
	
	public void battingFirst()
	{
		if((MatchInformation.toss==1 && MatchInformation.choose==1)||(MatchInformation.toss==2 && MatchInformation.choose==2) )
		{
			System.out.println(MatchInformation.team1+" batting first");
		}
		else if((MatchInformation.toss==1 && MatchInformation.choose==2)||(MatchInformation.toss==2 && MatchInformation.choose==1))
		{
			System.out.println(MatchInformation.team2+" batting first");
		}
	}
}
