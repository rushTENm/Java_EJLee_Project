package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class OderView extends JPanel {

	JTabbedPane t = new JTabbedPane();
	private JList list;
	private DefaultListModel listModel;
	private JButton DeleteButton;
	public int total;
	private int temp = 0;
	MainFrame F;
	ArrayList<String> sList = new ArrayList<>();
	static ArrayList<Integer> tablePrice = new ArrayList<>();
	String n;
	
	static HashMap<String, Integer> menuMap = new HashMap<>();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	public OderView(MainFrame f) {
		total = 0;
		setSize(300, 80);
		setLayout(null);
		
		F=f;
		MyActionListener listener = new MyActionListener();
		
		
		list = new JList();
		list.setForeground(Color.BLACK);
		list.setBounds(14, 12, 499, 305);
		add(list);
		
		JButton btnOder = new JButton("주문");
		btnOder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablePrice.add(total);
				F.changePanel();
			}
		});
		btnOder.setBounds(118, 524, 105, 46);
		add(btnOder);
		
		DeleteButton = new JButton("삭제");
		DeleteButton.addActionListener(new DeleteListner());
		DeleteButton.setBounds(118, 479, 105, 46);
		add(DeleteButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(723, 38, 519, 472);
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
				total = 1500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_1.setBackground(Color.WHITE);
		btnGB_1.setBounds(27, 24, 121, 43);
		panel.add(btnGB_1);
		
		JButton btnGB_2 = new JButton("김치김밥");
		btnGB_2.setBackground(Color.WHITE);
		btnGB_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("김치김밥/2500원");
				list.setModel(listModel);
				total = 2500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_2.setBounds(162, 24, 119, 43);
		panel.add(btnGB_2);
		
		JButton btnGB_3 = new JButton("참치김밥");
		btnGB_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("참치김밥/2500원");
				list.setModel(listModel);
				total = 2500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_3.setBounds(295, 24, 121, 43);
		panel.add(btnGB_3);
		
		JButton btnGB_4 = new JButton("치즈김밥");
		btnGB_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("치즈김밥/2500원");
				list.setModel(listModel);
				total = 2500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_4.setBounds(27, 100, 121, 43);
		panel.add(btnGB_4);
		JButton btnGB_5 = new JButton("계란말이김밥");
		btnGB_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("계란말이김밥/3000원");
				list.setModel(listModel);
				total = 3000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_5.setBounds(162, 100, 119, 43);
		panel.add(btnGB_5);
		
		JButton btnGB_6 = new JButton("소고기김밥");
		btnGB_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("소고기김밥/3000원");
				list.setModel(listModel);
				total = 3000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_6.setBounds(295, 100, 121, 43);
		panel.add(btnGB_6);
		
		JButton btnGB_7 = new JButton("고추김밥");
		btnGB_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("고추김밥/2500원");
				list.setModel(listModel);
				total = 2500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_7.setBounds(27, 176, 121, 43);
		panel.add(btnGB_7);
		
		JButton btnGB_8 = new JButton("샐러드김밥");
		btnGB_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("샐러드김밥/2500원");
				list.setModel(listModel);
				total = 2500+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_8.setBounds(162, 176, 119, 43);
		panel.add(btnGB_8);
		
		JButton btnGB_9 = new JButton("모듬김밥");
		btnGB_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("모듬김밥/4000원");
				list.setModel(listModel);
				total = 4000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnGB_9.setBounds(295, 176, 121, 43);
		panel.add(btnGB_9);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("계절메뉴", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnSeason_1 = new JButton("물냉면");
		btnSeason_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("물냉면/5000원");
				list.setModel(listModel);
				total = 5000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnSeason_1.setBounds(14, 12, 111, 40);
		panel_1.add(btnSeason_1);
		
		JButton btnSeason_2 = new JButton("콩국수");
		btnSeason_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("콩국수/5000원");
				list.setModel(listModel);
				total = 5000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnSeason_2.setBounds(151, 12, 111, 40);
		panel_1.add(btnSeason_2);
		
		JButton btnSeason_3 = new JButton("비빔냉면");
		btnSeason_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("비빔냉면/5000원");
				list.setModel(listModel);
				total = 5000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnSeason_3.setBounds(293, 12, 111, 40);
		panel_1.add(btnSeason_3);
		
		JButton btnSeason_4 = new JButton("냉모밀");
		btnSeason_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("냉모밀/5000원");
				list.setModel(listModel);
				total = 5000+total;
				textField_1.setText(String.valueOf(total));
			}
		});
		btnSeason_4.setBounds(14, 78, 111, 40);
		panel_1.add(btnSeason_4);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("면류", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNoodle_1 = new JButton("라면");
		btnNoodle_1.setBounds(14, 12, 105, 27);
		panel_2.add(btnNoodle_1);
		
		JButton btnNoodle_2 = new JButton("김치라면");
		btnNoodle_2.setBounds(133, 12, 105, 27);
		panel_2.add(btnNoodle_2);
		
		JButton btnNoodle_3 = new JButton("떡라면");
		btnNoodle_3.setBounds(252, 12, 105, 27);
		panel_2.add(btnNoodle_3);
		
		JButton btnNoodle_4 = new JButton("만두라면");
		btnNoodle_4.setBounds(371, 12, 105, 27);
		panel_2.add(btnNoodle_4);
		
		JButton btnNoodle_5 = new JButton("치즈라면");
		btnNoodle_5.setBounds(14, 51, 105, 27);
		panel_2.add(btnNoodle_5);
		
		JButton btnNoodle_6 = new JButton("콩나물라면");
		btnNoodle_6.setBounds(133, 51, 105, 27);
		panel_2.add(btnNoodle_6);
		
		JButton btnNoodle_7 = new JButton("수제비라면");
		btnNoodle_7.setBounds(252, 51, 105, 27);
		panel_2.add(btnNoodle_7);
		
		JButton btnNoodle_8 = new JButton("짬뽕라면");
		btnNoodle_8.setBounds(371, 51, 105, 27);
		panel_2.add(btnNoodle_8);
		
		JButton btnNoodle_9 = new JButton("우동");
		btnNoodle_9.setBounds(14, 90, 105, 27);
		panel_2.add(btnNoodle_9);
		
		JButton btnNoodle_10 = new JButton("잔치국수");
		btnNoodle_10.setBounds(133, 90, 105, 27);
		panel_2.add(btnNoodle_10);
		
		JButton btnNoodle_11 = new JButton("비빔국수");
		btnNoodle_11.setBounds(252, 90, 105, 27);
		panel_2.add(btnNoodle_11);
		
		JButton btnNoodle_12 = new JButton("비빔국수");
		btnNoodle_12.setBounds(371, 90, 105, 27);
		panel_2.add(btnNoodle_12);
		
		JButton btnNoodle_13 = new JButton("손수제비");
		btnNoodle_13.setBounds(14, 129, 105, 27);
		panel_2.add(btnNoodle_13);
		
		JButton btnNoodle_14 = new JButton("칼국수");
		btnNoodle_14.setBounds(133, 129, 105, 27);
		panel_2.add(btnNoodle_14);
		
		JButton btnNoodle_15 = new JButton("쫄면");
		btnNoodle_15.setBounds(252, 129, 105, 27);
		panel_2.add(btnNoodle_15);
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("분식류", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(14, 12, 105, 27);
		panel_3.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(133, 12, 105, 27);
		panel_3.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(252, 12, 105, 27);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(14, 51, 105, 27);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(133, 51, 105, 27);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(252, 51, 105, 27);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(14, 90, 105, 27);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(133, 90, 105, 27);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(252, 90, 105, 27);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("New button");
		button_8.setBounds(14, 129, 105, 27);
		panel_3.add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setBounds(133, 129, 105, 27);
		panel_3.add(button_9);
		
		JButton button_10 = new JButton("New button");
		button_10.setBounds(252, 129, 105, 27);
		panel_3.add(button_10);
		
		JButton button_11 = new JButton("New button");
		button_11.setBounds(14, 168, 105, 27);
		panel_3.add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setBounds(133, 168, 105, 27);
		panel_3.add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(252, 168, 105, 27);
		panel_3.add(button_13);
		
		JButton button_14 = new JButton("New button");
		button_14.setBounds(14, 207, 105, 27);
		panel_3.add(button_14);
		
		JButton button_15 = new JButton("New button");
		button_15.setBounds(133, 207, 105, 27);
		panel_3.add(button_15);
		
		JButton button_16 = new JButton("New button");
		button_16.setBounds(252, 207, 105, 27);
		panel_3.add(button_16);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("덮밥/복음밥류", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("찌개/탕류", null, panel_5, null);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("받은 금액");
		lblNewLabel_1.setBounds(14, 399, 62, 18);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(107, 396, 116, 24);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("원");
		lblNewLabel_2.setBounds(226, 399, 62, 18);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("거스름돈");
		lblNewLabel_3.setBounds(14, 439, 62, 18);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(107, 432, 116, 24);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("원");
		lblNewLabel_4.setBounds(226, 439, 62, 18);
		add(lblNewLabel_4);
		
		JButton btnNum_1 = new JButton("1");
		btnNum_1.addActionListener(listener);
		btnNum_1.setBounds(297, 355, 62, 36);
		add(btnNum_1);
		
		JButton btnNum_2 = new JButton("2");
		btnNum_2.addActionListener(listener);
		btnNum_2.setBounds(373, 355, 62, 36);
		add(btnNum_2);
		
		JButton btnNum_3 = new JButton("3");
		btnNum_3.addActionListener(listener);
		btnNum_3.setBounds(449, 355, 62, 36);
		add(btnNum_3);
		
		JButton btnNum_4 = new JButton("4");
		btnNum_4.addActionListener(listener);
		btnNum_4.setBounds(297, 403, 62, 36);
		add(btnNum_4);
		
		JButton btnNum_5 = new JButton("5");
		btnNum_5.addActionListener(listener);
		btnNum_5.setBounds(373, 403, 62, 36);
		add(btnNum_5);
		
		JButton btnNum_6 = new JButton("6");
		btnNum_6.addActionListener(listener);
		btnNum_6.setBounds(449, 403, 62, 36);
		add(btnNum_6);
		
		JButton btnNum_7 = new JButton("7");
		btnNum_7.addActionListener(listener);
		btnNum_7.setBounds(297, 451, 62, 36);
		add(btnNum_7);
		
		JButton btnNum_8 = new JButton("8");
		btnNum_8.addActionListener(listener);
		btnNum_8.setBounds(373, 451, 62, 36);
		add(btnNum_8);
		
		JButton btnNum_9 = new JButton("9");
		btnNum_9.addActionListener(listener);
		btnNum_9.setBounds(449, 451, 62, 36);
		add(btnNum_9);
		
		JButton btnNum_00 = new JButton("00");
		btnNum_00.addActionListener(listener);
		btnNum_00.setBounds(297, 499, 138, 36);
		add(btnNum_00);
		
		JButton btnNum_0 = new JButton("0");
		btnNum_0.addActionListener(listener);
		btnNum_0.setBounds(449, 499, 62, 36);
		add(btnNum_0);
		
		JButton btnPayment = new JButton("결제");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.changePanel();
			}
		});
		btnPayment.setBounds(14, 524, 105, 46);
		add(btnPayment);
		
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
		btnAllDelete.setBounds(14, 479, 105, 46);
		add(btnAllDelete);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.setText("0");
				n = null;
				sList.clear();
			}
		});
		btnC.setBounds(525, 355, 62, 36);
		add(btnC);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int money = temp-total;
				textField_3.setText(String.valueOf(money));
			}
		});
		btnEnter.setBounds(297, 547, 216, 36);
		add(btnEnter);
		
		
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
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			sList.add(b.getText());
			n = null;
			for(String d : sList)
				n = n+d;
			n = n.substring(4);
			textField_2.setText(n);
			temp = Integer.parseInt(n);
			
			
		}
	}
}