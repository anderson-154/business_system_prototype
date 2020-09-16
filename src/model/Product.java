package model;

public class Product {

	private String idProduct;
	private String nameProduct;
	private String description;
	private String cost;
	private String restaurantNit;
	
	public Product(String idProduct, String nameProduct, String description, String cost, String restaurantNit) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.description = description;
		this.cost = cost;
		this.restaurantNit = restaurantNit;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public String getDescription() {
		return description;
	}

	public String getCost() {
		return cost;
	}

	public String getRestaurantNit() {
		return restaurantNit;
	}
	
}
