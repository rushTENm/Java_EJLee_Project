

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

public class PaymentView extends JPanel {

	JTabbedPane t = new JTabbedPane();
	private JList list;
	private DefaultListModel listModel;
	private JButton DeleteButton;
	private int total;
	private int temp = 0;
	MainFrame F;
	ArrayList<String> sList = new ArrayList<>();
	ArrayList<Integer> tablePrice = new ArrayList<>();
	String n;

	static HashMap<String, Integer> menuMap = new HashMap<>();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public PaymentView(MainFrame f) {

	
		setSize(300, 80);
		setLayout(null);

		F = f;
		MyActionListener listener = new MyActionListener();

		list = new JList();
		list.setForeground(Color.BLACK);
		list.setBounds(14, 12, 499, 280);
		add(list);

		listModel = new DefaultListModel();


		JLabel label = new JLabel("총 금액");
		label.setBounds(14, 329, 62, 18);
		add(label);

		textField_1 = new JTextField();
		textField_1.setText(String.valueOf(total));
		textField_1.setBounds(107, 326, 116, 24);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("원");
		lblNewLabel.setBounds(226, 329, 62, 18);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("받은 금액");
		lblNewLabel_1.setBounds(14, 369, 62, 18);
		add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(107, 366, 116, 24);
		add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("원");
		lblNewLabel_2.setBounds(226, 369, 62, 18);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("거스름돈");
		lblNewLabel_3.setBounds(14, 409, 62, 18);
		add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(107, 402, 116, 24);
		add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("원");
		lblNewLabel_4.setBounds(226, 409, 62, 18);
		add(lblNewLabel_4);

		JButton btnNum_1 = new JButton("1");
		btnNum_1.addActionListener(listener);
		btnNum_1.setBounds(297, 325, 62, 36);
		add(btnNum_1);

		JButton btnNum_2 = new JButton("2");
		btnNum_2.addActionListener(listener);
		btnNum_2.setBounds(373, 325, 62, 36);
		add(btnNum_2);

		JButton btnNum_3 = new JButton("3");
		btnNum_3.addActionListener(listener);
		btnNum_3.setBounds(449, 325, 62, 36);
		add(btnNum_3);

		JButton btnNum_4 = new JButton("4");
		btnNum_4.addActionListener(listener);
		btnNum_4.setBounds(297, 373, 62, 36);
		add(btnNum_4);

		JButton btnNum_5 = new JButton("5");
		btnNum_5.addActionListener(listener);
		btnNum_5.setBounds(373, 373, 62, 36);
		add(btnNum_5);

		JButton btnNum_6 = new JButton("6");
		btnNum_6.addActionListener(listener);
		btnNum_6.setBounds(449, 373, 62, 36);
		add(btnNum_6);

		JButton btnNum_7 = new JButton("7");
		btnNum_7.addActionListener(listener);
		btnNum_7.setBounds(297, 421, 62, 36);
		add(btnNum_7);

		JButton btnNum_8 = new JButton("8");
		btnNum_8.addActionListener(listener);
		btnNum_8.setBounds(373, 421, 62, 36);
		add(btnNum_8);

		JButton btnNum_9 = new JButton("9");
		btnNum_9.addActionListener(listener);
		btnNum_9.setBounds(449, 421, 62, 36);
		add(btnNum_9);

		JButton btnNum_00 = new JButton("00");
		btnNum_00.addActionListener(listener);
		btnNum_00.setBounds(297, 469, 138, 36);
		add(btnNum_00);

		JButton btnNum_0 = new JButton("0");
		btnNum_0.addActionListener(listener);
		btnNum_0.setBounds(449, 469, 62, 36);
		add(btnNum_0);

		JButton btnPayment = new JButton("결제");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.changePanel();
			}
		});
		btnPayment.setBounds(14, 494, 105, 46);
		add(btnPayment);

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
				int money = temp - total;
				textField_3.setText(String.valueOf(money));
			}
		});
		btnEnter.setBounds(297, 517, 216, 36);
		add(btnEnter);

	}

	class DeleteListner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// This method can be called only if
			// there's a valid selection
			// so go ahead and remove whatever's selected.
			int index = list.getSelectedIndex();
			listModel.remove(index);

			int size = listModel.getSize();

			if (size == 0) { // Nobody's left, disable firing.
				DeleteButton.setEnabled(false);

			} else { // Select an index.
				if (index == listModel.getSize()) {
					// removed item in last position
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