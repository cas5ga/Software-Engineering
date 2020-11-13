import java.math.BigDecimal;
import java.math.RoundingMode;

//////////////////////////////////////////////////////////////////////
//CSC2220
//Programming Assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the pitcher class. All actions that a pitcher
 can perform and all pitcher stats are written in this class*/
/////////////////////////////////////////////////////////////////////
public class Pitcher extends BaseballPlayer{
   private int earnedRuns = 0;
   private int outs = 0; 
   int inningCounter = 0;
   private int inningsPitched = 0;
   
   //Constructor, with all arguments
   public Pitcher(String fn, String ln, String p, int er, int o, int ip) {
       super(fn, ln, p);
       setEarnedRuns(er);
       setOuts(o);
       setInningsPitched(ip);
   }
   
   public Pitcher(String f, String l, String p){
      super(f, l, p);
   }
   
   /////////////////GETTERS/////////////////
   public int getEarnedRuns(){//Earned Runs
      return earnedRuns;
   }
   public int getInningsPitched(){//Innings Pitched
      if((inningsPitched - (int)inningsPitched) < 0.50){
         inningsPitched = (int)inningsPitched;
      }
      else if((inningsPitched - (int)inningsPitched) < 0.75){
         inningsPitched = (int)inningsPitched;
      }
      return inningsPitched;
   }
   public int getOuts() {
	   return outs;
   }
   
   /////////////////SETTERS/////////////////
   public void setEarnedRuns(int e){//Earned Runs
      earnedRuns = e;
   }
   public void setInningsPitched(int i){//Innings Pitched
      inningsPitched = i;
   }
   public void setOuts(int o) {
	  outs = o;
   }
   
   /////////////////HELPER METHODS/////////////////
   public  void scorePlay(BaseballGame.PlayResult pr, int r){//Adjusts pitcher stats according to the play that happened
      this.earnedRuns += r;
      switch(pr){
         case SINGLE:
            super.incrementHits();
            break;
         case DOUBLE:
            super.incrementHits();
            break;
         case TRIPLE:
            super.incrementHits();
            break;
         case HOMER:
            super.incrementHits();
            break;
         case WALK: 
            super.incrementWalks();
            break;
         case STRIKEOUT:
            super.incrementStrikeouts();
            break;
         case FLYOUT:
         case SACFLY:
         case POPOUT:
         case GROUNDOUT:
            super.incrementStrikeouts();
            break;
         case DOUBLEPLAY:
            super.incrementStrikeouts();
            super.incrementStrikeouts();
            break;
      }
   }
   
   public void incrementInningsPitched(){
      inningsPitched ++;
   }
   
   public double calcEarnedRunAvg(){//Calculates ERA
	   if((inningsPitched / 9.0) == 0) {
		   return (double) 0;
	   }else {
		   return (double) earnedRuns / (inningsPitched/9.0);
	   }
   }
   
   public double calcWhip(){//Calculates WHIP
      return (double)(super.getWalks() + super.getHits()) / inningsPitched;
   }
   
   public double kPerNine(){//Calculates k/9
      return (double)super.getStrikeouts() / (inningsPitched / 9.0);
   }
   
   public static double round(double value, int places) {//Used to round averages
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
