package cap9_construtores_this_sobrecarga_encapsulamento.encapsulamento.entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Product() {
		
	}
	
	

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}



	public Product(String name, double price, int quantity) {
		
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double totalValueInStock() {

		return (this.quantity * this.price);
	}

	public void addProducts(int quantityToAdd) {

		this.quantity += quantityToAdd;
	}

	public void removeProducts(int quantityToRemove) {

		this.quantity -= quantityToRemove;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
	

}
