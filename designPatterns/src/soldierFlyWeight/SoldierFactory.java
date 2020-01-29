package soldierFlyWeight;

import java.util.Dictionary;
import java.util.Hashtable;

public class SoldierFactory {/*
	
	// Depolama alan�(Havuz).
    // Uygulama ortam�nda tekrar edecek olan FlyWeight nesne �rnekleri depolama alan�nda basit birer Key ile ifade edilir
    private Dictionary<SoldierType, Soldier> _soldiers;

    public SoldierFactory()
    {
        _soldiers = new Hashtable<SoldierType, Soldier>();
    }

    public Soldier GetSoldier(int sType)
    {
        Soldier soldier = null;

        // E�er depolama alan�nda, parametre olarak gelen Key ile e�le�en bir FlyWeight nesnesi var ise onu �ek
      //  if (_soldiers.equals(sType))
         //   soldier = _soldiers[sType];
      //  else
        {
            // Yoksa Key tipine bakarak uygun FlyWeight nesne �rne�ini olu�tur ve depolama alan�na(havuz) ekle
         //   if (sType == SoldierType.Private)
                soldier = new Private();
          //  else if (sType == SoldierType.Sergeant)
                soldier = new Sergeant();
         //   _soldiers.Add(sType, soldier);
     //   }

        // Elde edilen FlyWeight nesnesini geri d�nd�r
        return soldier;
   // }
*/
}
