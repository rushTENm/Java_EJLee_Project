package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class PaymentView extends JPanel{

	private JButton DeleteButton;
	public int total;
	private int temp = 0;
	MainFrame F;
	String n;
	ArrayList<String> sList = new ArrayList<>();
	ArrayList<Integer> tablePrice = new ArrayList<>();
	static HashMap<String, Integer> menuMap = new HashMap<>();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public PaymentView(MainFrame f, int total) {

		this.total = total;
		setSize(300, 80);
		setLocation(300, 300);
		setLayout(null);

		F = f;
		MyActionListener listener = new MyActionListener();

		JLabel label = new JLabel("결제 금액");
		label.setBounds(14, 14, 62, 18);
		add(label);

		textField_1 = new JTextField();
		textField_1.setText(String.valueOf(total));
		textField_1.setBounds(100, 14, 116, 24);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("원");
		lblNewLabel.setBounds(230, 14, 62, 18);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("받은 금액");
		lblNewLabel_1.setBounds(14, 50, 62, 18);
		add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(100, 50, 116, 24);
		add(textField_2);
		textField_2.setColumns(10);
		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new MyDispatcher());
		
		JLabel lblNewLabel_2 = new JLabel("원");
		lblNewLabel_2.setBounds(230, 50, 62, 18);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("거스름돈");
		lblNewLabel_3.setBounds(14, 86, 62, 18);
		add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setBounds(100, 86, 116, 24);
		add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("원");
		lblNewLabel_4.setBounds(230, 86, 62, 18);
		add(lblNewLabel_4);

		JButton btnNum_1 = new JButton("1");
		btnNum_1.addActionListener(listener);
		btnNum_1.setBounds(250, 14, 150, 72);
		add(btnNum_1);

		JButton btnNum_2 = new JButton("2");
		btnNum_2.addActionListener(listener);

		btnNum_2.setBounds(430, 14, 150, 72);
		add(btnNum_2);

		JButton btnNum_3 = new JButton("3");
		btnNum_3.addActionListener(listener);

		btnNum_3.setBounds(600, 14, 150, 72);
		add(btnNum_3);

		JButton btnNum_4 = new JButton("4");
		btnNum_4.addActionListener(listener);

		btnNum_4.setBounds(250, 106, 150, 72);
		add(btnNum_4);

		JButton btnNum_5 = new JButton("5");
		btnNum_5.addActionListener(listener);

		btnNum_5.setBounds(430, 106, 150, 72);
		add(btnNum_5);

		JButton btnNum_6 = new JButton("6");
		btnNum_6.addActionListener(listener);

		btnNum_6.setBounds(600, 106, 150, 72);
		add(btnNum_6);

		JButton btnNum_7 = new JButton("7");
		btnNum_7.addActionListener(listener);

		btnNum_7.setBounds(250, 198, 150, 72);
		add(btnNum_7);

		JButton btnNum_8 = new JButton("8");
		btnNum_8.addActionListener(listener);

		btnNum_8.setBounds(430, 198, 150, 72);
		add(btnNum_8);

		JButton btnNum_9 = new JButton("9");
		btnNum_9.addActionListener(listener);

		btnNum_9.setBounds(600, 198, 150, 72);
		add(btnNum_9);

		JButton btnNum_00 = new JButton("00");
		btnNum_00.addActionListener(listener);
		btnNum_00.setBounds(250, 290, 150, 72);
		add(btnNum_00);

		JButton btnNum_0 = new JButton("0");
		btnNum_0.addActionListener(listener);

		btnNum_0.setBounds(430, 290, 150, 72);
		add(btnNum_0);

		JButton btnPayment = new JButton("결제");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F.clearTable(Integer.parseInt(textField_3.getText()));
				// F.getCardLayout().show(F.getContentPane(), "One");
			}
		});
		btnPayment.setBounds(14, 130, 230, 46);
		add(btnPayment);

		JButton btnC = new JButton("C");

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_2.requestFocusInWindow();
				n = null;
				sList.clear();
			}
		});
		btnC.setBounds(600, 290, 150, 72);
		add(btnC);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int change = temp - total;
				textField_3.setText(String.valueOf(change));
			}
		});
		btnEnter.setBounds(250, 382, 500, 72);
		add(btnEnter);

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
	private class MyDispatcher implements KeyEventDispatcher
	{
		@Override
		public boolean dispatchKeyEvent(KeyEvent e)
		{
			if (e.getID() == KeyEvent.KEY_TYPED)
			{
				System.out.println("Got key event from " + e.getKeyChar());
				String s = "" + e.getKeyChar();
				if (s.compareToIgnoreCase("0") >= 0 && s.compareToIgnoreCase("9") <= 0)
				{
					System.out.println("s : " + s);
					if (textField_2.isEditable())
					{
						String curText = textField_2.getText();
						textField_2.setText(curText + s);
						System.out.println("able");
					} 
					else 
					{
						textField_2.setEditable(true);
						textField_2.setText(s);
						System.out.println("disable");
					}
				}
				
				else if(textField_2.getText().length() != 0)
	            {
	               textField_2.setText(textField_2.getText().substring(0, textField_2.getText().length() - 1));
	            }
	            textField_2.requestFocusInWindow();
	            
			}
			return true;
		}
	}
}
