package OnlineShop.Service;

import OnlineShop.Enteties.Order;

/**
 * 
 * @author Aronno
 *
 */
public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);

	Order[] getOrders();

}
