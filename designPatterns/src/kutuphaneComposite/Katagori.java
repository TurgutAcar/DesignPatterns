package kutuphaneComposite;

import java.util.ArrayList;
import java.util.List;


public class Katagori implements IKutuphane {
     public String ad;
     
     

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}


	public Katagori(String ad) {
		this.ad = ad;
	}
	private List<IKutuphane> altElemanlar= new ArrayList<IKutuphane>();
	
	public void Ekle(IKutuphane kutuphane) {
		altElemanlar.add(kutuphane);
	}

	@Override
	public void Goster(int karakterSayisi) {
		// TODO Auto-generated method stub
		int cizgi=karakterSayisi++;
		System.out.println(cizgi+" adet "+ad+" "+altElemanlar.size());
		   for(IKutuphane katagori:altElemanlar) {
			   katagori.Goster(karakterSayisi);
		   }

	}

	@Override
	public String toString() {
		return "Katagori [ad=" + ad + "]";
	}

}
