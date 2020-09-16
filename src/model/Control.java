package model;

import java.time.LocalDate;
import java.util.Arrays;

import customException.EmptyDataException;


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

	public void addRestaurant(String name, String nit, String adminName) throws EmptyDataException {
		String msg="";
		boolean exception = false;
		if(name == null) {
			exception=true;	
			msg+="name";
		}
		if(nit == null) {
			exception = true;
			msg+="nit";
		}
		if(adminName == null) {
			exception = true;
			msg+="admin name";
		}
		if(exception) {
			throw new EmptyDataException(msg);
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
	
	public void addProduct(String idProduct, String nameProduct, String description, String cost, String restaurantNit) throws EmptyDataException {
		String msg="";
		boolean exception=false;
		
		if(idProduct == null) {
			exception=true;
			msg+= "id product";
		}
		if(nameProduct == null) {
			exception=true;
			msg+= "product name";
		}
		if(description == null) {
			exception=true;
			msg+= "description";
		}
		if(cost == null) {
			exception=true;
			msg+= "cost";
		}
		if(restaurantNit == null) {
			exception=true;
			msg+= "restaurant nit";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			int posProduct = searchFirstAvailableProducts();
			products[posProduct] = new Product(idProduct,  nameProduct,  description,  cost,  restaurantNit);
		}
	}
	
	public void addClient(String typeId, String idClient, String nameClient, String lastNameClient, String tel, String direction) throws EmptyDataException {
		
		String msg="";
		boolean exception = false;
		if(typeId == null) {
			exception= true;
			msg+= "type id";
		}
		if(idClient == null) {
			exception= true;
			msg+= "id client";
		}
		if(nameClient == null) {
			exception= true;
			msg+= "name client";
		}
		if(lastNameClient == null) {
			exception= true;
			msg+= "last name client";
		}
		if(tel == null) {
			exception= true;
			msg+= "tel";
		}
		if(direction == null) {
			exception= true;
			msg+= "direction";
		}
		if(exception) {
			throw new EmptyDataException(msg);
		}
		else {
			int i=0;
			if(clients.length==0) {
				clients[i] = new Client(typeId,  idClient,  nameClient,  lastNameClient,  tel,  direction);
			}else {
				while(lastNameClient.compareTo(clients[i].getLastNameClient())>0) {
					i++;
				}
				clients[i] = new Client(typeId,  idClient,  nameClient,  lastNameClient,  tel,  direction);
			}
		}
	}
	
	public void registerOrder(String idOrder, LocalDate date, String idClientsOrder, String nitRestaurant, StateOrder stateOrder) throws EmptyDataException {
		String msg="";
		Boolean exception = false;
		if(idOrder == null) {
			exception= true;
			msg+= "id order";
		}
		if(date == null) {
			exception= true;
			msg+= "date";
		}
		if(idClientsOrder == null) {
			exception= true;
			msg+= "id client's order";
		}
		if(nitRestaurant == null) {
			exception= true;
			msg+= "restaurant nit";
		}
		if(stateOrder == null) {
			exception= true;
			msg+= "state order";
		}
		if(exception) {
			throw new EmptyDataException(msg);
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
