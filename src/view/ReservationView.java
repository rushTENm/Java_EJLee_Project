package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ReservationView extends JPanel {

    private JTable table;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField nameField;
    private JTextField numField;

    public ReservationView(MainFrame f) {
        setBounds(10, 10, 790, 590);
        setLayout(null);

        String header[] = {"날짜", "시간", "이름", "인원"};
        DefaultTableModel model = new DefaultTableModel(null, header);

        try {
            BufferedReader fr = new BufferedReader(new FileReader("Reservation.dat"));
            while (true) {
                String line = fr.readLine();
                if (line == null)
                    break;
                String[] strings = line.split(" ");
                model.addRow(strings);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        panel.setBounds(14, 14, 772, 548);
        panel.setBorder(BorderFactory.createTitledBorder("예약현황"));
        add(panel);
        panel.setLayout(null);
        table = new JTable(model);
        table.setBounds(14, 55, 747, 420);
        panel.add(table);
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setToolTipText("");

        JLabel dateLabel = new JLabel("날짜");
        dateLabel.setFont(new Font("Courier", Font.BOLD, 20));
        dateLabel.setBounds(16, 26, 62, 20);
        panel.add(dateLabel);

        JLabel timeLabel = new JLabel("시간");
        timeLabel.setFont(new Font("Courier", Font.BOLD, 20));
        timeLabel.setBounds(203, 26, 62, 20);
        panel.add(timeLabel);

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setFont(new Font("Courier", Font.BOLD, 20));
        nameLabel.setBounds(388, 26, 62, 20);
        panel.add(nameLabel);

        JLabel numLabel = new JLabel("인원");
        numLabel.setFont(new Font("Courier", Font.BOLD, 20));
        numLabel.setBounds(575, 26, 62, 20);
        panel.add(numLabel);

        dateField = new JTextField();
        dateField.setBounds(14, 480, 186, 24);
        panel.add(dateField);
        //dateField.setColumns(10);

        timeField = new JTextField();
        timeField.setColumns(10);
        timeField.setBounds(201, 480, 186, 24);
        panel.add(timeField);

        nameField = new JTextField();
        nameField.setColumns(10);
        nameField.setBounds(388, 480, 186, 24);
        panel.add(nameField);

        numField = new JTextField();
        numField.setColumns(10);
        numField.setBounds(575, 480, 186, 24);
        panel.add(numField);

        JButton btnNewButton = new JButton("추가");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String inputStr[] = new String[4];
                inputStr[0] = dateField.getText();
                inputStr[1] = timeField.getText();
                inputStr[2] = nameField.getText();
                inputStr[3] = numField.getText();

                if (inputStr[0].isEmpty() || inputStr[1].isEmpty() || inputStr[2].isEmpty() || inputStr[3].isEmpty()) {
                    System.out.println("isEmpty");
                } else {
                    model.addRow(inputStr);

                    dateField.setText("");
                    timeField.setText("");
                    nameField.setText("");
                    numField.setText("");
                }
            }
        });
        btnNewButton.setBounds(655, 510, 105, 27);
        panel.add(btnNewButton);

        JButton button = new JButton("삭제");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (table.getSelectedRow() == -1) {
                    return;
                } else {
                    model.removeRow(table.getSelectedRow());
                }
            }
        });
        button.setBounds(540, 510, 105, 27);
        panel.add(button);

        JButton btnNewButton_1 = new JButton("확인");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // BufferedWriter 와 FileWriter를 조합
                    BufferedWriter fw = new BufferedWriter(new FileWriter("Reservation.dat"));
                    // 파일안에 문자열 쓰기
                    for (Object object : model.getDataVector()) {
                        Vector vector = (Vector) object;
                        for (Object inner : vector) {
                            fw.write(inner.toString());
                            fw.write(" ");
                        }
                        fw.write("\n");
                    }
                    fw.flush();
                    // 객체 닫기
                    fw.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                f.getCardLayout().show(f.getContentPane(), "One");
            }
        });
        btnNewButton_1.setBounds(14, 510, 105, 27);
        panel.add(btnNewButton_1);
    }
}
