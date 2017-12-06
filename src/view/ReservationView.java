package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
public class ReservationView extends JPanel {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	MainFrame F;
	public ReservationView(MainFrame f) {
		setBounds(100, 100, 798, 602);
		
		//setContentPane(contentPane);
		setLayout(null);
		F = f;
		String header[] ={"날짜","시간","이름","인원"};
		String contents[][] = {{"날짜","시간","이름","인원"},
				{"17-12-06","17:00","정호석", "4"}};
		
		DefaultTableModel model = new DefaultTableModel(contents, header);
		
		textField = new JTextField();
		textField.setBounds(14, 392, 116, 24);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 392, 116, 24);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(274, 392, 116, 24);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(404, 392, 116, 24);
		add(textField_3);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputStr[] = new String[4];
				
				inputStr[0] = textField.getText();
				inputStr[1] = textField_1.getText();
				inputStr[2] = textField_2.getText();
				inputStr[3] =textField_3.getText();
				model.addRow(inputStr);
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton.setBounds(534, 372, 105, 27);
		add(btnNewButton);
		
		JButton button = new JButton("삭제");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow()==-1){
					return;
				}
				else{
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		button.setBounds(661, 372, 105, 27);
		add(button);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.getCardLayout().show(F.getContentPane(), "One");
			}
		});
		btnNewButton_1.setBounds(534, 415, 105, 27);
		add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 25, 640, 336);
		panel.setBorder(BorderFactory.createTitledBorder("예약현황"));
		add(panel);
		panel.setLayout(null);
		table = new JTable(model);
		table.setBounds(14, 25, 612, 299);
		panel.add(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setToolTipText("");
		
		label = new JLabel("날짜");
		label.setBounds(57, 376, 62, 18);
		add(label);
		
		label_1 = new JLabel("시간");
		label_1.setBounds(187, 376, 62, 18);
		add(label_1);
		
		label_2 = new JLabel("이름");
		label_2.setBounds(316, 376, 62, 18);
		add(label_2);
		
		label_3 = new JLabel("인원");
		label_3.setBounds(448, 376, 62, 18);
		add(label_3);
		

	}
}
