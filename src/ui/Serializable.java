package ui;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.*;

public class Serializable {

	Control prototype = new Control();

	public Serializable(Control prototype) {
		this.prototype = prototype;

	}

	public void restaurantsCSV() {
		Path filePath = Paths.get("doc/restaurants.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String line;
			int count = 0;

			while ((line = br.readLine()) != null) {
				if (count != 0) {
					String[] LineDate = line.split(",");
					String name = LineDate[0];
					String nit = LineDate[1];
					String adminName = LineDate[2];

					prototype.addRestaurant(name, nit, adminName);
				}
				count++;
			}
		} catch (Exception a) {
			a.getMessage();
		}
	}

	public void productsCSV() {
		Path filePath = Paths.get("doc/products.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				if (count != 0) {
					for (int j = 0; j < prototype.getRestaurants().size(); j++) {
						for (int j2 = 0; j2 < prototype.getRestaurants().get(j).getProduct().size(); j2++) {

							String[] Line = line.split(",");
							String idProduct = Line[0];
							String nameProduct = Line[1];
							String description = Line[2];
							String cost = Line[3];
							String restaurantNit = Line[4];
							Product product = new Product(idProduct, nameProduct, description, cost, restaurantNit);
							prototype.getRestaurants().get(j).addProduct(product);
						}
					}
				}
				count++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
