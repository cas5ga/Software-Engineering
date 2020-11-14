//////////////////////////////////////////////////////////////////////
//CSC2220
//Programming Assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the baseball team class. All actions that a baseball
team can perform and all baseball team stats are written in this class
Several print methods as well as an array of baseball players arein
this class*/
/////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaseballTeam{

//default constructor:
   public BaseballTeam(){
      setMarker(0);
   }

//setters:
   public void setLocationName(String s){
      locationName = s;
   }

   public void setTeamName(String s, int team){
	  if(team == 1) {
		  GUI.setLblAwayScore(s);
	  } else {
		  GUI.setLblHomeScore(s);
	  }
      teamName = s;
   }
   public void setMarker(int x){
      marker = x;
   }

//getters
   public String getLocationName(){
      return locationName;
   }

   public String getTeamName(){
      return teamName;
   }
   
   public int getMarker(){
      return marker;
   }

   public BaseballPlayer getBatter(){
   
      if(marker == 8){
         marker = 0;
      }
      
      marker++;
      return (Batter) roster.get(marker-1);
   }
   
   public Batter getCurrentBatter(){
      if(marker - 1 != -1 && marker != 9){
         return (Batter) roster.get(marker - 1);
      } else {
         return (Batter) roster.get(0);
      }
   }
   
   public Batter getPreviousBatter(){
	      if(marker - 2 != -1 && marker != 10){
	         return (Batter) roster.get(marker - 2);
	      } 
	      if(marker -2 == -1){
	    	  return (Batter) roster.get(7);
	      }else {
	      
	         return (Batter) roster.get(0);
	      }
	   }
   
   public Pitcher getPitcher(){
      return (Pitcher) roster.get(8);
   }
   
   
   public void decrementMarker() {
	   marker--;
	   if(marker == -1) {
		   marker = 8;
	   }
   }
   
   //read away team file
   public void FileTeamSet (String FileName)
   {
	   String line;
	   int counter = 0;

		   Scanner T = new Scanner(FileName);
	            
		   ArrayList<BaseballPlayer> team = new ArrayList<BaseballPlayer>(9);
		   
		   while(counter < 8){ //Continues through the loop until there are 8 batters, then breaks out and added the pitcher
			   
			   line = T.nextLine(); //Moves to the next line in the file
			   String[] values = line.split(" "); //Splits the line from the file up into separate parts
			   
			   Batter newBatter = new Batter(values[0], values[1], values[2] ,Integer.parseInt(values[3]),  Integer.parseInt(values[4]), Integer.parseInt(values[5]), 
					   Integer.parseInt(values[6]), Integer.parseInt(values[7]),
					   Integer.parseInt(values[8]), Integer.parseInt(values[9]), Integer.parseInt(values[10]), Integer.parseInt(values[11]), Integer.parseInt(values[12])); 
			 //Creates a batter with first name,last name, position, at bats, hits, doubles, triples, home runs, walks, sac flies, runs scored, runs batted in, and strike outs
			   
			   team.add(newBatter);//Added the new batter to the team array

			   //keeps track of what player it is and when to stop looping in order to correctly store the pitcher
			   counter = counter + 1;
			   }
		   
		   line = T.nextLine(); //Moves to the next line in the file
		   
		   String[] values = line.split(" ");//Splits the line from the file up into separate parts
		   
		   //Creates a new pitcher with first name, last name, position, earned runs, outs, and innings pitched
		   Pitcher newPitcher = new Pitcher(values[0], values[1], values[2], Integer.parseInt(values[3]),  Integer.parseInt(values[4]),Integer.parseInt(values[5]));
		   
		   team.add(newPitcher);//Adds pitcher to the team
		   
		   T.close();//closes the scanner that reads the file 
		   
		   if(team.size() == 9) {
			   roster = team; //Adds the team to the roster if it is a full team, else there is no new team created
		   }
	            
	   }
   
   public void importPlayer(BaseballPlayer p, int team, int playerNum){
	  switch(team){
		  case 1: 
			  switch(playerNum) {
			  	case 1:
			  		GUI.setTfAwayBatter1(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 2:
			  		GUI.setTfAwayBatter2(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 3:
			  		GUI.setTfAwayBatter3(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 4:
			  		GUI.setTfAwayBatter4(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 5:
			  		GUI.setTfAwayBatter5(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 6:
			  		GUI.setTfAwayBatter6(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 7:
			  		GUI.setTfAwayBatter7(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 8:
			  		GUI.setTfAwayBatter8(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 9:
			  		GUI.setTfAwayPitcher(p.getFirstName() + " " + p.getLastName());
			  		break;
			  }
		  	break;
		  case 2: 
			  switch(playerNum) {
			  case 1:
			  		GUI.setTfHomeBatter1(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 2:
			  		GUI.setTfHomeBatter2(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 3:
			  		GUI.setTfHomeBatter3(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 4:
			  		GUI.setTfHomeBatter4(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 5:
			  		GUI.setTfHomeBatter5(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 6:
			  		GUI.setTfHomeBatter6(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 7:
			  		GUI.setTfHomeBatter7(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 8:
			  		GUI.setTfHomeBatter8(p.getFirstName() + " " + p.getLastName());
			  		break;
			  	case 9:
			  		GUI.setTfHomePitcher(p.getFirstName() + " " + p.getLastName());
			  		break;
			  }
		  	break;
	  }
      roster.add(p);
      
   }
  
   public ArrayList<BaseballPlayer> getRoster(){
      return roster;
   }

   private String locationName, teamName;
   private ArrayList<BaseballPlayer> roster = new ArrayList<BaseballPlayer>();
   private int marker; //keep track of where I am in the batting order...
   
}
