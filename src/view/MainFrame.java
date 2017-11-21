package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MainFrame extends JFrame {
	private CardLayout cards = new CardLayout();
	
	public CardLayout getCardLayout(){
		return cards;
	}
	
	public MainFrame(){
		setSize(1349, 758);
		getContentPane().setLayout(cards);
		setResizable(false);
		
		//getContentPane().add("One", new P_One(this));
		//getContentPane().add("Two", new Test01(this));
		
		setVisible(true);
	}
	public void changePanel(){
		cards.next(this.getContentPane());
	}
	public static void main(String[] args){
		new  MainFrame();
	}
}
