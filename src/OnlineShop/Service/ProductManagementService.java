package OnlineShop.Service;

import OnlineShop.Enteties.Product;

/**
 * 
 * @author Aronno
 *
 */
public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
