package OnlineShop.Menu.Implements;

import OnlineShop.Configuration.ApplicationContext;
import OnlineShop.Enteties.User;
import OnlineShop.Menu.Menu;
import OnlineShop.Service.UserManagementService;
import OnlineShop.Service.Implements.DefaultUserManagementService;

/**
 * 
 * @author Aronno
 *
 */
public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUsers();

		if (users.length == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");
	}

}
