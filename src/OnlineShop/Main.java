package OnlineShop;

import OnlineShop.Menu.Menu;
import OnlineShop.Menu.Implements.MainMenu;

/**
 * 
 * @author Aronno
 *
 */

// This is an Object Oriented based E-Commerce Console Application.
public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {

		Menu mainMenu = new MainMenu();
		mainMenu.start();

	}

}
