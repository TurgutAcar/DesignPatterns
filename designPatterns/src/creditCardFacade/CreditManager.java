package creditCardFacade;

public class CreditManager {

	 public void UseCredit(Customer customer)
     {
         if (ControlManager.CheckCanUseCredit(customer.idNo))
        	 System.out.println("Kredi kulland�r�lm��t�r.");
         else
        	 System.out.println("Banka kredinizi onaylamam��t�r.");
            
     }
	
}
