package model;

public class Restaurant {

	private String name;
	private String nit;
	private String adminName;
	
	public Restaurant(String name, String nit, String adminName) {
		super();
		this.name = name;
		this.nit = nit;
		this.adminName = adminName;
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
	
	
}
