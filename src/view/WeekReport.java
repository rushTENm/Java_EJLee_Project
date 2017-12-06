package Login;

import javax.swing.*;
import java.awt.*;

public class WeekReport extends JFrame
{
	WeekReport()
	{
		String str = "";
		String [] Year = {"2016", "2017"};
		String [] Month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		String [] Day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		
		setTitle("WeekRecord");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JLabel report = new JLabel("Weekly Record");
		report.setLocation(210, 10);
		report.setFont(new Font("Courier", Font.PLAIN, 20));
		report.setSize(250, 50);
		contentPane.add(report);
		
		JLabel DailyReport = new JLabel("Daily Record");
		DailyReport.setLocation(210, 255);
		DailyReport.setFont(new Font("Courier", Font.PLAIN, 20));
		DailyReport.setSize(250, 50);
		contentPane.add(DailyReport);
		
		JTextArea reportArea = new JTextArea(str);
		JScrollPane reportScroll = new JScrollPane(reportArea);
		reportScroll.setLocation(210,50);
		reportScroll.setSize(560, 195);
		contentPane.add(reportScroll);
		
		JTextArea DailyArea = new JTextArea(str);
		JScrollPane DailyScroll = new JScrollPane(DailyArea);
		DailyScroll.setLocation(210,300);
		DailyScroll.setSize(560, 245);
		contentPane.add(DailyScroll);
		
		JLabel DateLabel = new JLabel("처음 날짜 설정");
		DateLabel.setLocation(10, 15);
		DateLabel.setFont(new Font("Courier", Font.PLAIN, 20));
		DateLabel.setSize(200, 50);
		contentPane.add(DateLabel);
		
		JComboBox YearCom = new JComboBox(Year);
		YearCom.setLocation(10, 70);
		YearCom.setSize(60, 30);
		contentPane.add(YearCom);
		
		JComboBox MonthCom = new JComboBox(Month);
		MonthCom.setLocation(72, 70);
		MonthCom.setSize(60, 30);
		contentPane.add(MonthCom);
		
		JComboBox DayCom = new JComboBox(Day);
		DayCom.setLocation(135, 70);
		DayCom.setSize(60, 30);
		contentPane.add(DayCom);
		
		JLabel DateLastLabel = new JLabel("마지막 날짜 설정");
		DateLastLabel.setLocation(10, 90);
		DateLastLabel.setFont(new Font("Courier", Font.PLAIN, 20));
		DateLastLabel.setSize(200, 50);
		contentPane.add(DateLastLabel);
		
		JComboBox YearLastCom = new JComboBox(Year);
		YearLastCom.setLocation(10, 140);
		YearLastCom.setSize(60, 30);
		contentPane.add(YearLastCom);
		
		JComboBox MonthLastCom = new JComboBox(Month);
		MonthLastCom.setLocation(72, 140);
		MonthLastCom.setSize(60, 30);
		contentPane.add(MonthLastCom);
		
		JComboBox DayLastCom = new JComboBox(Day);
		DayLastCom.setLocation(135, 140);
		DayLastCom.setSize(60, 30);
		contentPane.add(DayLastCom);
		
		JButton InfoLoad = new JButton("정보 불러오기");
		InfoLoad.setLocation(10,444);
		InfoLoad.setSize(185, 50);
		contentPane.add(InfoLoad);
		
		JButton InfoSave = new JButton("정보 저장");
		InfoSave.setLocation(10,499);
		InfoSave.setSize(185, 50);
		contentPane.add(InfoSave);
		
		JPanel datePanel = new JPanel();
		datePanel.setLocation(5, 5);
		datePanel.setBorder(BorderFactory.createTitledBorder("Set Date"));
		datePanel.setFont(new Font("Courier", Font.PLAIN, 20));
		datePanel.setSize(195, 550);
		contentPane.add(datePanel);
		
		JPanel reportPanel = new JPanel();
		reportPanel.setLocation(200, 5);
		reportPanel.setBorder(BorderFactory.createTitledBorder("Weekly Report"));
		reportPanel.setFont(new Font("Courier", Font.PLAIN, 20));
		reportPanel.setSize(580, 250);
		contentPane.add(reportPanel);
		
		JPanel DailyPanel = new JPanel();
		DailyPanel.setLocation(200, 255);
		DailyPanel.setBorder(BorderFactory.createTitledBorder("Daily Report"));
		DailyPanel.setFont(new Font("Courier", Font.PLAIN, 20));
		DailyPanel.setSize(580, 300);
		contentPane.add(DailyPanel);
		
		setSize(800, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new WeekReport();
	}
}
