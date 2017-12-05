package view;

import javax.swing.JFrame;
import view.MainView;

public class LoginMain 
{
	LogIn Login;
	TestFrm testFrm;
	
	public static void main(String[] args)
	{
		LoginMain main = new LoginMain();
		main.Login = new LogIn();
		main.Login.setMain(main);
	}
	public void showFrameTest()
	{
		Login.dispose();
		this.testFrm = new TestFrm();
	}
}
