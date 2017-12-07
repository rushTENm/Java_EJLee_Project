package view;

import controller.TableSelector;
import model.Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainView extends JPanel {
    MainFrame F;
    public int selectedNumber = -1;
    public JButton buttons[] = new JButton[20];

    public MainView(MainFrame f) {
        int tableNum = 1;
        F = f;
        setSize(800, 600);
        setLayout(null);

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                buttons[tableNum - 1] = new JButton("테이블 " + tableNum);
                buttons[tableNum - 1].setLocation(160 + (i * 154), 90 + (j * 92));
                buttons[tableNum - 1].setSize(149, 87);
                buttons[tableNum - 1].addMouseListener(new TableSelector(this, buttons[tableNum - 1]));
                add(buttons[tableNum - 1]);
                tableNum++;
            }
        }

        JPanel TablePanel = new JPanel();
        TablePanel.setLocation(150, 70);
        TablePanel.setSize(630, 486);
        TablePanel.setBorder(BorderFactory.createTitledBorder("테이블 정보"));
        add(TablePanel);

        JLabel timeLabel = new JLabel();
        Time time = new Time(timeLabel);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                time.createAndShowGUI();
            }
        });
        timeLabel.setLocation(15, 30);
        timeLabel.setFont(new Font("Courier", Font.PLAIN, 40));
        timeLabel.setSize(700, 30);
        add(timeLabel);


        // 왼쪽 버튼 모음
        JButton cancelButton = new JButton("선택 취소");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelIterator();
            }
        });
        cancelButton.setLocation(15, 87);
        cancelButton.setSize(130, 50);
        add(cancelButton);

        JButton Order = new JButton("주문");
        Order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedNumber != -1) {
                    F.showOrderView(selectedNumber);
//                    F.getCardLayout().show(F.getContentPane(), "Two");
                    cancelIterator();
                }
            }
        });
        Order.setLocation(15, 142);
        Order.setSize(130, 50);
        add(Order);

        JButton Settle = new JButton("결제");
        Settle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedNumber != -1) {
                    F.showPaymentView(selectedNumber);
                    cancelIterator();
                }
            }
        });
        Settle.setLocation(15, 197);
        Settle.setSize(130, 50);
        add(Settle);

        JButton Vovert = new JButton("예약현황");
        Vovert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F.getCardLayout().show(F.getContentPane(), "four");
            }
        });
        Vovert.setLocation(15, 252);
        Vovert.setSize(130, 50);
        add(Vovert);

        JButton reportButton = new JButton("총매출");
        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F.getCardLayout().show(F.getContentPane(), "six");
            }
        });
        reportButton.setLocation(15, 363);
        reportButton.setSize(130, 50);
        add(reportButton);

        JButton itemScan = new JButton("상품조회");
        itemScan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F.getCardLayout().show(F.getContentPane(), "seven");
            }
        });
        itemScan.setLocation(15, 308);
        itemScan.setSize(130, 50);
        add(itemScan);

        JLabel POSVersion = new JLabel("POS system version 2.0");
        POSVersion.setLocation(567, 10);
        POSVersion.setFont(new Font("Courier", Font.PLAIN, 20));
        POSVersion.setSize(700, 30);
        add(POSVersion);

        JPanel OrderPanel = new JPanel();
        OrderPanel.setLocation(10, 70);
        OrderPanel.setSize(140, 485);
        OrderPanel.setBorder(BorderFactory.createTitledBorder("정보"));
        add(OrderPanel);

        JPanel posPanel = new JPanel();
        posPanel.setLocation(5, 5);
        posPanel.setBorder(BorderFactory.createTitledBorder("POS시스템"));
        posPanel.setFont(new Font("Courier", Font.PLAIN, 20));
        posPanel.setSize(780, 555);
        add(posPanel);


        setVisible(true);
    }

    private void cancelIterator() {
        for (int i = 0; i < 20; i++) {
            buttons[i].setEnabled(true);
        }
        selectedNumber = -1;
    }

}
