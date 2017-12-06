package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

public class MainFrame extends JFrame {
    private CardLayout cards = new CardLayout();
    MainView mainView = new MainView(this);
    int selectedNumber = -1;

    public CardLayout getCardLayout() {
        return cards;
    }

    OrderView orders[] = new OrderView[20];

    public MainFrame() {
        setSize(800, 600);
        getContentPane().setLayout(cards);
        setResizable(false);

        getContentPane().add("One", mainView);
        getContentPane().add("Three", new PaymentView(this));
        getContentPane().add("four", new ReservationView(this));
        getContentPane().add("six", new WeekReport(this));
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    public void showOrderView(int selectedNumber) {
        this.selectedNumber = selectedNumber;
        if (orders[selectedNumber - 1] == null)
            orders[selectedNumber - 1] = new OrderView(this);
        getContentPane().add("Two", orders[selectedNumber - 1]);

        this.getCardLayout().show(this.getContentPane(), "Two");
    }

    public void returnTotal(int total) {
        String originalText = mainView.buttons[selectedNumber-1].getText();
        String[] strings = originalText.split(" ");
        mainView.buttons[selectedNumber-1].setText(strings[0]+" "+strings[1]+ " "+ total + " 원");
        this.getCardLayout().show(this.getContentPane(), "One");

    }
}
