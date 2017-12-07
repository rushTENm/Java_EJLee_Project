package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeekReport extends JPanel {
    MainFrame F;

    public WeekReport(MainFrame f) {
        F = f;
        String str = "";
        String[] Year = {"2016", "2017"};
        String[] Month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] Day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        setLayout(null);

        JLabel report = new JLabel("Weekly Record");
        report.setLocation(210, 10);
        report.setFont(new Font("Courier", Font.PLAIN, 20));
        report.setSize(250, 50);
        add(report);

        JLabel DailyReport = new JLabel("Daily Record");
        DailyReport.setLocation(210, 255);
        DailyReport.setFont(new Font("Courier", Font.PLAIN, 20));
        DailyReport.setSize(250, 50);
        add(DailyReport);

        JTextArea reportArea = new JTextArea(str);
        JScrollPane reportScroll = new JScrollPane(reportArea);
        reportScroll.setLocation(210, 50);
        reportScroll.setSize(560, 195);
        add(reportScroll);

        JTextArea DailyArea = new JTextArea(str);
        JScrollPane DailyScroll = new JScrollPane(DailyArea);
        DailyScroll.setLocation(210, 300);
        DailyScroll.setSize(560, 245);
        add(DailyScroll);

        JLabel DateLabel = new JLabel("처음 날짜 설정");
        DateLabel.setLocation(10, 15);
        DateLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        DateLabel.setSize(200, 50);
        add(DateLabel);

        JComboBox YearCom = new JComboBox(Year);
        YearCom.setLocation(10, 70);
        YearCom.setSize(60, 30);
        add(YearCom);

        JComboBox MonthCom = new JComboBox(Month);
        MonthCom.setLocation(72, 70);
        MonthCom.setSize(60, 30);
        add(MonthCom);

        JComboBox DayCom = new JComboBox(Day);
        DayCom.setLocation(135, 70);
        DayCom.setSize(60, 30);
        add(DayCom);

        JLabel DateLastLabel = new JLabel("마지막 날짜 설정");
        DateLastLabel.setLocation(10, 90);
        DateLastLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        DateLastLabel.setSize(200, 50);
        add(DateLastLabel);

        JComboBox YearLastCom = new JComboBox(Year);
        YearLastCom.setLocation(10, 140);
        YearLastCom.setSize(60, 30);
        add(YearLastCom);

        JComboBox MonthLastCom = new JComboBox(Month);
        MonthLastCom.setLocation(72, 140);
        MonthLastCom.setSize(60, 30);
        add(MonthLastCom);

        JComboBox DayLastCom = new JComboBox(Day);
        DayLastCom.setLocation(135, 140);
        DayLastCom.setSize(60, 30);
        add(DayLastCom);

        JButton returnMain = new JButton("메인으로 돌아가기");
        returnMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F.getCardLayout().show(F.getContentPane(), "One");
            }
        });
        returnMain.setLocation(10, 389);
        returnMain.setSize(185, 50);
        add(returnMain);

        JButton InfoLoad = new JButton("정보 불러오기");
        InfoLoad.setLocation(10, 444);
        InfoLoad.setSize(185, 50);
        add(InfoLoad);

        JButton InfoSave = new JButton("정보 저장");
        InfoSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "성공(미구현)");
            }
        });
        InfoSave.setLocation(10, 499);
        InfoSave.setSize(185, 50);
        add(InfoSave);

        JPanel datePanel = new JPanel();
        datePanel.setLocation(5, 5);
        datePanel.setBorder(BorderFactory.createTitledBorder("Set Date"));
        datePanel.setFont(new Font("Courier", Font.PLAIN, 20));
        datePanel.setSize(195, 550);
        add(datePanel);

        JPanel reportPanel = new JPanel();
        reportPanel.setLocation(200, 5);
        reportPanel.setBorder(BorderFactory.createTitledBorder("Weekly Report"));
        reportPanel.setFont(new Font("Courier", Font.PLAIN, 20));
        reportPanel.setSize(580, 250);
        add(reportPanel);

        JPanel DailyPanel = new JPanel();
        DailyPanel.setLocation(200, 255);
        DailyPanel.setBorder(BorderFactory.createTitledBorder("Daily Report"));
        DailyPanel.setFont(new Font("Courier", Font.PLAIN, 20));
        DailyPanel.setSize(580, 300);
        add(DailyPanel);

        setSize(800, 600);
        setVisible(true);
    }
}
