package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Control {

	private List<Restaurant> restaurants;
	private Product [] products;
	private Client [] clients;
	private Order[] orders;
	
	public Control() {
		super();
		restaurants = new ArrayList<Restaurant>();
	}
	
	public void sortByFullName() {
		Arrays.sort(clients, new ClientFullNameSort());
	}
	
	public void sortRestaurantByName() {
		for(int i =0;i<restaurants.size()-1;i++) {
			
			String minName = restaurants.get(i).getName();
			int minPos =i;
			
			for(int j = i+1;j<restaurants.size();j++) {
				String CurrentName = restaurants.get(i).getName();
				if(minName.compareTo(CurrentName)<0) {
					minName = CurrentName;
					minPos=j;
				}
			}
			Restaurant temp = restaurants.get(minPos);
			
			
		}
	}

	public void addRestaurant(String name, String nit, String adminName) {
		Restaurant newRestaurant = new Restaurant(name, nit, adminName);
		
		
	}
	
	public void addProduct() {
		
	}
	
	public void addClient() {
		
	}
	
	public void registerOrder() {
		
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
