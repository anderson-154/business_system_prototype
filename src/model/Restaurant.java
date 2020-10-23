package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String name;
	private String nit;
	private String adminName;
	private List<Product> products;

	/**
	 * method constructor restaurant
	 * @param name
	 * @param nit
	 * @param adminName
	 */
	public Restaurant(String name, String nit, String adminName) {
		super();
		this.name = name;
		this.nit = nit;
		this.adminName = adminName;
		products = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getNit() {
		return nit;
	}

	public String getAdminName() {
		return adminName;
	}

	public List<Product> getProduct() {
		return products;
	}

	public void setTheProduct(List<Product> products) {
		this.products = products;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product){
		products.add(product);
    }
	/**
	 * method sort restaurant
	 *<p>des:</p> this method sort the restaurants
	 *<b>pre:</b> the list are different null
	 */
	public void bubbleSortProduct() {
		for (int i = 0; i < products.size()-1; i++) {
			for (int j = 0; j < products.size()-i-1; j++) {
				Product n1 = products.get(j);
				Product n2 = products.get(j+1);
				if(n1.equals(n2)) {
					products.set(j, n2);
					products.set(j+1, n1);
				}
			}
		}
	}

	
}
