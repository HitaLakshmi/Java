
package src;

import models.DairyProduct;
import models.Fruit;
import models.GroceryItem;
import models.Vegetable;
import services.*;
import utils.DataLoad;

public class Main {
    public static void main(String[] args) {
        InventoryServices service = new InventoryServicesImp();
        
        //MANUALLY ADDING ITEMS TO BASKET
//        service.addItem(new Fruit("Mango", 120, 2, true));
//        service.addItem(new Vegetable("Spinach",40,1.5,true));
//        service.addItem(new DairyProduct("Cheese",500,.5,25));
        
        
        //Getting items details from user
        
        
        DataLoad load =new DataLoad();
        while(true) {
        	System.out.println("Add items in your inventory");
        	GroceryItem item=load.getData();
        	service.addItem(item);
        	System.out.println("Continue ?");
        	if(load.getScanner().next().equals("n")) {
        		break;
        	}
        	else {
        		continue;
        	}
        }
        
        service.showInventory();
        
        //service.bill();
        System.out.println("--------------FINAL BILL-----------------");
        service.bill();
    }
    
}
