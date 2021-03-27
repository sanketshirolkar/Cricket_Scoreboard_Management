package com.cricketscoreboard.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamLists 
{
	public static String [] bothTeamList = new String[24]; //Only if team lists are provided in standard manner.
	ArrayList<String> list = new ArrayList<>();
	public static String path;
	
	public void generateTeamLists()
	{
		
		File file = new File(path);
		Scanner read = null;
	//while(true)
	//{
		try 
		{
			
			read = new Scanner(file);
	
			while(read.hasNextLine())
			{
				list.add(read.nextLine());
			}	
			list.remove(12);
			list.toArray(bothTeamList);
			for(String namesOfEachTeamPlayers:bothTeamList)
			{
				System.out.println(namesOfEachTeamPlayers);
			}
			
		}
		catch (FileNotFoundException ex) 
		{
			System.out.println("File not found");
				//ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(read!=null)
					read.close();
			}
			catch(NullPointerException e)
			{
			
			}
		}
	}
	
}
