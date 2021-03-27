package com.cricketscoreboard.java;

public class MatchInformation 
{
	static String venue;
	static String team1;
	static String team2;
	
	static int maxOversPerInnings;
    static int toss;
    static int choose;
	public void matchInfo()
	{
	
			if(maxOversPerInnings==50)
			{
				System.out.println("Hello and warm welcome to the One Day International match between "+team1+" and "+team2+" from "+venue+".");
			}
			else if(maxOversPerInnings==20)
			{	
				System.out.println("Hello and warm welcome to the t-20 International match between "+team1+" and "+team2+" from "+venue+".");
			}
			else
			{
				System.out.println("Overs should be either 20 or 50");
			}
			
		System.out.println("Stay tuned, toss and team news coming your way in a bit.");		
	}
	
	
	public void tossUpdate()
	{
		String choice="";
			
		if(choose==1)
		{
			choice = "bat";
		}
		else if(choose==2)
		{
			choice="field";
		}
		else
		{
			System.out.println("choice selection should be either 1 or 2. 1 for bat and 2 for field");
		}
					
		if(toss!=1 && toss!=2)
		{     
			System.out.println("Available options are only 1 or 2 and bat or field. So invalid input");
		}
		else
		{
			switch(toss)
			{
				case 1:
					System.out.println(team1+" won the toss and opted to "+choice+" first");
					break;
				case 2:
					System.out.println(team2+" won the toss and opted to "+choice+" first");
					break;
			}
		}
	}
}
