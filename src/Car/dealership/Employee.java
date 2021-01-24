package Car.dealership;

public class Employee {
	
	public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle)
	{
		if(finance==true) {
			double loanAmount= vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
	}else if(vehicle.getPrice() <= cust.getCashOnHand())
	{
		perocessTransaction(cust,vehicle);
	}else
	{
		System.out.println("customer will need more money to purchase vehicle.." +vehicle);
	}

}
	public void runCreditHistory(Customer customer,double loanAmount)
	{
		System.out.println("Run credit history for customer...");
		System.out.println("customer has been been approved vehicle..");
	}
	
	public void perocessTransaction(Customer cust,Vehicle vehicle)
	{
		System.out.println("customer has purchased vehiclee" + vehicle + "for the price"+ vehicle.getPrice());
	}
	
}