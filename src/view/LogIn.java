package view;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {

    private LoginMain main;
    private MainView View;

    private JTextField userText;
    private JPasswordField passText;
    private JButton btnInit;
    private JButton btnLogin;

    public static boolean bLoginCheck;

    MainFrame F;

    public static void main(String[] args) {
        new LogIn();

    }

    public LogIn() {

        setTitle("LOGIN");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        placeLoginPanel(panel);

        add(panel);

        setVisible(true);
    }

    public void placeLoginPanel(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });

        btnInit = new JButton("Reset");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });

        btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                isLoginCheck();
                return;
            }
        });
    }

    public void isLoginCheck() {
        if (userText.getText().equals("MasterPos") && new String(passText.getPassword()).equals("pos1234")) {
            bLoginCheck = true;
            if (bLoginCheck) {
                F = new MainFrame();
                setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void setMain(LoginMain main) {
        this.main = main;
    }

    public boolean isLogin() {
        return bLoginCheck;
    }
}
