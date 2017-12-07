package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class OrderView extends JPanel {

    JTabbedPane t = new JTabbedPane();
    private JList list;
    private DefaultListModel listModel;
    private JButton DeleteButton;
    public int total;
    private int temp = 0;
    MainFrame F;
    ArrayList<String> sList = new ArrayList<>();
    ArrayList<String> OrderList = new ArrayList<>();
    ArrayList<Integer> tablePrice = new ArrayList<>();
    String n;

    static HashMap<String, Integer> menuMap = new HashMap<>();
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    public OrderView(MainFrame f) {
        total = 0;
        setSize(300, 80);
        setLayout(null);

        F = f;

        MyActionListener listener = new MyActionListener();

        list = new JList();
        list.setForeground(Color.BLACK);
        list.setBorder(new LineBorder(new Color(0, 0, 0)));
        list.setBounds(14, 42, 309, 305);
        add(list);


        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(353, 38, 429, 472);
        add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("김밥", null, panel, null);
        panel.setLayout(null);

        listModel = new DefaultListModel();

        JButton btnGB_1 = new JButton("원조김밥");
        btnGB_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("원조김밥/1500원");
                list.setModel(listModel);
                OrderList.add("원조김밥/1500원");
                total = 1500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_1.setBackground(Color.WHITE);
        btnGB_1.setBounds(14, 12, 130, 27);
        panel.add(btnGB_1);

        JButton btnGB_2 = new JButton("김치김밥");
        btnGB_2.setBackground(Color.WHITE);
        btnGB_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치김밥/2500원");
                list.setModel(listModel);
                OrderList.add("김치김밥/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_2.setBounds(152, 12, 130, 27);
        panel.add(btnGB_2);

        JButton btnGB_3 = new JButton("참치김밥");
        btnGB_3.setBackground(Color.WHITE);
        btnGB_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("참치김밥/2500원");
                list.setModel(listModel);
                OrderList.add("참치김밥/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_3.setBounds(290, 12, 130, 27);
        panel.add(btnGB_3);

        JButton btnGB_4 = new JButton("치즈김밥");
        btnGB_4.setBackground(Color.WHITE);
        btnGB_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("치즈김밥/2500원");
                list.setModel(listModel);
                OrderList.add("치즈김밥/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_4.setBounds(14, 51, 130, 27);
        panel.add(btnGB_4);
        JButton btnGB_5 = new JButton("계란말이김밥");
        btnGB_5.setBackground(Color.WHITE);
        btnGB_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("계란말이김밥/3000원");
                list.setModel(listModel);
                OrderList.add("계란말이김밥/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_5.setBounds(152, 51, 130, 27);
        panel.add(btnGB_5);

        JButton btnGB_6 = new JButton("소고기김밥");
        btnGB_6.setBackground(Color.WHITE);
        btnGB_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("소고기김밥/3000원");
                list.setModel(listModel);
                OrderList.add("소고기김밥/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_6.setBounds(290, 51, 130, 27);
        panel.add(btnGB_6);

        JButton btnGB_7 = new JButton("고추김밥");
        btnGB_7.setBackground(Color.WHITE);
        btnGB_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("고추김밥/2500원");
                list.setModel(listModel);
                OrderList.add("고추김밥/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_7.setBounds(14, 90, 130, 27);
        panel.add(btnGB_7);

        JButton btnGB_8 = new JButton("샐러드김밥");
        btnGB_8.setBackground(Color.WHITE);
        btnGB_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("샐러드김밥/2500원");
                list.setModel(listModel);
                OrderList.add("샐러드김밥/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_8.setBounds(152, 90, 130, 27);
        panel.add(btnGB_8);

        JButton btnGB_9 = new JButton("모듬김밥");
        btnGB_9.setBackground(Color.WHITE);
        btnGB_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("모듬김밥/4000원");
                list.setModel(listModel);
                OrderList.add("모듬김밥/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnGB_9.setBounds(290, 90, 130, 27);
        panel.add(btnGB_9);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("계절메뉴", null, panel_1, null);
        panel_1.setLayout(null);

        JButton btnSeason_1 = new JButton("물냉면");
        btnSeason_1.setBackground(Color.WHITE);
        btnSeason_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("물냉면/5000원");
                list.setModel(listModel);
                OrderList.add("물냉면/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnSeason_1.setBounds(14, 12, 130, 27);
        panel_1.add(btnSeason_1);

        JButton btnSeason_2 = new JButton("콩국수");
        btnSeason_2.setBackground(Color.WHITE);
        btnSeason_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("콩국수/5000원");
                list.setModel(listModel);
                OrderList.add("콩국수/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnSeason_2.setBounds(150, 12, 130, 27);
        panel_1.add(btnSeason_2);

        JButton btnSeason_3 = new JButton("비빔냉면");
        btnSeason_3.setBackground(Color.WHITE);
        btnSeason_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("비빔냉면/5000원");
                list.setModel(listModel);
                OrderList.add("비빔냉면/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnSeason_3.setBounds(290, 12, 130, 27);
        panel_1.add(btnSeason_3);

        JButton btnSeason_4 = new JButton("냉모밀");
        btnSeason_4.setBackground(Color.WHITE);
        btnSeason_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("냉모밀/5000원");
                list.setModel(listModel);
                OrderList.add("냉모밀/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnSeason_4.setBounds(14, 51, 130, 27);
        panel_1.add(btnSeason_4);

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("면류", null, panel_2, null);
        panel_2.setLayout(null);

        JButton btnNoodle_1 = new JButton("계란라면");
        btnNoodle_1.setBackground(Color.WHITE);
        btnNoodle_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("계란라면/2500원");
                list.setModel(listModel);
                OrderList.add("냉모밀/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });
        btnNoodle_1.setBounds(14, 12, 130, 27);
        panel_2.add(btnNoodle_1);

        JButton btnNoodle_2 = new JButton("김치라면");
        btnNoodle_2.setBackground(Color.WHITE);
        btnNoodle_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치라면/3000원");
                list.setModel(listModel);
                OrderList.add("김치라면/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_2.setBounds(150, 12, 130, 27);
        panel_2.add(btnNoodle_2);

        JButton btnNoodle_3 = new JButton("떡라면");
        btnNoodle_3.setBackground(Color.WHITE);
        btnNoodle_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("떡라면/3000원");
                list.setModel(listModel);
                OrderList.add("떡라면/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_3.setBounds(290, 12, 130, 27);
        panel_2.add(btnNoodle_3);

        JButton btnNoodle_4 = new JButton("만두라면");
        btnNoodle_4.setBackground(Color.WHITE);
        btnNoodle_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("만두라면/3000원");
                list.setModel(listModel);
                OrderList.add("만두라면/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_4.setBounds(14, 51, 130, 27);
        panel_2.add(btnNoodle_4);

        JButton btnNoodle_5 = new JButton("치즈라면");
        btnNoodle_5.setBackground(Color.WHITE);
        btnNoodle_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("치즈라면/3000원");
                list.setModel(listModel);
                OrderList.add("치즈라면/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_5.setBounds(150, 51, 130, 27);
        panel_2.add(btnNoodle_5);

        JButton btnNoodle_6 = new JButton("콩나물라면");
        btnNoodle_6.setBackground(Color.WHITE);
        btnNoodle_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("콩나물라면/3000원");
                list.setModel(listModel);
                OrderList.add("콩나물라면/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_6.setBounds(290, 51, 130, 27);
        panel_2.add(btnNoodle_6);

        JButton btnNoodle_7 = new JButton("수제비라면");
        btnNoodle_7.setBackground(Color.WHITE);
        btnNoodle_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("수제비라면/4000원");
                list.setModel(listModel);
                OrderList.add("수제비라면/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_7.setBounds(14, 90, 130, 27);
        panel_2.add(btnNoodle_7);

        JButton btnNoodle_8 = new JButton("짬뽕라면");
        btnNoodle_8.setBackground(Color.WHITE);
        btnNoodle_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("짬뽕라면/4000원");
                list.setModel(listModel);
                OrderList.add("짬뽕라면/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_8.setBounds(150, 90, 130, 27);
        panel_2.add(btnNoodle_8);

        JButton btnNoodle_9 = new JButton("우동");
        btnNoodle_9.setBackground(Color.WHITE);
        btnNoodle_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("우동/3500원");
                list.setModel(listModel);
                OrderList.add("우동/3500원");
                total = 3500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_9.setBounds(290, 90, 130, 27);
        panel_2.add(btnNoodle_9);

        JButton btnNoodle_10 = new JButton("잔치국수");
        btnNoodle_10.setBackground(Color.WHITE);
        btnNoodle_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("잔치국수/4000원");
                list.setModel(listModel);
                OrderList.add("잔치국수/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_10.setBounds(290, 90, 130, 27);
        panel_2.add(btnNoodle_10);

        JButton btnNoodle_11 = new JButton("비빔국수");
        btnNoodle_11.setBackground(Color.WHITE);
        btnNoodle_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("비빔국수/4500원");
                list.setModel(listModel);
                OrderList.add("비빔국수/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_11.setBounds(14, 129, 130, 27);
        panel_2.add(btnNoodle_11);

        JButton btnNoodle_12 = new JButton("손수제비");
        btnNoodle_12.setBackground(Color.WHITE);
        btnNoodle_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("손수제비/4500원");
                list.setModel(listModel);
                OrderList.add("손수제비/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_12.setBounds(150, 129, 130, 27);
        panel_2.add(btnNoodle_12);

        JButton btnNoodle_13 = new JButton("김치수제비");
        btnNoodle_13.setBackground(Color.WHITE);
        btnNoodle_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치수제비/4500원");
                list.setModel(listModel);
                OrderList.add("김치수제비/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_13.setBounds(290, 129, 130, 27);
        panel_2.add(btnNoodle_13);

        JButton btnNoodle_14 = new JButton("칼국수");
        btnNoodle_14.setBackground(Color.WHITE);
        btnNoodle_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("칼국수/4500원");
                list.setModel(listModel);
                OrderList.add("칼국수/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_14.setBounds(14, 168, 130, 27);
        panel_2.add(btnNoodle_14);

        JButton btnNoodle_15 = new JButton("쫄면");
        btnNoodle_15.setBackground(Color.WHITE);
        btnNoodle_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("쫄면/4000원");
                list.setModel(listModel);
                OrderList.add("쫄면/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnNoodle_15.setBounds(150, 168, 130, 27);
        panel_2.add(btnNoodle_15);


        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("분식류", null, panel_3, null);
        panel_3.setLayout(null);

        JButton btnsnack_1 = new JButton("떡볶이");
        btnsnack_1.setBackground(Color.WHITE);
        btnsnack_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("떡볶이/2500원");
                list.setModel(listModel);
                OrderList.add("떡볶이/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_1.setBounds(14, 12, 130, 27);
        panel_3.add(btnsnack_1);

        JButton btnsnack_2 = new JButton("치즈떡볶이");
        btnsnack_2.setBackground(Color.WHITE);
        btnsnack_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("치즈떡볶이/3000원");
                list.setModel(listModel);
                OrderList.add("치즈떡볶이/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_2.setBounds(150, 12, 130, 27);
        panel_3.add(btnsnack_2);

        JButton btnsnack_3 = new JButton("라볶이");
        btnsnack_3.setBackground(Color.WHITE);
        btnsnack_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("라볶이/3000원");
                list.setModel(listModel);
                OrderList.add("라볶이/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_3.setBounds(290, 12, 130, 27);
        panel_3.add(btnsnack_3);

        JButton btnsnack_4 = new JButton("치즈라볶이");
        btnsnack_4.setBackground(Color.WHITE);
        btnsnack_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("치즈라볶이/3500원");
                list.setModel(listModel);
                OrderList.add("치즈라볶이/3500원");
                total = 3500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_4.setBounds(14, 56, 130, 27);
        panel_3.add(btnsnack_4);

        JButton btnsnack_5 = new JButton("쫄떡볶이");
        btnsnack_5.setBackground(Color.WHITE);
        btnsnack_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("쫄떡볶이/4000원");
                list.setModel(listModel);
                OrderList.add("쫄떡볶이/4000원");
                total = 4000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_5.setBounds(150, 56, 130, 27);
        panel_3.add(btnsnack_5);

        JButton btnsnack_6 = new JButton("떡국");
        btnsnack_6.setBackground(Color.WHITE);
        btnsnack_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("떡국/4500원");
                list.setModel(listModel);
                OrderList.add("떡국/44500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_6.setBounds(290, 56, 130, 27);
        panel_3.add(btnsnack_6);

        JButton btnsnack_7 = new JButton("만두국");
        btnsnack_7.setBackground(Color.WHITE);
        btnsnack_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("만두국/4500원");
                list.setModel(listModel);
                OrderList.add("만두국/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_7.setBounds(14, 95, 130, 27);
        panel_3.add(btnsnack_7);

        JButton btnsnack_8 = new JButton("떡만두국");
        btnsnack_8.setBackground(Color.WHITE);
        btnsnack_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("떡만두국/5000원");
                list.setModel(listModel);
                OrderList.add("떡만두국/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_8.setBounds(150, 95, 130, 27);
        panel_3.add(btnsnack_8);

        JButton btnsnack_9 = new JButton("고기만두");
        btnsnack_9.setBackground(Color.WHITE);
        btnsnack_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("고기만두/3000원");
                list.setModel(listModel);
                OrderList.add("고기만두/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_9.setBounds(290, 95, 130, 27);
        panel_3.add(btnsnack_9);

        JButton btnsnack_10 = new JButton("김치만두");
        btnsnack_10.setBackground(Color.WHITE);
        btnsnack_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치만두/3000원");
                list.setModel(listModel);
                OrderList.add("김치만두/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_10.setBounds(14, 134, 130, 27);
        panel_3.add(btnsnack_10);

        JButton btnsnack_11 = new JButton("물만두");
        btnsnack_11.setBackground(Color.WHITE);
        btnsnack_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("물만두/3000원");
                list.setModel(listModel);
                OrderList.add("물만두/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_11.setBounds(150, 134, 130, 27);
        panel_3.add(btnsnack_11);

        JButton btnsnack_12 = new JButton("군만두");
        btnsnack_12.setBackground(Color.WHITE);
        btnsnack_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("군만두/3000원");
                list.setModel(listModel);
                OrderList.add("군만두/3000원");
                total = 3000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_12.setBounds(290, 134, 130, 27);
        panel_3.add(btnsnack_12);

        JButton btnsnack_13 = new JButton("오뎅");
        btnsnack_13.setBackground(Color.WHITE);
        btnsnack_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("오뎅/2500원");
                list.setModel(listModel);
                OrderList.add("오뎅/2500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnsnack_13.setBounds(14, 173, 130, 27);
        panel_3.add(btnsnack_13);


        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("덮밥/복음밥류", null, panel_4, null);
        panel_4.setLayout(null);

        JButton btnBowlOfRice_1 = new JButton("제육덮밥");
        btnBowlOfRice_1.setBackground(Color.WHITE);
        btnBowlOfRice_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("제육덮밥/4500원");
                list.setModel(listModel);
                OrderList.add("제육덮밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_1.setBounds(14, 12, 130, 27);
        panel_4.add(btnBowlOfRice_1);

        JButton btnBowlOfRice_2 = new JButton("오징어덮밥");
        btnBowlOfRice_2.setBackground(Color.WHITE);
        btnBowlOfRice_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("오징어덮밥/4500원");
                list.setModel(listModel);
                OrderList.add("오징어덮밥/4500원");
                total = 2500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_2.setBounds(150, 12, 130, 27);
        panel_4.add(btnBowlOfRice_2);

        JButton btnBowlOfRice_3 = new JButton("김치덮밥");
        btnBowlOfRice_3.setBackground(Color.WHITE);
        btnBowlOfRice_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치덮밥/4500원");
                list.setModel(listModel);
                OrderList.add("김치덮밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_3.setBounds(290, 12, 130, 27);
        panel_4.add(btnBowlOfRice_3);

        JButton btnBowlOfRice_4 = new JButton("참치김치덮밥");
        btnBowlOfRice_4.setBackground(Color.WHITE);
        btnBowlOfRice_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("참치김치덮밥/5000원");
                list.setModel(listModel);
                OrderList.add("참치김치덮밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_4.setBounds(14, 51, 130, 27);
        panel_4.add(btnBowlOfRice_4);

        JButton btnBowlOfRice_5 = new JButton("소고기덮밥");
        btnBowlOfRice_5.setBackground(Color.WHITE);
        btnBowlOfRice_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("소고기덮밥/5000원");
                list.setModel(listModel);
                OrderList.add("소고기덮밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_5.setBounds(150, 51, 130, 27);
        panel_4.add(btnBowlOfRice_5);

        JButton btnBowlOfRice_6 = new JButton("짜장덮밥");
        btnBowlOfRice_6.setBackground(Color.WHITE);
        btnBowlOfRice_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("짜장덮밥/5000원");
                list.setModel(listModel);
                OrderList.add("짜장덮밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_6.setBounds(290, 51, 130, 27);
        panel_4.add(btnBowlOfRice_6);

        JButton btnBowlOfRice_7 = new JButton("낙지덮밥");
        btnBowlOfRice_7.setBackground(Color.WHITE);
        btnBowlOfRice_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("낙지덮밥/5500원");
                list.setModel(listModel);
                OrderList.add("낙지덮밥/5500원");
                total = 5500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_7.setBounds(14, 90, 130, 27);
        panel_4.add(btnBowlOfRice_7);

        JButton btnBowlOfRice_8 = new JButton("야채볶음밥");
        btnBowlOfRice_8.setBackground(Color.WHITE);
        btnBowlOfRice_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("야채볶음밥/4500원");
                list.setModel(listModel);
                OrderList.add("야채볶음밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_8.setBounds(150, 90, 130, 27);
        panel_4.add(btnBowlOfRice_8);

        JButton btnBowlOfRice_9 = new JButton("김치볶음밥");
        btnBowlOfRice_9.setBackground(Color.WHITE);
        btnBowlOfRice_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치볶음밥/4500원");
                list.setModel(listModel);
                OrderList.add("김치볶음밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_9.setBounds(290, 90, 130, 27);
        panel_4.add(btnBowlOfRice_9);

        JButton btnBowlOfRice_10 = new JButton("낚지볶음밥");
        btnBowlOfRice_10.setBackground(Color.WHITE);
        btnBowlOfRice_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("낙지볶음밥/5000원");
                list.setModel(listModel);
                OrderList.add("낙지볶음밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_10.setBounds(14, 129, 130, 27);
        panel_4.add(btnBowlOfRice_10);

        JButton btnBowlOfRice_11 = new JButton("참치김치볶음밥");
        btnBowlOfRice_11.setBackground(Color.WHITE);
        btnBowlOfRice_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("참치김치볶음밥/5000원");
                list.setModel(listModel);
                OrderList.add("참치김치볶음밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_11.setBounds(150, 129, 130, 27);
        panel_4.add(btnBowlOfRice_11);

        JButton btnBowlOfRice_12 = new JButton("새우볶음밥");
        btnBowlOfRice_12.setBackground(Color.WHITE);
        btnBowlOfRice_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("새우볶음밥/5000원");
                list.setModel(listModel);
                OrderList.add("새우볶음밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_12.setBounds(290, 129, 130, 27);
        panel_4.add(btnBowlOfRice_12);

        JButton btnBowlOfRice_13 = new JButton("소고기볶음밥");
        btnBowlOfRice_13.setBackground(Color.WHITE);
        btnBowlOfRice_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("소고기볶음밥/5000원");
                list.setModel(listModel);
                OrderList.add("소고기볶음밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_13.setBounds(14, 168, 130, 27);
        panel_4.add(btnBowlOfRice_13);

        JButton btnBowlOfRice_14 = new JButton("해물볶음밥");
        btnBowlOfRice_14.setBackground(Color.WHITE);
        btnBowlOfRice_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("해물볶음밥/5000원");
                list.setModel(listModel);
                OrderList.add("해물볶음밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_14.setBounds(150, 168, 130, 27);
        panel_4.add(btnBowlOfRice_14);

        JButton btnBowlOfRice_15 = new JButton("오므라이스");
        btnBowlOfRice_15.setBackground(Color.WHITE);
        btnBowlOfRice_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("오므라이스/4500원");
                list.setModel(listModel);
                OrderList.add("오므라이스/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_15.setBounds(290, 168, 130, 27);
        panel_4.add(btnBowlOfRice_15);

        JButton btnBowlOfRice_16 = new JButton("카레라이스");
        btnBowlOfRice_16.setBackground(Color.WHITE);
        btnBowlOfRice_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("카레라이스/4500원");
                list.setModel(listModel);
                OrderList.add("카레라이스/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_16.setBounds(14, 207, 130, 27);
        panel_4.add(btnBowlOfRice_16);

        JButton btnBowlOfRice_17 = new JButton("참치오므라이스");
        btnBowlOfRice_17.setBackground(Color.WHITE);
        btnBowlOfRice_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("참치오므라이스/5000원");
                list.setModel(listModel);
                OrderList.add("참치오므라이스/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_17.setBounds(150, 207, 130, 27);
        panel_4.add(btnBowlOfRice_17);

        JButton btnBowlOfRice_18 = new JButton("돈까스오므라이스");
        btnBowlOfRice_18.setBackground(Color.WHITE);
        btnBowlOfRice_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("돈까스오므라이스/6000원");
                list.setModel(listModel);
                OrderList.add("돈까스오므라이스/6000원");
                total = 6000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnBowlOfRice_18.setBounds(290, 207, 130, 27);
        panel_4.add(btnBowlOfRice_18);

        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("찌개/탕류", null, panel_5, null);
        panel_5.setLayout(null);

        JButton btnStew_1 = new JButton("된장찌개");
        btnStew_1.setBackground(Color.WHITE);
        btnStew_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("된장찌개/4500원");
                list.setModel(listModel);
                OrderList.add("된장찌개/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_1.setBounds(14, 12, 130, 27);
        panel_5.add(btnStew_1);

        JButton btnStew_2 = new JButton("순두부찌개");
        btnStew_2.setBackground(Color.WHITE);
        btnStew_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("순두부찌개/4500원");
                list.setModel(listModel);
                OrderList.add("순두부찌개/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_2.setBounds(150, 12, 130, 27);
        panel_5.add(btnStew_2);

        JButton btnStew_3 = new JButton("김치찌개");
        btnStew_3.setBackground(Color.WHITE);
        btnStew_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("김치찌개/4500원");
                list.setModel(listModel);
                OrderList.add("김치찌개/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_3.setBounds(290, 12, 130, 27);
        panel_5.add(btnStew_3);

        JButton btnStew_4 = new JButton("참치김치찌개");
        btnStew_4.setBackground(Color.WHITE);
        btnStew_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("참치김치찌개/5000원");
                list.setModel(listModel);
                OrderList.add("참치김치찌개/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_4.setBounds(14, 51, 130, 27);
        panel_5.add(btnStew_4);

        JButton btnStew_5 = new JButton("부대찌개");
        btnStew_5.setBackground(Color.WHITE);
        btnStew_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("부대찌개/6000원");
                list.setModel(listModel);
                OrderList.add("부대찌개/6000원");
                total = 6000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_5.setBounds(150, 51, 130, 27);
        panel_5.add(btnStew_5);

        JButton btnStew_6 = new JButton("고등어김치조림");
        btnStew_6.setBackground(Color.WHITE);
        btnStew_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("고등어김치조림/5000원");
                list.setModel(listModel);
                OrderList.add("고등어김치조림/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_6.setBounds(290, 51, 130, 27);
        panel_5.add(btnStew_6);

        JButton btnStew_7 = new JButton("올갱이해장국");
        btnStew_7.setBackground(Color.WHITE);
        btnStew_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("올갱이해장국/5000원");
                list.setModel(listModel);
                OrderList.add("올갱이해장국/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_7.setBounds(14, 90, 130, 27);
        panel_5.add(btnStew_7);

        JButton btnStew_8 = new JButton("육개장");
        btnStew_8.setBackground(Color.WHITE);
        btnStew_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("육개장/5000원");
                list.setModel(listModel);
                OrderList.add("육개장/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_8.setBounds(150, 90, 130, 27);
        panel_5.add(btnStew_8);

        JButton btnStew_9 = new JButton("갈비탕");
        btnStew_9.setBackground(Color.WHITE);
        btnStew_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("갈비탕/5000원");
                list.setModel(listModel);
                OrderList.add("갈비탕/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_9.setBounds(290, 90, 130, 27);
        panel_5.add(btnStew_9);

        JButton btnStew_10 = new JButton("황태해장국");
        btnStew_10.setBackground(Color.WHITE);
        btnStew_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("황태해장국/5500원");
                list.setModel(listModel);
                OrderList.add("황태해장국/5500원");
                total = 5500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_10.setBounds(14, 129, 130, 27);
        panel_5.add(btnStew_10);

        JButton btnStew_11 = new JButton("뚝배기불고기");
        btnStew_11.setBackground(Color.WHITE);
        btnStew_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("뚝배기불고기/5000원");
                list.setModel(listModel);
                OrderList.add("뚝배기불고기/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_11.setBounds(150, 129, 130, 27);
        panel_5.add(btnStew_11);

        JButton btnStew_12 = new JButton("공기밥");
        btnStew_12.setBackground(Color.WHITE);
        btnStew_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("공기밥/1000원");
                list.setModel(listModel);
                OrderList.add("공기밥/1000원");
                total = 1000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnStew_12.setBounds(290, 129, 130, 27);
        panel_5.add(btnStew_12);

        JPanel panel_6 = new JPanel();
        tabbedPane.addTab("건강죽", null, panel_6, null);
        panel_6.setLayout(null);

        JButton btnPorridge_1 = new JButton("호박죽");
        btnPorridge_1.setBackground(Color.WHITE);
        btnPorridge_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("호박죽/4500원");
                list.setModel(listModel);
                OrderList.add("호박죽/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorridge_1.setBounds(14, 12, 130, 27);
        panel_6.add(btnPorridge_1);

        JButton btnPorridge_2 = new JButton("단팥죽");
        btnPorridge_2.setBackground(Color.WHITE);
        btnPorridge_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("단팥죽/4500원");
                list.setModel(listModel);
                OrderList.add("단팥죽/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorridge_2.setBounds(150, 12, 130, 27);
        panel_6.add(btnPorridge_2);

        JButton btnPorridge_3 = new JButton("소고기야채죽");
        btnPorridge_3.setBackground(Color.WHITE);
        btnPorridge_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("소고기야채죽/5000원");
                list.setModel(listModel);
                OrderList.add("된장찌개/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorridge_3.setBounds(290, 12, 130, 27);
        panel_6.add(btnPorridge_3);

        JButton btnPorridge_4 = new JButton("전복죽");
        btnPorridge_4.setBackground(Color.WHITE);
        btnPorridge_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("전복죽/6500원");
                list.setModel(listModel);
                OrderList.add("전복죽/6500원");
                total = 6500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorridge_4.setBounds(14, 51, 130, 27);
        panel_6.add(btnPorridge_4);

        JPanel panel_7 = new JPanel();
        tabbedPane.addTab("비빔밥류", null, panel_7, null);
        panel_7.setLayout(null);

        JButton btnbibimbap_1 = new JButton("비빔밥");
        btnbibimbap_1.setBackground(Color.WHITE);
        btnbibimbap_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("비빔밥/4500원");
                list.setModel(listModel);
                OrderList.add("비빔밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnbibimbap_1.setBounds(14, 12, 130, 27);
        panel_7.add(btnbibimbap_1);

        JButton btnbibimbap_2 = new JButton("돌솥비빔밥");
        btnbibimbap_2.setBackground(Color.WHITE);
        btnbibimbap_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("돌솦비빔밥/5000원");
                list.setModel(listModel);
                OrderList.add("돌솦비빔밥/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnbibimbap_2.setBounds(150, 12, 130, 27);
        panel_7.add(btnbibimbap_2);

        JButton btnbibimbap_3 = new JButton("돌솥알밥");
        btnbibimbap_3.setBackground(Color.WHITE);
        btnbibimbap_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("돌솥알밥/5500원");
                list.setModel(listModel);
                OrderList.add("돌솥알밥/5500원");
                total = 5500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnbibimbap_3.setBounds(290, 12, 130, 27);
        panel_7.add(btnbibimbap_3);

        JButton btnbibimbap_4 = new JButton("양품이비빔밥");
        btnbibimbap_4.setBackground(Color.WHITE);
        btnbibimbap_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("양푼이비빔밥/10000원");
                list.setModel(listModel);
                OrderList.add("양푼이비빔밥/10000원");
                total = 10000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnbibimbap_4.setBounds(14, 51, 130, 27);
        panel_7.add(btnbibimbap_4);

        JButton btnbibimbap_5 = new JButton("잡채밥");
        btnbibimbap_5.setBackground(Color.WHITE);
        btnbibimbap_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("잡채밥/4500원");
                list.setModel(listModel);
                OrderList.add("잡채밥/4500원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnbibimbap_5.setBounds(150, 51, 130, 27);
        panel_7.add(btnbibimbap_5);

        JPanel panel_8 = new JPanel();
        tabbedPane.addTab("돈까스", null, panel_8, null);
        panel_8.setLayout(null);

        JButton btnPorkCutlet_1 = new JButton("돈까스");
        btnPorkCutlet_1.setBackground(Color.WHITE);
        btnPorkCutlet_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("돈까스/5000원");
                list.setModel(listModel);
                OrderList.add("돈까스/5000원");
                total = 5000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_1.setBounds(14, 12, 130, 27);
        panel_8.add(btnPorkCutlet_1);

        JButton btnPorkCutlet_2 = new JButton("치즈돈까스");
        btnPorkCutlet_2.setBackground(Color.WHITE);
        btnPorkCutlet_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("치즈돈까스/6000원");
                list.setModel(listModel);
                OrderList.add("치즈돈까스/6000원");
                total = 4500 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_2.setBounds(150, 12, 130, 27);
        panel_8.add(btnPorkCutlet_2);

        JButton btnPorkCutlet_3 = new JButton("카레돈까스");
        btnPorkCutlet_3.setBackground(Color.WHITE);
        btnPorkCutlet_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("카레돈까스/6000원");
                list.setModel(listModel);
                OrderList.add("카레돈까스/6000원");
                total = 6000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_3.setBounds(290, 12, 130, 27);
        panel_8.add(btnPorkCutlet_3);

        JButton btnPorkCutlet_4 = new JButton("고구마돈까스");
        btnPorkCutlet_4.setBackground(Color.WHITE);
        btnPorkCutlet_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("고구마돈까스/6000원");
                list.setModel(listModel);
                OrderList.add("고구마돈까스/6000원");
                total = 6000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_4.setBounds(14, 51, 130, 27);
        panel_8.add(btnPorkCutlet_4);

        JButton btnPorkCutlet_5 = new JButton("스페셜정식");
        btnPorkCutlet_5.setBackground(Color.WHITE);
        btnPorkCutlet_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("스페셜정식/7000원");
                list.setModel(listModel);
                OrderList.add("비빔밥/7000원");
                total = 7000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_5.setBounds(150, 51, 130, 27);
        panel_8.add(btnPorkCutlet_5);

        JButton btnPorkCutlet_6 = new JButton("스페셜정식2");
        btnPorkCutlet_6.setBackground(Color.WHITE);
        btnPorkCutlet_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement("스페셜정식2/7000원");
                list.setModel(listModel);
                OrderList.add("스페셜정식/7000원");
                total = 7000 + total;
                textField_1.setText(String.valueOf(total));
            }
        });

        btnPorkCutlet_6.setBounds(290, 51, 130, 27);
        panel_8.add(btnPorkCutlet_6);

        JLabel label = new JLabel("총 금액");
        label.setBounds(14, 359, 62, 18);
        add(label);

        textField_1 = new JTextField();
        textField_1.setText("0");
        textField_1.setBounds(107, 356, 116, 24);
        add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel = new JLabel("원");
        lblNewLabel.setBounds(226, 359, 62, 18);
        add(lblNewLabel);


        JButton btnOder = new JButton("확인");
        btnOder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tablePrice.add(total);
                F.setTotal(total);
//                F.getCardLayout().show(F.getContentPane(), "One");
            }
        });
        btnOder.setBounds(10, 430, 100, 46);
        add(btnOder);


        DeleteButton = new JButton("삭제");
        DeleteButton.addActionListener(new DeleteListner());
        DeleteButton.setBounds(120, 430, 100, 46);
        add(DeleteButton);


        JButton btnAllDelete = new JButton("일괄취소");
        btnAllDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                listModel.clear();
                total = 0;
                textField_1.setText("0");
                n = null;
                sList.clear();
                textField_2.setText("0");
                textField_3.setText("0");
                temp = 0;
            }
        });
        btnAllDelete.setBounds(230, 430, 100, 46);
        add(btnAllDelete);

    }

    class DeleteListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //This method can be called only if
            //there's a valid selection
            //so go ahead and remove whatever's selected.
            int index = list.getSelectedIndex();
            listModel.remove(index);

            int size = listModel.getSize();

            if (size == 0) { //Nobody's left, disable firing.
                DeleteButton.setEnabled(false);

            } else { //Select an index.
                if (index == listModel.getSize()) {
                    //removed item in last position
                    index--;
                }

                list.setSelectedIndex(index);
                list.ensureIndexIsVisible(index);
            }
        }
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            sList.add(b.getText());
            n = null;
            for (String d : sList)
                n = n + d;
            n = n.substring(4);
            textField_2.setText(n);
            temp = Integer.parseInt(n);


        }
    }
}