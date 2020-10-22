package model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import customException.EmptyDataException;


public class Control {

	private List<Restaurant> restaurants;
	private List<Product>  products;
	private List<Client> clients;
	private List<Order> orders;

	public Control() {
		clients = new ArrayList<>();
		restaurants = new ArrayList<>();
		products = new ArrayList<>();
		orders = new ArrayList<>();
	}
	
	public void sortByFullName() {
		Collections.sort(clients, new ClientFullNameSort());
	}

	public void addRestaurant(String name, String nit, String adminName) throws EmptyDataException {
		String msg="";
		boolean exception=false;
		
		if(name == "") {
			exception=true;
			msg+= "id product";
		}
		if(nit == "") {
			exception=true;
			msg+= "product name";
		}
		if(adminName == "") {
			exception=true;
			msg+= "description";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			restaurants.add(new Restaurant(name,nit,adminName));
		}
	}
	
	public void addProduct(String idProduct, String nameProduct, String description, String cost, String restaurantNit) throws EmptyDataException {
		String msg="";
		boolean exception=false;
		
		if(idProduct == "") {
			exception=true;
			msg+= "id product";
		}
		if(nameProduct == "") {
			exception=true;
			msg+= "product name";
		}
		if(description == "") {
			exception=true;
			msg+= "description";
		}
		if(cost == "") {
			exception=true;
			msg+= "cost";
		}
		if(restaurantNit == "") {
			exception=true;
			msg+= "restaurant nit";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			products.add(new Product(idProduct, nameProduct, description, cost, restaurantNit));
		}
	}
	
	public void addClient(String typeId, String idClient, String nameClient, String lastNameClient, String tel, String direction) throws EmptyDataException {
		
		String msg="";
		boolean exception = false;
		if(typeId == "") {
			exception= true;
			msg+= "type id";
		}
		if(idClient == "") {
			exception= true;
			msg+= "id client";
		}
		if(nameClient == "") {
			exception= true;
			msg+= "name client";
		}
		if(lastNameClient == "") {
			exception= true;
			msg+= "last name client";
		}
		if(tel == "") {
			exception= true;
			msg+= "tel";
		}
		if(direction == "") {
			exception= true;
			msg+= "direction";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			clients.add(new Client(typeId, idClient, nameClient, lastNameClient, tel, direction));
			sortByFullName();
		}
	}
	
	public void registerOrder(String idOrder, Date date, String idClientsOrder, String nitRestaurant, String stateOrder) throws EmptyDataException {
		String msg="";
		Boolean exception = false;
		if(idOrder == "") {
			exception= true;
			msg+= "id order";
		}
		if(date == null) {
			exception= true;
			msg+= "date";
		}
		if(idClientsOrder == "") {
			exception= true;
			msg+= "id client's order";
		}
		if(nitRestaurant == "") {
			exception= true;
			msg+= "restaurant nit";
		}
		if(stateOrder == "") {
			exception= true;
			msg+= "state order";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			orders.add(new Order(idOrder, date, idClientsOrder, nitRestaurant, stateOrder));
		}
	}
	
	public void addProductToARestaurant(String restarantNit, Product NewProduct) {

        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).getNit().equals(restarantNit)) {
            	restaurants.get(i).addProduct(NewProduct);
            }
        }
    }
	
	 public List<Client> getClients() {
	        return clients;
	    }

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
}
