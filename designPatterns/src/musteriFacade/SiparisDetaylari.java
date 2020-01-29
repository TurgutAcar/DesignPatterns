package musteriFacade;

import java.util.List;

public class SiparisDetaylari {
	public void siparisDetaylariniEkle(int siparisId,List<SepettekiUrun>urunler) {
		System.out.println(siparisId+" numarali siparise alinan ürünler: "+siparisId);
		System.out.println(".............................................");
		for(SepettekiUrun urun:urunler) {
			System.out.println(urun.urunAd+" urununden "+urun.adet+" alindi.Ara toplam: "+urun.fiyat);
		}
	}

}
