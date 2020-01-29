package kutuphaneComposite;

public class Kitap implements IKutuphane {
	public String ad;

	public Kitap(String name) {
		this.ad = name;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public void Goster(int karakterSayisi) {
		// TODO Auto-generated method stub
		System.out.println("karakter sayisii:" + karakterSayisi+"add:"+ad);

	}

	@Override
	public String toString() {
		return "Kitap [ad=" + ad + "]";
	}

}
