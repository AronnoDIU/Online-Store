package OnlineShop.Menu.Implements;

import java.util.Scanner;

import OnlineShop.Configuration.ApplicationContext;
import OnlineShop.Menu.Menu;

/**
 * 
 * @author Aronno
 *
 */
public class ChangeEmailMenu implements Menu {

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		try (Scanner sc = new Scanner(System.in)) {
			String userInput = sc.next();
			context.getLoggedInUser().setEmail(userInput);
		}
		System.out.println("Your email has been successfully changed");
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE EMAIL *****");
		System.out.print("Enter new email: ");
	}

}
