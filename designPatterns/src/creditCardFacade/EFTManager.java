package creditCardFacade;

public class EFTManager {

	  public void SendEFT(Customer fromCustomer, Customer toCustomer, int eftAmount)
      {
          if (ControlManager.CheckHasEnoughCashInBankAccount(fromCustomer, eftAmount))
          {
              fromCustomer.amount -= eftAmount;
              System.out.println("EFT "+ toCustomer.customerNumber+ "nolu hesaba gönderildi..");
          }
          else
        	  System.out.println("Hesabınızda yeterli miktar olmadığı için EFT işleminiz gerçekleştirilemedi.");

      }
	
	
}
