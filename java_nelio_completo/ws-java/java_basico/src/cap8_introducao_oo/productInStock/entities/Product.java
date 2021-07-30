package cap8_introducao_oo.productInStock.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

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
