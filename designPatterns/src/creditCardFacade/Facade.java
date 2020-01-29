package creditCardFacade;

public class Facade {
	 private EFTManager _eftManager;
     private CreditManager _creditManager;

     public Facade()
     {
         _eftManager = new EFTManager();
         _creditManager = new CreditManager();
         
}
     public void SendEFT(Customer fromCustomer, Customer toCustomer, int eftAmount)
     {
         _eftManager.SendEFT(fromCustomer, toCustomer, eftAmount);
     }

     public void UseCredit(Customer customer)
     {
         _creditManager.UseCredit(customer);
     }
}