//////////////////////////////////////////////////////////////////////
//CSC 2220
//Programming assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the baseball player class. All actions that a baseball
player can perform and all baseball player stats are written in this class*/
/////////////////////////////////////////////////////////////////////
public abstract class BaseballPlayer{


//Constructor with arguments...
   public BaseballPlayer(String fn, String ln, String p){
      setFirstName(fn);
      setLastName(ln);
      setPosition(p);
      setHits(0);
      setWalks(0);
      setStrikeouts(0);
   }
   
   
   //Constructor without arguments, calling the first constructor
   public BaseballPlayer(){
      this("", "", "");
   }
   
   
   //setters
   public void setFirstName(String s){
      firstName = s;
   }
   
   public void setLastName(String s){
      lastName = s;
   }
   
   public void setPosition(String s){
      position = s;
   }
   
   public void setHits(int s){
      hits = s;
   }
   
   public void setWalks(int w){
      walks = w;
   }
   
   public void setStrikeouts(int s){
      strikeouts = s;
   }
   
   //getters
   public String getFirstName(){
      return firstName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public String getPosition(){
      return position;
   }
   
   public int getHits(){
      return hits;
   }
   
   public int getWalks(){
      return walks;
   }
   
   public int getStrikeouts(){
      return strikeouts;
   }
   
   protected void incrementStrikeouts(){
      strikeouts++;
   }
   
   protected void incrementWalks(){
      walks++;
   }
   
   protected void incrementHits(){
      hits++;
   }
   
   //information is different for how a play will be scored between batter and pitcher
   public abstract void scorePlay(BaseballGame.PlayResult pr, int r);
   
   //since we're also dealing with inheritance, declare the data as protected...
   protected String firstName, lastName, position;
   protected int hits, walks, strikeouts;
   
}
