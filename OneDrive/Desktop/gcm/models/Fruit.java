package models;

public class Fruit extends GroceryItem{
	 private boolean isSeasonal;
	    public Fruit(String name, double price, double quantity, boolean isSeasonal) {
	        super(name, price, quantity);
	        this.isSeasonal=isSeasonal;
	    }
	    public void display(){
	    	System.out.println("--------------------------------------------");
	        System.out.println("Fruit "+ getname());
	        System.out.println("Price "+ getprice());
	        System.out.println("Quantity "+getquantity());
	        System.out.println("Seasonal "+(isSeasonal?"Yes":"No"));
	        System.out.println("Total Price "+getquantity()*getprice());
	    }

	    public boolean  isSeasonal(){
	        return isSeasonal;
	    }
	    public void setSeasonal(boolean seasonal){
	        isSeasonal=seasonal;
	    }
}
