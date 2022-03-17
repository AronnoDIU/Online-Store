package OnlineShop.Service;

import OnlineShop.Enteties.User;

/**
 * 
 * @author Aronno
 *
 */
public interface UserManagementService {

	String registerUser(User user);

	User[] getUsers();

	User getUserByEmail(String userEmail);

}
