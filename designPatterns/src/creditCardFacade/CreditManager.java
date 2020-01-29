package creditCardFacade;

public class CreditManager {

	 public void UseCredit(Customer customer)
     {
         if (ControlManager.CheckCanUseCredit(customer.idNo))
        	 System.out.println("Kredi kullandýrýlmýþtýr.");
         else
        	 System.out.println("Banka kredinizi onaylamamýþtýr.");
            
     }
	
}
