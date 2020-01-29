package bankaProxy;

public class ProxyBanka implements IBanka {
	Banka banka;
	boolean login;
	String kullaniciAdi,sifre;
	
	
	public ProxyBanka(String kullaniciAdi, String sifre) {
		
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	boolean girisYap() {
		if(kullaniciAdi.equals("turgutacar") && sifre.equals("arroyo")) {
			banka=new Banka();
			login=true;
			System.out.println("Hesaba giris yapildi.");
			return true;
		}
		else {
			System.out.println("Lutfen kullanici adi ve sifrenizi dogru girdiginize emin olunuz.");
		}
		login = false;
		return false;
	}


	@Override
	public boolean odemeYap(double tutar) {
		girisYap();
		
		if(!login) {
			System.out.println("Hesaba giris yapýlamadigindan odeme alamiyoruz. ");
			return false;
		}
		banka.odemeYap(tutar);
		return true;
	}

}
