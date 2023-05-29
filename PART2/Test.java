package devoir1_Exo2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//creation objete employee
		Employee o1 = new Employee("falcao",40,15.50);
		//setting des addresses
		o1.setAddress_0(new Address("Queen",48,"K1P1N2"));
		o1.setAddress_1(new Address("King Edward",800,"K1N6N5"));
		//affichage de notre objet
		System.out.println(o1);

	}

}
