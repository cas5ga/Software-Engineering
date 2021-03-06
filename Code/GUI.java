//////////////////////////////////////////////////////////////////////
//CSC2220
//Programming Assignment 6-7
/////////////////////////////////////////////////////////////////////
/*This class is the GUI class. All gui actions 
are written in this class*/
/////////////////////////////////////////////////////////////////////
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Button;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class GUI{

	public JTextField getTfAwayInning1() {
		return tfAwayInning1;
	}

	public static void setTfAwayInning1(int i) {
		tfAwayInning1.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning1() {
		return tfHomeInning1;
	}

	public static void setTfHomeInning1(int i) {
		tfHomeInning1.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning2() {
		return tfHomeInning2;
	}

	public static void setTfHomeInning2(int i) {
		tfHomeInning2.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning2() {
		return tfAwayInning2;
	}

	public static void setTfAwayInning2(int i) {
		tfAwayInning2.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning4() {
		return tfHomeInning4;
	}

	public static void setTfHomeInning4(int i) {
		tfHomeInning4.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning4() {
		return tfAwayInning4;
	}

	public static void setTfAwayInning4(int i) {
		tfAwayInning4.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning3() {
		return tfAwayInning3;
	}

	public static void setTfAwayInning3(int i) {
		tfAwayInning3.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning3() {
		return tfHomeInning3;
	}

	public static void setTfHomeInning3(int i) {
		tfHomeInning3.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning6() {
		return tfHomeInning6;
	}

	public static void setTfHomeInning6(int i) {
		tfHomeInning6.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning6() {
		return tfAwayInning6;
	}

	public static void setTfAwayInning6(int i) {
		tfAwayInning6.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning5() {
		return tfAwayInning5;
	}

	public static void setTfAwayInning5(int i) {
		tfAwayInning5.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning5() {
		return tfHomeInning5;
	}

	public static void setTfHomeInning5(int i) {
		tfHomeInning5.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning8() {
		return tfHomeInning8;
	}

	public static void setTfHomeInning8(int i) {
		tfHomeInning8.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning8() {
		return tfAwayInning8;
	}

	public static void setTfAwayInning8(int i) {
		tfAwayInning8.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning7() {
		return tfAwayInning7;
	}

	public static void setTfAwayInning7(int i) {
		tfAwayInning7.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning7() {
		return tfHomeInning7;
	}

	public static void setTfHomeInning7(int i) {
		tfHomeInning7.setText(Integer.toString(i));
	}

	public JTextField getTfAwayInning9() {
		return tfAwayInning9;
	}

	public static void setTfAwayInning9(int i) {
		tfAwayInning9.setText(Integer.toString(i));
	}

	public JTextField getTfHomeInning9() {
		return tfHomeInning9;
	}

	public static void setTfHomeInning9(int i) {
		tfHomeInning9.setText(Integer.toString(i));
	}

	public JTextField getTfAwayWalks() {
		return tfAwayWalks;
	}

	public static void setTfAwayWalks(int numberOfWalks_AWAY) {
		tfAwayWalks.setText(Integer.toString(numberOfWalks_AWAY));
	}

	public JTextField getTfHomeWalks() {
		return tfHomeWalks;
	}

	public static void setTfHomeWalks(int numberOfWalks_HOME) {
		tfHomeWalks.setText(Integer.toString(numberOfWalks_HOME));
	}

	public JTextField getTfHomeHits() {
		return tfHomeHits;
	}

	public static void setTfHomeHits(int numberOfHits_HOME) {
		tfHomeHits.setText(Integer.toString(numberOfHits_HOME));
	}

	public JTextField getTfAwayHits() {
		return tfAwayHits;
	}

	public static void setTfAwayHits(int numberOfHits_AWAY) {
		tfAwayHits.setText(Integer.toString(numberOfHits_AWAY));
	}

	public JTextField getTfAwayRuns() {
		return tfAwayRuns;
	}

	public static void setTfAwayRuns(int numberOfRuns_AWAY) {
		tfAwayRuns.setText(Integer.toString(numberOfRuns_AWAY));
	}

	public JTextField getTfHomeRuns() {
		return tfHomeRuns;
	}

	public static void setTfHomeRuns(int numberOfRuns_HOME) {
		tfHomeRuns.setText(Integer.toString(numberOfRuns_HOME));
	}

	public JTextField getTfSecondBase() {
		return tfSecondBase;
	}

	public static void setTfSecondBase(String string) {
		tfSecondBase.setText(string);
	}

	public JTextField getTfFirstBase() {
		return tfFirstBase;
	}

	public static void setTfFirstBase(String string) {
		tfFirstBase.setText(string);
	}

	public JTextField getTfThirdBase() {
		return tfThirdBase;
	}

	public static void setTfThirdBase(String string) {
		tfThirdBase.setText(string);
	}

	public JTextField getTfUpToBat() {
		return tfUpToBat;
	}

	public static void setTfUpToBat(String string) {
		tfUpToBat.setText(string);
	}

	public static JTextField getTfAwayBatter1() {
		return tfAwayBatter1;
	}

	public static void setTfAwayBatter1(String string) {
		tfAwayBatter1.setText(string);
	}

	public static JTextField getTfAwayAvg1() {
		return tfAwayAvg1;
	}

	public static void setTfAwayAvg1(String s) {
		tfAwayAvg1.setText(s);
	}

	public static JTextField getTfAwayBatter2() {
		return tfAwayBatter2;
	}

	public static void setTfAwayBatter2(String string) {
		tfAwayBatter2.setText(string);
	}

	public static JTextField getTfAwayAvg2() {
		return tfAwayAvg2;
	}

	public static void setTfAwayAvg2(String s) {
		tfAwayAvg2.setText(s);
	}

	public static JTextField getTfAwayBatter3() {
		return tfAwayBatter3;
	}

	public static void setTfAwayBatter3(String string) {
		tfAwayBatter3.setText(string);
	}

	public static JTextField getTfAwayAvg3() {
		return tfAwayAvg3;
	}

	public static void setTfAwayAvg3(String s) {
		tfAwayAvg3.setText(s);
	}

	public static JTextField getTfAwayBatter4() {
		return tfAwayBatter4;
	}

	public static void setTfAwayBatter4(String string) {
		tfAwayBatter4.setText(string);
	}

	public static void setTfAwayAvg4(String s) {
		tfAwayAvg4.setText(s);
	}

	public void setTfAwayAvg4(JTextField tfAwayAvg4) {
		this.tfAwayAvg4 = tfAwayAvg4;
	}
	
	public static JTextField getTfAwayAvg4() {
		return tfAwayAvg4;	
	}
	
	public static JTextField getTfAwayBatter5() {
		return tfAwayBatter5;
	}

	public static void setTfAwayBatter5(String string) {
		tfAwayBatter5.setText(string);
	}

	public JLabel getLblAwayLineup() {
		return lblAwayLineup;
	}

	public void setLblAwayLineup(JLabel lblAwayLineup) {
		this.lblAwayLineup = lblAwayLineup;
	}

	public static JTextField getTfAwayAvg5() {
		return tfAwayAvg5;
	}

	public static void setTfAwayAvg5(String s) {
		tfAwayAvg5.setText(s);
	}


	public static JTextField getTfAwayBatter6() {
		return tfAwayBatter6;
	}

	public static void setTfAwayBatter6(String string) {
		tfAwayBatter6.setText(string);
	}

	public static JTextField getTfAwayAvg6() {
		return tfAwayAvg6;
	}

	public static void setTfAwayAvg6(String s) {
		tfAwayAvg6.setText(s);
	}


	public static JTextField getTfAwayBatter7() {
		return tfAwayBatter7;
	}

	public static void setTfAwayBatter7(String string) {
		tfAwayBatter7.setText(string);
	}

	public static JTextField getTfAwayAvg7() {
		return tfAwayAvg7;
	}

	public static void setTfAwayAvg7(String s) {
		tfAwayAvg7.setText(s);
	}


	public static JTextField getTfAwayBatter8() {
		return tfAwayBatter8;
	}

	public static void setTfAwayBatter8(String string) {
		tfAwayBatter8.setText(string);
	}

	public static JTextField getTfAwayAvg8() {
		return tfAwayAvg8;
	}

	public static void setTfAwayAvg8(String s) {
		tfAwayAvg8.setText(s);
	}


	public static JTextField getTfAwayPitcher() {
		return tfAwayPitcher;
	}

	public static void setTfAwayPitcher(String string) {
		tfAwayPitcher.setText(string);
	}

	public static JTextField getTfAwayERA() {
		return tfAwayERA;
	}

	public static void setTfAwayERA(String s) {
		tfAwayERA.setText(s);
	}

	public JLabel getLblAwayPitcherName() {
		return lblAwayPitcherName;
	}

	public void setLblAwayPitcherName(JLabel lblAwayPitcherName) {
		this.lblAwayPitcherName = lblAwayPitcherName;
	}

	public JLabel getLblAwayERA() {
		return lblAwayERA;
	}

	public void setLblAwayERA(JLabel lblAwayERA) {
		this.lblAwayERA = lblAwayERA;
	}

	public static JTextField getTfHomeBatter1() {
		return tfHomeBatter1;
	}

	public static void setTfHomeBatter1(String string) {
		tfHomeBatter1.setText(string);
	}

	public static JTextField getTfHomeAvg1() {
		return tfHomeAvg1;
	}

	public static void setTfHomeAvg1(String s) {
		tfHomeAvg1.setText(s);
	}

	public static JTextField getTfHomeBatter2() {
		return tfHomeBatter2;
	}

	public static void setTfHomeBatter2(String string) {
		tfHomeBatter2.setText(string);
	}

	public static JTextField getTfHomeAvg2() {
		return tfHomeAvg2;
	}

	public static void setTfHomeAvg2(String s) {
		tfHomeAvg2.setText(s);
	}

	public static JTextField getTfHomeBatter3() {
		return tfHomeBatter3;
	}

	public static void setTfHomeBatter3(String string) {
		tfHomeBatter3.setText(string);
	}

	public static JTextField getTfHomeAvg3() {
		return tfHomeAvg3;
	}

	public static void setTfHomeAvg3(String s) {
		tfHomeAvg3.setText(s);
	}

	public static JTextField getTfHomeBatter4() {
		return tfHomeBatter4;
	}

	public static void setTfHomeBatter4(String string) {
		tfHomeBatter4.setText(string);
	}

	public static JTextField getTfHomeAvg4() {
		return tfHomeAvg4;
	}

	public static void setTfHomeAvg4(String s) {
		tfHomeAvg4.setText(s);
	}

	public static JTextField getTfHomeBatter5() {
		return tfHomeBatter5;
	}

	public static void setTfHomeBatter5(String string) {
		tfHomeBatter5.setText(string);
	}

	public static JTextField getTfHomeAvg5() {
		return tfHomeAvg5;
	}

	public static void setTfHomeAvg5(String s) {
		tfHomeAvg5.setText(s);
	}

	public static JTextField getTfHomeBatter6() {
		return tfHomeBatter6;
	}

	public static void setTfHomeBatter6(String string) {
		tfHomeBatter6.setText(string);
	}

	public static JTextField getTfHomeAvg6() {
		return tfHomeAvg6;
	}

	public static void setTfHomeAvg6(String s) {
		tfHomeAvg6.setText(s);
	}

	public static JTextField getTfHomeBatter7() {
		return tfHomeBatter7;
	}

	public static void setTfHomeBatter7(String string) {
		tfHomeBatter7.setText(string);
	}

	public static JTextField getTfHomeAvg7() {
		return tfHomeAvg7;
	}

	public static void setTfHomeAvg7(String s) {
		tfHomeAvg7.setText(s);
	}

	public static JTextField getTfHomeBatter8() {
		return tfHomeBatter8;
	}

	public static void setTfHomeBatter8(String string) {
		tfHomeBatter8.setText(string);
	}

	public static JTextField getTfHomeAvg8() {
		return tfHomeAvg8;
	}

	public static void setTfHomeAvg8(String s) {
		tfHomeAvg8.setText(s);
	}

	public static JTextField getTfHomePitcher() {
		return tfHomePitcher;
	}

	public static void setTfHomePitcher(String string) {
		tfHomePitcher.setText(string);
	}

	public static JTextField getTfHomeERA() {
		return tfHomeERA;
	}

	public static void setTfHomeERA(String s) {
		tfHomeERA.setText(s);
	}

	public JTextField getTfPreviousPlayBatter() {
		return tfPreviousPlayBatter;
	}

	public static void setTfPreviousPlayBatter(String string) {
		tfPreviousPlayBatter.setText(string);
	}

	public JTextField getTfPreviousPlayResult() {
		return tfPreviousPlayResult;
	}

	public static void setTfPreviousPlayResult(String string) {
		tfPreviousPlayResult.setText(string);
	}

	public JTextField getTfPreviousPlayOuts() {
		return tfPreviousPlayOuts;
	}

	public static void setTfPreviousPlayOuts(int i) {
		tfPreviousPlayOuts.setText(Integer.toString(i));
	}

	public JLabel getLblBoxStatus() {
		return lblBoxStatus;
	}

	public void setLblBoxStatus(JLabel lblBoxStatus) {
		this.lblBoxStatus = lblBoxStatus;
	}

	public JPanel getBatterPanel() {
		return batterPanel;
	}

	public void setBatterPanel(JPanel batterPanel) {
		this.batterPanel = batterPanel;
	}

	public JLabel getLblVersus() {
		return lblVersus;
	}

	public void setLblVersus(JLabel lblVersus) {
		this.lblVersus = lblVersus;
	}

	public JTextField getTfBatter() {
		return tfBatter;
	}

	public static void setTfBatter(String string) {
		tfBatter.setText(string);
	}

	public JTextField getTfPitcher() {
		return tfPitcher;
	}

	public static void setTfPitcher(String string) {
		tfPitcher.setText(string);
	}

	public JLabel getLblCurrentBatter() {
		return lblCurrentBatter;
	}

	public void setLblCurrentBatter(JLabel lblCurrentBatter) {
		this.lblCurrentBatter = lblCurrentBatter;
	}

	public JLabel getLblCurrentPitcher() {
		return lblCurrentPitcher;
	}

	public void setLblCurrentPitcher(JLabel lblCurrentPitcher) {
		this.lblCurrentPitcher = lblCurrentPitcher;
	}

	public JLabel getLblBatterStats() {
		return lblBatterStats;
	}

	public void setLblBatterStats(JLabel lblBatterStats) {
		this.lblBatterStats = lblBatterStats;
	}

	public JLabel getLblAtBats() {
		return lblAtBats;
	}

	public void setLblAtBats(JLabel lblAtBats) {
		this.lblAtBats = lblAtBats;
	}

	public JLabel getLblRunsScored() {
		return lblRunsScored;
	}

	public void setLblRunsScored(JLabel lblRunsScored) {
		this.lblRunsScored = lblRunsScored;
	}

	public JLabel getLblHits2() {
		return lblHits2;
	}

	public void setLblHits2(JLabel lblHits2) {
		this.lblHits2 = lblHits2;
	}

	public JLabel getLblDoubles() {
		return lblDoubles;
	}

	public void setLblDoubles(JLabel lblDoubles) {
		this.lblDoubles = lblDoubles;
	}

	public JPanel getAwayPanel() {
		return awayPanel;
	}

	public void setAwayPanel(JPanel awayPanel) {
		this.awayPanel = awayPanel;
	}

	public JLabel getLblTriples() {
		return lblTriples;
	}

	public void setLblTriples(JLabel lblTriples) {
		this.lblTriples = lblTriples;
	}

	public JLabel getLblHomers() {
		return lblHomers;
	}

	public void setLblHomers(JLabel lblHomers) {
		this.lblHomers = lblHomers;
	}

	public JLabel getLblRunsBattedIn() {
		return lblRunsBattedIn;
	}

	public void setLblRunsBattedIn(JLabel lblRunsBattedIn) {
		this.lblRunsBattedIn = lblRunsBattedIn;
	}

	public JLabel getLblSacflies() {
		return lblSacflies;
	}

	public void setLblSacflies(JLabel lblSacflies) {
		this.lblSacflies = lblSacflies;
	}

	public JLabel getLblWalks2() {
		return lblWalks2;
	}

	public void setLblWalks2(JLabel lblWalks2) {
		this.lblWalks2 = lblWalks2;
	}

	public JLabel getLblStrikeOuts() {
		return lblStrikeOuts;
	}

	public void setLblStrikeOuts(JLabel lblStrikeOuts) {
		this.lblStrikeOuts = lblStrikeOuts;
	}

	public JTextField getTfAtBats() {
		return tfAtBats;
	}

	public static void setTfAtBats(String string) {
		tfAtBats.setText(string);
	}

	public JTextField getTfRuns() {
		return tfRuns;
	}

	public static void setTfRuns(String string) {
		tfRuns.setText(string);
	}

	public JTextField getTfHits() {
		return tfHits;
	}

	public static void setTfHits(String string) {
		tfHits.setText(string);
	}

	public JTextField getTfDoubles() {
		return tfDoubles;
	}

	public static void setTfDoubles(String string) {
		tfDoubles.setText(string);
	}

	public JTextField getTfTriples() {
		return tfTriples;
	}

	public static void setTfTriples(String string) {
		tfTriples.setText(string);
	}

	public JTextField getTfHomers() {
		return tfHomers;
	}

	public static void setTfHomers(String string) {
		tfHomers.setText(string);
	}

	public JTextField getTfRBI() {
		return tfRBI;
	}

	public static void setTfRBI(String string) {
		tfRBI.setText(string);
	}

	public JTextField getTfSacFlies() {
		return tfSacFlies;
	}

	public static void setTfSacFlies(String string) {
		tfSacFlies.setText(string);
	}

	public JTextField getTfWalks() {
		return tfWalks;
	}

	public static void setTfWalks(String string) {
		tfWalks.setText(string);
	}

	public JTextField getTfStrikeouts() {
		return tfStrikeouts;
	}

	public static void setTfStrikeouts(String string) {
		tfStrikeouts.setText(string);
	}
	public JLabel getLblHomeScore() {
		return lblHomeScore;
	}

	public static void setLblHomeScore(String s) {
		lblHomeScore.setText(s);
	}

	public JLabel getLblAwayScore() {
		return lblAwayScore;
	}

	public static void setLblAwayScore(String s) {
		lblAwayScore.setText(s);
	}
	BaseballGame game = new BaseballGame();
	private JFrame frmBaseball;
	protected static JTextField tfAwayInning1;
	protected static JTextField tfHomeInning1;
	protected static JTextField tfHomeInning2;
	protected static JTextField tfAwayInning2;
	protected static JTextField tfHomeInning4;
	private static JTextField tfAwayInning4;
	private static JTextField tfAwayInning3;
	private static JTextField tfHomeInning3;
	private static JTextField tfHomeInning6;
	private static JTextField tfAwayInning6;
	private static JTextField tfAwayInning5;
	private static JTextField tfHomeInning5;
	private static JTextField tfHomeInning8;
	private static JTextField tfAwayInning8;
	private static JTextField tfAwayInning7;
	private static JTextField tfHomeInning7;
	private static JTextField tfAwayInning9;
	private static JTextField tfHomeInning9;
	private static JTextField tfAwayWalks;
	private static JTextField tfHomeWalks;
	private static JTextField tfHomeHits;
	private static JTextField tfAwayHits;
	private static JTextField tfAwayRuns;
	private static JTextField tfHomeRuns;
	private static JTextField tfSecondBase;
	private static JTextField tfFirstBase;
	private static JTextField tfThirdBase;
	private static JTextField tfUpToBat;
	protected static JTextField tfAwayBatter1;
	protected static JTextField tfAwayAvg1;
	protected static JTextField tfAwayBatter2;
	protected static JTextField tfAwayAvg2;
	protected static JTextField tfAwayBatter3;
	protected static JTextField tfAwayAvg3;
	protected static JTextField tfAwayBatter4;
	protected static JTextField tfAwayAvg4;
	protected static JTextField tfAwayBatter5;
	protected JLabel lblAwayLineup;
	private static JTextField tfAwayAvg5;
	private static JTextField tfAwayBatter6;
	private static JTextField tfAwayAvg6;
	private static JTextField tfAwayBatter7;
	private static JTextField tfAwayAvg7;
	private static JTextField tfAwayBatter8;
	private static JTextField tfAwayAvg8;
	private static JTextField tfAwayPitcher;
	private static JTextField tfAwayERA;
	private JLabel lblAwayPitcherName;
	private JLabel lblAwayERA;
	private static JTextField tfHomeBatter1;
	private static JTextField tfHomeAvg1;
	private static JTextField tfHomeBatter2;
	private static JTextField tfHomeAvg2;
	private static JTextField tfHomeBatter3;
	private static JTextField tfHomeAvg3;
	private static JTextField tfHomeBatter4;
	private static JTextField tfHomeAvg4;
	private static JTextField tfHomeBatter5;
	private static JTextField tfHomeAvg5;
	private static JTextField tfHomeBatter6;
	private static JTextField tfHomeAvg6;
	private static JTextField tfHomeBatter7;
	private static JTextField tfHomeAvg7;
	private static JTextField tfHomeBatter8;
	private static JTextField tfHomeAvg8;
	private static JTextField tfHomePitcher;
	private static JTextField tfHomeERA;
	private static JTextField tfPreviousPlayBatter;
	private static JTextField tfPreviousPlayResult;
	private static JTextField tfPreviousPlayOuts;
	private JLabel lblBoxStatus;
	private JPanel batterPanel;
	private JLabel lblVersus;
	private static JTextField tfBatter;
	private static JTextField tfPitcher;
	private JLabel lblCurrentBatter;
	private JLabel lblCurrentPitcher;
	private JLabel lblBatterStats;
	private JLabel lblAtBats;
	private JLabel lblRunsScored;
	private JLabel lblHits2;
	private JLabel lblDoubles;
	protected JPanel awayPanel;
	private JLabel lblTriples;
	private JLabel lblHomers;
	private JLabel lblRunsBattedIn;
	private JLabel lblSacflies;
	private JLabel lblWalks2;
	private JLabel lblStrikeOuts;
	private static JTextField tfAtBats;
	private static JTextField tfRuns;
	private static JTextField tfHits;
	private static JTextField tfDoubles;
	private static JTextField tfTriples;
	private static JTextField tfHomers;
	private static JTextField tfRBI;
	private static JTextField tfSacFlies;
	private static JTextField tfWalks;
	private static JTextField tfStrikeouts;
	private static JLabel lblHomeScore;
	private static JLabel lblAwayScore;
	private static JButton btnStartGame;
	private static JButton btnNextPlay;
	private ArrayList<String> homeFirstNames;
	private ArrayList<String> homeLastNames;
	private ArrayList<String> awayFirstNames;
	private ArrayList<String> awayLastNames;
	private JLabel img;
	private JLabel lblNewLabel;
	
	public GUI() {
		initialize();
	}

	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 1600, 985);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		//Sets the shade of gray to be used
		Color colorGray = new Color(100,100,100);
		//Initializes the background to gray
		getFrame().getContentPane().setBackground(colorGray);
		
		//Creates the menu bar at the top of the window
		JMenuBar menuBar = new JMenuBar();
		getFrame().setJMenuBar(menuBar);
		
		//Creates a sub-menu to create a new team
		JMenu newTeam = new JMenu("Create New Team");
		JMenuItem home = new JMenuItem("Home Team");
		JMenuItem away = new JMenuItem("Away Team");
		newTeam.add(home);
		newTeam.add(away);
		
		//Creates a new frame to get names to create a new home team
		JFrame homeTeamFrame = new JFrame("Home Team");
		homeTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a new frame to get names to create a new away team
		JFrame awayTeamFrame = new JFrame("Away Team");
		awayTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Text fields to get player names for a new home team
		JTextField homeCFFirstName = new JTextField(25);
		JTextField homeCFLastName = new JTextField(25);
		JTextField homeRFFirstName = new JTextField(25);
		JTextField homeRFLastName = new JTextField(25);
		JTextField homeLFFirstName = new JTextField(25);
		JTextField homeLFLastName = new JTextField(25);
		JTextField home1BFirstName = new JTextField(25);
		JTextField home1BLastName = new JTextField(25);
		JTextField home2BFirstName = new JTextField(25);
		JTextField home2BLastName = new JTextField(25);
		JTextField homeSSFirstName = new JTextField(25);
		JTextField homeSSLastName = new JTextField(25);
		JTextField home3BFirstName = new JTextField(25);
		JTextField home3BLastName = new JTextField(25);
		JTextField homeCFirstName = new JTextField(25);
		JTextField homeCLastName = new JTextField(25);
		JTextField homePFirstName = new JTextField(25);
		JTextField homePLastName = new JTextField(25);
		
		//Creates the panel with labels and text boxes for new home player names
		JPanel homeTeamPane = new JPanel();
		homeTeamPane.setLayout(new BoxLayout(homeTeamPane, BoxLayout.Y_AXIS));
		homeTeamPane.add(new JLabel("Center Field - First Name: "));
		homeTeamPane.add(homeCFFirstName);
		homeTeamPane.add(new JLabel("Center Field - Last Name: "));
		homeTeamPane.add(homeCFLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("Right Field - First Name: "));
		homeTeamPane.add(homeRFFirstName);
		homeTeamPane.add(new JLabel("Right Field - Last Name: "));
		homeTeamPane.add(homeRFLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("Left Field - First Name: "));
		homeTeamPane.add(homeLFFirstName);
		homeTeamPane.add(new JLabel("Left Field - Last Name: "));
		homeTeamPane.add(homeLFLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("1st Base - First Name: "));
		homeTeamPane.add(home1BFirstName);
		homeTeamPane.add(new JLabel("1st Base - Last Name: "));
		homeTeamPane.add(home1BLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("2nd Base - First Name: "));
		homeTeamPane.add(home2BFirstName);
		homeTeamPane.add(new JLabel("2nd Base - Last Name: "));
		homeTeamPane.add(home2BLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("Short Stop - First Name: "));
		homeTeamPane.add(homeSSFirstName);
		homeTeamPane.add(new JLabel("Short Stop - Last Name: "));
		homeTeamPane.add(homeSSLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("3rd Base - First Name: "));
		homeTeamPane.add(home3BFirstName);
		homeTeamPane.add(new JLabel("3rd Base - Last Name: "));
		homeTeamPane.add(home3BLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("Catcher - First Name: "));
		homeTeamPane.add(homeCFirstName);
		homeTeamPane.add(new JLabel("Catcher - Last Name: "));
		homeTeamPane.add(homeCLastName);
		homeTeamPane.add(new JLabel(" "));
		homeTeamPane.add(new JLabel("Pitcher - First Name: "));
		homeTeamPane.add(homePFirstName);
		homeTeamPane.add(new JLabel("Pitcher - Last Name: "));
		homeTeamPane.add(homePLastName);
		homeTeamPane.add(new JLabel(" "));
		
		//Text fields to get player names for a new away team
		JTextField awayCFFirstName = new JTextField(25);
		JTextField awayCFLastName = new JTextField(25);
		JTextField awayRFFirstName = new JTextField(25);
		JTextField awayRFLastName = new JTextField(25);
		JTextField awayLFFirstName = new JTextField(25);
		JTextField awayLFLastName = new JTextField(25);
		JTextField away1BFirstName = new JTextField(25);
		JTextField away1BLastName = new JTextField(25);
		JTextField away2BFirstName = new JTextField(25);
		JTextField away2BLastName = new JTextField(25);
		JTextField awaySSFirstName = new JTextField(25);
		JTextField awaySSLastName = new JTextField(25);
		JTextField away3BFirstName = new JTextField(25);
		JTextField away3BLastName = new JTextField(25);
		JTextField awayCFirstName = new JTextField(25);
		JTextField awayCLastName = new JTextField(25);
		JTextField awayPFirstName = new JTextField(25);
		JTextField awayPLastName = new JTextField(25);
		
		//Creates the panel with labels and text boxes for new  player names
		JPanel awayTeamPane = new JPanel();
		awayTeamPane.setLayout(new BoxLayout(awayTeamPane, BoxLayout.Y_AXIS));
		awayTeamPane.add(new JLabel("Center Field - First Name: "));
		awayTeamPane.add(awayCFFirstName);
		awayTeamPane.add(new JLabel("Center Field - Last Name: "));
		awayTeamPane.add(awayCFLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("Right Field - First Name: "));
		awayTeamPane.add(awayRFFirstName);
		awayTeamPane.add(new JLabel("Right Field - Last Name: "));
		awayTeamPane.add(awayRFLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("Left Field - First Name: "));
		awayTeamPane.add(awayLFFirstName);
		awayTeamPane.add(new JLabel("Left Field - Last Name: "));
		awayTeamPane.add(awayLFLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("1st Base - First Name: "));
		awayTeamPane.add(away1BFirstName);
		awayTeamPane.add(new JLabel("1st Base - Last Name: "));
		awayTeamPane.add(away1BLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("2nd Base - First Name: "));
		awayTeamPane.add(away2BFirstName);
		awayTeamPane.add(new JLabel("2nd Base - Last Name: "));
		awayTeamPane.add(away2BLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("Short Stop - First Name: "));
		awayTeamPane.add(awaySSFirstName);
		awayTeamPane.add(new JLabel("Short Stop - Last Name: "));
		awayTeamPane.add(awaySSLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("3rd Base - First Name: "));
		awayTeamPane.add(away3BFirstName);
		awayTeamPane.add(new JLabel("3rd Base - Last Name: "));
		awayTeamPane.add(away3BLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("Catcher - First Name: "));
		awayTeamPane.add(awayCFirstName);
		awayTeamPane.add(new JLabel("Catcher - Last Name: "));
		awayTeamPane.add(awayCLastName);
		awayTeamPane.add(new JLabel(" "));
		awayTeamPane.add(new JLabel("Pitcher - First Name: "));
		awayTeamPane.add(awayPFirstName);
		awayTeamPane.add(new JLabel("Pitcher - Last Name: "));
		awayTeamPane.add(awayPLastName);
		awayTeamPane.add(new JLabel(" "));
		
		//ArrayLists to store home team first and last names
		homeFirstNames = new ArrayList<String>();
		homeLastNames = new ArrayList<String>();
		
		//Opens the frame with the home team player name text boxes
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showOptionDialog(homeTeamFrame, homeTeamPane, "Home Team", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if(option == JOptionPane.OK_OPTION) {
					//Empties the lists in case there were already names in the lists
					homeFirstNames.clear();
					homeLastNames.clear();
					
					//Stores user input for home team first names in an ArrayList
					homeFirstNames.add(homeCFFirstName.getText());
					homeFirstNames.add(homeRFFirstName.getText());
					homeFirstNames.add(homeLFFirstName.getText());
					homeFirstNames.add(home1BFirstName.getText());
					homeFirstNames.add(home2BFirstName.getText());
					homeFirstNames.add(homeSSFirstName.getText());
					homeFirstNames.add(home3BFirstName.getText());
					homeFirstNames.add(homeCFirstName.getText());
					homeFirstNames.add(homePFirstName.getText());

					//Stores user input for home team last names in an ArrayList
					homeLastNames.add(homeCFLastName.getText());
					homeLastNames.add(homeRFLastName.getText());
					homeLastNames.add(homeLFLastName.getText());
					homeLastNames.add(home1BLastName.getText());
					homeLastNames.add(home2BLastName.getText());
					homeLastNames.add(homeSSLastName.getText());
					homeLastNames.add(home3BLastName.getText());
					homeLastNames.add(homeCLastName.getText());
					homeLastNames.add(homePLastName.getText());
				}
			}
		});
		
		//ArrayLists to store away team first and last names
		awayFirstNames = new ArrayList<String>();
		awayLastNames = new ArrayList<String>();
		
		//Opens the frame with the away team player name text boxes
		away.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showOptionDialog(awayTeamFrame, awayTeamPane, "Away Team", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if(option == JOptionPane.OK_OPTION) {
					//Empties the lists in case there were already names in the lists
					awayFirstNames.clear();
					awayLastNames.clear();
					
					//Stores user input for home team first names in an ArrayList
					awayFirstNames.add(awayCFFirstName.getText());
					awayFirstNames.add(awayRFFirstName.getText());
					awayFirstNames.add(awayLFFirstName.getText());
					awayFirstNames.add(away1BFirstName.getText());
					awayFirstNames.add(away2BFirstName.getText());
					awayFirstNames.add(awaySSFirstName.getText());
					awayFirstNames.add(away3BFirstName.getText());
					awayFirstNames.add(awayCFirstName.getText());
					awayFirstNames.add(awayPFirstName.getText());

					//Stores user input for away team last names in an ArrayList
					awayLastNames.add(awayCFLastName.getText());
					awayLastNames.add(awayRFLastName.getText());
					awayLastNames.add(awayLFLastName.getText());
					awayLastNames.add(away1BLastName.getText());
					awayLastNames.add(away2BLastName.getText());
					awayLastNames.add(awaySSLastName.getText());
					awayLastNames.add(away3BLastName.getText());
					awayLastNames.add(awayCLastName.getText());
					awayLastNames.add(awayPLastName.getText());
				}
			}
		});
		
		//Creates the Team Options menu
		JMenu teamOptions = new JMenu("Team Options");
		//Adds the new team sub-menu to the team options menu
		teamOptions.add(newTeam);
		//Adds the team options menu to the menu bar
		menuBar.add(teamOptions);
	
		//Creates the change background color menu and adds the colors
		JMenu changeColor = new JMenu("Change Background Color");
		JMenuItem red = new JMenuItem("Red");
		JMenuItem blue = new JMenuItem("Blue");
		JMenuItem green = new JMenuItem("Green");
		JMenuItem orange = new JMenuItem("Orange");
		JMenuItem gray = new JMenuItem("Gray");
		changeColor.add(red);
		changeColor.add(blue);
		changeColor.add(green);
		changeColor.add(orange);
		changeColor.add(gray);
		
		//Specifies the exact color to be used
		Color colorRed = new Color(150,0,0);
		Color colorGreen = new Color(0,150,0);
		Color colorBlue = new Color(0,0,175);
		Color colorOrange = new Color(204,102,0);
		
		//Changes the background color to red
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorRed);
			}
		});
		
		//Changes the background color to green
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorGreen);
			}
		});
		
		//Changes the background color to blue
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorBlue);
			}
		});
		
		//Changes the background color to orange
		orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorOrange);
			}
		});
		
		//Changes the background color to gray
		gray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorGray);
			}
		});
		
		//Creates the preferences menu
		JMenu preferences = new JMenu("Preferences");
		//Adds the change background color sub-menu to the preferences menu
		preferences.add(changeColor);
		//Adds the preferences menu to the menu bar
		menuBar.add(preferences);
		
		JPanel scoreboardPanel = new JPanel();
		scoreboardPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		scoreboardPanel.setBounds(10, 16, 1575, 186);
		getFrame().getContentPane().add(scoreboardPanel);
		scoreboardPanel.setLayout(null);
		
		JLabel lblScoreboard = new JLabel("Scoreboard");
		lblScoreboard.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblScoreboard.setBounds(10, 0, 234, 52);
		scoreboardPanel.add(lblScoreboard);
		
		JLabel lblAwayScore = new JLabel("AWAY");
		lblAwayScore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAwayScore.setBounds(20, 99, 46, 25);
		scoreboardPanel.add(lblAwayScore);
		
		JLabel lblHomeScore = new JLabel("HOME");
		lblHomeScore.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHomeScore.setBounds(20, 135, 46, 25);
		scoreboardPanel.add(lblHomeScore);
		
		JLabel lblInning = new JLabel("Inning");
		lblInning.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning.setBounds(20, 68, 57, 20);
		scoreboardPanel.add(lblInning);
		
		JLabel lblInning1 = new JLabel("1");
		lblInning1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning1.setBounds(126, 66, 9, 25);
		scoreboardPanel.add(lblInning1);
		
		JLabel lblInning2 = new JLabel("2");
		lblInning2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning2.setBounds(171, 66, 9, 25);
		scoreboardPanel.add(lblInning2);
		
		JLabel lblInning3 = new JLabel("3");
		lblInning3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning3.setBounds(209, 66, 9, 25);
		scoreboardPanel.add(lblInning3);
		
		JLabel lblInning4 = new JLabel("4");
		lblInning4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning4.setBounds(254, 66, 9, 25);
		scoreboardPanel.add(lblInning4);
		
		JLabel lblInning5 = new JLabel("5");
		lblInning5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning5.setBounds(294, 66, 9, 25);
		scoreboardPanel.add(lblInning5);
		
		JLabel lblInning6 = new JLabel("6");
		lblInning6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning6.setBounds(338, 66, 9, 25);
		scoreboardPanel.add(lblInning6);
		
		JLabel lblInning7 = new JLabel("7");
		lblInning7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning7.setBounds(382, 66, 9, 25);
		scoreboardPanel.add(lblInning7);
		
		JLabel lblInning8 = new JLabel("8");
		lblInning8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning8.setBounds(426, 66, 9, 25);
		scoreboardPanel.add(lblInning8);
		
		JLabel lblInning9 = new JLabel("9");
		lblInning9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInning9.setBounds(466, 66, 9, 25);
		scoreboardPanel.add(lblInning9);
		
		tfAwayInning1 = new JTextField();
		tfAwayInning1.setEditable(false);
		tfAwayInning1.setBounds(117, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning1);
		tfAwayInning1.setColumns(10);
		
		tfHomeInning1 = new JTextField();
		tfHomeInning1.setEditable(false);
		tfHomeInning1.setColumns(10);
		tfHomeInning1.setBounds(117, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning1);
		
		tfHomeInning2 = new JTextField();
		tfHomeInning2.setEditable(false);
		tfHomeInning2.setColumns(10);
		tfHomeInning2.setBounds(161, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning2);
		
		tfAwayInning2 = new JTextField();
		tfAwayInning2.setEditable(false);
		tfAwayInning2.setColumns(10);
		tfAwayInning2.setBounds(161, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning2);
		
		tfHomeInning4 = new JTextField();
		tfHomeInning4.setEditable(false);
		tfHomeInning4.setColumns(10);
		tfHomeInning4.setBounds(243, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning4);
		
		tfAwayInning4 = new JTextField();
		tfAwayInning4.setEditable(false);
		tfAwayInning4.setColumns(10);
		tfAwayInning4.setBounds(243, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning4);
		
		tfAwayInning3 = new JTextField();
		tfAwayInning3.setEditable(false);
		tfAwayInning3.setColumns(10);
		tfAwayInning3.setBounds(199, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning3);
		
		tfHomeInning3 = new JTextField();
		tfHomeInning3.setEditable(false);
		tfHomeInning3.setColumns(10);
		tfHomeInning3.setBounds(199, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning3);
		
		tfHomeInning6 = new JTextField();
		tfHomeInning6.setEditable(false);
		tfHomeInning6.setColumns(10);
		tfHomeInning6.setBounds(330, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning6);
		
		tfAwayInning6 = new JTextField();
		tfAwayInning6.setEditable(false);
		tfAwayInning6.setColumns(10);
		tfAwayInning6.setBounds(330, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning6);
		
		tfAwayInning5 = new JTextField();
		tfAwayInning5.setEditable(false);
		tfAwayInning5.setColumns(10);
		tfAwayInning5.setBounds(286, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning5);
		
		tfHomeInning5 = new JTextField();
		tfHomeInning5.setEditable(false);
		tfHomeInning5.setColumns(10);
		tfHomeInning5.setBounds(286, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning5);
		
		tfHomeInning8 = new JTextField();
		tfHomeInning8.setEditable(false);
		tfHomeInning8.setColumns(10);
		tfHomeInning8.setBounds(418, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning8);
		
		tfAwayInning8 = new JTextField();
		tfAwayInning8.setEditable(false);
		tfAwayInning8.setColumns(10);
		tfAwayInning8.setBounds(418, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning8);
		
		tfAwayInning7 = new JTextField();
		tfAwayInning7.setEditable(false);
		tfAwayInning7.setColumns(10);
		tfAwayInning7.setBounds(374, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning7);
		
		tfHomeInning7 = new JTextField();
		tfHomeInning7.setEditable(false);
		tfHomeInning7.setColumns(10);
		tfHomeInning7.setBounds(374, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning7);
		
		tfAwayInning9 = new JTextField();
		tfAwayInning9.setEditable(false);
		tfAwayInning9.setColumns(10);
		tfAwayInning9.setBounds(456, 101, 28, 25);
		scoreboardPanel.add(tfAwayInning9);
		
		tfHomeInning9 = new JTextField();
		tfHomeInning9.setEditable(false);
		tfHomeInning9.setColumns(10);
		tfHomeInning9.setBounds(456, 139, 28, 25);
		scoreboardPanel.add(tfHomeInning9);
		
		JLabel lblRuns = new JLabel("R");
		lblRuns.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRuns.setBounds(596, 63, 21, 25);
		scoreboardPanel.add(lblRuns);
		
		JLabel lblHits = new JLabel("H");
		lblHits.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHits.setBounds(645, 63, 21, 25);
		scoreboardPanel.add(lblHits);
		
		JLabel lblWalks = new JLabel("W");
		lblWalks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWalks.setBounds(697, 66, 21, 20);
		scoreboardPanel.add(lblWalks);
		
		tfAwayWalks = new JTextField();
		tfAwayWalks.setText("0");
		tfAwayWalks.setEditable(false);
		tfAwayWalks.setColumns(10);
		tfAwayWalks.setBounds(690, 97, 28, 25);
		scoreboardPanel.add(tfAwayWalks);
		
		tfHomeWalks = new JTextField();
		tfHomeWalks.setText("0");
		tfHomeWalks.setEditable(false);
		tfHomeWalks.setColumns(10);
		tfHomeWalks.setBounds(690, 135, 28, 25);
		scoreboardPanel.add(tfHomeWalks);
		
		tfHomeHits = new JTextField();
		tfHomeHits.setText("0");
		tfHomeHits.setEditable(false);
		tfHomeHits.setColumns(10);
		tfHomeHits.setBounds(638, 135, 28, 25);
		scoreboardPanel.add(tfHomeHits);
		
		tfAwayHits = new JTextField();
		tfAwayHits.setText("0");
		tfAwayHits.setEditable(false);
		tfAwayHits.setColumns(10);
		tfAwayHits.setBounds(638, 97, 28, 25);
		scoreboardPanel.add(tfAwayHits);
		
		tfAwayRuns = new JTextField();
		tfAwayRuns.setText("0");
		tfAwayRuns.setEditable(false);
		tfAwayRuns.setColumns(10);
		tfAwayRuns.setBounds(589, 99, 28, 25);
		scoreboardPanel.add(tfAwayRuns);
		
		tfHomeRuns = new JTextField();
		tfHomeRuns.setText("0");
		tfHomeRuns.setEditable(false);
		tfHomeRuns.setColumns(10);
		tfHomeRuns.setBounds(589, 137, 28, 25);
		scoreboardPanel.add(tfHomeRuns);
		
		JButton btnStartGame = new JButton("Start New Game");
		
		btnStartGame.setBounds(1414, 22, 136, 37);
		scoreboardPanel.add(btnStartGame);
		
		JButton btnNextPlay_1 = new JButton("Run Next Play");
		btnNextPlay_1.setBounds(1414, 135, 136, 37);
		scoreboardPanel.add(btnNextPlay_1);
		btnNextPlay_1.setEnabled(false);
		
		btnNextPlay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean b = nextPlay();
				btnNextPlay_1.setEnabled(b);
				
			}
		});
		
		JPanel boxStatusPanel = new JPanel();
		boxStatusPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		boxStatusPanel.setBounds(434, 214, 719, 561);
		getFrame().getContentPane().add(boxStatusPanel);
		boxStatusPanel.setLayout(null);
		
		tfSecondBase = new JTextField();
		tfSecondBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfSecondBase.setEditable(false);
		tfSecondBase.setBounds(304, 95, 176, 42);
		boxStatusPanel.add(tfSecondBase);
		tfSecondBase.setColumns(10);
		
		tfFirstBase = new JTextField();
		tfFirstBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfFirstBase.setEditable(false);
		tfFirstBase.setColumns(10);
		tfFirstBase.setBounds(527, 250, 170, 42);
		boxStatusPanel.add(tfFirstBase);
		
		tfThirdBase = new JTextField();
		tfThirdBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfThirdBase.setEditable(false);
		tfThirdBase.setColumns(10);
		tfThirdBase.setBounds(81, 250, 176, 42);
		boxStatusPanel.add(tfThirdBase);
		
		tfUpToBat = new JTextField();
		tfUpToBat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfUpToBat.setEditable(false);
		tfUpToBat.setColumns(10);
		tfUpToBat.setBounds(304, 409, 176, 42);
		boxStatusPanel.add(tfUpToBat);
		
		lblBoxStatus = new JLabel("Box Status");
		lblBoxStatus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblBoxStatus.setBounds(10, 6, 195, 52);
		boxStatusPanel.add(lblBoxStatus);
		
		JLabel lblPreviousPlayBatter = new JLabel("Batter:");
		lblPreviousPlayBatter.setBounds(10, 478, 62, 32);
		boxStatusPanel.add(lblPreviousPlayBatter);
		lblPreviousPlayBatter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		tfPreviousPlayBatter = new JTextField();
		tfPreviousPlayBatter.setBounds(81, 481, 168, 30);
		boxStatusPanel.add(tfPreviousPlayBatter);
		tfPreviousPlayBatter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayBatter.setEditable(false);
		tfPreviousPlayBatter.setColumns(10);
		
		JLabel lblPreviousPlayResult = new JLabel("Play:");
		lblPreviousPlayResult.setBounds(10, 511, 44, 32);
		boxStatusPanel.add(lblPreviousPlayResult);
		lblPreviousPlayResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		tfPreviousPlayResult = new JTextField();
		tfPreviousPlayResult.setBounds(81, 514, 168, 30);
		boxStatusPanel.add(tfPreviousPlayResult);
		tfPreviousPlayResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayResult.setEditable(false);
		tfPreviousPlayResult.setColumns(10);
		
		JLabel lblPreviousPlayOuts = new JLabel("Outs:");
		lblPreviousPlayOuts.setBounds(601, 511, 48, 32);
		boxStatusPanel.add(lblPreviousPlayOuts);
		lblPreviousPlayOuts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		tfPreviousPlayOuts = new JTextField();
		tfPreviousPlayOuts.setBounds(661, 514, 36, 30);
		boxStatusPanel.add(tfPreviousPlayOuts);
		tfPreviousPlayOuts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayOuts.setEditable(false);
		tfPreviousPlayOuts.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setBackground(Color.WHITE);
		img.setIcon(new ImageIcon(this.getClass().getResource("/baseball field.png")));
		img.setBounds(190, 58, 400, 400);
		boxStatusPanel.add(img);
		
		lblNewLabel = new JLabel("Previous Play:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(50, 439, 152, 27);
		boxStatusPanel.add(lblNewLabel);
		
		JPanel awayPanel = new JPanel();
		awayPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		awayPanel.setBounds(10, 214, 414, 561);
		getFrame().getContentPane().add(awayPanel);
		awayPanel.setLayout(null);
		
		JLabel lblAwayLineup = new JLabel("Away Line Up");
		lblAwayLineup.setBounds(69, 11, 281, 55);
		lblAwayLineup.setFont(new Font("Tahoma", Font.PLAIN, 45));
		awayPanel.add(lblAwayLineup);
		
		tfAwayBatter1 = new JTextField();
		tfAwayBatter1.setEditable(false);
		tfAwayBatter1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter1.setText("Name");
		tfAwayBatter1.setBounds(26, 113, 230, 34);
		awayPanel.add(tfAwayBatter1);
		tfAwayBatter1.setColumns(10);
		
		tfAwayAvg1 = new JTextField();
		tfAwayAvg1.setEditable(false);
		tfAwayAvg1.setText("0.000");
		tfAwayAvg1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg1.setColumns(10);
		tfAwayAvg1.setBounds(321, 118, 64, 34);
		tfAwayAvg1.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg1);
		
		JLabel lblAwayBattingAvg = new JLabel("Batting Avg");
		lblAwayBattingAvg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayBattingAvg.setBounds(266, 77, 119, 34);
		awayPanel.add(lblAwayBattingAvg);
		
		JLabel lblAwayBatterName = new JLabel("Batter Name");
		lblAwayBatterName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayBatterName.setBounds(26, 77, 119, 25);
		awayPanel.add(lblAwayBatterName);
		
		tfAwayBatter2 = new JTextField();
		tfAwayBatter2.setEditable(false);
		tfAwayBatter2.setText("Name");
		tfAwayBatter2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter2.setColumns(10);
		tfAwayBatter2.setBounds(26, 158, 230, 34);
		awayPanel.add(tfAwayBatter2);
		
		tfAwayAvg2 = new JTextField();
		tfAwayAvg2.setEditable(false);
		tfAwayAvg2.setText("0.000");
		tfAwayAvg2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg2.setColumns(10);
		tfAwayAvg2.setBounds(321, 163, 64, 34);
		tfAwayAvg2.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg2);
		
		tfAwayBatter3 = new JTextField();
		tfAwayBatter3.setEditable(false);
		tfAwayBatter3.setText("Name");
		tfAwayBatter3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter3.setColumns(10);
		tfAwayBatter3.setBounds(26, 201, 230, 34);
		awayPanel.add(tfAwayBatter3);
		
		tfAwayAvg3 = new JTextField();
		tfAwayAvg3.setEditable(false);
		tfAwayAvg3.setText("0.000");
		tfAwayAvg3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg3.setColumns(10);
		tfAwayAvg3.setBounds(321, 206, 64, 34);
		tfAwayAvg3.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg3);
		
		tfAwayBatter4 = new JTextField();
		tfAwayBatter4.setEditable(false);
		tfAwayBatter4.setText("Name");
		tfAwayBatter4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter4.setColumns(10);
		tfAwayBatter4.setBounds(26, 246, 230, 34);
		awayPanel.add(tfAwayBatter4);
		
		tfAwayAvg4 = new JTextField();
		tfAwayAvg4.setEditable(false);
		tfAwayAvg4.setText("0.000");
		tfAwayAvg4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg4.setColumns(10);
		tfAwayAvg4.setBounds(321, 251, 64, 34);
		tfAwayAvg4.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg4);
		
		tfAwayBatter5 = new JTextField();
		tfAwayBatter5.setEditable(false);
		tfAwayBatter5.setText("Name");
		tfAwayBatter5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter5.setColumns(10);
		tfAwayBatter5.setBounds(26, 291, 230, 34);
		awayPanel.add(tfAwayBatter5);
		
		tfAwayAvg5 = new JTextField();
		tfAwayAvg5.setEditable(false);
		tfAwayAvg5.setText("0.000");
		tfAwayAvg5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg5.setColumns(10);
		tfAwayAvg5.setBounds(321, 296, 64, 34);
		tfAwayAvg5.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg5);
		
		tfAwayBatter6 = new JTextField();
		tfAwayBatter6.setEditable(false);
		tfAwayBatter6.setText("Name");
		tfAwayBatter6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter6.setColumns(10);
		tfAwayBatter6.setBounds(26, 336, 230, 34);
		awayPanel.add(tfAwayBatter6);
		
		tfAwayAvg6 = new JTextField();
		tfAwayAvg6.setEditable(false);
		tfAwayAvg6.setText("0.000");
		tfAwayAvg6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg6.setColumns(10);
		tfAwayAvg6.setBounds(321, 341, 64, 34);
		tfAwayAvg6.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg6);
		
		tfAwayBatter7 = new JTextField();
		tfAwayBatter7.setEditable(false);
		tfAwayBatter7.setText("Name");
		tfAwayBatter7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter7.setColumns(10);
		tfAwayBatter7.setBounds(26, 381, 230, 34);
		awayPanel.add(tfAwayBatter7);
		
		tfAwayAvg7 = new JTextField();
		tfAwayAvg7.setEditable(false);
		tfAwayAvg7.setText("0.000");
		tfAwayAvg7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg7.setColumns(10);
		tfAwayAvg7.setBounds(321, 386, 64, 34);
		tfAwayAvg7.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg7);
		
		tfAwayBatter8 = new JTextField();
		tfAwayBatter8.setEditable(false);
		tfAwayBatter8.setText("Name");
		tfAwayBatter8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayBatter8.setColumns(10);
		tfAwayBatter8.setBounds(26, 426, 230, 34);
		awayPanel.add(tfAwayBatter8);
		
		tfAwayAvg8 = new JTextField();
		tfAwayAvg8.setEditable(false);
		tfAwayAvg8.setText("0.000");
		tfAwayAvg8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayAvg8.setColumns(10);
		tfAwayAvg8.setBounds(321, 431, 64, 34);
		tfAwayAvg8.setBackground(Color.RED);
		awayPanel.add(tfAwayAvg8);
		
		tfAwayPitcher = new JTextField();
		tfAwayPitcher.setEditable(false);
		tfAwayPitcher.setText("Name");
		tfAwayPitcher.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayPitcher.setColumns(10);
		tfAwayPitcher.setBounds(26, 507, 230, 34);
		awayPanel.add(tfAwayPitcher);
		
		tfAwayERA = new JTextField();
		tfAwayERA.setEditable(false);
		tfAwayERA.setText("0.000");
		tfAwayERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAwayERA.setColumns(10);
		tfAwayERA.setBounds(304, 507, 81, 34);
		tfAwayERA.setBackground(Color.RED);
		awayPanel.add(tfAwayERA);
		
		lblAwayPitcherName = new JLabel("Pitcher Name");
		lblAwayPitcherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayPitcherName.setBounds(26, 471, 127, 25);
		awayPanel.add(lblAwayPitcherName);
		
		lblAwayERA = new JLabel("ERA");
		lblAwayERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayERA.setBounds(350, 476, 35, 34);
		awayPanel.add(lblAwayERA);
		
		
		
		//Creates a new frame to display away team batter stats
		JFrame awayBatterStatsFrame = new JFrame("Away Team Player Stats");
		awayBatterStatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a new frame to display away team pitcher stats
		JFrame awayPitcherStatsFrame = new JFrame("Away Team Player Stats");
		awayPitcherStatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Displays stats for batter 1
		tfAwayBatter1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(0).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(0).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 2
		tfAwayBatter2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(1).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(1).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 3
		tfAwayBatter3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(2).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(2).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 4
		tfAwayBatter4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(3).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(3).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 5
		tfAwayBatter5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(4).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(4).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 6
		tfAwayBatter6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(5).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(5).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 7
		tfAwayBatter7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(6).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(6).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 8
		tfAwayBatter8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayBatterStatsFrame, "Batter Name: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getFirstName()
						+ " " + BaseballGame.getAwayTeam().getSpecificBatter(7).getLastName()
						+ "\nHits: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getHits()
						+ "\nRuns: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getDoubles()
						+ "\nTriples: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getTriples()
						+ "\nHomers: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getSpecificBatter(7).getWalks(),
						"Away Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for the pitcher
		tfAwayPitcher.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(awayPitcherStatsFrame, "Pitcher Name: " + BaseballGame.getAwayTeam().getPitcher().getFirstName()
						+ " " + BaseballGame.getAwayTeam().getPitcher().getLastName()
						+ "\nEarned Runs: " + BaseballGame.getAwayTeam().getPitcher().getEarnedRuns()
						+ "\nEarned Run Average: " + BaseballGame.getAwayTeam().getPitcher().calcEarnedRunAvg()
						+ "\nStrikeouts: " + BaseballGame.getAwayTeam().getPitcher().getStrikeouts()
						+ "\nWalks: " + BaseballGame.getAwayTeam().getPitcher().getWalks()
						+ "\nWHIP: " + BaseballGame.getAwayTeam().getPitcher().calcWhip(),
						"Away Team Pitcher Stats", JOptionPane.PLAIN_MESSAGE);

			}
			
		});

		
		
		JPanel homePanel = new JPanel();
		homePanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		homePanel.setLayout(null);
		homePanel.setBounds(1163, 214, 422, 561);
		getFrame().getContentPane().add(homePanel);
		
		JLabel lblHomeLineup = new JLabel("Home Line Up");
		lblHomeLineup.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblHomeLineup.setBounds(67, 11, 281, 55);
		homePanel.add(lblHomeLineup);
		
		tfHomeBatter1 = new JTextField();
		tfHomeBatter1.setEditable(false);
		tfHomeBatter1.setText("Name");
		tfHomeBatter1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter1.setColumns(10);
		tfHomeBatter1.setBounds(21, 113, 230, 34);
		homePanel.add(tfHomeBatter1);
		
		tfHomeAvg1 = new JTextField();
		tfHomeAvg1.setEditable(false);
		tfHomeAvg1.setText("0.000");
		tfHomeAvg1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg1.setColumns(10);
		tfHomeAvg1.setBounds(316, 118, 64, 34);
		tfHomeAvg1.setBackground(Color.RED);
		homePanel.add(tfHomeAvg1);
		
		JLabel lblHomeBattingAvg = new JLabel("Batting Avg");
		lblHomeBattingAvg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomeBattingAvg.setBounds(261, 77, 119, 34);
		homePanel.add(lblHomeBattingAvg);
		
		JLabel lblHomeBatterName = new JLabel("Batter Name");
		lblHomeBatterName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomeBatterName.setBounds(21, 77, 119, 25);
		homePanel.add(lblHomeBatterName);
		
		tfHomeBatter2 = new JTextField();
		tfHomeBatter2.setEditable(false);
		tfHomeBatter2.setText("Name");
		tfHomeBatter2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter2.setColumns(10);
		tfHomeBatter2.setBounds(21, 158, 230, 34);
		homePanel.add(tfHomeBatter2);
		
		tfHomeAvg2 = new JTextField();
		tfHomeAvg2.setEditable(false);
		tfHomeAvg2.setText("0.000");
		tfHomeAvg2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg2.setColumns(10);
		tfHomeAvg2.setBounds(316, 163, 64, 34);
		tfHomeAvg2.setBackground(Color.RED);
		homePanel.add(tfHomeAvg2);
		
		tfHomeBatter3 = new JTextField();
		tfHomeBatter3.setEditable(false);
		tfHomeBatter3.setText("Name");
		tfHomeBatter3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter3.setColumns(10);
		tfHomeBatter3.setBounds(21, 201, 230, 34);
		homePanel.add(tfHomeBatter3);
		
		tfHomeAvg3 = new JTextField();
		tfHomeAvg3.setEditable(false);
		tfHomeAvg3.setText("0.000");
		tfHomeAvg3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg3.setColumns(10);
		tfHomeAvg3.setBounds(316, 206, 64, 34);
		tfHomeAvg3.setBackground(Color.RED);
		homePanel.add(tfHomeAvg3);
		
		tfHomeBatter4 = new JTextField();
		tfHomeBatter4.setEditable(false);
		tfHomeBatter4.setText("Name");
		tfHomeBatter4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter4.setColumns(10);
		tfHomeBatter4.setBounds(21, 246, 230, 34);
		homePanel.add(tfHomeBatter4);
		
		tfHomeAvg4 = new JTextField();
		tfHomeAvg4.setEditable(false);
		tfHomeAvg4.setText("0.000");
		tfHomeAvg4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg4.setColumns(10);
		tfHomeAvg4.setBounds(316, 251, 64, 34);
		tfHomeAvg4.setBackground(Color.RED);
		homePanel.add(tfHomeAvg4);
		
		tfHomeBatter5 = new JTextField();
		tfHomeBatter5.setEditable(false);
		tfHomeBatter5.setText("Name");
		tfHomeBatter5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter5.setColumns(10);
		tfHomeBatter5.setBounds(21, 291, 230, 34);
		homePanel.add(tfHomeBatter5);
		
		tfHomeAvg5 = new JTextField();
		tfHomeAvg5.setEditable(false);
		tfHomeAvg5.setText("0.000");
		tfHomeAvg5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg5.setColumns(10);
		tfHomeAvg5.setBounds(316, 296, 64, 34);
		tfHomeAvg5.setBackground(Color.RED);
		homePanel.add(tfHomeAvg5);
		
		tfHomeBatter6 = new JTextField();
		tfHomeBatter6.setEditable(false);
		tfHomeBatter6.setText("Name");
		tfHomeBatter6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter6.setColumns(10);
		tfHomeBatter6.setBounds(21, 336, 230, 34);
		homePanel.add(tfHomeBatter6);
		
		tfHomeAvg6 = new JTextField();
		tfHomeAvg6.setEditable(false);
		tfHomeAvg6.setText("0.000");
		tfHomeAvg6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg6.setColumns(10);
		tfHomeAvg6.setBounds(316, 341, 64, 34);
		tfHomeAvg6.setBackground(Color.RED);
		homePanel.add(tfHomeAvg6);
		
		tfHomeBatter7 = new JTextField();
		tfHomeBatter7.setEditable(false);
		tfHomeBatter7.setText("Name");
		tfHomeBatter7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter7.setColumns(10);
		tfHomeBatter7.setBounds(21, 381, 230, 34);
		homePanel.add(tfHomeBatter7);
		
		tfHomeAvg7 = new JTextField();
		tfHomeAvg7.setEditable(false);
		tfHomeAvg7.setText("0.000");
		tfHomeAvg7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg7.setColumns(10);
		tfHomeAvg7.setBounds(316, 386, 64, 34);
		tfHomeAvg7.setBackground(Color.RED);
		homePanel.add(tfHomeAvg7);
		
		tfHomeBatter8 = new JTextField();
		tfHomeBatter8.setEditable(false);
		tfHomeBatter8.setText("Name");
		tfHomeBatter8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeBatter8.setColumns(10);
		tfHomeBatter8.setBounds(21, 426, 230, 34);
		homePanel.add(tfHomeBatter8);
		
		tfHomeAvg8 = new JTextField();
		tfHomeAvg8.setEditable(false);
		tfHomeAvg8.setText("0.000");
		tfHomeAvg8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeAvg8.setColumns(10);
		tfHomeAvg8.setBounds(316, 431, 64, 34);
		tfHomeAvg8.setBackground(Color.RED);
		homePanel.add(tfHomeAvg8);
		
		tfHomePitcher = new JTextField();
		tfHomePitcher.setEditable(false);
		tfHomePitcher.setText("Name");
		tfHomePitcher.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomePitcher.setColumns(10);
		tfHomePitcher.setBounds(21, 507, 230, 34);
		homePanel.add(tfHomePitcher);
		
		tfHomeERA = new JTextField();
		tfHomeERA.setEditable(false);
		tfHomeERA.setText("0.000");
		tfHomeERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfHomeERA.setColumns(10);
		tfHomeERA.setBounds(298, 507, 82, 34);
		tfHomeERA.setBackground(Color.RED);
		homePanel.add(tfHomeERA);
		
		JLabel lblHomePitcherName = new JLabel("Pitcher Name");
		lblHomePitcherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomePitcherName.setBounds(21, 471, 127, 25);
		homePanel.add(lblHomePitcherName);
		
		JLabel lblHomeERA = new JLabel("ERA");
		lblHomeERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomeERA.setBounds(345, 476, 35, 34);
		homePanel.add(lblHomeERA);
		
		
		//Creates a new frame to display home team batter stats
		JFrame homeBatterStatsFrame = new JFrame("Home Team Player Stats");
		homeBatterStatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a new frame to display home team pitcher stats
		JFrame homePitcherStatsFrame = new JFrame("Home Team Player Stats");
		homePitcherStatsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Displays stats for batter 1
		tfHomeBatter1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(0).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(0).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 2
		tfHomeBatter2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(1).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(1).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 3
		tfHomeBatter3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(2).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(2).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 4
		tfHomeBatter4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(3).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(3).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 5
		tfHomeBatter5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(4).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(4).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 6
		tfHomeBatter6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(5).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(5).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 7
		tfHomeBatter7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(6).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(6).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for batter 8
		tfHomeBatter8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homeBatterStatsFrame, "Batter Name: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getFirstName()
						+ " " + BaseballGame.getHomeTeam().getSpecificBatter(7).getLastName()
						+ "\nHits: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getHits()
						+ "\nRuns: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getRunsScored()
						+ "\nRBIs: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getRunsBattedIn()
						+ "\nDoubles: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getDoubles()
						+ "\nTriples: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getTriples()
						+ "\nHomers: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getHomers()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getSpecificBatter(7).getWalks(),
						"Home Team Batter Stats", JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		
		//Displays stats for the pitcher
		tfHomePitcher.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(homePitcherStatsFrame, "Pitcher Name: " + BaseballGame.getHomeTeam().getPitcher().getFirstName()
						+ " " + BaseballGame.getHomeTeam().getPitcher().getLastName()
						+ "\nEarned Runs: " + BaseballGame.getHomeTeam().getPitcher().getEarnedRuns()
						+ "\nEarned Run Average: " + BaseballGame.getHomeTeam().getPitcher().calcEarnedRunAvg()
						+ "\nStrikeouts: " + BaseballGame.getHomeTeam().getPitcher().getStrikeouts()
						+ "\nWalks: " + BaseballGame.getHomeTeam().getPitcher().getWalks()
						+ "\nWHIP: " + BaseballGame.getHomeTeam().getPitcher().calcWhip(),
						"Home Team Pitcher Stats", JOptionPane.PLAIN_MESSAGE);

			}
			
		});
		
		
		batterPanel = new JPanel();
		batterPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		batterPanel.setLayout(null);
		batterPanel.setBounds(10, 787, 1575, 140);
		getFrame().getContentPane().add(batterPanel);
		
		lblVersus = new JLabel("VS.");
		lblVersus.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVersus.setBounds(229, 65, 37, 39);
		batterPanel.add(lblVersus);
		
		tfBatter = new JTextField();
		tfBatter.setText("Batter Name");
		tfBatter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfBatter.setEditable(false);
		tfBatter.setColumns(10);
		tfBatter.setBounds(10, 65, 209, 39);
		batterPanel.add(tfBatter);
		
		tfPitcher = new JTextField();
		tfPitcher.setText("Pitcher Name");
		tfPitcher.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfPitcher.setEditable(false);
		tfPitcher.setColumns(10);
		tfPitcher.setBounds(276, 65, 209, 39);
		batterPanel.add(tfPitcher);
		
		lblCurrentBatter = new JLabel("Current Batter");
		lblCurrentBatter.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCurrentBatter.setBounds(26, 25, 165, 31);
		batterPanel.add(lblCurrentBatter);
		
		lblCurrentPitcher = new JLabel("Current Pitcher");
		lblCurrentPitcher.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCurrentPitcher.setBounds(292, 26, 172, 28);
		batterPanel.add(lblCurrentPitcher);
		
		lblBatterStats = new JLabel("Batter's Stats:");
		lblBatterStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBatterStats.setBounds(616, 73, 118, 31);
		batterPanel.add(lblBatterStats);
		
		lblAtBats = new JLabel("ab");
		lblAtBats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAtBats.setBounds(784, 50, 46, 14);
		batterPanel.add(lblAtBats);
		
		lblRunsScored = new JLabel("r");
		lblRunsScored.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRunsScored.setBounds(864, 50, 46, 14);
		batterPanel.add(lblRunsScored);
		
		lblHits2 = new JLabel("h");
		lblHits2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHits2.setBounds(944, 50, 46, 14);
		batterPanel.add(lblHits2);
		
		lblDoubles = new JLabel("2b");
		lblDoubles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoubles.setBounds(1024, 50, 46, 14);
		batterPanel.add(lblDoubles);
		
		lblTriples = new JLabel("3b");
		lblTriples.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTriples.setBounds(1104, 50, 46, 14);
		batterPanel.add(lblTriples);
		
		lblHomers = new JLabel("hr");
		lblHomers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHomers.setBounds(1184, 50, 46, 14);
		batterPanel.add(lblHomers);
		
		lblRunsBattedIn = new JLabel("rbi");
		lblRunsBattedIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRunsBattedIn.setBounds(1264, 50, 46, 14);
		batterPanel.add(lblRunsBattedIn);
		
		lblSacflies = new JLabel("sf");
		lblSacflies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSacflies.setBounds(1344, 50, 46, 14);
		batterPanel.add(lblSacflies);
		
		lblWalks2 = new JLabel("bb");
		lblWalks2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWalks2.setBounds(1424, 50, 46, 14);
		batterPanel.add(lblWalks2);
		
		lblStrikeOuts = new JLabel("so");
		lblStrikeOuts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStrikeOuts.setBounds(1504, 50, 46, 14);
		batterPanel.add(lblStrikeOuts);
		
		tfAtBats = new JTextField();
		tfAtBats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfAtBats.setEditable(false);
		tfAtBats.setColumns(10);
		tfAtBats.setBounds(769, 79, 46, 20);
		batterPanel.add(tfAtBats);
		
		tfRuns = new JTextField();
		tfRuns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRuns.setEditable(false);
		tfRuns.setColumns(10);
		tfRuns.setBounds(846, 79, 46, 20);
		batterPanel.add(tfRuns);
		
		tfHits = new JTextField();
		tfHits.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfHits.setEditable(false);
		tfHits.setColumns(10);
		tfHits.setBounds(925, 79, 46, 20);
		batterPanel.add(tfHits);
		
		tfDoubles = new JTextField();
		tfDoubles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfDoubles.setEditable(false);
		tfDoubles.setColumns(10);
		tfDoubles.setBounds(1011, 79, 46, 20);
		batterPanel.add(tfDoubles);
		
		tfTriples = new JTextField();
		tfTriples.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTriples.setEditable(false);
		tfTriples.setColumns(10);
		tfTriples.setBounds(1091, 79, 46, 20);
		batterPanel.add(tfTriples);
		
		tfHomers = new JTextField();
		tfHomers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfHomers.setEditable(false);
		tfHomers.setColumns(10);
		tfHomers.setBounds(1169, 79, 46, 20);
		batterPanel.add(tfHomers);
		
		tfRBI = new JTextField();
		tfRBI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRBI.setEditable(false);
		tfRBI.setColumns(10);
		tfRBI.setBounds(1250, 79, 46, 20);
		batterPanel.add(tfRBI);
		
		tfSacFlies = new JTextField();
		tfSacFlies.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfSacFlies.setEditable(false);
		tfSacFlies.setColumns(10);
		tfSacFlies.setBounds(1327, 79, 46, 20);
		batterPanel.add(tfSacFlies);
		
		tfWalks = new JTextField();
		tfWalks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfWalks.setEditable(false);
		tfWalks.setColumns(10);
		tfWalks.setBounds(1410, 79, 46, 20);
		batterPanel.add(tfWalks);
		
		tfStrikeouts = new JTextField();
		tfStrikeouts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfStrikeouts.setEditable(false);
		tfStrikeouts.setColumns(10);
		tfStrikeouts.setBounds(1491, 79, 46, 20);
		batterPanel.add(tfStrikeouts);
		
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNextPlay_1.setEnabled(true);
				btnStartGame.setEnabled(false);
				game = new BaseballGame();
				startGame();
			}
		});

	}
	
	private void startGame() {//Starts the game
		SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>(){

			@Override
			protected Boolean doInBackground() throws Exception {
				
				if(homeFirstNames.size() == 9 && homeLastNames.size() == 9 && awayFirstNames.size() == 9 && awayLastNames.size() == 9 && !homeFirstNames.contains("") && !homeLastNames.contains("") && !awayFirstNames.contains("") && !awayLastNames.contains("")) {
					game.initTeams_NewHome(homeFirstNames, homeLastNames);
					game.initTeams_NewAway(awayFirstNames, awayLastNames);
				}
				else if (homeFirstNames.size() == 9 && homeLastNames.size() == 9 && !homeFirstNames.contains("") && !homeLastNames.contains("")) {
					game.initTeams_NewHome(homeFirstNames, homeLastNames);
					game.initTeams_Away();
				}
				else if (awayFirstNames.size() == 9 && awayLastNames.size() == 9 && !awayFirstNames.contains("") && !awayLastNames.contains("")) {
					game.initTeams_Home();
					game.initTeams_NewAway(awayFirstNames, awayLastNames);
				}
				else {
					game.initTeams_Home();
					game.initTeams_Away();
				}
				
				game.initBatterPitcher();
				
				return true;
			}
			
			@Override
			protected void done() {
				
				frmBaseball.revalidate();
				frmBaseball.repaint();
				
			}
			
			
		};
		
		worker.execute();
	}

	private boolean nextPlay() {
		SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>(){//Gets the next play
			
			@Override
			protected Boolean doInBackground() throws Exception {
				
				//game.nextPlay();
				//game.printEndOfGame(game.getHomeTeam(), game.getAwayTeam());

				return true;
			}
		
			@Override
			protected void done() {
				
				getFrame().revalidate();
				getFrame().repaint();
				
			}
			
			
		};
		worker.execute();
		return game.nextPlay();
}
		
	
	public JFrame getFrame() {
		return frmBaseball;
	}

	public void setFrame(JFrame frame) {
		this.frmBaseball = frame;
		frmBaseball.setTitle("Baseball Game");
	}

	public static JButton getBtnNextPlay() {
		return btnNextPlay;
	}

	public static void setBtnNextPlay(JButton btnNextPlay) {
		GUI.btnNextPlay = btnNextPlay;
	}
}