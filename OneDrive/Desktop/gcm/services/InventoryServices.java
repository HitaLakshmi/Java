package services;
import models.GroceryItem;
public interface InventoryServices {
	 void addItem(GroceryItem item);
	    void showInventory();
	    double bill();
}
