package utils;

import java.util.Scanner;

import models.Fruit;
import models.GroceryItem;
import models.Vegetable;
import models.DairyProduct;

public class DataLoad {
	Scanner sc;
	public DataLoad() {
		sc= new Scanner(System.in);
	}
	public Scanner getScanner() {
		return sc;
	}
public GroceryItem getData() {
	GroceryItem item = null;

System.out.println("Enter which product you want to purchase");
System.out.println("choose 1 for fruit, 2 for vegetable, 3 for dairyproduct");
int type=sc.nextInt();
System.out.println("Enter product name");
String name=sc.next();
System.out.println("Enter product Price ");
double price=sc.nextDouble();
System.out.println("Enter Product quality");
double quantity=sc.nextDouble();
switch(type) {

case 1:
	System.out.println("Seasonal Fruit? type Y Yes");
	boolean isSeasonal=sc.next().equals("Y")?true:false;
	item=new Fruit(name,price,quantity,isSeasonal);
	break;
case 2:
	System.out.println("Organic vegetable? type Y Yes");
	boolean isOrganic=sc.next().equals("Y")?true:false;
	item=new Vegetable(name,price,quantity,isOrganic);
	break;
case 3:
	System.out.println("Enter fat content");
	double fatContent=sc.nextInt();
	item=new DairyProduct(name,price,quantity,fatContent);
	break;
}
return item;
}
}
