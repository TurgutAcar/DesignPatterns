package creditCardFacade;

public class ControlManager {
	 public static boolean CheckHasEnoughCashInBankAccount(Customer customer, int amount)
     {
         if (customer.amount >= amount)
             return true;
         else
             return false;
     }

     public static boolean CheckCanUseCredit(String idNo)
     {
         //test i�in her zaman return true
         return true;
     }
}
