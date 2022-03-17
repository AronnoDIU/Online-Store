package OnlineShop.Menu.Implements;

import java.util.Scanner;

import OnlineShop.Configuration.ApplicationContext;
import OnlineShop.Enteties.User;
import OnlineShop.Enteties.Implements.DefaultUser;
import OnlineShop.Menu.Menu;
import OnlineShop.Service.UserManagementService;
import OnlineShop.Service.Implements.DefaultUserManagementService;

/**
 * 
 * @author Aronno
 *
 */
public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = sc.next();
		System.out.print("Please, enter your last name: ");
		String lastName = sc.next();
		System.out.print("Please, enter your password: ");
		String password = sc.next();
		System.out.print("Please, enter your email: ");
		
		sc.close();

		sc = new Scanner(System.in);
		String email = sc.nextLine();
		
//		sc.close();

		User user = new DefaultUser(firstName, lastName, password, email);

		String errorMessage = userManagementService.registerUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}

		context.getMainMenu().start();
		
		sc.close();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");
	}

}
