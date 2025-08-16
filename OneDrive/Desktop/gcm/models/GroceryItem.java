package models;

public abstract class GroceryItem {
	 private String name;
	    private double price;
	    private double quantity;

	    public GroceryItem(String name, double price, double quantity){
	        this.name=name;
	        this.price=price;
	        this.quantity=quantity;
	    }



	    //Encapsulation

	    //Setting 
	    public void setname(String name){
	        this.name=name;
	    }
	    public void setprice(double price){
	        this.price=price;
	    }
	    public void setquantity(double quantity){
	        this.quantity=quantity;
	    }


	    //Getting
	    public String getname(){
	        return name;
	    }
	    public double getprice(){
	        return price;

	    }
	    public double getquantity(){
	        return quantity;
	    }
	    // Abstraction

	    public abstract void display();
	}

