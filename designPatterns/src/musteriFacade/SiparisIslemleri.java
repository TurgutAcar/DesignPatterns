package musteriFacade;

public class SiparisIslemleri {
	public int siparisEkle(int siparisTarihi,Musteri musteri,KargoSirketi kargoSirketi) {
		System.out.println(siparisTarihi+" tarihinde "+musteri.ad+" isimli musteri siparisi eklendi.Secilen kargo sirketi: "+kargoSirketi.ad);
		return 1;
	}
	

}
