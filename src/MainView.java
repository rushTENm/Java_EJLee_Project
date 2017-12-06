package MainView;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame
{
	MainView()
	{
		int tablenum = 1;
		
		setTitle("POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		for(int i = 0; i <= 4; i++)
		{
			for(int j = 0; j <= 3; j++)
			{
				JButton b = new JButton("테이블\n" + tablenum);
				b.setLocation(160 + (i * 124), 90 + (j * 116));
				b.setSize(119, 111);
				contentPane.add(b);
				tablenum++;
			}
		}
		
		JPanel TablePanel = new JPanel();
		TablePanel.setLocation(150, 70);
		TablePanel.setSize(630, 486);
		TablePanel.setBorder(BorderFactory.createTitledBorder("테이블 정보"));
		contentPane.add(TablePanel);
		
		JButton MV = new JButton("메인화면");
		MV.setLocation(154, 20);
		MV.setSize(100, 50);
		contentPane.add(MV);
		
		JButton AllSales = new JButton("총매출");
		AllSales.setLocation(259, 20);
		AllSales.setSize(100, 50);
		contentPane.add(AllSales);
		
		JButton Vovert = new JButton("예약현황");
		Vovert.setLocation(364, 20);
		Vovert.setSize(100, 50);
		contentPane.add(Vovert);

		JButton Settle = new JButton("결제");
		Settle.setLocation(15, 142);
		Settle.setSize(130, 50);
		contentPane.add(Settle);
		
		JButton Order = new JButton("주문");
		Order.setLocation(15, 197);
		Order.setSize(130, 50);
		contentPane.add(Order);
		
		JButton itemScan = new JButton("상품조회");
		itemScan.setLocation(18,498);
		itemScan.setSize(127, 50);
		contentPane.add(itemScan);
		
		JLabel POSVersion = new JLabel("POS system version 1.1");
		POSVersion.setLocation(567, 10);
		POSVersion.setFont(new Font("Courier", Font.PLAIN, 20));
		POSVersion.setSize(700, 30);
		contentPane.add(POSVersion);
		
		JLabel TimeView = new JLabel("Time : ");
		TimeView.setLocation(567,30);
		TimeView.setFont(new Font("Courier", Font.PLAIN, 20));
		TimeView.setSize(700, 50);
		contentPane.add(TimeView);
		
		
		
		JPanel OrderPanel = new JPanel();
		OrderPanel.setLocation(14, 250);
		OrderPanel.setSize(135, 305);
		OrderPanel.setBorder(BorderFactory.createTitledBorder("주문정보"));
		contentPane.add(OrderPanel);
		
		JPanel posPanel = new JPanel();
		posPanel.setLocation(5, 5);
		posPanel.setBorder(BorderFactory.createTitledBorder("POS시스템"));
		posPanel.setFont(new Font("Courier", Font.PLAIN, 20));
		posPanel.setSize(780, 555);
		contentPane.add(posPanel);	
		
		setSize(800, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MainView();
	}
}