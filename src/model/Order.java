package model;

import java.time.LocalDate;

public class Order {

	private String idOrder;
	private LocalDate date;
	private String idClientsOrder;
	private String nitRestaurant;
	private StateOrder stateOrder;
	
	public Order(String idOrder, LocalDate date, String idClientsOrder, String nitRestaurant, StateOrder stateOrder) {
		super();
		this.idOrder = idOrder;
		this.date = date;
		this.idClientsOrder = idClientsOrder;
		this.nitRestaurant = nitRestaurant;
		this.stateOrder = stateOrder;	}

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

	public StateOrder getStateOrder() {
		return stateOrder;
	}

	public void setStateOrder(StateOrder stateOrder) {
		this.stateOrder = stateOrder;
	}
	
	
}
