package model;

public class Client {

	private String typeId;
	private String idClient;
	private String nameClient;
	private String lastNameClient;
	private String tel;
	private String direction;
	
	public Client(String typeId, String idClient, String nameClient, String lastNameClient, String tel, String direction) {
		super();
		this.typeId = typeId;
		this.idClient = idClient;
		this.nameClient = nameClient;
		this.lastNameClient = lastNameClient;
		this.tel = tel;
		this.direction = direction;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getIdClient() {
		return idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	
	public String getLastNameClient() {
		return lastNameClient;
	}

	public String getTel() {
		return tel;
	}

	public String getDirection() {
		return direction;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public void setLastNameClient(String lastNameClient) {
		this.lastNameClient = lastNameClient;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	
}
