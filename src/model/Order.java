package model;

import java.time.LocalDate;

public class Order {

	private String idOrder;
	private LocalDate date;
	private String idClientsOrder;
	private String nitRestaurant;
	private String stateOrder;
	
	public Order(String idOrder, LocalDate date, String idClientsOrder, String nitRestaurant, String stateOrder) {
		super();
		this.idOrder = idOrder;
		this.date = date;
		this.idClientsOrder = idClientsOrder;
		this.nitRestaurant = nitRestaurant;
		this.stateOrder = stateOrder;
	}

	public String getIdOrder() {
		return idOrder;
	}

	public LocalDate getDate() {
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

	public void setStateOrder(String stateOrder) {
		this.stateOrder = stateOrder;
	}
	
	
}
