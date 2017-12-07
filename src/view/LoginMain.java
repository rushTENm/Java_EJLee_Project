package view;

public class LoginMain {
    LogIn Login;

    public static void main(String[] args) {
        LoginMain main = new LoginMain();
        main.Login = new LogIn();
        main.Login.setMain(main);
    }
}

