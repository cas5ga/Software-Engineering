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

	public JTextField getTfAwayAvg6() {
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

	public JTextField getTfAwayAvg7() {
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

	public JTextField getTfAwayAvg8() {
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

	public JTextField getTfAwayERA() {
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

	public JTextField getTfHomeAvg1() {
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

	public JTextField getTfHomeAvg2() {
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

	public JTextField getTfHomeAvg3() {
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

	public JTextField getTfHomeAvg4() {
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

	public JTextField getTfHomeAvg5() {
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

	public JTextField getTfHomeAvg6() {
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

	public JTextField getTfHomeAvg7() {
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

	public JTextField getTfHomeAvg8() {
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

	public JTextField getTfHomeERA() {
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
	
	public GUI() {
		initialize();
	}

	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 1600, 985);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		Color colorGray = new Color(100,100,100);
		getFrame().getContentPane().setBackground(colorGray);
		
		JMenuBar menuBar = new JMenuBar();
		getFrame().setJMenuBar(menuBar);
		
		JMenu newTeam = new JMenu("Create New Team");
		JMenuItem home = new JMenuItem("Home Team");
		JMenuItem away = new JMenuItem("Away Team");
		newTeam.add(home);
		newTeam.add(away);
		
		JFrame homeTeamFrame = new JFrame("Home Team");
		homeTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame awayTeamFrame = new JFrame("Away Team");
		awayTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField homeBatter1Field = new JTextField(25);
		JTextField homeBatter2Field = new JTextField(25);
		JTextField homeBatter3Field = new JTextField(25);
		JTextField homeBatter4Field = new JTextField(25);
		JTextField homeBatter5Field = new JTextField(25);
		JTextField homeBatter6Field = new JTextField(25);
		JTextField homeBatter7Field = new JTextField(25);
		JTextField homeBatter8Field = new JTextField(25);
		JTextField homePitcherField = new JTextField(25);
		
		JPanel homeTeamPane = new JPanel();
		homeTeamPane.setLayout(new BoxLayout(homeTeamPane, BoxLayout.Y_AXIS));
		homeTeamPane.add(new JLabel("Name of Batter #1: "));
		homeTeamPane.add(homeBatter1Field);
		homeTeamPane.add(new JLabel("Name of Batter #2: "));
		homeTeamPane.add(homeBatter2Field);
		homeTeamPane.add(new JLabel("Name of Batter #3: "));
		homeTeamPane.add(homeBatter3Field);
		homeTeamPane.add(new JLabel("Name of Batter #4: "));
		homeTeamPane.add(homeBatter4Field);
		homeTeamPane.add(new JLabel("Name of Batter #5: "));
		homeTeamPane.add(homeBatter5Field);
		homeTeamPane.add(new JLabel("Name of Batter #6: "));
		homeTeamPane.add(homeBatter6Field);
		homeTeamPane.add(new JLabel("Name of Batter #7: "));
		homeTeamPane.add(homeBatter7Field);
		homeTeamPane.add(new JLabel("Name of Batter #8: "));
		homeTeamPane.add(homeBatter8Field);
		homeTeamPane.add(new JLabel("Name of Picher: "));
		homeTeamPane.add(homePitcherField);
		
		JTextField awayBatter1Field = new JTextField(25);
		JTextField awayBatter2Field = new JTextField(25);
		JTextField awayBatter3Field = new JTextField(25);
		JTextField awayBatter4Field = new JTextField(25);
		JTextField awayBatter5Field = new JTextField(25);
		JTextField awayBatter6Field = new JTextField(25);
		JTextField awayBatter7Field = new JTextField(25);
		JTextField awayBatter8Field = new JTextField(25);
		JTextField awayPitcherField = new JTextField(25);
		
		JPanel awayTeamPane = new JPanel();
		awayTeamPane.setLayout(new BoxLayout(awayTeamPane, BoxLayout.Y_AXIS));
		awayTeamPane.add(new JLabel("Name of Batter #1: "));
		awayTeamPane.add(awayBatter1Field);
		awayTeamPane.add(new JLabel("Name of Batter #2: "));
		awayTeamPane.add(awayBatter2Field);
		awayTeamPane.add(new JLabel("Name of Batter #3: "));
		awayTeamPane.add(awayBatter3Field);
		awayTeamPane.add(new JLabel("Name of Batter #4: "));
		awayTeamPane.add(awayBatter4Field);
		awayTeamPane.add(new JLabel("Name of Batter #5: "));
		awayTeamPane.add(awayBatter5Field);
		awayTeamPane.add(new JLabel("Name of Batter #6: "));
		awayTeamPane.add(awayBatter6Field);
		awayTeamPane.add(new JLabel("Name of Batter #7: "));
		awayTeamPane.add(awayBatter7Field);
		awayTeamPane.add(new JLabel("Name of Batter #8: "));
		awayTeamPane.add(awayBatter8Field);
		awayTeamPane.add(new JLabel("Name of Picher: "));
		awayTeamPane.add(awayPitcherField);
		
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(homeTeamFrame, homeTeamPane, "Home Team", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		away.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(awayTeamFrame, awayTeamPane, "Away Team", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		JMenu teamOptions = new JMenu("Team Options");
		teamOptions.add(newTeam);
		menuBar.add(teamOptions);
	
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
		
		Color colorRed = new Color(150,0,0);
		Color colorGreen = new Color(0,150,0);
		Color colorBlue = new Color(0,0,175);
		Color colorOrange = new Color(204,102,0);
		
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorRed);
			}
		});
		
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorGreen);
			}
		});
		
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorBlue);
			}
		});
		
		orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorOrange);
			}
		});
		
		gray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().getContentPane().setBackground(colorGray);
			}
		});
		
		JMenu preferences = new JMenu("Preferences");
		preferences.add(changeColor);
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
		boxStatusPanel.setBounds(434, 214, 719, 294);
		getFrame().getContentPane().add(boxStatusPanel);
		boxStatusPanel.setLayout(null);
		
		tfSecondBase = new JTextField();
		tfSecondBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfSecondBase.setEditable(false);
		tfSecondBase.setBounds(347, 11, 176, 42);
		boxStatusPanel.add(tfSecondBase);
		tfSecondBase.setColumns(10);
		
		tfFirstBase = new JTextField();
		tfFirstBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfFirstBase.setEditable(false);
		tfFirstBase.setColumns(10);
		tfFirstBase.setBounds(528, 112, 170, 42);
		boxStatusPanel.add(tfFirstBase);
		
		tfThirdBase = new JTextField();
		tfThirdBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfThirdBase.setEditable(false);
		tfThirdBase.setColumns(10);
		tfThirdBase.setBounds(123, 112, 176, 42);
		boxStatusPanel.add(tfThirdBase);
		
		tfUpToBat = new JTextField();
		tfUpToBat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfUpToBat.setEditable(false);
		tfUpToBat.setColumns(10);
		tfUpToBat.setBounds(347, 219, 176, 42);
		boxStatusPanel.add(tfUpToBat);
		
		JLabel lblUpToBat = new JLabel("Up to bat:");
		lblUpToBat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUpToBat.setBounds(267, 224, 70, 28);
		boxStatusPanel.add(lblUpToBat);
		
		JLabel lblFirstBase = new JLabel("First Base:");
		lblFirstBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstBase.setBounds(459, 120, 70, 28);
		boxStatusPanel.add(lblFirstBase);
		
		JLabel lblSecondBase = new JLabel("Second Base:");
		lblSecondBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondBase.setBounds(254, 16, 83, 28);
		boxStatusPanel.add(lblSecondBase);
		
		JLabel lblThirdBase = new JLabel("Third Base:");
		lblThirdBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThirdBase.setBounds(35, 117, 83, 28);
		boxStatusPanel.add(lblThirdBase);
		
		lblBoxStatus = new JLabel("Box Status");
		lblBoxStatus.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblBoxStatus.setBounds(10, 11, 218, 52);
		boxStatusPanel.add(lblBoxStatus);
		
		JPanel previousPlayPanel = new JPanel();
		previousPlayPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		previousPlayPanel.setBounds(434, 519, 719, 256);
		getFrame().getContentPane().add(previousPlayPanel);
		previousPlayPanel.setLayout(null);
		
		JLabel lblPreviousPlay = new JLabel("Current Play:");
		lblPreviousPlay.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblPreviousPlay.setBounds(10, 11, 306, 76);
		previousPlayPanel.add(lblPreviousPlay);
		
		tfPreviousPlayBatter = new JTextField();
		tfPreviousPlayBatter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayBatter.setEditable(false);
		tfPreviousPlayBatter.setColumns(10);
		tfPreviousPlayBatter.setBounds(113, 102, 168, 30);
		previousPlayPanel.add(tfPreviousPlayBatter);
		
		JLabel lblPreviousPlayBatter = new JLabel("Batter:");
		lblPreviousPlayBatter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPreviousPlayBatter.setBounds(24, 99, 62, 32);
		previousPlayPanel.add(lblPreviousPlayBatter);
		
		JLabel lblPreviousPlayResult = new JLabel("Play:");
		lblPreviousPlayResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPreviousPlayResult.setBounds(24, 145, 44, 32);
		previousPlayPanel.add(lblPreviousPlayResult);
		
		tfPreviousPlayResult = new JTextField();
		tfPreviousPlayResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayResult.setEditable(false);
		tfPreviousPlayResult.setColumns(10);
		tfPreviousPlayResult.setBounds(113, 148, 168, 30);
		previousPlayPanel.add(tfPreviousPlayResult);
		
		JLabel lblPreviousPlayOuts = new JLabel("Outs:");
		lblPreviousPlayOuts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPreviousPlayOuts.setBounds(24, 186, 48, 32);
		previousPlayPanel.add(lblPreviousPlayOuts);
		
		tfPreviousPlayOuts = new JTextField();
		tfPreviousPlayOuts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPreviousPlayOuts.setEditable(false);
		tfPreviousPlayOuts.setColumns(10);
		tfPreviousPlayOuts.setBounds(113, 189, 36, 30);
		previousPlayPanel.add(tfPreviousPlayOuts);
		
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
		awayPanel.add(tfAwayERA);
		
		lblAwayPitcherName = new JLabel("Pitcher Name");
		lblAwayPitcherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayPitcherName.setBounds(26, 471, 127, 25);
		awayPanel.add(lblAwayPitcherName);
		
		lblAwayERA = new JLabel("ERA");
		lblAwayERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAwayERA.setBounds(350, 476, 35, 34);
		awayPanel.add(lblAwayERA);

		
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
		homePanel.add(tfHomeERA);
		
		JLabel lblHomePitcherName = new JLabel("Pitcher Name");
		lblHomePitcherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomePitcherName.setBounds(21, 471, 127, 25);
		homePanel.add(lblHomePitcherName);
		
		JLabel lblHomeERA = new JLabel("ERA");
		lblHomeERA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHomeERA.setBounds(345, 476, 35, 34);
		homePanel.add(lblHomeERA);
		
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
				game.initTeams();
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}