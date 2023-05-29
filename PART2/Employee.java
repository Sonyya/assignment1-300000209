package devoir1_Exo2;

public class Employee {
	//attributs de la classe
	private String name;
	private int hours;
	private double rate;
	private Address[] address = new Address[6];
	
	//constructeurs
	public Employee()
	{
	}
	
	public Employee(String name, int hours, double rate) {
		super();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	
	}
	
	public Employee(String name, int hours, double rate, Address[] address) {
		super();
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.address = address;
	}
	
	//getters et setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address address[]) {
		this.address = address;
	}
	
	
	public Address getAddress_0() {
		return address[0];
	}
	public void setAddress_0(Address address) {
		this.address[0] = address;
	}
	
	
	public Address getAddress_1() {
		return address[1];
	}
	public void setAddress_1(Address address) {
		this.address[1] = address;
	}
	
	
	public Address getAddress_2() {
		return address[2];
	}
	public void setAddress_2(Address address) {
		this.address[2] = address;
	}
	
	
	public Address getAddress_3() {
		return address[3];
	}
	public void setAddress_3(Address address) {
		this.address[3] = address;
	}
	
	
	public Address getAddress_4() {
		return address[4];
	}
	public void setAddress_4(Address address) {
		this.address[4] = address;
	}
	
	public Address getAddress_5() {
		return address[5];
	}
	public void setAddress_5(Address address) {
		this.address[5] = address;
	}
	
	
	/**
	 * @return les addresses de l objets employee sous forme de String
	 */
	private  String addressesAffiche()
	{
		String result = new String();
		
		for(int i = 0 ; i < this.address.length && this.address[i]!=null ; i++)
		{
			result += "address" + i + "= " + this.address[i];
			result += i!=this.address.length-1? "| ":"";
		}
		
		return result;
	}
	

	@Override
	public String toString() {
		return "Employee [name = " + name + " | hours = " + hours + " | rate = " + rate + " | " + addressesAffiche() + "]";
	}
	
	
	

}
