package model;

public class Product {

	private String idProduct;
	private String nameProduct;
	private String description;
	private String cost;
	private String restaurantNit;
	
	/**
	 * method constructor
	 * @param idProduct
	 * @param nameProduct
	 * @param description
	 * @param cost
	 * @param restaurantNit
	 */
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

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public void setRestaurantNit(String restaurantNit) {
		this.restaurantNit = restaurantNit;
	}
	
}
