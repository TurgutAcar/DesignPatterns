package creditCardFacade;

public class EFTManager {

	  public void SendEFT(Customer fromCustomer, Customer toCustomer, int eftAmount)
      {
          if (ControlManager.CheckHasEnoughCashInBankAccount(fromCustomer, eftAmount))
          {
              fromCustomer.amount -= eftAmount;
              System.out.println("EFT "+ toCustomer.customerNumber+ "nolu hesaba g�nderildi..");
          }
          else
        	  System.out.println("Hesab�n�zda yeterli miktar olmad��� i�in EFT i�leminiz ger�ekle�tirilemedi.");

      }
	
	
}
