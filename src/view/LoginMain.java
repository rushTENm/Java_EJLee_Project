package Login;

import javax.swing.JFrame;

public class LoginMain 
{
	LogIn Login;
	MainView mainView;
	WeekReport report;
	
	public static void main(String[] args)
	{
		LoginMain main = new LoginMain();
		main.Login = new LogIn();
		main.Login.setMain(main);
	}
	public void showFrameTest()
	{
		Login.dispose();
		this.mainView = new MainView();
	}
}
