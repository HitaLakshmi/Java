package models;

public class DairyProduct extends GroceryItem{
	private double  fatContent;


    public DairyProduct(String name, double price, double quantity, double fatContent) {
        super(name, price, quantity);
        this.fatContent=fatContent;
    }
    public void setFatContent(double fatContent){
        this.fatContent=fatContent;
    }
    public double getFatContent(){
        return fatContent;
    }
  //  @Override
    public void display(){
    	System.out.println("--------------------------------------------");
         System.out.println("Dairy "+ getname());
        System.out.println("Price "+ getprice());
        System.out.println("Quantity "+getquantity());
        System.out.println("Fatcontent "+fatContent);
        System.out.println("Total Price "+getquantity()*getprice());
    }
}
