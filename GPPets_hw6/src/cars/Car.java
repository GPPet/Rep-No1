package cars;

public class Car { // can be set as an abstract class
	protected int price; //! double; it also should be "protected"; good practice
	// get & set provide enough freedom for the user!
	
	public Car(){
		//this.price = 0; could be completely empty, can contain some logics! :-)
	}
	
	public Car(int price){
		this();
		
		setPrice(price);
	}

	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		if(price <= 0){
			this.price = 1;
			//checks whether the entered number is not proper for price of the object!!!
			//not zero but also not the improper value;
		} else {
			this.price = price;
		}
	}
}