package models;
import java.util.ArrayList;
import java.util.List;

public class Vegetable extends GroceryItem{
	private boolean  isOrganic;
    public Vegetable(String name, double price, double quantity,boolean isOrganic){
        super(name, price, quantity);
        this.isOrganic =isOrganic;
    }
    public boolean isOrganic(){
        return isOrganic;
    }
    public void setOrganic(boolean organic){
        this.isOrganic=organic;
    }
    public void display(){
    	System.out.println("--------------------------------------------");
         System.out.println("Vegetable "+ getname());
        System.out.println("Price "+ getprice());
        System.out.println("Quantity "+getquantity());
        System.out.println("Seasonal "+(isOrganic?"Yes":"No"));
        System.out.println("Total Price "+getquantity()*getprice());
    }
}
