package view;

import java.awt.*;

import javax.swing.*;

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
        setTitle("Point of Sale");
        getContentPane().add("One", mainView);
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

        String[] strings = mainView.buttons[selectedNumber - 1].getText().split(" ");
        if (strings.length > 2) {
            orders[selectedNumber - 1].totalTextField.setText(strings[2]);
            orders[selectedNumber - 1].total = Integer.parseInt(strings[2]);
        }
        this.getCardLayout().show(this.getContentPane(), "Two");
    }

    public void showPaymentView(int selectedNumber) {
        this.selectedNumber = selectedNumber;
        if (orders[selectedNumber - 1] == null)
            orders[selectedNumber - 1] = new OrderView(this);
        String originalText = mainView.buttons[selectedNumber - 1].getText();
        String[] strings = originalText.split(" ");
        int total = Integer.parseInt(strings[2]);

        getContentPane().add("Three", new PaymentView(this, total));
        this.getCardLayout().show(this.getContentPane(), "Three");
    }

    public void setTotal(int total) {
        String originalText = mainView.buttons[selectedNumber - 1].getText();
        String[] strings = originalText.split(" ");
        mainView.buttons[selectedNumber - 1].setText(strings[0] + " " + strings[1] + " " + total + " 원");
        this.getCardLayout().show(this.getContentPane(), "One");
    }

    public void clearTable(int change) {
        String originalText = mainView.buttons[selectedNumber - 1].getText();
        String[] strings = originalText.split(" ");

        if (change >= 0) {
            mainView.buttons[selectedNumber - 1].setText(strings[0] + " " + strings[1]);
            orders[selectedNumber - 1] = null;
        } else if (change < 0) {
            mainView.buttons[selectedNumber - 1].setText(strings[0] + " " + strings[1] + " " + change * (-1) + " 원");
        }
        this.getCardLayout().show(this.getContentPane(), "One");

    }
}
