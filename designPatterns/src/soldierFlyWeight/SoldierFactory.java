package soldierFlyWeight;

import java.util.Dictionary;
import java.util.Hashtable;

public class SoldierFactory {/*
	
	// Depolama alaný(Havuz).
    // Uygulama ortamýnda tekrar edecek olan FlyWeight nesne örnekleri depolama alanýnda basit birer Key ile ifade edilir
    private Dictionary<SoldierType, Soldier> _soldiers;

    public SoldierFactory()
    {
        _soldiers = new Hashtable<SoldierType, Soldier>();
    }

    public Soldier GetSoldier(int sType)
    {
        Soldier soldier = null;

        // Eðer depolama alanýnda, parametre olarak gelen Key ile eþleþen bir FlyWeight nesnesi var ise onu çek
      //  if (_soldiers.equals(sType))
         //   soldier = _soldiers[sType];
      //  else
        {
            // Yoksa Key tipine bakarak uygun FlyWeight nesne örneðini oluþtur ve depolama alanýna(havuz) ekle
         //   if (sType == SoldierType.Private)
                soldier = new Private();
          //  else if (sType == SoldierType.Sergeant)
                soldier = new Sergeant();
         //   _soldiers.Add(sType, soldier);
     //   }

        // Elde edilen FlyWeight nesnesini geri döndür
        return soldier;
   // }
*/
}
