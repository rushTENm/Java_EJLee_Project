package controller;

import view.MainView;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableSelector extends MouseAdapter {
    MainView callBy;
    JButton button;

    public TableSelector(MainView callBy, JButton button) {
        this.callBy = callBy;
        this.button = button;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String[] strings = button.getText().split(" ");
        int num = Integer.parseInt(strings[1]);
        if (callBy.selectedNumber == -1)
            callBy.selectedNumber = num;
        System.out.println(callBy.selectedNumber);

        for (int i = 0; i < 20; i++) {
            if (callBy.selectedNumber - 1 == i)
                continue;

            callBy.buttons[i].setEnabled(false);
        }
    }
}
