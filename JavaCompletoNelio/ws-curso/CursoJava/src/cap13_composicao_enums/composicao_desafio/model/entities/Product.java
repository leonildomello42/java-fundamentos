package cap13_composicao_enums.composicao_desafio.model.entities;

public class Product {
	
	private String name;
	private Double price;
	
	
	public Product() {
		
	}
	
	public Product(String nome, Double price) {
		super();
		this.name = nome;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
//	@Override
//	public String toString() {
//		
//		return "Product :" + name + " Price: " + price;
//	}

}
