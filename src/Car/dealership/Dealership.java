package Car.dealership;

public class Dealership {

	public static void main(String[] args) {
		
       Customer cust1 = new Customer();
       cust1.setName("avinash");
       cust1.setAddress("pune");
       cust1.setCashOnHand(30000);
       
       Vehicle vehicle = new Vehicle("Enova","Accord",15000);
//       vehicle.setMake("Enova");
//       vehicle.setModel("Accord");
//       vehicle.setPrice(15000);
       
       Employee emp = new Employee();
	
    
	cust1.purchaseCar(vehicle, emp, false);
	
	Vehicle car = new Vehicle("Enova","Accord",15000);
	     boolean value =car.equals(vehicle);
	     System.out.println(value);
	}
	
} 
