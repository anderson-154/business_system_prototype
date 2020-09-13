package model;

import java.time.LocalDate;
import java.util.Arrays;


public class Control {

	private Restaurant[] restaurants;
	private Product [] products;
	private Client [] clients;
	private Order[] orders;
	
	public Control() {
		super();
	}
	
	public void sortByFullName() {
		Arrays.sort(clients, new ClientFullNameSort());
	}
	
	public void sortRestaurantByName() {
		for(int i =0;i<restaurants.length-1;i++) {
			
			String minName = restaurants[i].getName();
			int minPos =i;
			
			for(int j = i+1;j<restaurants.length;j++) {
				String CurrentName = restaurants[i].getName();
				if(minName.compareTo(CurrentName)<0) {
					minName = CurrentName;
					minPos=j;
				}
			}
			Restaurant temp = restaurants[i];
			restaurants[minPos]=restaurants[i];
			restaurants[i]=temp;

		}
	}

	public void addRestaurant(String name, String nit, String adminName) {

		boolean exception = false;
		if(name == null) {
			exception=true;	
		}
		if(nit == null) {
			exception = true;
		}
		if(adminName == null) {
			exception = true;
		}
		if(exception) {
			//lanza la excepcion
		}
		else {
			int posRestaurant = searchFirstAvailableRestaurant();
			restaurants[posRestaurant] = new Restaurant(name, nit, adminName);
		}		
	}
	
	private int searchFirstAvailableRestaurant() {
		int pos = -1;
		for (int i = 0; i < restaurants.length && pos==-1; i++) {
			Restaurant current = restaurants[i];
			if(current==null) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	private int searchFirstAvailableClient() {
		int pos = -1;
		for (int i = 0; i < clients.length && pos==-1; i++) {
			Client current = clients[i];
			if(current==null) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	private int searchFirstAvailableProducts() {
		int pos = -1;
		for (int i = 0; i < products.length && pos==-1; i++) {
			Product current = products[i];
			if(current==null) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	private int searchFirstAvailableOrder() {
		int pos = -1;
		for (int i = 0; i < orders.length && pos==-1; i++) {
			Order current = orders[i];
			if(current==null) {
				pos = i;
			}
		}
		
		return pos;
	}
	
	public void addProduct(String idProduct, String nameProduct, String description, String cost, String restaurantNit) {
		boolean exception=false;
		
		if(idProduct == null) {
			exception=true;
		}
		if(nameProduct == null) {
			exception=true;
		}
		if(description == null) {
			exception=true;
		}
		if(cost == null) {
			exception=true;
		}
		if(restaurantNit == null) {
			exception=true;
		}
		if(exception) {
			//lanza la excepcion
		}
		else {
			int posProduct = searchFirstAvailableProducts();
			products[posProduct] = new Product(idProduct,  nameProduct,  description,  cost,  restaurantNit);
		}
	}
	//corregir y agregarlo de forma ordenada
	public void addClient(String typeId, String idClient, String nameClient, String lastNameClient, String tel, String direction) {
		
		boolean exception = false;
		if(typeId == null) {
			exception= true;
		}
		if(idClient == null) {
			exception= true;
		}
		if(nameClient == null) {
			exception= true;
		}
		if(lastNameClient == null) {
			exception= true;
		}
		if(tel == null) {
			exception= true;
		}
		if(direction == null) {
			exception= true;
		}
		if(exception) {
			//lanza la excepcion
		}
		else {
			int posClient=searchFirstAvailableClient();
			clients[posClient] = new Client( typeId,  idClient,  nameClient,  lastNameClient,  tel,  direction);
		}
	}
	
	public void registerOrder(String idOrder, LocalDate date, String idClientsOrder, String nitRestaurant, String stateOrder) {
		Boolean exception = false;
		if(idOrder == null) {
			exception= true;
		}
		if(date == null) {
			exception= true;
		}
		if(idClientsOrder == null) {
			exception= true;
		}
		if(nitRestaurant == null) {
			exception= true;
		}
		if(stateOrder == null) {
			exception= true;
		}
		if(exception) {
			//lanza la excepcion
		}
		else {
			int posOrder=searchFirstAvailableOrder();
			orders[posOrder] = new Order(idOrder, date, idClientsOrder, nitRestaurant, stateOrder);
		}
	}
	
	public void updateData() {
		
	}
	
	public void updateProducts(String idProduct) {
		
	}
	
	public void updateClients(String idClient) {
		
	}
	
	public void updateOrder(String idOrder) {
		
	}
}
