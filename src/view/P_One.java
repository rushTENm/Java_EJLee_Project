package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class P_One extends JPanel {
	private JLabel lblNewLabel;
	private JButton btnNewButton1;
	private JButton btnNewButton2;
	private MainFrame F;
	
	public P_One(MainFrame f){
		setBackground(Color.WHITE);
		setSize(300, 80);
		setLayout(null);
		
		F=f;
		
        btnNewButton1 = new JButton("주문/결제");
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                F.changePanel();
            }
        });
        btnNewButton1.setBounds(415, 314, 151, 62);
        add(btnNewButton1);
        
        setVisible(true);
	}

}
