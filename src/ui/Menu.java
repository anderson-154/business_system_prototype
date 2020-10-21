package ui;

import model.*;
import java.util.Date;
import java.util.Scanner;

import customException.EmptyDataException;
import model.Control;

public class Menu {

	public static final int EXIT_OPTION = 10;

	public Scanner sc;
	public Control prototype;

	public Menu() {

		sc = new Scanner(System.in);
		prototype = new Control();
	}

	public void startMenu() {
		String m = getMenuText();
		int option;
		do {
			System.out.println(m);
			option = readOption();
			executeOperation(option);
		} while (option != EXIT_OPTION);
	}

	private String getMenuText() {
		String m;
		m = "===============\n";
		m += "    Menu\n";
		m += "===============\n";
		m += "1. Add restaurant \n";
		m += "2. Add product \n";
		m += "3. Add client \n";
		m += "4. Add order \n";
		m += "5. Search client \n";
		m += "6. Update info client \n";
		m += "7. Update info restaurant \n";
		m += "8. Update info product \n";
		m += "9. Update info order \n";
		return m;

	}

	private int readOption() {
		int option;
		option = Integer.parseInt(sc.nextLine());
		return option;
	}

	private void executeOperation(int option) {

		switch (option) {
		case 1:
			System.out.println("write the name");
			String name = sc.nextLine();
			System.out.println("write the nit");
			String nit = sc.nextLine();
			System.out.println("write the admin name");
			String admName = sc.nextLine();
			try {
				prototype.addRestaurant(name, nit, admName);
			} catch (EmptyDataException e) {
				e.getMessage();
			}
			break;

		case 2:
			System.out.println("whats is the code product?");
			String idProduct = sc.nextLine();
			System.out.println("whats is the name product?");
			String nameProduct = sc.nextLine();
			System.out.println("whats is the description product?");
			String description = sc.nextLine();
			System.out.println("whats is the coste product?");
			String cost = sc.nextLine();
			System.out.println("whats is the quantity product?");
			System.out.println("Please enter the ID of the restaurant to which you want to add product?");
			String restaurantNit = sc.nextLine();
			try {
				prototype.addProduct(idProduct, nameProduct, description, cost, restaurantNit);
			} catch (EmptyDataException e) {
				e.getMessage();
			}
			break;

		case 3:
			System.out.println("Please enter customer date");
			System.out.println(" ");

			System.out.println("whats is the client's name?");
			String nameClient = sc.nextLine();
			System.out.println("whats is the client's lastName client?");
			String lastNameClient = sc.nextLine();
			System.out.println("whats is the client's id?");
			String idClient = sc.nextLine();
			System.out.println("whats is the client's type id?");
			String typeId = sc.nextLine();
			System.out.println("whats is the client's telephone?");
			String tel = sc.nextLine();
			System.out.println("whats is the client's address?");
			String direction = sc.nextLine();
			try {
				prototype.addClient(typeId, idClient, nameClient, lastNameClient, tel, direction);
			} catch (EmptyDataException e) {
				e.getMessage();
			}

			break;

		case 4:
			System.out.println("How many orders do you want");
			int opt = sc.nextInt();
			String stateOrder = " ";
			for (int i = 0; i < opt; i++) {
				Date date = new Date();
				String idOrder = String.valueOf((int) (1000000 * Math.random()));
				System.out.println("Enter the client's id:");
				String idClientsOrder = sc.nextLine();
				System.out.println("Enter the ID of the restaurant");
				String nitRestaurant = sc.nextLine();

				System.out.println("Enter dof order status");
				System.out.println("(1).REQUESTED");
				System.out.println("(2).IN PROGRESS");
				System.out.println("(3).SENT");
				System.out.println("(4).DElIVERED");

				opt = sc.nextInt();

				if (opt == 1) {
					stateOrder = "Requested";
				} else if (opt == 2) {
					stateOrder = "Process";
				} else if (opt == 3) {
					stateOrder = "Sent";
				} else if (opt == 4) {
					stateOrder = "Delivered";
				}

				try {
					prototype.registerOrder(idOrder, date, idClientsOrder, nitRestaurant, stateOrder);
				} catch (EmptyDataException e) {
					e.getMessage();
				}
			}

			break;

		case 5:
			double startTime = System.currentTimeMillis();

			System.out.println("enter the client ID to search");
			String seachNameClient = sc.nextLine();
			System.out.println(" ");

			for (int i = 0; i < prototype.getClients().size(); i++) {

				if (seachNameClient.equalsIgnoreCase(prototype.getClients().get(i).getIdClient())) {

					System.out.println("the search client is: ");
					System.out.println(" ");

					Client client = prototype.getClients().get(i);
					System.out.println("the client's name is" + client.getNameClient());
					System.out.println("the client's name is" + client.getLastNameClient());
					System.out.println("the client's id is" + client.getIdClient());
					System.out.println("the client's type ID is" + client.getTypeId());
					System.out.println("the clients telephone is" + client.getTel());
					System.out.println("the clients addres is" + client.getDirection());

					double endTime = System.currentTimeMillis();
					double duration = (endTime - startTime);

					System.out.println("the search duration is: " + duration);

				}

			}

			break;

		case 6:
			System.out.println("please enter the ID of the client you want update");
			String clientId = sc.nextLine();

			for (int i = 0; i < prototype.getClients().size(); i++) {
				if (clientId.equalsIgnoreCase(prototype.getClients().get(i).getIdClient())) {
					System.out.println("please enter the information of the client you want to update ");
					System.out.println("1. name \n");
					System.out.println("2. type Id \n");
					System.out.println("3. client ID \n");
					System.out.println("4. telephone \n");
					System.out.println("5. direction");

					int optionUdateClient = sc.nextInt();

					switch (optionUdateClient) {
					case 1:
						System.out.println("enter the new name");
						String setName = sc.nextLine();
						prototype.getClients().get(i).setNameClient(setName);
						System.out.println("the information has been change successfully");
						break;

					case 2:
						System.out.println("enter the new type id");
						String setTypeId = sc.nextLine();
						prototype.getClients().get(i).setTypeId(setTypeId);
						System.out.println("the information has been change successfully");
						break;

					case 3:
						System.out.println("enter the new client id");
						String setClientId = sc.nextLine();
						prototype.getClients().get(i).setIdClient(setClientId);
						;
						System.out.println("the information has been change successfully");
						break;

					case 4:
						System.out.println("enter the new telephone");
						String setTel = sc.nextLine();
						prototype.getClients().get(i).setTel(setTel);
						System.out.println("the information has been change successfully");
						break;

					case 5:
						System.out.println("enter the new direction");
						String setDirection = sc.nextLine();
						prototype.getClients().get(i).setDirection(setDirection);
						;
						System.out.println("the information has been change successfully");
						break;

					}
				}
			}
			break;

		case 7:
			System.out.println("please enter the ID of the restaurant you want update");
			String idRestaurant = sc.nextLine();

			for (int i = 0; i < prototype.getRestaurants().size(); i++) {
				if (idRestaurant.equalsIgnoreCase(prototype.getRestaurants().get(i).getNit())) {
					System.out.println("please enter the information of the restaurant you want to update ");
					System.out.println("1. name \n");
					System.out.println("2. nit \n");
					System.out.println("3. name of admin \n");

					int optionUptadeRestaurant = sc.nextInt();

					switch (optionUptadeRestaurant) {
					case 1:
						System.out.println("enter the new name");
						String setNameR = sc.nextLine();
						prototype.getRestaurants().get(i).setName(setNameR);
						System.out.println("the information has been change successfully");

						break;

					case 2:
						System.out.println("enter the new nit");
						String setNit = sc.nextLine();
						prototype.getRestaurants().get(i).setNit(setNit);
						System.out.println("the information has been change successfully");
						break;

					case 3:
						System.out.println("enter the new admin name");
						String setNameAdmin = sc.nextLine();
						prototype.getRestaurants().get(i).setAdminName(setNameAdmin);
						System.out.println("the information has been change successfully");

						System.out.println("the restaurant information is update successfully");
						break;
					}

				}
			}
			break;

		case 8:
			System.out.println("please enter the code of the product you want update");
			String codeProduct = sc.nextLine();
			System.out.println(" ");

			for (int i = 0; i < prototype.getRestaurants().size(); i++) {

				for (int j = 0; j < prototype.getRestaurants().get(i).getProduct().size(); j++) {

					if ((codeProduct
							.equalsIgnoreCase(prototype.getRestaurants().get(i).getProduct().get(j).getIdProduct()))) {
						System.out.println("please enter the information of the product you want to update ");
						System.out.println("1. id product \n");
						System.out.println("2. name \n");
						System.out.println("3. description \n");
						System.out.println("4. coste \n");
						System.out.println("5. restaurant nit");
						int optionUpdateProdut = sc.nextInt();

						switch (optionUpdateProdut) {
						case 1:
							System.out.println("enter the new id");
							String newId = sc.nextLine();
							prototype.getRestaurants().get(i).getProduct().get(j).setCost(newId);
							System.out.println("the restaurant information is update successfully");

							break;

						case 2:
							System.out.println("enter the new name");
							String nameUpdateProduct = sc.nextLine();
							prototype.getRestaurants().get(i).getProduct().get(j).setNameProduct(nameUpdateProduct);
							;
							System.out.println("the product information is update successfully");
							break;

						case 3:
							System.out.println("enter the new description");
							String updateDescription = sc.nextLine();
							prototype.getRestaurants().get(i).getProduct().get(j).setDescription(updateDescription);
							System.out.println("the product information is update successfully");
							break;

						case 4:
							System.out.println("enter the new coste");
							String updateCoste = sc.nextLine();
							prototype.getRestaurants().get(i).getProduct().get(j).setCost(updateCoste);
							System.out.println("the product information is update successfully");
							break;

						case 5:
							System.out.println("enter the new restaurant nit");
							String updateRestaurantNit = sc.nextLine();
							prototype.getRestaurants().get(i).getProduct().get(j).setRestaurantNit(updateRestaurantNit);
							System.out.println("the product information is update successfully");
							break;
						}
					}
				}
			}
			break;

		case 9:
			System.out.println("please enter the ID of the order you want update");
			String updateOrder = sc.nextLine();

			for (int i = 0; i < prototype.getOrders().size(); i++) {
				if (updateOrder.equalsIgnoreCase(prototype.getOrders().get(i).getIdOrder())) {
					System.out.println("please enter the information of the order you want to update ");
					System.out.println("1. id client \n");
					System.out.println("2. nit restaurant \n");
					System.out.println("3. state order \n");

					int optionUpdateOrder = sc.nextInt();

					switch (optionUpdateOrder) {

					case 1:
						System.out.println("enter the new client id");
						String updateIdClient = sc.nextLine();
						prototype.getOrders().get(i).setIdClientsOrder(updateIdClient);
						System.out.println("the information has been change successfully");
						break;

					case 2:
						System.out.println("enter the new restaurant nit");
						String updateNitRestaurantOrder = sc.nextLine();
						prototype.getOrders().get(i).setNitRestaurant(updateNitRestaurantOrder);
						System.out.println("the information has been change successfully");
						break;

					case 3:
						System.out.println("enter the new state order");
						String updateStateOrder = sc.nextLine();
						prototype.getOrders().get(i).setStateOrder(updateStateOrder);
						System.out.println("the information has been change successfully");
						System.out.println("the order information is update successfully");
					}
				}
			}
			break;

		case 10:exitProgram();break;
		default:
			break;
		}
	}

	private void exitProgram() {
		sc.close();
	}

}
