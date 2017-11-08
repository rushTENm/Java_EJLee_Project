import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    public static void main(String[] args) {
        new CheckBoxItemEventEx();
    }
}

class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] names = {"사과", "배", "체리"};
    private JLabel sumLabel;

    public CheckBoxItemEventEx() {
        setTitle("CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(new JLabel("사과 100원, 배 5000원, 체리 20000원"));

        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPaintedFlat(true);
            container.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재 0원 입니다.");
        container.add(sumLabel);

        setSize(250, 200);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (e.getItem() == fruits[0])
                    sum += 100;
                if (e.getItem() == fruits[1])
                    sum += 5000;
                if (e.getItem() == fruits[2])
                    sum += 20000;
            } else {
                if (e.getItem() == fruits[0])
                    sum -= 100;
                if (e.getItem() == fruits[1])
                    sum -= 5000;
                if (e.getItem() == fruits[2])
                    sum -= 20000;
            }
            sumLabel.setText("현재 " + sum + "원입니다.");


        }
    }
}