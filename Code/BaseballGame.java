/////////t///////////////////////////////////////////////////////////
//CSC2220
//Programming Assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the baseball game class. All actions that can occur
in a baseball game are written in this class*/
/////////////////////////////////////////////////////////////////////
import java.security.SecureRandom;
import java.util.ArrayList;
import java.awt.Color;

public class BaseballGame{

   public enum PlayResult{SINGLE, DOUBLE, TRIPLE, HOMER, WALK, STRIKEOUT, FLYOUT, SACFLY, POPOUT, GROUNDOUT, DOUBLEPLAY};
   private static int halfInning = 1;
   private static int inning = 1;
   private static Batter emptyPlayer = new Batter("(Empty)", "", "");
   private static Batter[] bases = {emptyPlayer, emptyPlayer, emptyPlayer};
   private static int[] scoreboard = new int[18];
   private static int numberOfOuts = 0, numDoublPlayOuts = 0;
   private static int numberOfHits_AWAY = 0, numberOfWalks_AWAY = 0, numberOfRuns_AWAY = 0;
   private static int numberOfHits_HOME = 0, numberOfWalks_HOME = 0, numberOfRuns_HOME = 0;
   private static int numRunsThisPlay = 0, numOutsThisPlay = 0, numWalksThisPlay = 0, numHitsThisPlay = 0;
   private static PlayResult pr;
   private static BaseballTeam home = new BaseballTeam();
   private static BaseballTeam away = new BaseballTeam();
   private int walkingToPlate = 0;
   
   
   ////////////////////////////////////////////////////////////////////////////////
   /////////////////////////// START PLAY METHODS ////////////////////////////////
   //////////////////////////////////////////////////////////////////////////////  
    
   //////////////////////////////////WALK/////////////////////////////////
   public static void walk(Batter b){
	  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
		  bases[2].incrementRunsScored();
	  }
      if(getHalfInning()%2 == 0){
         numberOfWalks_AWAY++;
      }
      else{
         numberOfWalks_HOME++;
      } 
      if(bases[0] != emptyPlayer && bases [1] != emptyPlayer && bases[2] != emptyPlayer){//If bases are loaded, all players advance a base and a run is added
         if(halfInning%2 == 0){
            numberOfRuns_AWAY++;
         }
         else{
            numberOfRuns_HOME++;
         }
         numRunsThisPlay++;
         bases[2] = bases[1];//Second base runner goes to third
         bases[1] = bases[0];//First base runner goes to second
         bases[0] = b;//Batter goes to first
      }
      if(bases[0] != emptyPlayer && bases [1] != emptyPlayer && bases[2] == emptyPlayer){//If there is a person on first and second but not third
         bases[2] = bases[1];//Second goes to third
         bases[1] = bases[0];//First goes to second
         bases[0] = b;//Batter goes to first
      }
      if(bases[0] != emptyPlayer && bases [1] == emptyPlayer){//If there is a person on first but not second
         bases[1] = bases[0];//First goes to second
         bases[0] = b;//Batter goes to first
      }
      if(bases[0] == emptyPlayer){//Noone on first
         bases[0] = b;//Batter goes to first
      }
      numWalksThisPlay++;
   }   
   
   //////////////////////////////////SINGLE/////////////////////////////////
   public static void single(Batter b){
	  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
		bases[2].incrementRunsScored();
	  }
      if(bases[2] != emptyPlayer){//If a runner is on third, add a run and take them off of third
         if(halfInning%2 == 0){
            numberOfRuns_AWAY++;
         }
         else{
            numberOfRuns_HOME++;
         }
         numRunsThisPlay++;
         bases[2] = emptyPlayer;
      }
      if(bases[1] != emptyPlayer){//If a runner is on second, move them to third and take the runner off of second
         bases [2] = bases[1];
         bases [1] = emptyPlayer;
         
      }
      if(bases[0] != emptyPlayer){//If a runner is on first, move them to second but keep the runner on first since the batter goes to first
         bases [1] = bases[0];
         bases[0] = b;
      }
      if(bases[0] == emptyPlayer){
         bases[0] = b;
      }
      if(halfInning%2 == 0){//Adding hits
         numberOfHits_AWAY++;
      }
      else{
         numberOfHits_HOME++;
      } 
      numHitsThisPlay++;
   }
   
   //////////////////////////////////DOUBLE/////////////////////////////////
   public static void doubleHit(Batter b){
		  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
			  bases[2].incrementRunsScored();
		  }
		  if(bases[1] != emptyPlayer) {//Increment second base runner's runs if they are batted in
			  bases[1].incrementRunsScored();
		  }
      if(bases[2] != emptyPlayer){//If a runner is on third, send them home and empty third base
         bases[2] = emptyPlayer;
         if(halfInning%2 == 0){
            numberOfRuns_AWAY++;
         }
         else{
            numberOfRuns_HOME++;
         }
         numRunsThisPlay++;
      }
      if(bases[1] != emptyPlayer){//If a runner is on second, send them home and put the batter on second
         if(halfInning%2 == 0){
            numberOfRuns_AWAY++;
         }
         else{
            numberOfRuns_HOME++;
         }
         numRunsThisPlay++;
         bases[1] = b;
      }
      if(bases[0] != emptyPlayer){//If a batter is on first, empty first base and send them to third
         bases[2] = bases[0];//First to third
         bases[1] = b;//Batter to second
         bases[0] = emptyPlayer;
      }
      if(bases[1] == emptyPlayer){
         bases[1] = b;
      }
      if(halfInning%2 == 0){//Adding hits
         numberOfHits_AWAY++;
      }
      else{
         numberOfHits_HOME++;
      }
      //b.incrementDoubles();//Incrementing doubles of the passed batter
      numHitsThisPlay++;
   }
   
   //////////////////////////////////TRIPLE/////////////////////////////////
   public static void triple(Batter b){
		  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
			  bases[2].incrementRunsScored();
		  }
		  if(bases[1] != emptyPlayer) {//Increment second base runner's runs if they are batted in
			  bases[1].incrementRunsScored();
		  }
		  if(bases[0] != emptyPlayer) {//Increment first base runner's runs if they are batted in
			  bases[0].incrementRunsScored();
		  }
      for (int i = 0; i < bases.length; i++) {//Loop that adds a run to the respective team for each time there is a runner on base
         if(bases[i] != emptyPlayer){
            if(halfInning%2 == 0){
               numberOfRuns_AWAY++;
            }
            else{
               numberOfRuns_HOME++;
            }
            numRunsThisPlay++;
         }
      }
      if(halfInning%2 == 0){//Addding hits
         numberOfHits_AWAY++;
      }
      else{
         numberOfHits_HOME++;
      }
      numHitsThisPlay++;
      bases[0] = emptyPlayer;//Sending the batter to third base and clearing the other bases 
      bases[1] = emptyPlayer;
      bases[2] = b;
   }
   
   //////////////////////////////////HOMER/////////////////////////////////
   public static void homeRun(Batter b){
		  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
			  bases[2].incrementRunsScored();
		  }
		  if(bases[1] != emptyPlayer) {//Increment second base runner's runs if they are batted in
			  bases[1].incrementRunsScored();
		  }
		  if(bases[0] != emptyPlayer) {//Increment first base runner's runs if they are batted in
			  bases[0].incrementRunsScored();
		  }
      for (int i = 0; i < bases.length; i++) {
         if(bases[i] != emptyPlayer){//If someone is on a base, add a run
            if(halfInning%2 == 0){
               numberOfRuns_AWAY++;
            }
            else{
               numberOfRuns_HOME++;
            }
            numRunsThisPlay++;
         }
      }
      if(halfInning%2 == 0){//Automatically add 1 more run for the batter
         numberOfRuns_AWAY++;
      }
      else{
         numberOfRuns_HOME++;
      }
      if(halfInning%2 == 0){//Adding hits
         numberOfHits_AWAY++;
      }
      else{
         numberOfHits_HOME++;
      }
      numRunsThisPlay ++;
      bases[0] = emptyPlayer;//Empty the bases
      bases[1] = emptyPlayer;
      bases[2] = emptyPlayer;
   }
   
   //////////////////////////////////DOUBLE PLAY/////////////////////////////////
   public static void doublePlay(Batter b){
      if(bases[0] == emptyPlayer && bases[1] == emptyPlayer && bases[2] == emptyPlayer){//If the bases are empty, add 1 out
         //b.incrementAtBats();//Increment at bats of the passed batter
         numOutsThisPlay++;
         numberOfOuts++;
         return;
      }
      else{//Else, remove the furthest two runners
         if(bases[2] != emptyPlayer && numDoublPlayOuts != 2){//If there is someone on third and there hasnt already been 2 outs, remove him.
            bases[2] = emptyPlayer;
            numDoublPlayOuts++;
            numOutsThisPlay++;
            numberOfOuts++;
         }
         if(bases[1] != emptyPlayer && numDoublPlayOuts != 2){//If there is someone on second and there hasnt already been 2 outs, remove him.
            bases[1] = emptyPlayer;
            numDoublPlayOuts++;
            numOutsThisPlay++;
            numberOfOuts++;
         }
         if(bases[0] != emptyPlayer && numDoublPlayOuts != 2){//If there is someone on first and there hasnt already been 2 outs, remove him.
            numDoublPlayOuts++;                         //Then, check if the person on first was the second out, and if not remove the batter.
            numOutsThisPlay++; 
                                                                     
            if(numDoublPlayOuts != 2){//If the runner on first base was the first out of the double play, first base is empty because that means the batter was the second out
               bases[0] = emptyPlayer;
            }
            else{//If the first base runner was the second out in the double play, allow the batter to go to first base
               bases[0] = b;
               //b.incrementHits();//Increment hits of the passed batter
            }
                        
            numberOfOuts++;
         }
      }
      numDoublPlayOuts = 0;
      
   }
   
   //////////////////////////////////SAC FLY/////////////////////////////////   
   public static void sacFly(Batter b){
		  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
			  bases[2].incrementRunsScored();
		  }
      if(numberOfOuts < 2){//If its not the third out, it is essentially a ground out
         if(bases[2] != emptyPlayer){//If a runner is on third, add a run and take them off of third
            if(halfInning%2 == 0){
               numberOfRuns_AWAY++;
            }
            else{
               numberOfRuns_HOME++;
            }
            //b.incrementAtBats();//If the batter's sac fly scores a run, add an at bat for that batter 
            numRunsThisPlay++;
            bases [2] = emptyPlayer;
         }
         if(bases[1] != emptyPlayer){//If a runner is on second, move them to third and take the runner off of second
            bases [2] = bases[1];
            bases [1] = emptyPlayer;
            
         }
         if(bases[0] != emptyPlayer){//If a runner is on first, move them to second but remove the person from first since the batter is out
            bases[1] = bases[0];
            bases [0] = emptyPlayer;
         }
      }
      //b.incrementSacFlies();//Incrementing the batters sac flies
      numOutsThisPlay++;
      numberOfOuts++;
   }
   
   //////////////////////////////////GROUND OUT/////////////////////////////////
   public static void groundOut(Batter b){
		  if(bases[2] != emptyPlayer) {//Increment third base runner's runs if they are batted in
			  bases[2].incrementRunsScored();
		  }
      if(bases[2] != emptyPlayer){//If a runner is on third, add a run and take them off of third
         if(halfInning%2 == 0){
                       
            numberOfRuns_AWAY++;
         }
         else{
            numberOfRuns_HOME++;
         }
         numRunsThisPlay++;
         bases [2] = emptyPlayer;
      }
      if(bases[1] != emptyPlayer){//If a runner is on second, move them to third and take the runner off of second
         bases[2] = bases[1];
         bases [1] = emptyPlayer;
      }
      if(bases[0] != emptyPlayer){//If a runner is on first, move them to second but remove the person from first since the batter is out
         bases[1] = bases[0];
         bases [0] = emptyPlayer;
      }
      //b.incrementAtBats();//Incrementing the batters at bats
      numOutsThisPlay++;
      numHitsThisPlay++;
      numberOfOuts++;
   }
   
   //////////////////////////////////OUTS/////////////////////////////////
   public static void variousOuts(Batter b){
      //b.incrementAtBats();
      numberOfOuts++;
      numOutsThisPlay++;
   }
   
      
   public static int getNumberOfOuts(){
      return numberOfOuts;
   }
   
   public static int roll(){
   
      SecureRandom randomNumbers = new SecureRandom();
      int die;
      die = randomNumbers.nextInt(6) + 1;
      
      return die;
   
   }
   
   public static int getNumRunsThisPlay(){
      return numRunsThisPlay;
   }
   ////////////////////////////////////////////////////////////////////////////////
   /////////////////////////// END PLAY METHODS //////////////////////////////////
   //////////////////////////////////////////////////////////////////////////////      
   
   
   
   
   
   //////////////////////////////////////////////////////////////////////////////////
   /////////////////////////// START MISC METHODS //////////////////////////////////
   ////////////////////////////////////////////////////////////////////////////////  
   public static void getNextPlayUpdateStats(){//Gets the next play and updates guis and stats based on the play
      
      int die1, die2, temp;
      die1 = roll(); //roll the first die
      die2 = roll(); //roll the second die
      
      while((die1 == 5 && die2 == 6) && numberOfOuts > 1){ //rerolls the dice if a sac fly is rolled while at 2 outs
    	  die1 = roll();
          die2 = roll();
      }

      if(die1>die2){ //swap to accommodate switch statement
         temp = die1;
         die1 = die2;
         die2 = temp;
      }
      
      PlayResult result = PlayResult.WALK;
      
      switch(die1){//Switch that a random dice toll is passed into
         case 1:
            switch(die2){
               case 1:
                  GUI.setTfPreviousPlayResult("Home Run");//Update GUI to display play result
                  result = PlayResult.HOMER;
                  if(BaseballGame.getHalfInning() % 2 ==0){//If it is a home batter
                     BaseballGame.homeRun(getHomeTeam().getPreviousBatter());//Update player stats based on the play               
                  }
                  else{//If it is an away batter
                     BaseballGame.homeRun(getAwayTeam().getPreviousBatter());//Update player stats based on the play
                  }
                  break;
               case 2://Repeat the previous for each possible random play
                  GUI.setTfPreviousPlayResult("Double!");
                  result = PlayResult.DOUBLE;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.doubleHit(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.doubleHit(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 3:
                  GUI.setTfPreviousPlayResult("Fly out!");
                  result = PlayResult.FLYOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 4:
                  GUI.setTfPreviousPlayResult("Walk");
                  result = PlayResult.WALK;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.walk(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.walk(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 5:
                  GUI.setTfPreviousPlayResult("Pop out.");
                  result = PlayResult.POPOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 6:
                  GUI.setTfPreviousPlayResult("Single.");
                  result = PlayResult.SINGLE;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.single(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.single(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
         case 2:
            switch(die2){
               
               case 2:
                  GUI.setTfPreviousPlayResult("Double play.");
                  result = PlayResult.DOUBLEPLAY;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.doublePlay(getAwayTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.doublePlay(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 3:
                  GUI.setTfPreviousPlayResult("Ground out.");
                  result = PlayResult.GROUNDOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.groundOut(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.groundOut(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 4:
                  GUI.setTfPreviousPlayResult("Strike out.");
                  result = PlayResult.STRIKEOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 5:
                  GUI.setTfPreviousPlayResult("Single.");
                  result = PlayResult.SINGLE;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.single(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.single(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 6:
                  GUI.setTfPreviousPlayResult("Strike out.");
                  result = PlayResult.STRIKEOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
         case 3:
            switch(die2){
               
               case 3:
                  GUI.setTfPreviousPlayResult("Walk");
                  result = PlayResult.WALK;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.walk(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.walk(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 4:
                  GUI.setTfPreviousPlayResult("Triple.");
                  result = PlayResult.TRIPLE;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.triple(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.triple(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 5:
                  GUI.setTfPreviousPlayResult("Ground out.");
                  result = PlayResult.GROUNDOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.groundOut(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.groundOut(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 6:
                  GUI.setTfPreviousPlayResult("Fly out.");
                  result = PlayResult.FLYOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
         case 4:
            switch(die2){
               
               case 4:
                  GUI.setTfPreviousPlayResult("Walk");
                  result = PlayResult.WALK;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.walk(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.walk(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 5:
                  GUI.setTfPreviousPlayResult("Pop out.");
                  result = PlayResult.POPOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 6:
                  GUI.setTfPreviousPlayResult("Strike out.");
                  result = PlayResult.STRIKEOUT;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.variousOuts(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.variousOuts(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
         case 5:
            switch(die2){
               case 5:
                  GUI.setTfPreviousPlayResult("Double.");
                  result = PlayResult.DOUBLE;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.doubleHit(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.doubleHit(getAwayTeam().getPreviousBatter());  
                  }
                  break;
               case 6:
                  GUI.setTfPreviousPlayResult("Sac fly.");
                  result = PlayResult.SACFLY;
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.sacFly(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.sacFly(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
         case 6:
            switch(die2){
               
               case 6:
                  GUI.setTfPreviousPlayResult("Home Run!");
                  result = PlayResult.HOMER;
                  //numRunsThisPlay--; //Dont count the batter to the RBIs
                  if(BaseballGame.getHalfInning() % 2 ==0){
                     BaseballGame.homeRun(getHomeTeam().getPreviousBatter());                  
                  }
                  else{
                     BaseballGame.homeRun(getAwayTeam().getPreviousBatter());  
                  }
                  break;
            }
            break;
      }
      //Need to make it to where when a runner is batted in it increments their runs
      if(BaseballGame.getHalfInning() % 2 ==0){
          getHomeTeam().getPreviousBatter().scorePlay(result, numRunsThisPlay); 
          getAwayTeam().getPitcher().scorePlay(result, numRunsThisPlay); 
       }
       else{
    	   getAwayTeam().getPreviousBatter().scorePlay(result, numRunsThisPlay);  
    	   getHomeTeam().getPitcher().scorePlay(result, numRunsThisPlay); 
       }
      updatePlayerAverages();//Update the players averages based on the random play
   }
   

   
   public static void playOver(){//Function that adds the current plays runs to the score for the half inning and resets the number of runs, walks, outs, and hits for the play
      scoreboard[halfInning - 1] += numRunsThisPlay;
      numRunsThisPlay = 0; //Resetting variables
      numWalksThisPlay = 0;
      numOutsThisPlay = 0;
      numHitsThisPlay = 0;
   }
   
   public boolean endOfHalfInning(){//Function that emptys the bases array, prints an end of half inning message, resets number of outs, and updates the halfinning integer
      GUI.setTfBatter(" ");//Clearing GUI components
      GUI.setTfPitcher(" ");
      GUI.setTfUpToBat(" ");
      GUI.setTfAtBats(" ");
      GUI.setTfRuns(" ");
      GUI.setTfHits(" ");
      GUI.setTfDoubles(" ");
      GUI.setTfTriples(" ");
      GUI.setTfHomers(" ");
      GUI.setTfRBI(" ");
      GUI.setTfSacFlies(" ");
      GUI.setTfWalks(" ");
      GUI.setTfStrikeouts(" ");
      bases[0] = emptyPlayer; //End of half inning, empty the bases
      bases[1] = emptyPlayer;
      bases[2] = emptyPlayer;
      numberOfOuts = 0;//Reset numOuts
      halfInning++;//incrementHalf-Inning
      if(halfInning % 2 == 1){//Increment inning when necessary
         inning++;
      }
      getCurrentTeam().getPitcher().incrementInningsPitched();
      displayBases(); //Display empty bases
      if(inning == 10) {
    	  return false;
      } else {
    	  return true;
      }
   }
   
   public void initTeams_Away() {//Imports the default away team
      away.importPlayer(new Batter("Trent", "Grisham", "cf"), 1, 1);
      away.importPlayer(new Batter("Wil", "Myers", "rf"), 1, 2);
      away.importPlayer(new Batter("Tony", "Gwynn", "lf"), 1, 3);
      away.importPlayer(new Batter("Eric", "Hosmer", "1b"), 1, 4);
      away.importPlayer(new Batter("Jake", "Cronenworth", "2b"), 1, 5);
      away.importPlayer(new Batter("Fernando", "Tatis", "ss"), 1, 6);
      away.importPlayer(new Batter("Manny", "Machado", "3b"), 1, 7);
      away.importPlayer(new Batter("Austin", "Nola", "c"), 1, 8);
      away.importPlayer(new Pitcher("Tommy", "Pham", "p"), 1, 9);
   } 
   
   public void initTeams_Home() {//Imports the default home team
	      home.importPlayer(new Batter("Dr.", "Hatch", "cf"), 2, 1);
	      home.importPlayer(new Batter("Alex", "Dean", "rf"), 2, 2);
	      home.importPlayer(new Batter("Joe", "Bailey", "lf"), 2, 3);
	      home.importPlayer(new Batter("John", "Smith", "1b"), 2, 4);
	      home.importPlayer(new Batter("Bat", "Man", "2b"), 2, 5);
	      home.importPlayer(new Batter("Baseball", "Player", "ss"), 2, 6);
	      home.importPlayer(new Batter("Player", "One", "3b"), 2, 7);
	      home.importPlayer(new Batter("Player", "Two", "c"), 2, 8);
	      home.importPlayer(new Pitcher("Player", "Three", "p"), 2, 9);
	   } 
   
   public void initTeams_NewHome(ArrayList<String> homeFirstNames, ArrayList<String> homeLastNames) {
	      //Create new home team from input here 
	      home.importPlayer(new Batter(homeFirstNames.get(0), homeLastNames.get(0), "cf"), 2, 1);
	      home.importPlayer(new Batter(homeFirstNames.get(1), homeLastNames.get(1), "rf"), 2, 2);
	      home.importPlayer(new Batter(homeFirstNames.get(2), homeLastNames.get(2), "lf"), 2, 3);
	      home.importPlayer(new Batter(homeFirstNames.get(3), homeLastNames.get(3), "1b"), 2, 4);
	      home.importPlayer(new Batter(homeFirstNames.get(4), homeLastNames.get(4), "2b"), 2, 5);
	      home.importPlayer(new Batter(homeFirstNames.get(5), homeLastNames.get(5), "ss"), 2, 6);
	      home.importPlayer(new Batter(homeFirstNames.get(6), homeLastNames.get(6), "3b"), 2, 7);
	      home.importPlayer(new Batter(homeFirstNames.get(7), homeLastNames.get(7), "c"), 2, 8);
	      home.importPlayer(new Pitcher(homeFirstNames.get(8), homeLastNames.get(8), "p"), 2, 9);
}                                                           
	   
	   public void initTeams_NewAway(ArrayList<String> awayFirstNames, ArrayList<String> awayLastNames) {
	      //Create new away team from input here		   
		  away.importPlayer(new Batter(awayFirstNames.get(0), awayLastNames.get(0), "cf"), 1, 1); 
		  away.importPlayer(new Batter(awayFirstNames.get(1), awayLastNames.get(1), "rf"), 1, 2);
		  away.importPlayer(new Batter(awayFirstNames.get(2), awayLastNames.get(2), "lf"), 1, 3); 
		  away.importPlayer(new Batter(awayFirstNames.get(3), awayLastNames.get(3), "1b"), 1, 4); 
		  away.importPlayer(new Batter(awayFirstNames.get(4), awayLastNames.get(4), "2b"), 1, 5); 
		  away.importPlayer(new Batter(awayFirstNames.get(5), awayLastNames.get(5), "ss"), 1, 6); 
		  away.importPlayer(new Batter(awayFirstNames.get(6), awayLastNames.get(6), "3b"), 1, 7); 
		  away.importPlayer(new Batter(awayFirstNames.get(7), awayLastNames.get(7), "c"), 1, 8); 
		  away.importPlayer(new Pitcher(awayFirstNames.get(8), awayLastNames.get(8), "p"), 1, 9); 
	   }
   
   public void initBatterPitcher() {//Initializes the batter v pitcher lineup GUI
      Batter b =  (Batter) away.getBatter();//Gets the batter
      BaseballPlayer p = home.getPitcher();//Gets the pitcher
      
      GUI.setTfUpToBat(b.getFirstName() + " " + b.getLastName());//Setting the names and stats
      GUI.setTfBatter(b.getFirstName() + " " + b.getLastName());
      GUI.setTfPitcher(p.getFirstName() + " " + p.getLastName());
      setBatterStats(b);
   }


   public void displayBases() {//Prints the name of the players on each base. If base is empty, sets the text to an empty string
      if(bases[0] != emptyPlayer) {//Setting first base
         GUI.setTfFirstBase(bases[0].getFirstName() + " " + bases[0].getLastName());
      } else {
         GUI.setTfFirstBase(" ");
      }
      if(bases[1] != emptyPlayer) {//Setting second base
         GUI.setTfSecondBase(bases[1].getFirstName() + " " + bases[1].getLastName());
      } else{
         GUI.setTfSecondBase(" ");
      }
      if(bases[2] != emptyPlayer) {//Setting third base
         GUI.setTfThirdBase(bases[2].getFirstName() + " " + bases[2].getLastName());
      } else{
         GUI.setTfThirdBase(" ");
      }
   }

   public void setBatterStats(Batter b) {//Updates the stats on  the batter v pitcher panel to the stats of the passed in batter
      GUI.setTfAtBats(Integer.toString(b.getAtBats()));
      GUI.setTfRuns(Integer.toString(b.getRunsScored()));
      GUI.setTfHits(Integer.toString(b.getHits()));
      GUI.setTfDoubles(Integer.toString(b.getDoubles()));
      GUI.setTfTriples(Integer.toString(b.getTriples()));
      GUI.setTfHomers(Integer.toString(b.getHomers()));
      GUI.setTfRBI(Integer.toString(b.getRunsBattedIn()));
      GUI.setTfSacFlies(Integer.toString(b.getSacFlies()));
      GUI.setTfWalks(Integer.toString(b.getWalks()));
      GUI.setTfStrikeouts(Integer.toString(b.getStrikeouts()));
   }



   public void updateScoreboard() {//Updates the gui components of the scoreboard panel
      playOver(); //End of play, update scoreboard
      
       if(getCurrentTeam() == away) {//Updates RHW part of scoreboard for the away team
         GUI.setTfAwayRuns(numberOfRuns_HOME);
         GUI.setTfAwayWalks(numberOfWalks_HOME);
         GUI.setTfAwayHits(numberOfHits_HOME);
      }
      else {//Updates RHW part of scoreboard for the home team
         GUI.setTfHomeRuns(numberOfRuns_AWAY);
         GUI.setTfHomeWalks(numberOfWalks_AWAY);
         GUI.setTfHomeHits(numberOfHits_AWAY);
      }
      
      switch(inning) {//Updates the scores on the scoreboard based on the passed in inning
         case 1:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning1(scoreboard[0]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning1(scoreboard[1]);
            }
            break;
         case 2:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning2(scoreboard[2]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning2(scoreboard[3]);
            }
            break;
         case 3:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning3(scoreboard[4]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning3(scoreboard[5]);
            }
            break;
         case 4:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning4(scoreboard[6]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning4(scoreboard[7]);
            }
            break;
         case 5:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning5(scoreboard[8]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning5(scoreboard[9]);
            }
            break;
         case 6:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning6(scoreboard[10]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning6(scoreboard[11]);
            }
            break;
         case 7:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning7(scoreboard[12]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning7(scoreboard[13]);
            }
            break;
         case 8: 
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning8(scoreboard[14]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning8(scoreboard[15]);
            }
            break;
         case 9:
            if(getCurrentTeam() == away) {
               GUI.setTfAwayInning9(scoreboard[16]);
            }
            else if(getCurrentTeam() == home) {
               GUI.setTfHomeInning9(scoreboard[17]);
            }
            break;
      }
      numRunsThisPlay = 0;
   }

   public static void updatePlayerAverages() {//Updates the averages of the team lineup gui component
      if(getCurrentTeam() == away) {
         Batter b = away.getPreviousBatter();
         Pitcher p = home.getPitcher();
         String ba = "";
         String era = "";
      
         if(b.battingAverage() == 0.0) {//Getting the away batting average
            ba = "0.000";
         } else {
            ba = String.format("%.3f", b.battingAverage());
         }
      
         if(p.calcEarnedRunAvg() == 0.0) {//Getting the home era
            era = "0.000";
         } else {
            era = String.format("%.3f", p.calcEarnedRunAvg());
         }
         
         
      
         GUI.setTfHomeERA(era);//Setting the home era
         if(Double.parseDouble(era) < 4) {
      	   GUI.getTfHomeERA().setBackground(Color.RED);
         }
         else {
      	   GUI.getTfHomeERA().setBackground(Color.GREEN);
         }
      
         switch(away.getMarker()) {//Setting the away batting average
            case 1:
               GUI.setTfAwayAvg8(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg8().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg8().setBackground(Color.GREEN);
               }
               break;
            case 2:
               GUI.setTfAwayAvg1(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg1().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg1().setBackground(Color.GREEN);
               }
               break;
            case 3:
               GUI.setTfAwayAvg2(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg2().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg2().setBackground(Color.GREEN);
               }
               break;
            case 4:
               GUI.setTfAwayAvg3(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg3().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg3().setBackground(Color.GREEN);
               }
               break;
            case 5:
               GUI.setTfAwayAvg4(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg4().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg4().setBackground(Color.GREEN);
               }
               break;
            case 6:
               GUI.setTfAwayAvg5(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg5().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg5().setBackground(Color.GREEN);
               }
               break;
            case 7:
               GUI.setTfAwayAvg6(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg6().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg6().setBackground(Color.GREEN);
               }
               break;
            case 8:
               GUI.setTfAwayAvg7(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfAwayAvg7().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfAwayAvg7().setBackground(Color.GREEN);
               }
               break;
         }
      } else {
         Batter b = home.getPreviousBatter();
         Pitcher p = away.getPitcher();
         String ba = "";
         String era = "";
      
         if(b.battingAverage() == 0) {//Getting the home batting avg
            ba = "0.000";
         } else {
        	 ba = String.format("%.3f", b.battingAverage());
         }
      
         if(p.calcEarnedRunAvg() == 0.0) {//Getting the away era
            era = "0.000";
         } else {
            era = String.format("%.3f", p.calcEarnedRunAvg());
         }
      
         GUI.setTfAwayERA(era);//Setting the away era
         if(Double.parseDouble(era) < 4) {
        	   GUI.getTfAwayERA().setBackground(Color.RED);
           }
           else {
        	   GUI.getTfAwayERA().setBackground(Color.GREEN);
           }
      
         switch(home.getMarker()) {//Setting the home batting avg
            case 1:
               GUI.setTfHomeAvg8(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg8().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg8().setBackground(Color.GREEN);
               }
               break;
            case 2:
               GUI.setTfHomeAvg1(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg1().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg1().setBackground(Color.GREEN);
               }
               break;
            case 3:
               GUI.setTfHomeAvg2(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg2().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg2().setBackground(Color.GREEN);
               }
               break;
            case 4:
               GUI.setTfHomeAvg3(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg3().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg3().setBackground(Color.GREEN);
               }
               break;
            case 5:
               GUI.setTfHomeAvg4(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg4().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg4().setBackground(Color.GREEN);
               }
               break;
            case 6:
               GUI.setTfHomeAvg5(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg5().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg5().setBackground(Color.GREEN);
               }
               break;
            case 7:
               GUI.setTfHomeAvg6(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg6().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg6().setBackground(Color.GREEN);
               }
               break;
            case 8:
               GUI.setTfHomeAvg7(ba);
               if(Double.parseDouble(ba) < 0.25) {
            	   GUI.getTfHomeAvg7().setBackground(Color.RED);
               }
               else {
            	   GUI.getTfHomeAvg7().setBackground(Color.GREEN);
               }
               break;
         }
      }
   
   }

   public void initNextBatter() {//Initializes gui components for the next and previous batters and gets the next play for the batter
      if(walkingToPlate == 0) { //Only occurs when the previous play didnt result in a new half inning starting
         if(getHalfInning() % 2 == 0){
            BaseballPlayer b = getHomeTeam().getBatter();//Getting current batter
            BaseballPlayer pb = getHomeTeam().getPreviousBatter();//Getting previous batter
            GUI.setTfUpToBat(b.getFirstName() + " " + b.getLastName());//Setting gui strings
            GUI.setTfBatter(b.getFirstName() + " " + b.getLastName());
            GUI.setTfPreviousPlayBatter(pb.getFirstName() + " " + pb.getLastName());
            setBatterStats((Batter) b);//Setting batter stats gui
         } else{
            BaseballPlayer b = getAwayTeam().getBatter();
            BaseballPlayer pb = getAwayTeam().getPreviousBatter();
            GUI.setTfUpToBat(b.getFirstName() + " " + b.getLastName());
            GUI.setTfBatter(b.getFirstName() + " " + b.getLastName());
            GUI.setTfPreviousPlayBatter(pb.getFirstName() + " " + pb.getLastName());
            setBatterStats((Batter) b);
         }
      
         getNextPlayUpdateStats();//Getting the next play and updating the batter stats
      
      } else {//Occurs when a half inning just started
      
         GUI.setTfPreviousPlayBatter(" ");
         GUI.setTfPreviousPlayResult(" ");
         
         if(getHalfInning() % 2 == 0){
            getHomeTeam().decrementMarker();
            BaseballPlayer b = getHomeTeam().getBatter();
            BaseballPlayer p = getAwayTeam().getPitcher();
            GUI.setTfUpToBat(b.getFirstName() + " " + b.getLastName());
            GUI.setTfBatter(b.getFirstName() + " " + b.getLastName());
            GUI.setTfPitcher(p.getFirstName() + " " + p.getLastName());
            setBatterStats((Batter) b);
         } else{
            getAwayTeam().decrementMarker();
            BaseballPlayer b = getAwayTeam().getBatter();
            BaseballPlayer p = getHomeTeam().getPitcher();
            GUI.setTfUpToBat(b.getFirstName() + " " + b.getLastName());
            GUI.setTfBatter(b.getFirstName() + " " + b.getLastName());
            GUI.setTfPitcher(p.getFirstName() + " " + p.getLastName());
            setBatterStats((Batter) b);
         }
         GUI.setTfPreviousPlayOuts(0);//Resetting outs when they are >= 3
         walkingToPlate = 0;//Reset walking to plate
      }
   }

   public boolean nextPlay() {//Called when someone clicks the "next play" button
      //printEndOfGame(getHomeTeam(), getAwayTeam());//For debugging
      initNextBatter();//Displays the next batter
      GUI.setTfPreviousPlayOuts(getNumberOfOuts());//Displays current outs
      updateScoreboard();//Updates the scoreboard
      displayBases();//Refreshes the bases
      boolean b = true;
      if(getNumberOfOuts() >= 3){
         b = endOfHalfInning();//Resets various things
         walkingToPlate = 1;//Setting the walking to plate var
      } 
      return b;
   }
   
   //Getters
   public static BaseballTeam getHomeTeam() {//Returns the home team
      return home;
   }

   public static BaseballTeam getAwayTeam() {//Returns the away team
      return away;
   }
   public static int getHalfInning(){//Returns the half inning
      return halfInning;
   }
   
   //Incrementers
   public static void incrementOuts(){//Increments the outs
      numberOfOuts++;
   }
   
   public static BaseballTeam getCurrentTeam() {//Gets the current at-bat team
      if(getHalfInning() % 2 == 0) {
         return home;
      } else {
         return away;
      }
   }
     ////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// END MISC METHODS ///////////////////////////////////
   ////////////////////////////////////////////////////////////////////////////////  
}



