package devoir1_Exo2;

public class Address {
	//attributs de la classe
	
	private String street;
	private int number;
	private String postal;
	
	//constructeurs
	public Address() {}
	
	public Address(String street, int number, String postal) {
		super();
		this.street = street;
		this.number = number;
		this.postal = postal;
	}
	
	
	//getters et setters
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}


	@Override
	public String toString() {
		return number + " " +street + ", " + postal ;
	}
	
	
	

}
