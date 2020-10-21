package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private List<Product> productsAdd;
	private String idOrder;
	private Date date;
	private String idClientsOrder;
	private String nitRestaurant;
	private String stateOrder;

	public Order(String idOrder, Date date, String idClientsOrder, String nitRestaurant, String stateOrder) {
		super();
		this.idOrder = idOrder;
		this.date = date;
		this.idClientsOrder = idClientsOrder;
		this.nitRestaurant = nitRestaurant;
		this.stateOrder = stateOrder;
		productsAdd = new ArrayList<>();
	}

	public String getIdOrder() {
		return idOrder;
	}

	public Date getDate() {
		return date;
	}

	public String getIdClientsOrder() {
		return idClientsOrder;
	}

	public String getNitRestaurant() {
		return nitRestaurant;
	}

	public String getStateOrder() {
		return stateOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setIdClientsOrder(String idClientsOrder) {
		this.idClientsOrder = idClientsOrder;
	}

	public void setNitRestaurant(String nitRestaurant) {
		this.nitRestaurant = nitRestaurant;
	}

	public void setStateOrder(String stateOrder) {
		this.stateOrder = stateOrder;
	}

	public List<Product> getProductsAdd() {
		return productsAdd;
	}

	public void setProductsAdd(List<Product> productsAdd) {
		this.productsAdd = productsAdd;
	}

}
