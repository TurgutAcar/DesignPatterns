package creditCardFacade;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Facade facade = new Facade();

         Customer customer1 = new Customer();
         customer1.setIdNo("1131543");
         customer1.setFullName("Ahmet");
         customer1.setCustomerNumber(1123);
         customer1.setAmount(999999);
         Customer customer2 = new Customer(); 
         customer2.setIdNo("113884543");
         customer2.setFullName("Mehmet");
         customer2.setCustomerNumber(112345);
         customer2.setAmount(1000);
        		 //send eft customer1 to customer2
         facade.SendEFT(customer1, customer2, 123);

         //use credit to customer 2
         facade.UseCredit(customer2);

	}

}
