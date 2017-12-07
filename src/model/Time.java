package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Time extends JPanel implements ActionListener {
    Calendar calendar1 = Calendar.getInstance();
    int hour = calendar1.get(Calendar.HOUR_OF_DAY);
    int min = calendar1.get(Calendar.MINUTE);
    int sec = calendar1.get(Calendar.SECOND);
    javax.swing.Timer timer;
    JLabel lbPresent;

    public Time(JLabel label) {
        timer = new javax.swing.Timer(1000, this);
        timer.setInitialDelay(0);
        timer.start();

        lbPresent = label;
        label.setText(hour + "시 " + min + "분 " + sec + "초");
    }

    public void actionPerformed(ActionEvent e) {
        ++sec;
        Calendar calendar2 = Calendar.getInstance();
        hour = calendar2.get(Calendar.HOUR_OF_DAY);
        min = calendar2.get(Calendar.MINUTE);
        sec = calendar2.get(Calendar.SECOND);
        lbPresent.setText(hour + "시 " + min + "분 " + sec + "초");
    }

    public static void createAndShowGUI() {
    }
}
