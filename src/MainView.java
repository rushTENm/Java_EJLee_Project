package MainView;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame
{
	MainView()
	{
		setTitle("POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		for(int i = 0; i <= 4; i++)
		{
			for(int j = 0; j <= 3; j++)
			{
				JButton b = new JButton("테이블\n" + i+j);
				b.setLocation(110 + (i * 105), 90 + (j * 105));
				b.setSize(100, 100);
				contentPane.add(b);
			}
		}
		
		JPanel TablePanel = new JPanel();
		TablePanel.setLocation(100, 70);
		TablePanel.setSize(540, 442);
		TablePanel.setBorder(BorderFactory.createTitledBorder("테이블 정보"));
		contentPane.add(TablePanel);
		
		JButton MV = new JButton("메인화면");
		MV.setLocation(104, 20);
		MV.setSize(100, 50);
		contentPane.add(MV);
		
		JButton AllSales = new JButton("총매출");
		AllSales.setLocation(209, 20);
		AllSales.setSize(100, 50);
		contentPane.add(AllSales);
		
		JButton Vovert = new JButton("예약현황");
		Vovert.setLocation(314, 20);
		Vovert.setSize(100, 50);
		contentPane.add(Vovert);

		JButton Settle = new JButton("결제");
		Settle.setLocation(15, 142);
		Settle.setSize(80, 50);
		contentPane.add(Settle);
		
		JButton Order = new JButton("주문");
		Order.setLocation(15, 197);
		Order.setSize(80, 50);
		contentPane.add(Order);
		
		JButton order = new JButton("상품조회");
		order.setLocation(18, 478);
		order.setSize(77, 30);
		contentPane.add(order);
		
		JLabel POSVersion = new JLabel("POS system version 1.0");
		POSVersion.setLocation(422, 10);
		POSVersion.setFont(new Font("Courier", Font.PLAIN, 20));
		POSVersion.setSize(500, 30);
		contentPane.add(POSVersion);
		
		JPanel OrderPanel = new JPanel();
		OrderPanel.setLocation(14, 250);
		OrderPanel.setSize(85, 263);
		OrderPanel.setBorder(BorderFactory.createTitledBorder("주문정보"));
		contentPane.add(OrderPanel);
		
		JPanel posPanel = new JPanel();
		posPanel.setLocation(5, 5);
		posPanel.setBorder(BorderFactory.createTitledBorder("POS시스템"));
		posPanel.setFont(new Font("Courier", Font.PLAIN, 20));
		posPanel.setSize(640, 513);
		contentPane.add(posPanel);	
		
		setSize(670, 560);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MainView();
	}
}