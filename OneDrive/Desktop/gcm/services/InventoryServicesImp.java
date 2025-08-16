
package services;
import java.util.ArrayList;
import java.util.List;

import models.GroceryItem;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryServicesImp implements InventoryServices {
    private List<GroceryItem> inventory;

    // Constructor to initialize the list
    public InventoryServicesImp() {
        this.inventory = (List<GroceryItem>) new ArrayList<GroceryItem>();
    }

    @Override
    public void addItem(GroceryItem item) {
        inventory.add(item);
        System.out.println(item.getname() + " added to inventory");
    }

    @Override
    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty");
        } else {
            System.out.println("----------------------------- Grocery Inventory ----------------------------");
            for (GroceryItem item : inventory) {
                item.display();
            }
        }
    }

    @Override
    public double bill() {
        double total = 0;
        for (GroceryItem item : inventory) {
            total += item.getprice() * item.getquantity();
        }
        System.out.println("Total Bill: " + total);
        return total;
    }
}
