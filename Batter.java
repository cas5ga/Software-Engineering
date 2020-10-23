import java.math.BigDecimal;
import java.math.RoundingMode;

//////////////////////////////////////////////////////////////////////
//CSC 2220
//Programming assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the batter class. All actions that a batter 
can perform and all batter stats are written in this class*/
/////////////////////////////////////////////////////////////////////
public class Batter extends BaseballPlayer{

//Constructor, with arguments:

   public Batter(String fn, String ln, String p, int ab, int h, int d, int t, int hr, int bb, int sf, int r, int rbi, int k){
      super(fn, ln, p);
      setAtBats(ab);
      setHits(h);
      setDoubles(d);
      setTriples(t);
      setHomers(hr);
      setWalks(bb);
      setSacFlies(sf);
      setRunsScored(r);
      setRunsBattedIn(rbi);
      setStrikeouts(k);
   }

//Default constructor:
   public Batter(){
      this("", "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
   }
   
   public Batter(String f, String l, String p){
      super(f, l, p);
      setAtBats(0);
      setHits(0);
      setDoubles(0);
      setTriples(0);
      setHomers(0);
      setWalks(0);
      setSacFlies(0);
      setRunsScored(0);
      setRunsBattedIn(0);
      setStrikeouts(0);
   }
   
  //Setters
   public void setAtBats(int ab){
      atBats = ab;
   }
  
  
  
   public void setDoubles(int d){
      doubles = d;
   }
  
   public void setTriples(int t){
      triples = t;
   }
  
   public void setHomers(int h){
      homers = h;
   }
  
  
  
   public void setRunsScored(int rs){
      runsScored = rs;
   }
  
   public void setRunsBattedIn (int rbi){
      runsBattedIn = rbi;
   }
  
   public void setSacFlies(int sf){
      sacFlies = sf;
   }
  
  
   
   //getters
         
   public int getAtBats(){
      return atBats;
   }
   
   public int getDoubles(){
      return doubles;
   }
   
   public int getTriples(){
      return triples;
   }
   
   public int getHomers(){
      return homers;
   }
   
   
   public int getSacFlies(){
      return sacFlies;
   }
   
   
   public int getRunsScored(){
      return runsScored;
   }
   
   public int getRunsBattedIn(){
      return runsBattedIn;
   }
   
  //incrementers
   public void incrementAtBats(){ //change all incrementers from private to public
      atBats++;
   }
  
   public void incrementSacFlies(){
      sacFlies++;
   }
  
   public void incrementSingles(){
      singles++;
   }
  
   public void incrementDoubles(){
      doubles++;
   }
  
   public void incrementTriples(){
      triples++;
   }
  
   public void incrementHomers(){
      homers++;
      incrementRunsScored();
   }
  
  
   public void incrementRunsScored(){ //because a batter can only score one run - on a homer
      runsScored++;
   }
  
   public void updateRunsBattedIn(int rbi){
      runsBattedIn += rbi;
   }
   
  
  
   
   public void scorePlay(BaseballGame.PlayResult pr, int rbi){
   
      updateRunsBattedIn(rbi);
   
      if((pr!=BaseballGame.PlayResult.WALK)&&(pr!=BaseballGame.PlayResult.SACFLY)){
      //the only times that the at-bats don't get incremented are when a batter walks or
      //hits a sac fly
         incrementAtBats();
      }
      
      
      switch(pr){ //yes, we double-count XBH (extra-base hits) and hits...
         case HOMER: 
            incrementHomers();
            incrementHits();
            break;
         case TRIPLE:
            incrementTriples();
            incrementHits();
            break;
         case DOUBLE:
            incrementDoubles();
            incrementHits();
            break;
         case SINGLE:
            incrementHits();
            break;
         case WALK:
            incrementWalks();
            break;
         case STRIKEOUT:
            incrementStrikeouts();
            break;
      
      
      }
   
   }
   
   //on-base percentage: (hits+walks)/(atbats + walks)
   public double onBasePercentage(){
      if((atBats+walks) != 0){
         return (double)(hits+walks)/(atBats+walks);
      }
      else{
         return (double)(hits+walks)/1;
      }
   }
   
   
   //slugging percentage: (singles + (2*doubles)+(3*triples)+(4*homers))/at-bats
   public double sluggingPercentage(){//or we can look at this as total bases divided by at-bats
      int singles = hits - (doubles + triples + homers);
      if(atBats != 0){
         return (double)(singles + (2*doubles) + (3*triples) + (4*homers))/(atBats);
      }
      else{
         return (double)(singles + (2*doubles) + (3*triples) + (4*homers))/1;
      }
   }
   //batting average: hits/atbats
   public double battingAverage(){
      if(atBats != 0){
         return round(((double)hits/atBats), 3);
      }
      else{
         return round(((double)hits/1), 3);
      }
   }


   public static double round(double value, int places) {//Used to round averages
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
   //this could be private or protected, if we were going to extend this class somehow...
   private int atBats, sacFlies, doubles, triples, homers, runsScored, runsBattedIn, singles;


}